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
        for (int i=1;i<=n;i++){//n factorial
            num=num*i;
        }
        int obj=n-r;
        int fact=1;
        for (int i=1;i<=obj;i++){//n-r factorial
            fact=fact*i;
        }
        int rfact=1;
        for (int i=1;i<=r;i++){//r factorial
            rfact=rfact*i;
        }
        int combination=num/(fact*rfact);//Applying formula   n!
                                         //C(n,r)       =  --------
                                         //                (n-r)!r!
        System.out.println("C("+n+","+r+")="+combination);
    }
}
