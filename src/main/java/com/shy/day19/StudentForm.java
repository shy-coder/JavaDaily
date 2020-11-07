package com.shy.day19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName StudentForm
 * @Author shy
 * @Date 2020/11/7
 **/
public class StudentForm {
    private JPanel mainPanel;
    private JButton button2;
    private JButton button4;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel leftPanel;
    private JTextField nameField;
    private JTextField weightField;
    private JButton 检查Button;
    private JLabel resultLabel;

    public StudentForm() {
        检查Button.addActionListener(e -> {
            //点击按钮需要做的逻辑
            System.out.println("click");
            String name = nameField.getText();
            int weight = Integer.parseInt(weightField.getText());
            student student = new student(name,weight);
            if (weight > 100){
                //JOptionPane.showMessageDialog(null,"体检不通过");
                resultLabel.setText(student.getName()+"体检未通过");
            }else {
                //JOptionPane.showMessageDialog(null,"体检通过");
                resultLabel.setText(student.getName()+"体检通过");
            }
            nameField.setText("");
            weightField.setText("");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentForm");
        frame.setContentPane(new StudentForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setSize(1200,900);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
