package tarea3;

public class Hexagono extends Figura{
    private double lado;

    public Hexagono(double lado){
        super(lados);
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return 3*Math.sqrt(3)*lado * lado/2;
    }

    @Override
    void display() {
        System.out.println("Hexagono:");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}