package ru.stqa.pft.sandbox;

public class Triangle {
    public double a;
    public double b;
    public double l;

public Triangle(double a, double b, double l ){
    this.a = a;
    this.b = b;
    this.l = l;

}

    public  double square() {
        return (((this.a * this.b)/2) * Math.sin(this.l));
    }
}
