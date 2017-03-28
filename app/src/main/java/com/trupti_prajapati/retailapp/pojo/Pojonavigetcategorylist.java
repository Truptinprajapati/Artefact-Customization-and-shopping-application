package com.trupti_prajapati.retailapp.pojo;

import java.util.List;

/**
 * Created by Lenovo on 21-03-2017.
 */

public class Pojonavigetcategorylist {


    /**
     * status : 1
     * categoryList : [{"categoryId":"4","categoryName":"CLOTH","subCategoryList":[{"categoryId":"1","categoryName":"MEN"}]},{"categoryId":"5","categoryName":"WATCH","subCategoryList":{"3":{"categoryId":"1","categoryName":"MEN"},"4":{"categoryId":"2","categoryName":"WOMEN"},"5":{"categoryId":"3","categoryName":"KIDS"}}},{"categoryId":"6","categoryName":"FOOTWEAR","subCategoryList":{"6":{"categoryId":"1","categoryName":"MEN"},"7":{"categoryId":"2","categoryName":"WOMEN"},"8":{"categoryId":"3","categoryName":"KIDS"}}},{"categoryId":"7","categoryName":"WALLET","subCategoryList":{"9":{"categoryId":"1","categoryName":"MEN"},"10":{"categoryId":"2","categoryName":"WOMEN"},"11":{"categoryId":"3","categoryName":"KIDS"}}},{"categoryId":"8","categoryName":"SUNGLASS","subCategoryList":{"12":{"categoryId":"1","categoryName":"MEN"},"13":{"categoryId":"2","categoryName":"WOMEN"},"14":{"categoryId":"3","categoryName":"KIDS"}}}]
     * Message : CategoryList fetched successfully
     */

    private int status;
    private String Message;
    private List<CategoryListBean> categoryList;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public List<CategoryListBean> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryListBean> categoryList) {
        this.categoryList = categoryList;
    }

    public static class CategoryListBean {
        /**
         * categoryId : 4
         * categoryName : CLOTH
         * subCategoryList : [{"categoryId":"1","categoryName":"MEN"}]
         */

        private String categoryId;
        private String categoryName;
        private List<SubCategoryListBean> subCategoryList;

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public List<SubCategoryListBean> getSubCategoryList() {
            return subCategoryList;
        }

        public void setSubCategoryList(List<SubCategoryListBean> subCategoryList) {
            this.subCategoryList = subCategoryList;
        }

        public static class SubCategoryListBean {
            /**
             * categoryId : 1
             * categoryName : MEN
             */

            private String categoryId;
            private String categoryName;

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public String getCategoryName() {
                return categoryName;
            }

            public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
            }
        }
    }
}
