package domain;

import enums.CategoryTypeEnum;

public class Mahsulotlar {
    private Integer sequence = 0;
    {
        sequence++;
    }
    private Integer categoryID = sequence;
    private CategoryTypeEnum categoryTypeEnum;
    private String categoryName;

    public Mahsulotlar(Integer sequence, Integer categoryID, CategoryTypeEnum categoryTypeEnum, String categoryName) {
        this.sequence = sequence;
        this.categoryID = categoryID;
        this.categoryTypeEnum = categoryTypeEnum;
        this.categoryName = categoryName;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public CategoryTypeEnum getCategoryTypeEnum() {
        return categoryTypeEnum;
    }

    public void setCategoryTypeEnum(CategoryTypeEnum categoryTypeEnum) {
        this.categoryTypeEnum = categoryTypeEnum;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "sequence=" + sequence +
                ", categoryID=" + categoryID +
                ", categoryTypeEnum=" + categoryTypeEnum +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
