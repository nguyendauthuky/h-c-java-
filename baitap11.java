/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author kyngu
 */
public class baitap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap nam sinh cua ban ");
        int namsinh=sc.nextInt();
        int namhientai=LocalDate.now().getYear();
        int sotuoi =namhientai-namsinh;
        System.out.println("so tuoi cua ban la "+sotuoi);
        
    }
}
