package DAY2.WhileLoop;

import java.util.Scanner;

public class TableformUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number = ");
        int n=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(i+"X"+n+" = "+i*n);
            i=i+1;
        }
    }
}
