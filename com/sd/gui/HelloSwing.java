package com.sd.gui;

import javax.swing.JFrame;

public class HelloSwing extends JFrame{
    public HelloSwing(){
        setTitle("Hello");
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args){
      HelloSwing h1=new HelloSwing();  
        h1.show();
        }
}
