package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

    public static void main(String[] args) {
        
        int sum = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 공백으로 구분해서 입력하세요");
        String numLine = sc.nextLine();
        
        String[] numArray = numLine.split(" ");
        
       
        for (String numStr : numArray) {
            sum += Integer.parseInt(numStr); 
        }
        
        System.out.println("합: " + sum); 
        
        sc.close(); 
    }
}
