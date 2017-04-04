package com.basics.events;

import javax.swing.JFrame;

public class TextFieldTest {

    public static void main(String[] args) {
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.pack();
        textFieldFrame.setLocationRelativeTo(null);
        textFieldFrame.setVisible(true);
    }
}
