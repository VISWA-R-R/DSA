package DAY2.ForLoop;

import java.util.Scanner;

public class TableformUser {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the number = ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+"X"+n+" = "+i*n);
        }
    }
}
