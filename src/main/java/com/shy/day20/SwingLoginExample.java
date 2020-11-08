package com.shy.day20;

import javax.swing.*;

/**
 * @ClassName SwingLoginExample
 * @Author shy
 * @Date 2020/11/8
 **/
public class SwingLoginExample {

    public static void main(String[] args) {
        //创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        //设置窗体的宽和高
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
        创建面板，这个类与HTML的div标签相似
        我们可以创建多个面板并在 JFrame 中指定位置
        面板中我们可以添加文本字段，按钮及其他组件
         */
        JPanel panel = new JPanel();
        //添加面板
        frame.add(panel);
        /*
        调用用户定义的方法并添加组件到面板
         */
        placeComponents(panel);

        //设置界面可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        //布局部分不过多介绍，设置布局为 null
        panel.setLayout(null);

        //创建 JLabel
        JLabel userLable = new JLabel("User");
        /**
         * 这个方法定义了组件的位置，
         * setBounds(x,y,width,height)
         * x 和 y 指定左上角的新位置，由width 和 height 指定新的大小
         */
        userLable.setBounds(10,20,80,25);
        panel.add(userLable);

        /**
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        /**
         * 输入密码的文本域
         */
        JLabel passwordLabel = new JLabel("PassWord:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /**
         * 这个类是用于输入的文本域
         * 输入的信息会以点号代替，用于包含密码的安全性
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        /**
         *创建登录按钮
         */
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);
    }
}
