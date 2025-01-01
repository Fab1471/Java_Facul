

import javax.swing.JOptionPane;

public class Cliente {

    private int  id;
    private String nome;
    private int idade;
    private double renda;

    public void cadastrarCiente() {
        this.ide = Integer.parseInt(JOptionPane.showInputDialog(message: "Digite o cóigo do cliente"));
        this.nome = JOptionPane.showInputDialog(message: "Digite o nome do cliente");
        this.idade Integer.parseInt(JOptionPane.showInputDialog(message: "Digite a idade do cliente"));
        this.renda = Double.parseDouble(JOptionPane.showInputDialog(message: "Digite a renda do cliente"));
    }

    public String imprimirResumoCliente() {
        String msg = "Id " + this.id + "\n";
        msg += "Nome " + this.nome + "\n";
        msg += "Idade " + this.idade + "\n";
        msg += "Renda " + this.renda;
        return msg;
    }

    public double getRenda() {
        return this.renda;
    }
}