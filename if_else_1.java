public class if_else_1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 10;
        if(b>a && b>c){
            System.out.println(b + " is Greater");
        }else{
            if(a>c){
                System.out.println(a + " is Greater");
            }else{
                System.out.println(c + " is Greater");
            }
        }

        // int a = 9;
        // if(a%2 == 0){
        //     System.out.println("Even Number");
        // }else{
        //     System.out.println("Odd Number");
        // }
    }
}
