package com.sd.io;

import java.io.*;

public class p9_FileLowerCase{
   public static void main(String[] args) throws Exception {
   File f=new File("test.txt");
   FileReader fr=new FileReader(f);
   BufferedReader br=new BufferedReader(fr);
   String s;
   while((s=br.readLine())!=null){
     System.out.println(s.toLowerCase());
   }
   fr.close();
   }
}