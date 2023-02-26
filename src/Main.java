import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Se interpreta de la siguiente manera True -Es consecutiva  False -No es Consecutiva");
        System.out.println("Ingresa la serie de caracteres: ");
        String principio = lector.nextLine();

        boolean consecutiva = true;

        for (int i = 0; i < principio.length() - 1; i++) {
            int serie1 = (int) principio.charAt(i);
            int serie2 = (int) principio.charAt(i + 1);

            if (serie2 - serie1 != 1) {
                consecutiva = false;
                break;
            }
        }

        System.out.println("La secuencia de caracteres es: " + consecutiva);
    }
}