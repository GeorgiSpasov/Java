package com.basics.events;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JLabel lblIntro;

    public TextFieldFrame() {
        super("Testing Events");
        setLayout(new FlowLayout());

        lblIntro = new JLabel("Enter text and press Enter");
        add(lblIntro);

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField(10);
        add(textField2);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
    }

    private class TextFieldHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";

            if (event.getSource() == textField1) {
                string = String.format("textField1: %s", textField1.getText());
            } else if (event.getSource() == textField2) {
                string = String.format("textField2: %s", textField2.getText());
            }

            JOptionPane.showMessageDialog(null, string);
        }
    }
}
