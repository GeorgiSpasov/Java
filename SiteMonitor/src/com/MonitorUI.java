/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Shadow
 */
public class MonitorUI extends JFrame {
    
    protected JLabel siteData;
    protected JButton btnGetData;
    protected JPanel innerPanel;
    protected SiteMonitor monitor;
    
    public MonitorUI() {
        super("Data Monitor");
        
        this.siteData = new JLabel();
        this.btnGetData = new JButton();
        this.innerPanel = new JPanel();
        this.monitor = new SiteMonitor();
        
        innerPanel.setLayout(new GridLayout(2, 1));
        innerPanel.add(siteData);
        innerPanel.add(btnGetData);
        
        getContentPane().add(innerPanel);
        
        btnGetData.setText("Get Data");
        btnGetData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    siteData.setText(monitor.sendGet());
                } catch (Exception ex) {
                }
            }
        });
        
        setSize(150, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new MonitorUI();
    }
}
