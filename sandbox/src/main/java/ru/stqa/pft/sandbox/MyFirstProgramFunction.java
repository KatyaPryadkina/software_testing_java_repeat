package ru.stqa.pft.sandbox;

public class MyFirstProgramFunction {                       //класс=описание структуры однотипных объектов. Объект например дата : число,день.месяц
    public static void main(String[] args) {
        hello("world!");
        hello("Alexey!");
        hello("People!");
        Square s = new Square(8);
       // s.l = 8;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(8,2);                                                        //создание объекта в классе main можно вынести в "псевдофункцию" в класс в виде конструктора
       // r.a = 8;
       //r.b = 2;
        System.out.println("Площадь пямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
    }
    public static void hello(String somebody) {                     //void = ф-я не возв значения
        System.out.println("Hello, " + somebody);

    }
    public static double area(Square ss) {          //вычисление площади квадрата                     //ф-я возвращает значения, имя переменной хранится только в фигурных скобках и не выходит за ее пределы
       return ss.l * ss.l;
    }

    public static int area(Rectangle r){          //вычисление площади прямоугольника,наименования ф-й одинаковые, но есть разница в передаваемых параметрах
        return r.a * r.b ;
    }
}
