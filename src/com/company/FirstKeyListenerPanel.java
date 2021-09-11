package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.lang.System.out;

public class FirstKeyListenerPanel extends JPanel implements KeyListener{
    private BufferedImage ep4, ep5, ep6;
    private int choice;

    public FirstKeyListenerPanel() {
        choice = 4;
        try {
            ep4 = ImageIO.read(new File("ep4.jpg"));
            ep5 = ImageIO.read(new File("ep5.jpg"));
            ep6 = ImageIO.read(new File("ep6.jpg"));
        } catch (Exception E) {
            out.println("Exception Error");
            return;
        }
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        switch (choice) {
            case 4:
                g.drawImage(ep4, 0, 0, getWidth(), getHeight(), null);
                break;
            case 5:
                g.drawImage(ep5, 0, 0, getWidth(), getHeight(), null);
                break;
            case 6:
                g.drawImage(ep6, 0, 0, getWidth(), getHeight(), null);
        }
        g.setColor(Color.red);
        g.drawString("Type 4, 5, or 6", 10, getHeight() - 10);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        choice = e.getKeyChar() - '0';
        out.println(choice);
        repaint();
    }

    public void addNotify(){
        super.addNotify();
        requestFocus();
    }
}
