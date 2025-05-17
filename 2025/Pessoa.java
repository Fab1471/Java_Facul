public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    // Construtor
    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    // toString para exibição
    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nCidade: " + cidade;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Fabrício Figueiredo", 29, "Varginha");
        System.out.println(p);
    }
}
