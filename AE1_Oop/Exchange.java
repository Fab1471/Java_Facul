public class Exchange {

    private final double cotacaoDolar = 5.5;
    private final double iof = 0.0568;
    private final double taxaOperacaoEmPercentual = 0.01;

    public double comprarDolar(double valorReal) {
        double valorDolar = valorReal / cotacaoDolar;
        double taxaOperacao = valorDolar * taxaOperacaoEmPercentual;
        double valorDolarComTaxa = valorDolar - taxaOperacao;
        double valorDolarComIOF = valorDolarComTaxa - (valorDolarComTaxa * iof);
        
        return valorDolarComIOF;
    }

public static void main(String[] args) {
    Exchange exchange = new Exchange();
    double valorReal = 1000;
    double valorDolar = exchange.comprarDolar(valorReal);
    System.out.println("Valor em dolar: " + valorDolar);
    }
}
