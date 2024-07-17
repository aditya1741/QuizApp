package com.aditya.quizapp.model;

public class CategoryRvModel {
    private int imgId;
    private String categoryTitle;
    private String totalQuestion;

    public CategoryRvModel(int imgId, String categoryTitle, String totalQuestion) {
        this.imgId = imgId;
        this.categoryTitle = categoryTitle;
        this.totalQuestion = totalQuestion;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(String totalQuestion) {
        this.totalQuestion = totalQuestion;
    }
}
