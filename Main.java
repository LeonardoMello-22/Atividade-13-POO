import java.util.Scanner;

// Exceção personalizada para saldo insuficiente
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

// Classe ContaCorrente
class ContaCorrente {
    private int numeroConta;
    private double saldo;

    // Construtor da ContaCorrente
    public ContaCorrente(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        } else if (valor > 0) {
            saldo -= valor;
        }
    }

    // Método para obter o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numeroConta = scan.nextInt();
        System.out.println("Digite o saldo inicial da conta: ");
        double saldoInicial = scan.nextDouble();

        ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor do saque " + (i + 1) + ": ");
            double valorSaque = scan.nextDouble();
            try {
                conta.sacar(valorSaque);
                System.out.println("Saque realizado com sucesso! Saldo atual: " + conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scan.close();
    }
}
