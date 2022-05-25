package ru.stqa.pft.sandbox;

public class Rectangle {            //класс прямоугольника
    public int a;
    public int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public  int area(){          //вычисление площади прямоугольника,наименования ф-й одинаковые, но есть разница в передаваемых параметрах
        return this.a * this.b;
    }
}
