package ru.stqa.pft.sandbox;

public class MyFirstProgramFunction {
    public static void main(String[] args) {
        hello("world!");
        hello("Alexey!");
        hello("People!");
        double len = 8;
        System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

        int a = 8;
        int b = 2;
        System.out.println("Площадь пямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));
    }
    public static void hello(String somebody) {                     //void = ф-я не возв значения
        System.out.println("Hello, " + somebody);

    }
    public static double area(double l) {          //вычисление площади квадрата                     //ф-я возвращает значения, имя переменной хранится только в фигурных скобках и не выходит за ее пределы
       return l * l;
    }

    public static int area(int a, int b){          //вычисление площади прямоугольника,наименования ф-й одинаковые, но есть разница в передаваемых параметрах
        return a * b ;
    }
}
