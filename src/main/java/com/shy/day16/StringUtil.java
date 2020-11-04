package com.shy.day16;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName StringUtil
 * @Author shy
 * @Date 2020/11/4
 **/
public class StringUtil {
    /**
     * 判断是否是空字符串，null和""都返回 true
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        return str == null || "".equals(str);
    }

    /**
     * 把String array of list 用给定的符号symbol连接成一个字符串
     * @param list      需要处理的列表
     * @param symbol    链接的符号
     * @return          处理后的字符串
     */
    public static String joinString(List<Object> list, String symbol) {
        StringBuilder result = new StringBuilder();
        if (list != null){
            for (Object o : list){
                String temp = o.toString();
                if (temp.trim().length() > 0){
                    result.append(temp).append(symbol);
                }
            }
            if (result.length() > 1) {
                result = new StringBuilder(result.substring(0, result.length()-1));
            }
        }
        return result.toString();
    }

    /**
     * 字符串省略截取
     * 字符串截取到指定长度size+...的形式
     * @param subject   需要处理的字符串
     * @param size      截取的长度
     * @return          处理后的字符串
     */
    public static String sunStringOmit(String subject, int size) {
        if (subject != null && subject.length() > size){
            subject = subject.substring(0,size) + "...";
        }
        return subject;
    }

    /**
     * 隐藏邮件地址前缀
     * @param email Email邮件地址，列入ssss@qq.com
     * @return      返回已经隐藏前缀邮箱地址，如******@qq.com
     */
    public static String getHideEmailPrefix(String email) {
        if (null != email) {
            int index = email.lastIndexOf("@");
            if (index > 0){
                email = repeat("*",index).concat(email.substring(index));
            }
        }
        return email;
    }

    /**
     * repeat       通过源字符串重复生成N次新的字符串
     * @param src   源字符串 列如：空格（“ ”），星号（“*”），“浙江”
     * @param num   重复生成次数
     * @return      返回已生成的重复字符串
     */
    private static String repeat(String src, int num) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <num ; i++) {
            s.append(src);
        }
        return s.toString();
    }

    /**
     * 截取字符串左侧的Num位截取到末尾
     * @param str1  处理的字符串
     * @param num   开始位置
     * @return      截取后的字符串
     */
    public static String lTrim(String str1,int num){
        String tt = "";
        if (str1.length() >= num && !isEmpty(str1)) {
            tt= str1.substring(num, str1.length());
        }
        return tt;
    }

    /**
     *  根据指定的字符串把源字符串分割成一个list
     * @param src       处理的字符串
     * @param patten    分割字符串
     * @return          处理后的list
     */
    public static List<String> parseString2List(String src,String patten){
        List<String> list=new ArrayList<>();
        if (src != null) {
            String[] tt=src.split(patten);
            list.addAll(Arrays.asList(tt));
        }
        return list;
    }

    /**
     * 格式化一个float
     * @param format 需要格式化的格式 such as #.00,#.#
     * @return       格式化后的字符串
     */
    public static String formatDouble(double f,String format){
        DecimalFormat decimalFormat = new DecimalFormat(format);
        return decimalFormat.format(f);
    }

    /**
     * 截取字符串左侧指定长度的字符串
     * @param input 输入字符串
     * @param count 截取长度
     * @return      截取的字符串
     */
    public static String left(String input,int count){
        if (isEmpty(input)){
            return "";
        }
        count = Math.min(count, input.length());
        return input.substring(0,count);
    }

    /**
     * 获取字符串str在String中出现的次数
     * @param str 子字符串
     */
    public static String trimPunct(String str){
        if (isEmpty(str))
            return "";
        return str.replaceAll("[\\pP\\p{Punct}]","");
    }

    /**
     * 获取字符串str在string中出现的次数
     * @param string 处理的字符串
     * @param str 子字符串
     */
    public static int countSubStr(String string,String str){
        if ((str==null)||(str.length()==0||(string==null)||(string.length()==0)))
            return 0;
        int count=0;
        int index=0;
        while ((index=string.indexOf(str,index))!=-1){
            count++;
            index+= str.length();
        }
        return count;
    }

}
