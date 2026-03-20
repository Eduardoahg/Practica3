package org.example;

public class punto4 {

    public static void main(String[] args) {
        int base = 2;
        int exponente = 5;
        System.out.println("Resultado de fragA (potencia): " + fragA(base, exponente));

        String palabra = "PUCMM";
        System.out.println("Cadena invertida: " + invertir(palabra));
    }

    /*
        Inciso 20-
     */
    public static int fragA(int x, int n) {
        if (n == 0) return 1;
        int mitad = fragA(x, n / 2);
        if (n % 2 == 0) return mitad * mitad;
        else return x * mitad * mitad;
    }

    /*
        Inciso 21-
     */

    public static String invertir(String s) {
        return inverAux(s, s.length() - 1);
    }

    private static String inverAux(String s, int i) {
        if (i < 0) return "";
        return s.charAt(i) + inverAux(s, i - 1);
    }
}
