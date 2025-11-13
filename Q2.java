/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int queries;
        int count=0;
        long number;
        int Luckydigit;
        int digit;
        
        
        do{
            System.out.println("Enter the number of queries: ");
            queries=sc.nextInt();
            if(queries < 1 || queries > 200){
            System.out.println("Please enter a number between 1 and 200");
            System.out.println("");
            }
        }while (queries < 1 || queries > 200);
        
        for(int z=0;z<queries;z++){
            int LuckyCount=0,ZeroCount=0,EvenCount=0,OddCount=0;
            count=0;
   
            do{    

                System.out.println("Enter the number to analyze: ");
                number=sc.nextLong();
                System.out.println("Enter the Lucky Digit: ");
                Luckydigit=sc.nextInt();

                if(number < 0 ||number > 2000000000){
                    System.out.println("Your number must be between 0 and 2000000000");
                    System.out.println("");
                }
                if(Luckydigit < 0 || Luckydigit > 9){
                    System.out.println("Your lucky number must be between 0 and 9");
                    System.out.println("");
                }
            }while((number < 0 ||number > 2000000000)||(Luckydigit < 0 || Luckydigit > 9));
            
            
            if (number==0){
                if(Luckydigit==0){
                    System.out.println("LUCKY");
                    continue;
                }
            } 
                
            while (number>0){
                digit=(int)number%10;
                    if(digit==Luckydigit)
                        LuckyCount++;
                    else if(digit==0)
                        ZeroCount++;
                    else if(digit%2==0)
                        EvenCount++;
                    else
                        OddCount++;
                    number/=10;
            }
            
            if (LuckyCount > ZeroCount && LuckyCount > EvenCount && LuckyCount > OddCount)
                System.out.println("LUCKY");
            else if (EvenCount > LuckyCount && EvenCount > ZeroCount && EvenCount > OddCount)
                System.out.println("BALANCED");
            else if(OddCount > LuckyCount && OddCount > ZeroCount && OddCount > EvenCount)
                System.out.println("ENERGETIC");
            else
                System.out.println("NEUTRAL");
        }
    }
    
}
