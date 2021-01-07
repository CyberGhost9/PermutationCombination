package com.company;

import java.util.Scanner;

public class Combination {
    Combination(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of items in the set: ");
        int n=scanner.nextInt();
        System.out.print("Number of item selected from set: ");
        int r= scanner.nextInt();
        int num=1;
        for (int i=1;i<=n;i++){
            num=num*i;
        }
        int obj=n-r;
        int fact=1;
        for (int i=1;i<=obj;i++){
            fact=fact*i;
        }
        int rfact=1;
        for (int i=1;i<=r;i++){
            rfact=rfact*i;
        }
        int combination=num/(fact*rfact);
        System.out.println("C("+n+","+r+")="+combination);
    }
}
