package com.sd.io;

import java.io.*;
import java.util.Scanner;

public class p9_PrintFile{
    public static void main(String[] args)throws FileNotFoundException {
    Scanner f=new Scanner(new File("Hi.txt"));
    String line=f.nextLine();
    System.out.println(line);
    }
}