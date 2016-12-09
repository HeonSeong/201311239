package com.sd.gui;

import javax.swing.*;
import java.awt.*;

public class CalcAreaGUIMain extends JFrame{
    JTextField radiusTf1, areaTf2;
    public CalcAreaGUIMain(){
        JPanel panel=new JPanel(new GridLayout(3,2));
        Container pane=getContentPane();
        pane.add(panel);
        JLabel label1=new JLabel("Radius ");
        JLabel label2=new JLabel("Area ");
        
        radiusTf1=new JTextField(10);
        areaTf2=new JTextField(10);
        
        JButton button1=new JButton("Compute ");
        JButton button2=new JButton("Cancel ");
        
        panel.add(label1);
        panel.add(radiusTf1);
        panel.add(label2);
        panel.add(areaTf2);
        panel.add(button1);
        panel.add(button2);
        pack();
        setVisible(true);
        }
        
        public static void main(String[] args){
        CalcAreaGUIMain gui1=new CalcAreaGUIMain();
        gui1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        }
}
        