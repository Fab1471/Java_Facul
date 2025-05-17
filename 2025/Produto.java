public class Produto {
    private String nome;
    private double preco;

    // Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.setNome("Teclado Mecânico Redragon Kala");
        prod.setPreco(370.00);
        System.out.println("Produto: " + prod.getNome() + " - Preço: R$ " + String.format("%.2f", prod.getPreco()));
    }
}
