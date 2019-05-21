# Coiny Android SDK

CoinySDK allows you to buy and sell cryptocurrencies inside your Android application. 

# Installation

To install the SDK:

Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }

Add the dependency:

`implementation 'com.github.CoinyIO:coiny-android-sdk:0.0.5'`

For login flow to work, CoinyLoginActivity needs to be added to AndroidManifest.xml:

`<activity android:name="io.coiny.android.sdk.CoinyLoginActivity"/>`

Also, you need to add internet permission to AndroidManifest.xml:

`<uses-permission android:name="android.permission.INTERNET" />`

# Authentication 

Coiny SDK is allows you to authenticate with OAuth2 authentication. This means that, you are allowed to manage other people's account that are authorized with your application.

# Getting Started

First of all you need to retrieve API Key and API Secret from Coiny. To add API Key and Secret into your application:

1. Open your Application Class and add the following

`Coiny.initialize(this, "your-app-id", true);`

If you want to test it on the sandbox environment:

`Coiny.initialize(this, "your-app-id", false);`

2. To authorize a user for your application: 

`Coiny.login(MainActivity.this);`

You may call this when your user clicks to a button or anything else. Then you need to implement CoinyLoginViewResponseListener to check response success or fail.

`implements Coiny.CoinyLoginViewResponseListener`

Also, you need to set listener like this:

`Coiny.setCoinyLoginViewResponseListener(this);`

There is a override method that notifies you if the user is authenticated.

	public interface CoinyLoginViewResponseListener {
		void coinyLoginDidGetToken(String authToken);
	}

# Making API Calls

## Calling Get Methods

Assume your application has wallets:read permission and the user authorized for that application. You may call the api and get response like this: 

	CoinyApiRequest.createRequest(this, "wallets",
                        null, "GET", new CoinyApiRequest.CoinyResponseListener() {
                    @Override
                    public void coinyRequestSuccess(JSONObject response) {
                        Log.i("CoinyWallets", response.toString());
                    }

                    @Override
                    public void coinyRequestFail(JSONObject error) {
                        Log.i("CoinyWallets", error.toString());
                    }
                });
The example above returns a JSONObject that contains response of the user's wallets.

## Calling POST/PUT/DELETE Methods

Just like calling the Get requests, you may call all the other methods with the same pattern. For instance, to buy a bitcoin you should call the following.

    Map<String, String> buyOrder = new HashMap<String, String>() {{
            put("pair","btc-try");
            put("price","34000");
            put("orderType","Market");
            put("quantity","0"); // quantity not needed for market buy order 
        }};

    CoinyApiRequest.createRequest(this, "orders/buy",
                        buyOrder, "POST", new CoinyApiRequest.CoinyResponseListener() {
                    @Override
                    public void coinyRequestSuccess(JSONObject response) {
                        Log.i("CoinyOrderBuy", response.toString()); // will return an array of transactions because there are at least 2 transaction will occur. 1 is fee transaction, the other is buy transaction
                    }

                    @Override
                    public void coinyRequestFail(JSONObject error) {
                        Log.i("CoinyOrderBuy", error.toString());
                    }
                });
