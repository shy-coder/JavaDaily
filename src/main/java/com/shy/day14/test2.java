package com.shy.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName test2
 * @Author shy
 * @Date 2020/11/2
 **/
public class test2 {
    public static void main(String[] args) {
        String check = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher("03174154204");
        System.out.println(matcher.matches());
    }
}
