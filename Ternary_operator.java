public class Ternary_operator {
    public static void main(String[] args) {
        int max = (5>3) ? 5:3;
        System.out.println(max);

        int marks = 33;
        boolean res = (marks >= 33) ? true : false;
        if (res){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
