package io.coiny.android.sdk.helper;

public class Enums {

    public enum UserStatus {
        Rejected,Unverified,Processing,Verified
    }

    public enum WalletType {
        Undefined,Crypto,Fiat
    }

    public enum TransactionStatusType {
        Rejected,Failed,Undefined,Pending,Confirmed,Processing,Completed
    }

    public enum TransactionType {
        Undefined,Buy,Sell,FiatDeposit,FiatWithdraw,CryptoDeposit,CryptoWithdraw,Trade,CryptoFee,MakerFee,TakerFee,FiatWithdrawFee
    }

    public enum AccountType {
        Iban,AccountNumber
    }

    public enum OrderType {
        Market,Limit
    }
}
