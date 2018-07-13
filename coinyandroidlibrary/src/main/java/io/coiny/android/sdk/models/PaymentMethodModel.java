package io.coiny.android.sdk.models;

import java.util.Date;

public class PaymentMethodModel {

    public class PaymentMethodResponse {

        private String id;
        private Date createDate;
        private String name;
        private String slug;
        private boolean depositEnabled;
        private boolean withdrawEnabled;
        private boolean isPercental;
        private double depositFeeAmount;
        private double minimumDepositAmount;
        private double minimumWithdrawalAmount;
        private double withdrawalFeeAmount;

        public PaymentMethodResponse(String id, Date createDate, String name, String slug,
                                     boolean depositEnabled, boolean withdrawEnabled,
                                     boolean isPercental, double depositFeeAmount,
                                     double minimumDepositAmount, double minimumWithdrawalAmount,
                                     double withdrawalFeeAmount) {
            this.id = id;
            this.createDate = createDate;
            this.name = name;
            this.slug = slug;
            this.depositEnabled = depositEnabled;
            this.withdrawEnabled = withdrawEnabled;
            this.isPercental = isPercental;
            this.depositFeeAmount = depositFeeAmount;
            this.minimumDepositAmount = minimumDepositAmount;
            this.minimumWithdrawalAmount = minimumWithdrawalAmount;
            this.withdrawalFeeAmount = withdrawalFeeAmount;
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

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public boolean isDepositEnabled() {
            return depositEnabled;
        }

        public void setDepositEnabled(boolean depositEnabled) {
            this.depositEnabled = depositEnabled;
        }

        public boolean isWithdrawEnabled() {
            return withdrawEnabled;
        }

        public void setWithdrawEnabled(boolean withdrawEnabled) {
            this.withdrawEnabled = withdrawEnabled;
        }

        public boolean isPercental() {
            return isPercental;
        }

        public void setPercental(boolean percental) {
            isPercental = percental;
        }

        public double getDepositFeeAmount() {
            return depositFeeAmount;
        }

        public void setDepositFeeAmount(double depositFeeAmount) {
            this.depositFeeAmount = depositFeeAmount;
        }

        public double getMinimumDepositAmount() {
            return minimumDepositAmount;
        }

        public void setMinimumDepositAmount(double minimumDepositAmount) {
            this.minimumDepositAmount = minimumDepositAmount;
        }

        public double getMinimumWithdrawalAmount() {
            return minimumWithdrawalAmount;
        }

        public void setMinimumWithdrawalAmount(double minimumWithdrawalAmount) {
            this.minimumWithdrawalAmount = minimumWithdrawalAmount;
        }

        public double getWithdrawalFeeAmount() {
            return withdrawalFeeAmount;
        }

        public void setWithdrawalFeeAmount(double withdrawalFeeAmount) {
            this.withdrawalFeeAmount = withdrawalFeeAmount;
        }
    }
}
