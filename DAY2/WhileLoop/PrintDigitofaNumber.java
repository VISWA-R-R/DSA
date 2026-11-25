package DAY2.WhileLoop;

public class PrintDigitofaNumber {
    public static void main(String[] args) {
        int num=3102004;
        int digitcount=String.valueOf(Math.abs(num)).length();
        int i=1;
        while(i<=digitcount){
            System.out.println("viswa");
            i=i+1;
        }
    }
}
