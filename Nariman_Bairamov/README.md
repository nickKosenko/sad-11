Эта пара была про переменные в Джаве и if-else


Статья про переменные - https://www.geeksforgeeks.org/data-types-in-java/ - тут таблица и примеры (читать только до "Non-Primitive Data Type or Reference Data Types", не включая)
Та же статья на русском - https://javarush.com/quests/lectures/questsyntaxpro.level07.lecture00



Задание 1:
Просто перепишите тут решение задачи про индекс массы/роста. Решите для себя и вставьте свой main ниже
....  Решение  .....

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner userheight = new Scanner(System.in);
        System.out.print("Enter your height:");   // вводи в метрах 1,8   через запятую
        double height = userheight.nextDouble();

        //использовал System.out.print() т.к тогда оно просит вводить на той же строке

        Scanner usermass = new Scanner(System.in);
        System.out.print("Enter your mass:");   // тоже через запятую
        double mass = usermass.nextDouble();

        double bmi = mass/(height*height);

        if(bmi>25.0){    // формула рабочая, я проверил, мож попробовать
            System.out.println("Youre owerweight!!!");
        } else {
            System.out.println("Youre stick 0___0");
        }

        }
    }


Задание 2:
Чётные/нечётные числа - переписать то, что было на паре
...  Решение  .....

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userNumber = new Scanner(System.in);
        System.out.print("Введите любое целое число:");
        int number = userNumber.nextInt();

        if(number%2 == 0){
            System.out.println("Ваше число парное");
        } else {
            System.out.println("Ваше число непарное");
        }

    }
}

Задание 3:
Сделать много переменных РАЗНЫХ типов и пометить их в один пример. Результат записать в переменную. Чисел должно быть штук 5-6. Потом скажете, какого типа полуилась переменная в результате
....  Решение  .... 

public class Main {
    public static void main(String[] args) {
        byte a = 23;
        short b = 153;
        int c = 73826;
        long d = 827662;

        float a1 = 0.12f;
        double b1 = 123.78;

        short solve  = (short)((a+b)-c/d%a1*b1);
        int solve1  = (int)((a+b)-c/d%a1*b1);
        long solve2  = (long)((a+b)-c/d%a1*b1);

        float solve3 = (float)((a+b)-c/d%a1*b1);
        double solve4 = ((a+b)-c/d%a1*b1);

        System.out.println(solve);
        System.out.println(solve1);
        System.out.println(solve2);
        System.out.println(solve3);
        System.out.println(solve4);
        }

    }