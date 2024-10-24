import java.util.*;

public class prime {
    public static void main(String[] args) {
        int n = 6;
        boolean isPrime = true;
        if(n == 2){
            isPrime = true;
        }else{
            for(int i = 2;i<Math.sqrt(n);i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime No.");
        }else{
            System.err.println("Not a Prime Number");
        }
    }
}
