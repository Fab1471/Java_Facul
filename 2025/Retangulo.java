public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Retangulo r = new Retangulo(5.0, 3.2);
        System.out.println("Área do retângulo: " + r.calcularArea());
    }
}
