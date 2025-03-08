package Figuras;
import Figuras.FigurasGeometrica;
public class circulo implements FigurasGeometrica {
    private double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String getTipo() {
        return "Circulo";
    }

}
