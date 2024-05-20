import java.util.HashMap;
import java.util.Scanner;

public class Questao1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int numero;

        System.out.println("Digite o nome: ");
        nome = scan.nextLine();

        System.out.println("Digite o numero: ");
        numero = scan.nextInt();

        HashMap<String, Integer> lista = new HashMap<String , Integer>();
        lista.put(nome, numero);

        try{
            if (numero >= 0 && numero < nome.length()){
                char letra = nome.charAt(numero);
                System.out.println("A letra é: " + letra);
            }else{
                System.out.println("Número inválido");
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println("Número inválido");
        }
        scan.close();
    }
}