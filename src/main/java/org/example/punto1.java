public class punto1 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialP1(n));
        System.out.println(factorial(n));
    }


    /*
        Inciso no se cual era
     */
    public static long factorialP1(int n) {
        if (n <= 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    /*
        Inciso 5-
     */
    public static long factorial(int n) {
        return factoAuxi(n, 1);
    }

    private static long factoAuxi(int n, long c) {
        if (n <= 1) {
            return c;
        }
        return factoAuxi(n - 1, n * c);
    }
}