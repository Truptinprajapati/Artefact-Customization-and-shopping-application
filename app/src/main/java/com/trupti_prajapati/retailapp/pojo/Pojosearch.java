package com.trupti_prajapati.retailapp.pojo;

import java.util.List;

/**
 * Created by Lenovo on 21-03-2017.
 */

public class Pojosearch {


    /**
     * ExperienceList : [{"catId":"1","catName":"Electronics"}]
     * Message : Category list fetched successfully
     * status : 1
     */

    private String Message;
    private String status;
    private List<ExperienceListBean> ExperienceList;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ExperienceListBean> getExperienceList() {
        return ExperienceList;
    }

    public void setExperienceList(List<ExperienceListBean> ExperienceList) {
        this.ExperienceList = ExperienceList;
    }

    public static class ExperienceListBean {
        /**
         * catId : 1
         * catName : Electronics
         */

        private String catId;
        private String catName;

        public String getCatId() {
            return catId;
        }

        public void setCatId(String catId) {
            this.catId = catId;
        }

        public String getCatName() {
            return catName;
        }

        public void setCatName(String catName) {
            this.catName = catName;
        }
    }
}
