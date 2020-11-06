package com.shy.day18;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @ClassName MD5test
 * @Author shy
 * @Date 2020/11/6
 **/
public class MD5test {
    public static void main(String[] args) {
        String str = "qwer12345";
        System.out.println("加密前的密码：" + str);
        String md5Str = createMD5(str);
        System.out.println("加密后的密码:" + md5Str);
    }
    /**
     * 创建给定字符串对应的加密后的字符串
     */
    public static String createMD5(String str) {
        str = str + "shy";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] b = md.digest();

            int temp;
            StringBuilder sb = new StringBuilder("");
            for (byte b1 : b) {
                temp = b1;
                if (temp < 0) temp += 256;
                if (temp < 16) sb.append("0");
                sb.append(Integer.toHexString(temp));
            }
            str = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return str;
    }
}
