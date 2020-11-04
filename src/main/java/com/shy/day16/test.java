package com.shy.day16;

/**
 * @ClassName test
 * @Author shy
 * @Date 2020/11/4
 **/
public class test {
    public static void main(String[] args) {
        String email = StringUtil.getHideEmailPrefix("2437309168@qq.com");
        System.out.println("隐藏后的邮箱：" + email);
        int count = StringUtil.countSubStr("qwerabcdab", "ab");
        System.out.println("出现的次数:" + count);
        String str = StringUtil.left("HelloWorld", 3);
        System.out.println("左侧的字符串：" + str);
    }
}
