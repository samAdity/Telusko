public class TypeCasting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 12;
        a=b;
        System.out.println(a);
        /* but if we will do
        b=a;
        System.out.println(b);
        then this will provide us an error.
         */
        int b1 = 120;
        byte a1 = (byte)b1;
        System.out.println(a1);
        // for byte we have to keep in mind about the range of byte, which is from -127 to 127.

        float f = 3.14f;
        int x = (int)f;
        System.out.println(x);
        /* this will only print the value 3, which is the int , but if we do
        float f = 3.14f;
        int x = f;
        System.out.println(x);
        then this will provide us error.
         */

        byte k = 10;
        byte z = 10;
        byte m = (byte)(k*z);
        System.out.println(m);

    }
}
