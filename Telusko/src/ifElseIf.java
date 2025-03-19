import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("No. 1 is greater");
        }
        else if(num2>num1){
            System.out.println("No. 2 is greater");
        }
        else{
            System.out.println("Both the no. are equal");
        }
    }
}
