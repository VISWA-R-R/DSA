package DAY1;

public class AtoZ {
    public static void main(String[] args) {
        char a='a';
        int i=1;
        while (a<='z') { 
            System.out.println(a);
            a=(char)(a+i);
        }
    }
}
