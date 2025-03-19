package htl.teddy_com.code._03.homework;

/**
 * @author Teddy_com
 * @version 1.0
 * @since 2024-03-19
 * @info War bis heute
 */

public class _19_3_Homework {
    //ergänze die Klasse PrimePower um eine Methode int nextPrime(int n),
    // die zur zahl n die nächste mögliche Primzahl findet und mit Return zurückgibt

    public static void main(String[] args) {
        System.out.println(nextPrime(5));
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

    public static int nextPrime(int n){
        int nPrim = n + 1;
        while (!isPrime(nPrim))
            nPrim++;
        return nPrim;
    }
}
