package Questao5;
public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("As dimensões fornecidas não formam um triângulo válido.");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void setLados(double lado1, double lado2, double lado3) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("As dimensões fornecidas não formam um triângulo válido.");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    private boolean validarDimensoes(double lado1, double lado2, double lado3) {
        return (Math.abs(lado2 - lado3) < lado1 && lado1 < lado2 + lado3) &&
               (Math.abs(lado1 - lado3) < lado2 && lado2 < lado1 + lado3) &&
               (Math.abs(lado1 - lado2) < lado3 && lado3 < lado1 + lado2);
    }

    // Outros métodos da classe Triangulo
}

class DimensoesInvalidasException extends Exception {
    public DimensoesInvalidasException(String mensagem) {
        super(mensagem);
    }
}