package com.company;

import javax.swing.*;

public class FirstKeyListener extends JFrame {
    private static final int WIDTH = 1600;
    private static final int HEIGHT = 960;

    public FirstKeyListener(String title){
        super(title);
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new FirstKeyListenerPanel());
        setVisible(true);
    }

}
