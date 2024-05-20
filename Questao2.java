import java.util.ArrayList;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scan.nextInt();
            idades.add(idade);
        }
        System.out.println("Digite a posição a ser removida (0 a 9): ");
        int numero = scan.nextInt();

        try {

            if (numero >= 0 && numero < idades.size()) {
                int idadeRemovida = idades.remove(numero);
                System.out.println("Idade na posição " + numero + " (" + idadeRemovida + ") foi removida.");
            } else {
                System.out.println("Posição inválida");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
        }

        scan.close();
    }
}