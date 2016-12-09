package com.sd.io;
import java.io.*;

public class p9_FileWrite{
    public static void main(String[] args) throws Exception{
        FileWriter file=new FileWriter("Hi.txt");
	BufferedWriter bf=new BufferedWriter(file);
        bf.write("Test.txt->Changed ");
        bf.write("Hi Friends");
        bf.close();
        }
}
    