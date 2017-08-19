/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Georgi Spasov
 */
public class MonitorUI extends JFrame {

    protected String data;
    protected JLabel dataContainer;
    protected JPanel innerPanel;
    protected SiteMonitor monitor;
    protected ImageIcon icon;

    protected SystemTray tray;
    protected TrayIcon trayIcon;

    private MonitorUI() {
        super("Site Monitor");
        icon = new ImageIcon(getClass().getResource("/com/monitor.png"));
        dataContainer = new JLabel();
        innerPanel = new JPanel();
        monitor = new SiteMonitor();

        setIconImage(icon.getImage());

        if (SystemTray.isSupported()) {
            tray = SystemTray.getSystemTray();

            ActionListener exitListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            };
            PopupMenu popup = new PopupMenu();
            MenuItem defaultItem = new MenuItem("Exit");
            defaultItem.addActionListener(exitListener);
            popup.add(defaultItem);
            defaultItem = new MenuItem("Open");
            defaultItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(true);
                    setExtendedState(JFrame.NORMAL);
                }
            });
            popup.add(defaultItem);
            trayIcon = new TrayIcon(icon.getImage(), "Site Monitor", popup);
            trayIcon.setImageAutoSize(true);
        } else {
        }

        addWindowStateListener(new WindowStateListener() {
            public void windowStateChanged(WindowEvent e) {
                if (e.getNewState() == ICONIFIED || e.getNewState() == 7) {
                    try {
                        tray.add(trayIcon);
                        setVisible(false);
                    } catch (AWTException ex) {
                    }
                }
                if (e.getNewState() == MAXIMIZED_BOTH || e.getNewState() == NORMAL) {
                    tray.remove(trayIcon);
                    setVisible(true);
                }
            }
        });

        dataContainer.setOpaque(true);
        dataContainer.setBackground(Color.WHITE);
//        dataContainer.setForeground(Color.red);
        dataContainer.setText("Getting data from site...");
        dataContainer.setToolTipText("Click to close");
        dataContainer.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                dispatchEvent(new WindowEvent(MonitorUI.this, WindowEvent.WINDOW_CLOSING));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                dataContainer.setBackground(Color.lightGray);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                dataContainer.setBackground(Color.white);
            }
        });

        innerPanel.setOpaque(false);
        innerPanel.setLayout(new FlowLayout());
        innerPanel.add(dataContainer);

        getContentPane().add(innerPanel);

        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        pack();
        setAlwaysOnTop(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            try {
                data = monitor.sendGet();
                dataContainer.setText(this.data);
                trayIcon.setToolTip(data);
                Thread.sleep(600000);
                dataContainer.setText("Refreshing...");
            } catch (Exception ex) {
            }
        }
    }

    public static void main(String[] args) {
        new MonitorUI();
    }
}
