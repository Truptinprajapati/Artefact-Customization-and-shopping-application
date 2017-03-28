package com.trupti_prajapati.retailapp.pojo;

/**
 * Created by Lenovo on 19-03-2017.
 */

public class PojoModel {


    /**
     * status : 1
     * userDetail : {"userId":3,"userName":"Rahul","address":"fdfdfdf","contactNumber":"8401265823","emailId":"rahul.yadav@ifuturz.com","userType":"1"}
     * message : You are Successfully Registered
     */

    private int status;
    private UserDetailBean userDetail;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public UserDetailBean getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetailBean userDetail) {
        this.userDetail = userDetail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class UserDetailBean {
        /**
         * userId : 3
         * userName : Rahul
         * address : fdfdfdf
         * contactNumber : 8401265823
         * emailId : rahul.yadav@ifuturz.com
         * userType : 1
         */

        private int userId;
        private String userName;
        private String address;
        private String contactNumber;
        private String emailId;
        private String userType;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }
    }
}
