package sample;

public class Controller {

    public static int gcd(int a, int b) {
        return b==0? a : gcd(b, a%b);
    }

    public static int iterativeGcd(int a, int b){
        int temp;
        while(b!=0){
            temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    //и двата метода са с линейна сложност

}
