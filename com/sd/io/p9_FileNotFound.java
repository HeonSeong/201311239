package com.sd.io;
import java.io.*;

public class p9_FileNotFound extends Exception {

    public static void main(String[] args){
        try{
         File f=new File("noname.txt");
         FileReader fr=new FileReader(f);
      
        } 
        catch(FileNotFoundException e){
        System.out.println("������ ã�� �� �����ϴ�.");
    }
}
}