public class Ativ_03 {
    public static void main(String[] args) {
        System.out.println("Numeros primos entre 1 e 123: ");
        for (int i = 2; i <= 123; i++){
            if(ehPrimo(i))
            System.out.println(i);

        }
    } 
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++){
            if (numero % j == 0)
            return false;
        }
        return true;
    }
}
