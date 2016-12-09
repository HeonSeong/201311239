package com.sd.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
    JTextField radiusTf1, areaTf2;
     JButton button1,button2;
    public CalcAreaGUIMain2(){
        JPanel panel=new JPanel(new GridLayout(3,2));
        Container pane=getContentPane();
        pane.add(panel);
        JLabel label1=new JLabel("Radius ");
        JLabel label2=new JLabel("Area ");
        
        radiusTf1=new JTextField(10);
        areaTf2=new JTextField(10);
        
        button1=new JButton("Compute ");
        button2=new JButton("Cancel ");
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        
        panel.add(label1);
        panel.add(radiusTf1);
        panel.add(label2);
        panel.add(areaTf2);
        panel.add(button1);
        panel.add(button2);
        pack();
        setVisible(true);
        }
        
       public void actionPerformed(ActionEvent e){
          if(e.getSource() == button1){
              double r =Double.parseDouble(radiusTf1.getText());
              areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
          }else if(e.getSource() == button2){
              radiusTf1.setText("");
              areaTf2.setText("");
	  }    
  }
        
        public static void main(String[] args){
        CalcAreaGUIMain2 gui1=new CalcAreaGUIMain2();
        gui1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        }
}
        