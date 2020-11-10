package chap4;

public class ErrConvert { //Perte de precision passage int à float vu que l'encodage en nbre de bit est différent
    public static void main (String ... args ) {
        int n ;
        float x ;

        n = 1234 ;
        x = n ;
        System.out.println ("n : " + n + "  x : " +  x) ;
        n = 123456789 ;
        x = n ;
        System.out.println ("n : " + n + "  x : " +  x) ;
    }
}

