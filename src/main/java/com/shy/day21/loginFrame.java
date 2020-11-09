package com.shy.day21;

import com.shy.day21.service.UserService;
import com.shy.day21.service.impl.UserServiceImpl;

import javax.swing.*;

/**
 * @ClassName loginFrame
 * @Author shy
 * @Date 2020/11/9
 **/
public class loginFrame {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel centerPanel;
    private JLabel logo;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JTextField nameField;
    private JPasswordField passwordField;
    private JButton loginButton;


    public loginFrame() {
        loginButton.addActionListener(e -> {
            //JOptionPane.showMessageDialog(null,"HelloWorld");
            String name = nameField.getText();
            char[] pwd = passwordField.getPassword();
            String password = new String(pwd);
            UserService userService = new UserServiceImpl();
            int flag = userService.login(name, password);
            if (flag == 1){
                JOptionPane.showMessageDialog(null,"登录成功");
            }else {
                JOptionPane.showMessageDialog(null,"登录失败");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("loginFrame");
        frame.setContentPane(new loginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

}
