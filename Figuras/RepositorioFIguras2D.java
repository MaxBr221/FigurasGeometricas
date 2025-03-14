package Figuras;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RepositorioFIguras2D {
        private List<FigurasGeometrica> figuras = new ArrayList<>();

        public void adicionarFiguras(FigurasGeometrica figura){
            figuras.add(figura);
        }
        public void removerFigura(int indice){
            if(indice >= 0 && indice < figuras.size()){
                figuras.remove(indice);
            }else{
                System.out.println("Indice invalido");
            }
        }
        public double getArea(int indice){
            if(indice >= 0 && indice < figuras.size()){
                return figuras.get(indice).calcularArea();
            }
            throw new IndexOutOfBoundsException("Indice invalido");
        }
        public double getPerimetro(int indice){
            if(indice >= 0 && indice < figuras.size()){
                return figuras.get(indice).calcularPerimetro();
            }
            throw new IndexOutOfBoundsException("indice invalido");

        }
        public String getTipo(int indice){
            if(indice >= 0 && indice < figuras.size()){
                return figuras.get(indice).getClass().getSimpleName();
            }
            throw new IndexOutOfBoundsException("indice invalido");

        }
        public int getTamanho(){
            return figuras.size();
        }
        public void ordenar(){
            Collections.sort(figuras);
        }
        public void listarFiguras(){
            if(figuras.isEmpty()){
                System.out.println("Repositorio vazio.");
            }else{
                for (int i = 0; i < figuras.size(); i++) {
                    System.out.println("Indice: " + i + ": " + figuras.get(i).getTipo() + " area: " + figuras.get(i).calcularArea());

                }
            }
        }




    }

