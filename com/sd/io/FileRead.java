package com.sd.io;

import java.io.*;

public class FileRead{
    public static void main(String[] args) throws Exception{ 
      File f=new File("test.txt");
      FileReader fr=new FileReader(f);
      BufferedReader br=new BufferedReader(fr);
      String s;
      while((s=br.readLine())!=null){ //EOF->end of file 
          System.out.println(s);
      }
      fr.close(); 
    }
}