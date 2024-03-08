package tarea3;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado){
        super(lados);
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    void display() {
        System.out.println("Cuadrado:");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}