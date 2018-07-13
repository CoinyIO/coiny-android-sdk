package io.coiny.android.sdk.models;

import java.util.Date;

import io.coiny.android.sdk.helper.Enums;

public class BankAccountModel {

    public static class BankAccountRequest {

        private String iban;
        private Enums.AccountType accountType;
        private String name;

        public BankAccountRequest(String iban, String name) {
            this.iban = iban;
            this.name = name;
        }

        public String getIban() {
            return iban;
        }

        public void setIban(String iban) {
            this.iban = iban;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class BankAccountResponse {

        private String id;
        private Date createDate;
        private String name;
        private String accountType;
        private String iban;

        public BankAccountResponse(String id, Date createDate, String name, String accountType, String iban) {
            this.id = id;
            this.createDate = createDate;
            this.name = name;
            this.accountType = accountType;
            this.iban = iban;
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

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public String getIban() {
            return iban;
        }

        public void setIban(String iban) {
            this.iban = iban;
        }
    }

}
