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
public class baitap16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap doanh thu ");
        double doanhthu=sc.nextDouble();
        double hoahong=0;
        if(doanhthu>100000000){
            hoahong=(double)5000000*3/100+5000000*5/100+(doanhthu-10000000)*7/100;
                    
        }else if (doanhthu>500000000){
        hoahong=(double)500000000*3+(doanhthu-500000000)*3/100;
        
        }else{
          hoahong=doanhthu*3/100;     
       }   
        System.out.println("hoa hong nhan duoc "+hoahong);
    }
}
