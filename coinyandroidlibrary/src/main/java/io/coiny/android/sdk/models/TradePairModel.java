package io.coiny.android.sdk.models;

import java.util.Date;

public class TradePairModel {

    public class TradePairRequest {

        private String name;

        public TradePairRequest(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class TradePairsResponse {

        private String id;
        private Date createDate;
        private String name;
        private WalletModel.CurrencyResponse firstCurrency;
        private WalletModel.CurrencyResponse secondCurrency;

        public TradePairsResponse(String id, Date createDate, String name, WalletModel.CurrencyResponse firstCurrency, WalletModel.CurrencyResponse secondCurrency) {
            this.id = id;
            this.createDate = createDate;
            this.name = name;
            this.firstCurrency = firstCurrency;
            this.secondCurrency = secondCurrency;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Date getCreateDate() {
            return createDate;
        }

        public void setCreateDate(Date createDate) {
            this.createDate = createDate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public WalletModel.CurrencyResponse getFirstCurrency() {
            return firstCurrency;
        }

        public void setFirstCurrency(WalletModel.CurrencyResponse firstCurrency) {
            this.firstCurrency = firstCurrency;
        }

        public WalletModel.CurrencyResponse getSecondCurrency() {
            return secondCurrency;
        }

        public void setSecondCurrency(WalletModel.CurrencyResponse secondCurrency) {
            this.secondCurrency = secondCurrency;
        }
    }

}
