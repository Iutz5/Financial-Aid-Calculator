/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.financialaidcalculatormaven;

import java.util.Scanner;

/**
 *
 * @author ianut
 */
public class Main {
    /**
     * @param income
     * @param numKids
     * @param
     * @return 
     */
    
    public static double computeAssistance(double income,int numKids) {
        double assistanceAmount = 0.0;
        if (income > 40000) {
            assistanceAmount = 0.0;
        }
        else if (income >= 30000) {
            if (numKids <= 2) {
                assistanceAmount = 500 * numKids;
            }
            else {
                assistanceAmount = 1000 * numKids;
            }
        }
        else if (income >= 20000) {
            if (numKids == 1) {
                assistanceAmount = 2000;
            }
            else if (numKids > 1) {
                assistanceAmount = 1500 * numKids;
            }
            else {
                assistanceAmount = 0.0;
            }
        }
        else {
            assistanceAmount = 2100 * numKids;
        }
        
        
        return assistanceAmount;
    }
    public static void main(String[] args) {
       Scanner question = new Scanner(System.in);
       System.out.println("How many kids need assistance?");
       
        int answerKids = question.nextInt();
       System.out.println("Next please enter combined income");
       double answerIncome = question.nextDouble();
       
       double assistanceAmount = computeAssistance(answerIncome, answerKids);
       
       System.out.println("Number of kids: " + answerKids);
       System.out.println("Combined income amount: " + answerIncome + "dollars");
       System.out.println("Assistance amount: " + assistanceAmount + "dollars");
       
       
       
        // TODO code application logic here
    }
        
}
