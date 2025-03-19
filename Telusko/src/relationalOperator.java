import java.util.Scanner;

public class relationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x =  sc.nextInt();
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        Boolean result1 = x>y;
        Boolean result2 = x<y;
        Boolean result3 = x>=y;
        Boolean result4 = x<=y;
        Boolean result5 = x==y;
        Boolean result6 = x!=y;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
