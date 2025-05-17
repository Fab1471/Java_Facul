public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joana Dark", 3000.0);
        Gerente g = new Gerente("Abraham Lincoln", 5000.0);

        System.out.println("Bônus Funcionário: R$ " + String.format("%.2f", f.calcularBonus()));
        System.out.println("Bônus Gerente: R$ " + String.format("%.2f", g.calcularBonus()));
    }
}
