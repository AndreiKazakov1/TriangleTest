import java.lang.*;


public class TriangleDefineMethods {

    public static String checkNumSides(int a, int b, int c){
        if (a > 0 && b > 0 && c > 0) {return TypeOfResults.VNS;}
            else return TypeOfResults.NVN;
        }

    public static String isTriangleExists(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a){return TypeOfResults.TE;}
        else return TypeOfResults.TDNE;
    }

    public static String kindOfTriangle (int a, int b, int c){
        var b1 = a + b > c && a + c > b && b + c > a;
        if (b1 &&(a == c && c == b)) {return TypeOfResults.EQUT;}
        else if (b1 &&(a==b || a==c || c==b)) {return TypeOfResults.ISOT;}
        else if (b1){return TypeOfResults.SCAT;}
        else return TypeOfResults.NOTEX;
    }
}

