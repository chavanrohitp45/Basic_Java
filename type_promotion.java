public class type_promotion {
    public static void main(String[] args) {
        char a = 'a';
        short b = 2;
        byte c = 5;
        int sum = a + b + c; // a+b+c -> convert into int not in char, short and byte
        System.out.println(sum);

        float  f = 8.8f;
        long l = 9;
        double d = 0.9;
        int i = 9;
        // long sum3 = f + l + d + i; // error -> cannot convert from double to long
        double sum2 = f + l + d + i; // f, l, d, i -> double
        System.out.println(sum2);

        byte g = 9;
        int sum4 = g+8; // Convert g into int
        System.out.println(sum4);
    }
}
