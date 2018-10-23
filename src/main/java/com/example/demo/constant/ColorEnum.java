package com.example.demo.constant;

/**
 * 颜色枚举
 */
public enum  ColorEnum {
    RED(1,"红色"),
    GREEN(2,"绿色"),
    BLUE(3,"蓝色");

    private  int colorCode;
    private  String colorName;

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    ColorEnum(int colorCode, String colorName) {
        this.colorCode = colorCode;
        this.colorName = colorName;
    }
}
