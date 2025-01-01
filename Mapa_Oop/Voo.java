

public class Voo {
    private String codigo;
    private int totalAssentos;
    private int assentosOcupados;

    public Voo(String codigo, int total assentos) {
        this.codigo = codigo;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
    }

    public void reservarAssento() {
    assentosOcupaos++;
    }

    public int getAssentosDisponiveis() {
        return assentosOcupados;
    }

    public String getCodigo() {
        return codigo;
    }
}
