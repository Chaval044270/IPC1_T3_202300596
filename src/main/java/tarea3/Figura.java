package tarea3;

import java.util.ArrayList;
import java.util.List;

abstract class Figura {

    static int lados;
    static double ladoRandom = Math.random()*10 + 1;
    
    Figura(double d){
        Figura.lados = (int) d;
    }

    abstract double calcularArea();

    void display(){
        System.out.println("Figura con " + lados + " lados y lado de " + ladoRandom + " unidades.");
    }

    
    //Se configura un valor aleatorio para el lado de cada figura
    public static void main(String[] args) {
        System.out.println("Lado de las figuras: " + ladoRandom + " unidades.");
        List<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Triangulo(ladoRandom)); //Se toma un triangulo equilatero
        figuras.add(new Cuadrado(ladoRandom));
        figuras.add(new Hexagono(ladoRandom));//Se toma un hexagono regular

        for (Figura figura : figuras) {
            figura.display();
            System.out.println("Su área es: " + figura.calcularArea());
        }
    }
}