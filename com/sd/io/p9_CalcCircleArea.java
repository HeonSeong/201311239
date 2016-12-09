package com.sd.io;
import java.util.Scanner;

public class p9_CalcCircleArea{
    public void Calc(){
    Scanner sc=new Scanner(System.in);
    System.out.print("반지름을 입력하세요:");

    double r=sc.nextDouble();
    double area=Math.PI*Math.pow(r,2);
    System.out.print("r:%.2f area: %.2f",r,area);
    }
	
    public static void main(String[] args){
    p9_CalcCircleArea test1=new p9_CalcCircleArea();
    test1.Calc(); 
    }
    
}