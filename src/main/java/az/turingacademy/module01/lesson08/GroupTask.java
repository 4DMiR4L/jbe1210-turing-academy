package az.turingacademy.module01.lesson08;

public class GroupTask {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        int x;
        x = a + b;
        System.out.println(x);
        x = a - b;
        System.out.println(x);
        x = a * b;
        System.out.println(x);
        x = a / b;
        System.out.println(x);
        x = a % b;
        System.out.println(x);

        a -= 1;
        System.out.println(a);
        b += 2;
        System.out.println(b);
        c *= 4;
        System.out.println(c);
        a /= 5;
        System.out.println(a);
        b %= 2;
        System.out.println(b);

        boolean d = c == a;
        System.out.println(d);
        boolean e = a != b;
        System.out.println(e);
        boolean f = a < b;
        System.out.println(f);
        int h = 0;
        System.out.println(++h);
        double pi = 3.14;
        int intPi = (int) pi;
        System.out.println(intPi);

        int y = 8;
        int netice = y >> 1;
        System.out.println(netice);
        int m = 4;
        int neyse = m >>> 1;
        System.out.println(neyse);

    }
}
