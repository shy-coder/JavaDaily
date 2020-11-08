package com.shy.day20;

import javax.swing.*;

/**
 * @ClassName HelloWorldSwiing
 * @Author shy
 * @Date 2020/11/8
 **/
public class HelloWorldSwing {

    public static void main(String[] args) {
        //显示应用 GUI
        javax.swing.SwingUtilities.invokeLater(HelloWorldSwing::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        //漂酿的外观
        JFrame.setDefaultLookAndFeelDecorated(true);

        //创建及设置窗口
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //添加 "Hello World" 标签
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        //显示窗口
        frame.pack();
        frame.setVisible(true);
    }
}
