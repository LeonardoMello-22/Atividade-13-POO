import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        double divisao;

        try {
            System.out.println("Digite o valor do primeiro número: ");
            numero1 = scan.nextInt();
            System.out.println("Digite o valor do segundo número: ");
            numero2 = scan.nextInt();   

            divisao = (double) numero1 / numero2;
            
            System.out.println("O resultado da divisão é: " + divisao);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } finally {
            scan.close();
        }
    }
}
