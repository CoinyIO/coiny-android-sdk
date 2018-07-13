package io.coiny.android.sdk.models;

import io.coiny.android.sdk.helper.Enums;

public class OrderModel {

    public static class OrderRequest {

        private double quantity;
        private double price;
        private String pair;
        private Enums.OrderType orderType;

        public OrderRequest(double quantity, double price, String pair, Enums.OrderType orderType) {
            this.quantity = quantity;
            this.price = price;
            this.pair = pair;
            this.orderType = orderType;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getPair() {
            return pair;
        }

        public void setPair(String pair) {
            this.pair = pair;
        }

        public Enums.OrderType getOrderType() {
            return orderType;
        }

        public void setOrderType(Enums.OrderType orderType) {
            this.orderType = orderType;
        }
    }

    public class OrderResponse {

        private String id;
        private String createDate;
        private TransactionModel.TransactionResponse[] transactions;

        public OrderResponse(String id, String createDate, TransactionModel.TransactionResponse[] transactions) {
            this.id = id;
            this.createDate = createDate;
            this.transactions = transactions;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public TransactionModel.TransactionResponse[] getTransactions() {
            return transactions;
        }

        public void setTransactions(TransactionModel.TransactionResponse[] transactions) {
            this.transactions = transactions;
        }
    }
}
