package ru.stqa.pft.sandbox;

public class Point {
    public double x1;
    public double y1;
    public double x2;
    public double y2;


    public Point(double x, double y) {                            //конструктор
        this.x1 = x;
        this.y1 = y;
        this.x2 = x;
        this.y2 = y;
    }



    public double distance(Point p) {                                                              //метод возвр.вычисление расстояния м/д точками, в параметре Класс и ссылка на его объект
        return Math.sqrt((this.x2 - p.x1) * (this.x2 - p.x1) + (this.y2 - p.y1) * (this.y2 - p.y1));
    }
}
