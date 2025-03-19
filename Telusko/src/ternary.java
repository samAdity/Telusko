import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = sc.nextInt();
        int result = 0;

//        if(num%2==0)
//            result=10;
//        else
//            result=20;

        //this is how in one line we can use ternary operator

        result= num%2==0 ? 10 : 20;
        System.out.println(result);
    }
}
