package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello, world!");    //каждое значение хранится отдельно  впамяти компьютера, явно объявленные значений = литеральные (строка, число). А остальные вычисляемые (арифметика, конкатенация)

        int l = 6;
        int s = l * l;                                  //переменная =l, значение = 6
        System.out.println("Площадь квадрата со стороно " + l + " = " + s);
        /*System.out.println(2 + 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(2 - 2);

        System.out.println(1 / 2);          //округление в сторону ближ.числа
        System.out.println(1.0 / 2);        //вывод числа с плавающей точкой (хранятся иначе, чем простые)
        System.out.println(1 / 2.0);
        System.out.println(2.0 / 2);

        System.out.println("2" + "2");              //конкатенация = склеивание строк
        System.out.println("2" + 2);                    //преобразования числа в строку
        System.out.println(2 + "2");

        System.out.println((2 + 2) * 2);

        System.out.println("2 + 2 = " + (2 + 2));   //чтобы избежать склейки, брать вычисляемое выражение в скобки */


    }

}