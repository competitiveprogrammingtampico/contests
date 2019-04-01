package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int x=0;
        int t= input.nextInt();

        for(int i=0;i<t;i++){
            x+=1;
            int n= input.nextInt();
            int sum=0;
            for(int j=0; j<n;j++){
                int k= input.nextInt();
                sum= sum+k;

            }
            System.out.println("Case " + x +": " + sum );
        }
    }
}