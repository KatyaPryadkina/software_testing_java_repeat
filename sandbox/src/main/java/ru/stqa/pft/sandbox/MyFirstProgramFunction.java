package ru.stqa.pft.sandbox;

public class MyFirstProgramFunction {                       //класс=описание структуры однотипных объектов. Объект например дата : число,день.месяц
    public static void main(String[] args) {

//вывод на консоль hello...
        hello("world!");
        hello("Alexey!");
        hello("People!");

//вывод на консоль площади квадрата
        Square s = new Square(8);
        // s.l = 8;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

//вывод на консоль площади квадрата
        Rectangle r = new Rectangle(8, 2);                                                        //создание объекта в классе main можно вынести в "псевдофункцию" в класс в виде конструктора
        // r.a = 8;
        //r.b = 2;
        System.out.println("Площадь пямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


//вывод на консоль расстояния м/д точками
        Point p1 = new Point(2, 2);
        Point p2 = new Point(1, 4);
        /*p1.x1 = 2;
        p1.y1 = 2;
        p2.x2 = 1;
        p2.y2 = 4;*/
        System.out.println("Расстояние между точками " + "(" + p1.x1 + ";" + p1.y1 + ")" + "," + "(" + p2.x2 + ";" + p2.y2 + ")" + " = " + p1.distance(p2));


//вывод на консоль площади треугольника
        Triangle t = new Triangle(4, 2, 45);
        /*t.a = 4;
        t.b = 2;
        t.l = 45;*/
        System.out.println("Площадь треугольника со сторонами " + t.a + " и " + t.b + " углом  " + t.l + "'" + " = " + t.square() );

    }

    public static void hello(String somebody) {                     //void = ф-я не возв значения
        System.out.println("Hello, " + somebody);

    }




}
