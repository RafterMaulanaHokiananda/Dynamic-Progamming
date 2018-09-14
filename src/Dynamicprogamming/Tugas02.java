/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamicprogamming;
import java.util.Scanner;
/**
 *
 * @author Rafter PC
 */
public class Tugas02 {
    public static void main(String[] args) {
        Scanner sistem = new Scanner(System.in);
        int arr[]= {7, 5, 4, 3, 2};
        int arr1[]= {10000, 7000, 5000, 3000, 2000};
        int bayaran = 0;
        
        System.out.print("Jumlah berat maksimal : ");
        int n = sistem.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            int hasil =  n / arr[i];
            n = n - (arr[i] * hasil);
            bayaran += hasil * arr1[i];
        }
        System.out.println("Bayaran yang didapat : " + bayaran);
    }
}
