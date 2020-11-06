package chap4;

public class ErrorAffecEl {
    public static void main (String args[]) {
        byte b=10 ;
        int n = 10000 ;
        b+=n ; // pas compris ça demander
        System.out.println ("b = " + b); ;
    }
}

