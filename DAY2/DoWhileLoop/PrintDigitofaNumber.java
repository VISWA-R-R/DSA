package DAY2.DoWhileLoop;

public class PrintDigitofaNumber {
    public static void main(String[] args) {
        int num=3102004;
        int digitcount=String.valueOf(Math.abs(num)).length();
        System.out.println(digitcount);
        int i=1;
        do { 
            System.out.println("viswa");
            i=i+1;
        } while (i<=digitcount);
    }
}
