public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + String.format("%.2f", valor));
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " - Saldo: R$ " + String.format("%.2f", saldo));
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Fabrício Figueiredo", 1000.0);
        conta.exibirSaldo();
        conta.depositar(250.0);
        conta.sacar(500.0);
        conta.sacar(1000.0);
        conta.exibirSaldo();
    }
}
