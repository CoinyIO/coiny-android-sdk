package io.coiny.android.sdk.models;

import java.util.Date;

import io.coiny.android.sdk.helper.Enums;

public class TransactionModel {

    public static class TransactionResponse {

        private String id;
        private Date createDate;
        private double preBalance;
        private double value;
        private double currentBalance;
        private String walletId;
        private WalletModel.CurrencyResponse currency;
        private String address;
        private Enums.TransactionStatusType status;
        private Enums.TransactionType type;
        private String desc;
        private double tradeValue;
        private WalletModel.CurrencyResponse tradeCurrency;

        public TransactionResponse(String id, Date createDate, double preBalance, double value,
                                   double currentBalance, String walletId, WalletModel.CurrencyResponse currency,
                                   String address, Enums.TransactionStatusType status,
                                   Enums.TransactionType type, String desc, double tradeValue,
                                   WalletModel.CurrencyResponse tradeCurrency) {
            this.id = id;
            this.createDate = createDate;
            this.preBalance = preBalance;
            this.value = value;
            this.currentBalance = currentBalance;
            this.walletId = walletId;
            this.currency = currency;
            this.address = address;
            this.status = status;
            this.type = type;
            this.desc = desc;
            this.tradeValue = tradeValue;
            this.tradeCurrency = tradeCurrency;
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

        public double getPreBalance() {
            return preBalance;
        }

        public void setPreBalance(double preBalance) {
            this.preBalance = preBalance;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public double getCurrentBalance() {
            return currentBalance;
        }

        public void setCurrentBalance(double currentBalance) {
            this.currentBalance = currentBalance;
        }

        public String getWalletId() {
            return walletId;
        }

        public void setWalletId(String walletId) {
            this.walletId = walletId;
        }

        public WalletModel.CurrencyResponse getCurrency() {
            return currency;
        }

        public void setCurrency(WalletModel.CurrencyResponse currency) {
            this.currency = currency;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Enums.TransactionStatusType getStatus() {
            return status;
        }

        public void setStatus(Enums.TransactionStatusType status) {
            this.status = status;
        }

        public Enums.TransactionType getType() {
            return type;
        }

        public void setType(Enums.TransactionType type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public double getTradeValue() {
            return tradeValue;
        }

        public void setTradeValue(double tradeValue) {
            this.tradeValue = tradeValue;
        }

        public WalletModel.CurrencyResponse getTradeCurrency() {
            return tradeCurrency;
        }

        public void setTradeCurrency(WalletModel.CurrencyResponse tradeCurrency) {
            this.tradeCurrency = tradeCurrency;
        }
    }
}
