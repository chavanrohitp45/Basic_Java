import java.util.*;
public class add_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Addition is : " + (n1 + n2));
        System.out.println("Product is : " + (n1 * n2));

        System.out.println("Enter the Radius of a circle : ");
        float r = sc.nextFloat();
        System.out.println("Area of Circle is : " + (3.14 * r * r));

        // Type Conversion
        // int a = sc.nextFloat(); // Error is there
        float a = sc.nextInt(); // Allowed
    }
}
