import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];
        int i = 0;  

        try {
            while (true) {
                System.out.println("Digite um número: ");
                int numero = scan.nextInt();

                if (numero == 0) {
                    vetor[i] = numero;
                    break;
                }

                vetor[i] = numero;
                i++;

                if (i >= 10) {
                    System.out.println("Erro: mais de 10 valores");
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: mais de 10 valores");
        } catch (InputMismatchException e) {
            System.out.println("Erro: valor inválido");
        } finally {
            scan.close();
        }

        System.out.println("Valores inseridos:");
        for (int j = 0; j < i; j++) {
            System.out.println(vetor[j]);
        }
    }
}
