/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamicprogamming;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Rafter PC
 */
public class Latihan01 {    
    private static void tampilJudul(String identitas )
    {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonaci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
                
    }
    
    public static void main(String[] args) 
    {
         String identitas = " RAFTER MAULANA HOKIANANDA / XR2 / 27";
         
         tampilJudul(identitas);
    }
   
      
   
    
    private static int tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;
    }
    
    int n= tampilInput();
    
    private static BigInteger fibo(int n)
    {
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for(int i = 2; i < n; i++)
        {
            hasil[i] = hasil[i-1].add(hasil[i-2]);
        }
        
        return hasil[n-1];
    }
    
    BigInteger hasil = fibo(n);
    
   
}
