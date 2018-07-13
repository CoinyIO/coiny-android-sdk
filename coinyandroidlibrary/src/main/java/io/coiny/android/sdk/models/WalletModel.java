package io.coiny.android.sdk.models;

import java.util.Date;

import io.coiny.android.sdk.helper.Enums;

public class WalletModel {

    public class WalletResponse {

        private String id;
        private Date createDate;
        private double balance;
        private Enums.WalletType type;
        private String name;
        private CurrencyResponse currency;
        private WalletAddress[] addresses;
        private boolean isTagEnabled;

        public WalletResponse(String id, Date createDate, double balance, Enums.WalletType type,
                              String name, CurrencyResponse currency, WalletAddress[] addresses,
                              boolean isTagEnabled) {
            this.id = id;
            this.createDate = createDate;
            this.balance = balance;
            this.type = type;
            this.name = name;
            this.currency = currency;
            this.addresses = addresses;
            this.isTagEnabled = isTagEnabled;
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

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public Enums.WalletType getType() {
            return type;
        }

        public void setType(Enums.WalletType type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CurrencyResponse getCurrency() {
            return currency;
        }

        public void setCurrency(CurrencyResponse currency) {
            this.currency = currency;
        }

        public WalletAddress[] getAddresses() {
            return addresses;
        }

        public void setAddresses(WalletAddress[] addresses) {
            this.addresses = addresses;
        }

        public boolean isTagEnabled() {
            return isTagEnabled;
        }

        public void setTagEnabled(boolean tagEnabled) {
            isTagEnabled = tagEnabled;
        }
    }

    public class CurrencyResponse {

        private String id;
        private Date createDate;
        private String name;
        private String shortName;
        private String symbol;

        public CurrencyResponse(String id, Date createDate, String name, String shortName, String symbol) {
            this.id = id;
            this.createDate = createDate;
            this.name = name;
            this.shortName = shortName;
            this.symbol = symbol;
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

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }
    }

    public class WalletAddress {

        private String id;
        private Date createDate;
        private String name;
        private String address;
        private String tag;

        public WalletAddress(String id, Date createDate, String name, String address, String tag) {
            this.id = id;
            this.createDate = createDate;
            this.name = name;
            this.address = address;
            this.tag = tag;
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }
}
