package program;

public class Task1 {
    public static void main(String[] args) {
        // int - целочисленный тип данных, используетс€ дл€ хранени€ целых чисел
        int a = 10;
        int b = 5;

        // ћатематические операции с использованием int
        System.out.println("—ложение: " + (a + b)); // сложение двух целых чисел
        System.out.println("¬ычитание: " + (a - b)); // вычитание двух целых чисел
        System.out.println("”множение: " + (a * b)); // умножение двух целых чисел
        System.out.println("ƒеление: " + (a / b)); // деление двух целых чисел

        // double - тип данных с плавающей точкой, используетс€ дл€ более точных и сложных вычислений
        double c = 2.5;
        double d = 1.5;

        // ћатематические операции с использованием double
        System.out.println("—ложение (double): " + (c + d)); // сложение двух чисел с плавающей точкой
        System.out.println("¬ычитание (double): " + (c - d)); // вычитание двух чисел с плавающей точкой

        // ѕример использовани€ условного оператора if-else
        if (a > b) {
            System.out.println("a больше b"); // условие истинно, если a больше b
        } else {
            System.out.println("a меньше или равно b"); // иначе, если a меньше или равно b
        }

        // ѕример цикла for
        System.out.println("÷икл for от 1 до 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i); // печатает числа от 1 до 5
        }

        // ѕример цикла while
        System.out.println("÷икл while: отсчет от 5 до 1");
        int count = 5; // начальное значение счетчика
        while (count > 0) {
            System.out.println(count); // печатает текущее значение счетчика
            count--; // уменьшает значение счетчика на 1
        }

        // boolean - логический тип данных, принимает значени€ true или false
        boolean isEven = a % 2 == 0; // провер€ет, €вл€етс€ ли число a четным
        System.out.println("„исло a четное: " + isEven);

        // char - тип данных дл€ хранени€ одиночного символа
        char letter = 'A';
        System.out.println("—имвол: " + letter);
    }
}