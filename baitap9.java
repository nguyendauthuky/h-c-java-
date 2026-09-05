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
public class baitap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("nhap so giay");
        int giay=sc.nextInt();
        int gio=giay/3600;
        int sogiayconlai=giay%3600;
        int phut=sogiayconlai/60;
        int sogiayconthua=sogiayconlai%60;
        System.out.println("so gio "+gio);
        System.out.println("so phut"+phut);
        System.out.println("so giay"+sogiayconthua);
    }
}
