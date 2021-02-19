package com.company;
//imported packages
import java.util.*;
import java.io.*;

//the main code for fibonacci series
public class Fibonacciseries {
    public  static  void main(String[]args) {


        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x1 = 0;
        int x2 = 1;
        int nextTerm= 0;
        System.out.print("Enter a natural number: ");
        int n = in.nextInt();
        System.out.print("Fibonacci series is: " + x1 + ", " + x2 + ", ");

        nextTerm = x1 + x2;
        //loop for completing code
        while(nextTerm <= n){
            System.out.print(nextTerm + ", ");
            x1 = x2;
            x2 = nextTerm;
            nextTerm = x1 +x2;
        }
    }
}
