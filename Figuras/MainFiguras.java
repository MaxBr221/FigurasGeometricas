package Figuras;
import java.util.Scanner;

public class MainFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepositorioFIguras2D repositorio = new RepositorioFIguras2D();

        repositorio.adicionarFiguras(new quadrado(4));
        repositorio.adicionarFiguras(new quadrado(2));
        repositorio.adicionarFiguras(new quadrado(6));
        repositorio.adicionarFiguras(new circulo(2));
        repositorio.adicionarFiguras(new circulo(3));
        repositorio.adicionarFiguras(new circulo(7));
        System.out.println("Figuras adicionada");
        System.out.println("_---------");

        System.out.println("Digite o indice desejado");

        int indice = sc.nextInt();
        if(indice >= 0 && indice < repositorio.getTamanho()){
            System.out.println("Figura no indice: " + indice + ": " + repositorio.getTipo(indice));
            System.out.println("Area: " + repositorio.getArea(indice));
            System.out.println("Perimetro: " + repositorio.getPerimetro(indice));
            System.out.println("______________");
        }
        int indice2 = sc.nextInt();
        System.out.println("Removendo figura do indice: " + indice2);
        repositorio.removerFigura(indice2);
        System.out.println("Finalizando programa...");
    }
}
