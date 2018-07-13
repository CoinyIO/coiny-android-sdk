package io.coiny.android.sdk.models;

import java.util.Date;
import java.util.List;

import io.coiny.android.sdk.helper.Enums;

public class UserModel {

    public class UserRequest {

        private String firstname;
        private String lastname;
        private String email;
        private String password;
        private String confirmPassword;
        private String phoneNumber;

        public UserRequest(String firstname, String lastname, String email, String password, String confirmPassword, String phoneNumber) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
            this.password = password;
            this.confirmPassword = confirmPassword;
            this.phoneNumber = phoneNumber;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getConfirmPassword() {
            return confirmPassword;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    public class UserResponse {

        private String id;
        private Date createDate;
        private List<RoleResponse> roles;
        private String email;
        private String phoneNumber;
        private String firstname;
        private String lastname;
        private String imageUrl;
        private Enums.UserStatus status;
        private String voucherId;

        public UserResponse(String id, Date createDate, List<RoleResponse> roles, String email,
                            String phoneNumber, String firstname, String lastname, String imageUrl,
                            Enums.UserStatus status, String voucherId) {
            this.id = id;
            this.createDate = createDate;
            this.roles = roles;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.firstname = firstname;
            this.lastname = lastname;
            this.imageUrl = imageUrl;
            this.status = status;
            this.voucherId = voucherId;
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

        public List<RoleResponse> getRoles() {
            return roles;
        }

        public void setRoles(List<RoleResponse> roles) {
            this.roles = roles;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public Enums.UserStatus getStatus() {
            return status;
        }

        public void setStatus(Enums.UserStatus status) {
            this.status = status;
        }

        public String getVoucherId() {
            return voucherId;
        }

        public void setVoucherId(String voucherId) {
            this.voucherId = voucherId;
        }
    }

    public class RoleResponse {

        private String id;
        private Date createDate;
        private String name;
        private String displayName;
        private String description;

        public RoleResponse(String id, Date createDate, String name, String displayName, String description) {
            this.id = id;
            this.createDate = createDate;
            this.name = name;
            this.displayName = displayName;
            this.description = description;
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

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public class UserLimitsResponse {

        private String id;
        private Date createDate;
        private double currentDailyFiatDeposit;
        private double currentDailyFiatWithdrawal;
        private double currentMonthlyFiatDeposit;
        private double currentMonthlyFiatWithdrawal;
        private double dailyMaxFiatDeposit;
        private double dailyMaxCryptoDeposit;
        private double dailyMaxFiatWithdrawal;
        private double dailyMaxCryptoWithdrawal;
        private double monthlyMaxCryptoDeposit;
        private double monthlyMaxFiatDeposit;
        private double monthlyMaxFiatWithdrawal;
        private double monthlyMaxCryptoWithdrawal;
        private int type;

        public UserLimitsResponse(String id, Date createDate, double currentDailyFiatDeposit,
                                  double currentDailyFiatWithdrawal, double currentMonthlyFiatDeposit,
                                  double currentMonthlyFiatWithdrawal, double dailyMaxFiatDeposit,
                                  double dailyMaxCryptoDeposit, double dailyMaxFiatWithdrawal,
                                  double dailyMaxCryptoWithdrawal, double monthlyMaxCryptoDeposit,
                                  double monthlyMaxFiatDeposit, double monthlyMaxFiatWithdrawal,
                                  double monthlyMaxCryptoWithdrawal, int type) {
            this.id = id;
            this.createDate = createDate;
            this.currentDailyFiatDeposit = currentDailyFiatDeposit;
            this.currentDailyFiatWithdrawal = currentDailyFiatWithdrawal;
            this.currentMonthlyFiatDeposit = currentMonthlyFiatDeposit;
            this.currentMonthlyFiatWithdrawal = currentMonthlyFiatWithdrawal;
            this.dailyMaxFiatDeposit = dailyMaxFiatDeposit;
            this.dailyMaxCryptoDeposit = dailyMaxCryptoDeposit;
            this.dailyMaxFiatWithdrawal = dailyMaxFiatWithdrawal;
            this.dailyMaxCryptoWithdrawal = dailyMaxCryptoWithdrawal;
            this.monthlyMaxCryptoDeposit = monthlyMaxCryptoDeposit;
            this.monthlyMaxFiatDeposit = monthlyMaxFiatDeposit;
            this.monthlyMaxFiatWithdrawal = monthlyMaxFiatWithdrawal;
            this.monthlyMaxCryptoWithdrawal = monthlyMaxCryptoWithdrawal;
            this.type = type;
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

        public double getCurrentDailyFiatDeposit() {
            return currentDailyFiatDeposit;
        }

        public void setCurrentDailyFiatDeposit(double currentDailyFiatDeposit) {
            this.currentDailyFiatDeposit = currentDailyFiatDeposit;
        }

        public double getCurrentDailyFiatWithdrawal() {
            return currentDailyFiatWithdrawal;
        }

        public void setCurrentDailyFiatWithdrawal(double currentDailyFiatWithdrawal) {
            this.currentDailyFiatWithdrawal = currentDailyFiatWithdrawal;
        }

        public double getCurrentMonthlyFiatDeposit() {
            return currentMonthlyFiatDeposit;
        }

        public void setCurrentMonthlyFiatDeposit(double currentMonthlyFiatDeposit) {
            this.currentMonthlyFiatDeposit = currentMonthlyFiatDeposit;
        }

        public double getCurrentMonthlyFiatWithdrawal() {
            return currentMonthlyFiatWithdrawal;
        }

        public void setCurrentMonthlyFiatWithdrawal(double currentMonthlyFiatWithdrawal) {
            this.currentMonthlyFiatWithdrawal = currentMonthlyFiatWithdrawal;
        }

        public double getDailyMaxFiatDeposit() {
            return dailyMaxFiatDeposit;
        }

        public void setDailyMaxFiatDeposit(double dailyMaxFiatDeposit) {
            this.dailyMaxFiatDeposit = dailyMaxFiatDeposit;
        }

        public double getDailyMaxCryptoDeposit() {
            return dailyMaxCryptoDeposit;
        }

        public void setDailyMaxCryptoDeposit(double dailyMaxCryptoDeposit) {
            this.dailyMaxCryptoDeposit = dailyMaxCryptoDeposit;
        }

        public double getDailyMaxFiatWithdrawal() {
            return dailyMaxFiatWithdrawal;
        }

        public void setDailyMaxFiatWithdrawal(double dailyMaxFiatWithdrawal) {
            this.dailyMaxFiatWithdrawal = dailyMaxFiatWithdrawal;
        }

        public double getDailyMaxCryptoWithdrawal() {
            return dailyMaxCryptoWithdrawal;
        }

        public void setDailyMaxCryptoWithdrawal(double dailyMaxCryptoWithdrawal) {
            this.dailyMaxCryptoWithdrawal = dailyMaxCryptoWithdrawal;
        }

        public double getMonthlyMaxCryptoDeposit() {
            return monthlyMaxCryptoDeposit;
        }

        public void setMonthlyMaxCryptoDeposit(double monthlyMaxCryptoDeposit) {
            this.monthlyMaxCryptoDeposit = monthlyMaxCryptoDeposit;
        }

        public double getMonthlyMaxFiatDeposit() {
            return monthlyMaxFiatDeposit;
        }

        public void setMonthlyMaxFiatDeposit(double monthlyMaxFiatDeposit) {
            this.monthlyMaxFiatDeposit = monthlyMaxFiatDeposit;
        }

        public double getMonthlyMaxFiatWithdrawal() {
            return monthlyMaxFiatWithdrawal;
        }

        public void setMonthlyMaxFiatWithdrawal(double monthlyMaxFiatWithdrawal) {
            this.monthlyMaxFiatWithdrawal = monthlyMaxFiatWithdrawal;
        }

        public double getMonthlyMaxCryptoWithdrawal() {
            return monthlyMaxCryptoWithdrawal;
        }

        public void setMonthlyMaxCryptoWithdrawal(double monthlyMaxCryptoWithdrawal) {
            this.monthlyMaxCryptoWithdrawal = monthlyMaxCryptoWithdrawal;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }

}
