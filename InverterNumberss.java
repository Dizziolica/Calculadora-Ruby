import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um numero maior que 1000");
        int numero;
        numero = input.nextInt();
        System.out.println(numero);

        String newnum3 = String.valueOf(numero);
        char[] digits1 = newnum3.toCharArray();
        int arraynum = newnum3.length();
        while (arraynum > 0) {
            arraynum--;
            System.out.print(digits1[arraynum]);
        }
    }
}
