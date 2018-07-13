package io.coiny.android.sdk.models;

import java.util.Date;

public class PriceModel {

    public class PriceResponse {

        private double bid;
        private double ask;
        private double size;
        private double price;
        private double volume;
        private String tradeId;
        private WalletModel.CurrencyResponse currency;

        public PriceResponse(double bid, double ask, double size, double price, double volume, String tradeId, WalletModel.CurrencyResponse currency) {
            this.bid = bid;
            this.ask = ask;
            this.size = size;
            this.price = price;
            this.volume = volume;
            this.tradeId = tradeId;
            this.currency = currency;
        }

        public double getBid() {
            return bid;
        }

        public void setBid(double bid) {
            this.bid = bid;
        }

        public double getAsk() {
            return ask;
        }

        public void setAsk(double ask) {
            this.ask = ask;
        }

        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        public String getTradeId() {
            return tradeId;
        }

        public void setTradeId(String tradeId) {
            this.tradeId = tradeId;
        }

        public WalletModel.CurrencyResponse getCurrency() {
            return currency;
        }

        public void setCurrency(WalletModel.CurrencyResponse currency) {
            this.currency = currency;
        }
    }

    public class StatsResponse {

        private double lowPrice;
        private double highPrice;
        private double openPrice;
        private double nowPrice;
        private double volume;

        public StatsResponse(double lowPrice, double highPrice, double openPrice, double nowPrice, double volume) {
            this.lowPrice = lowPrice;
            this.highPrice = highPrice;
            this.openPrice = openPrice;
            this.nowPrice = nowPrice;
            this.volume = volume;
        }

        public double getLowPrice() {
            return lowPrice;
        }

        public void setLowPrice(double lowPrice) {
            this.lowPrice = lowPrice;
        }

        public double getHighPrice() {
            return highPrice;
        }

        public void setHighPrice(double highPrice) {
            this.highPrice = highPrice;
        }

        public double getOpenPrice() {
            return openPrice;
        }

        public void setOpenPrice(double openPrice) {
            this.openPrice = openPrice;
        }

        public double getNowPrice() {
            return nowPrice;
        }

        public void setNowPrice(double nowPrice) {
            this.nowPrice = nowPrice;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }
    }

    public class MarketCandleResponse {

        private double lowPrice;
        private double highPrice;
        private double openPrice;
        private double closePrice;
        private double volumePrice;
        private double volumeQuantity;
        private double weightedAverage;
        private Date timestamp;

        public MarketCandleResponse(double lowPrice, double highPrice, double openPrice,
                                    double closePrice, double volumePrice, double volumeQuantity,
                                    double weightedAverage, Date timestamp) {
            this.lowPrice = lowPrice;
            this.highPrice = highPrice;
            this.openPrice = openPrice;
            this.closePrice = closePrice;
            this.volumePrice = volumePrice;
            this.volumeQuantity = volumeQuantity;
            this.weightedAverage = weightedAverage;
            this.timestamp = timestamp;
        }

        public double getLowPrice() {
            return lowPrice;
        }

        public void setLowPrice(double lowPrice) {
            this.lowPrice = lowPrice;
        }

        public double getHighPrice() {
            return highPrice;
        }

        public void setHighPrice(double highPrice) {
            this.highPrice = highPrice;
        }

        public double getOpenPrice() {
            return openPrice;
        }

        public void setOpenPrice(double openPrice) {
            this.openPrice = openPrice;
        }

        public double getClosePrice() {
            return closePrice;
        }

        public void setClosePrice(double closePrice) {
            this.closePrice = closePrice;
        }

        public double getVolumePrice() {
            return volumePrice;
        }

        public void setVolumePrice(double volumePrice) {
            this.volumePrice = volumePrice;
        }

        public double getVolumeQuantity() {
            return volumeQuantity;
        }

        public void setVolumeQuantity(double volumeQuantity) {
            this.volumeQuantity = volumeQuantity;
        }

        public double getWeightedAverage() {
            return weightedAverage;
        }

        public void setWeightedAverage(double weightedAverage) {
            this.weightedAverage = weightedAverage;
        }

        public Date getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Date timestamp) {
            this.timestamp = timestamp;
        }
    }
}