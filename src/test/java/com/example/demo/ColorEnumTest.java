package com.example.demo;

import com.example.demo.constant.ColorEnum;
import org.junit.Test;

public class ColorEnumTest {
    @Test
    public  void test(){
        int blueColorCode= ColorEnum.BLUE.getColorCode();

        String greenColorName=ColorEnum.GREEN.getColorName();

        System.out.println("blueColorCode:"+blueColorCode);
        System.out.println("greenColorName:"+greenColorName);
    }
}
