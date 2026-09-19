/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong4;

import java.util.Scanner;

/**
 *
 * @author kyngu
 */
public class baitap14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap a");
        int a =sc.nextInt();
        System.out.print("nhap a");
        int b=sc.nextInt();
        System.out.print("nhap c");
        int c =sc.nextInt();
        double denlta=(double)b*b-4*a*c;
        if(denlta<0){
            System.out.println("phuong trinh vo nghiem ");
        }else if(denlta==0){
             double x=(double)-b/2*a;
            System.out.println("nghiem cua phuong trinh kep la "+x);
    }else{
            double x1=(-b+Math.sqrt(denlta)/2*a);
            double x2=(-b-Math.sqrt(denlta)/2*a);
            System.out.println("phuong trinh co nghiem la ");
            
                        
            
        }
                
        
    }
}
