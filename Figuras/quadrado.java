package Figuras;

public class quadrado implements FigurasGeometrica {
    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;

    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    public quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getTipo() {
        return "Quadrado";
    }
}
