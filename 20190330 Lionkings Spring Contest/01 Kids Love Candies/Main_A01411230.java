package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int t= input.nextInt();
        for(int i=0;i<t;i++){
            int n= input.nextInt();
            int k = input.nextInt();
            int sum=0;
            for(int j=0; j<n; j++){
                int o = input.nextInt();
                sum=sum+(o/k);
            }
            System.out.println(sum);
        }
    }
}