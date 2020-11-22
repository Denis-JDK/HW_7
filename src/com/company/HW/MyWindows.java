package com.company.HW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MyWindows extends JFrame {
    MyWindows () {
        setVisible(true);
        setLocation(100, 300);
        setSize(400,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Мое окошко!");

        JPanel panel = new JPanel(new GridLayout(3,2));

        JButton btn1 = new JButton("Выход");
        panel.add(btn1);
        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JButton btn2 = new JButton(" Вторая кнопка");
        panel.add(btn2);
        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyWindows();
            }

    });
        add(panel, BorderLayout.SOUTH);
    }
}