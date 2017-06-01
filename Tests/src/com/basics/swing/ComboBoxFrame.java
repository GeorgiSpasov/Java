package com.basics.swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {

    private JComboBox imagesJComboBox;
    private JLabel label; // Display selected image

    private String names[] = {"Endevour.jpg", "ISS.jpg", "Orion.jpg", "Soyuz.jpg", "Tianlong.jpg", "Voyager1.jpg"};

    private Icon icons[] = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3])),
        new ImageIcon(getClass().getResource(names[4])),
        new ImageIcon(getClass().getResource(names[5]))
    }; // Add the source package folder with the images from the project properties

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox(names);
        imagesJComboBox.setMaximumRowCount(3);
        imagesJComboBox.setAlignmentX(BOTTOM_ALIGNMENT);

        imagesJComboBox.addItemListener(
                new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                }
            }
        }
        );

        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }
}
