/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

import java.util.Scanner;

/**
 *
 * @author kyngu
 */
public class baitap10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("nhsp so tien ");
        double sotien=sc.nextDouble();
        System.out.println("nhap so phan tram giam gia  %");
        double phantram=sc.nextDouble();
        double giaphaitra=(sotien*phantram)/100;
        System.out.println("gia ma ban phai tra la "+giaphaitra);
    }
 
}
