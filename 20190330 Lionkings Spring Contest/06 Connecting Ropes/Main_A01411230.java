package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int t= input.nextInt();

        for(int i=0;i<t;i++){
            int n= input.nextInt();
            int sum=0;
            int total=0;
            for(int j=0; j<n;j++){
                int k= input.nextInt();
                sum= sum+k;
                total= sum-(n*2-2);
            }
            System.out.println( total );
        }
    }
}