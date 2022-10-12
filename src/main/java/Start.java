import java.util.Scanner;

public class Start {

    public static void main(String[] args)  {

        int ch = 1;
        while (ch==1) {
            Scanner in = new Scanner(System.in);
            System.out.println("input side 'a':");
            int a = in.nextInt();
            System.out.println("input side 'b':");
            int b = in.nextInt();
            System.out.println("input side 'c':");
            int c = in.nextInt();

            System.out.println(TriangleDefineMethods.checkNumSides(a, b, c));
            System.out.println(TriangleDefineMethods.isTriangleExists(a, b, c));
            System.out.println(TriangleDefineMethods.kindOfTriangle(a, b, c));

            System.out.println("to continue enter '1' to exit enter '0'");
            ch = in.nextInt();
        }
    }
}

