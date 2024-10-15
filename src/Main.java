// Пшеничникова ПМИ-10
// Нечетный вариант

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Main n = new Main();
        
        // 1 блок заданий: методы
        System.out.println("Ответы по 1 блоку заданий:\n");

        // вывод 1.1 задания
        System.out.println("1.1 задача:");
        double x = 5.25;
        System.out.println("Входящее число: " + x);
        System.out.printf("Вывод дробной части: " + "%.2f%n", n.fraction(x));

        // вывод 1.3 задания
        System.out.println("\n1.3 задача:");
        System.out.println("Введенный символ 0 равен : " + charToNum('0'));
        //System.out.println("Введенный символ а равен : " + charToNum('a'));



        // вывод 1.5 задания
        System.out.println("\n1.5 задача:");
        System.out.println("Проверка на двузначное число: False - не двузначное, True - двузначное");
        System.out.println("Ответ: " + n.is2Digits());

        // вывод 1.7 задания
        System.out.println("\n1.7 задача:");
        System.out.println("Входит ли число в диапазон? True - да, False - нет");
        System.out.println("Ответ: " + n.isInRange());


        // вывод 1.9 задания
        System.out.println("\n1.9 задача:");
        System.out.println("Все ли три числа равны? True - да, False - нет");
        System.out.println("Ответ: " + n.isEqual());



        // 2 блок заданий: условия
        System.out.println("Ответы по 2 блоку заданий:");

        // вывод 2.1 задания
        System.out.println("\n2.1 задача:");
        System.out.println("Образуем модуль числа.");
        System.out.println("Модуль числа = " + n.abs());

        // вывод 2.3 задания
        System.out.println("\n2.3 задача:");
        System.out.println("Делится ли число на 3 или на 5? True - да, False - нет");
        System.out.println("Ответ: " + n.is35());


        // вывод 2.5 задания
        System.out.println("\n2.5 задача:");
        System.out.println("Какое из трёх чисел больше?");
        System.out.println("Ответ: " + n.max3());

        // вывод 2.7 задания
        System.out.println("\n2.7 задача:");
        System.out.println("Сумма двух чисел.");
        System.out.println("!Условие: если сумма попадает в диапазон от 10 до 19, то выводится 20");
        System.out.println("Сумма двух чисел = " + n.sum2());

        // вывод 2.9 задания
        System.out.println("\n2.9 задача:");
        System.out.println("День недели соответствующий числу 20 = " + n.day(20));

        // 3 блок заданий: циклы
        System.out.println("Ответы по 3 блоку заданий:\n");
        
        // вывод 3.1 задания
        System.out.println("\n3.1 задача:");
        System.out.println("Строка от 0 до x чисел");
        System.out.println("Вывод: " + n.listNums());

        // вывод 3.3 задания
        System.out.println("\n3.3 задача:");
        System.out.println("Строка от 0 до x только из четных чисел");
        System.out.println("Вывод: " + n.chet());

        // вывод 3.5 задания
        System.out.println("\n3.5 задача:");
        System.out.println("Количество знаков в числе: " + n.numLen());

        // вывод 3.7 задания
        System.out.println("\n3.7 задача:");
        System.out.println("Квадрат с размерами x*x: ");
        n.square();

        // вывод 3.9 задания
        System.out.println("\n3.9 задача:");
        System.out.println("Треугольник из символов * ");
        n.rightTriangle();

        // 4 блок заданий: массивы
        System.out.println("Ответы по 4 блоку заданий:\n");

        // вывод 4.1 задания
        System.out.println("\n4.1 задача:");
        System.out.println("Индекс первого вхождения числа в массиве");
        System.out.println("!Условие: Если число не входит в массив – возвращается -1");
        int[] arr_41 = {1, 2, 3, 4, 2, 2, 5};
        System.out.println("Массив:" + Arrays.toString(arr_41));
        System.out.println("Вывод: " + n.findFirst(arr_41, 7));

        // вывод 4.3 задания
        System.out.println("\n4.3 задача:");
        System.out.println("Наибольшего числа из массива по модулю: ");
        int[] arr_43 = {1, -2, -7, 4, 2, 2, 5};
        System.out.println("Массив:" + Arrays.toString(arr_43));
        System.out.println("Вывод: " + n.maxAbs(arr_43, -7));

        // вывод 4.5 задания
        System.out.println("\n4.5 задача:");
        int[] arr_45 ={1, 2, 3, 8, 9, 7};
        int[] arr_2 = {4, 5, 6};
        int pos = 3;
        System.out.println("Первый массив: " + Arrays.toString(arr_45));
        System.out.println("Второй массив: " + Arrays.toString(arr_2));
        System.out.println("Вставка новых значений на индексе: " + pos);
        System.out.println("Результат нового массива: " + Arrays.toString(n.add(arr_2, arr_45, pos)));

        // вывод 4.7 задания
        System.out.println("\n4.7 задача:");
        int[] arr_47 = {5, 9, 2, 6, 1};
        System.out.println("Массив: " + Arrays.toString(arr_47));
        System.out.println("Массив в обратном порядке: " + Arrays.toString(n.reverseBack(arr_47)));

        // вывод 4.9 задания
        System.out.println("\n4.9 задача:");
        int[] arr_49 = {1, 2, 3, 8, 2, 2, 9};
        System.out.println("Массив: " + Arrays.toString(arr_49));
        System.out.println("Массив с индексами числа 8: " + Arrays.toString(n.findAll(arr_49, 8)));

    }

    // решение 1 блока заданий: методы
    // 1.1
    public double fraction(double x) {
        int integerX = (int)x;
        return x - integerX;
    }

    // 1.3
    public static int charToNum(char c) {
        // Проверяем, что входной символ является цифрой от 0 до 9
        if (c < '0' || c > '9') {
            throw new IllegalArgumentException("Символ должен быть цифрой от 0 до 9");
        }
        return c - '0';
    }

    // 1.5
    public boolean is2Digits() {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите число для проверки на двузначность: ");
        int x = scaner.nextInt();
        if ((x < -99 || x > -10) && (x > 99 || x < 10)) {
            return false;
        }
        return true;
    }

    // 1.7
    public boolean isInRange() {
        Scanner scaner = new Scanner(System.in);
        int a = 5, b = 1;
        System.out.println("Левая граница диапазона(а) = " + a + "\nПравая граница диапазона(b) = " + b);
        System.out.print("Входящее число в диапазон = ");
        int num = scaner.nextInt();
        if (a < b && num >= a && num <= b) {
            return true;
        }else if (a > b && num <= a && num >= b) {
            return true;
        }
        return false;
    }

    // 1.9
    public boolean isEqual() {
        Scanner scaner = new Scanner(System.in);
        int a = -1, b = 3, c = 2;
        System.out.println("1-е число: " + a + "\n 2-е число: " + b + "\n 3-е число: " + c);
        if (a == b && b == c) {
            return true;
        }
        return false;
    }

    // решение 2 блока заданий: условия

    // 2.1
    public int abs() {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Задаваемое число: ");
        int x = scaner.nextInt();
        if (x >= 0){
            return x;
        }
        return x * -1;
    }

    // 2.3
    public boolean is35() {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Проверяемое число: ");
        int x = scaner.nextInt();
        // Проверяем, делится ли число на 3
        if (x % 3 == 0) {
            // Если число делится на 3, проверяем, делится ли оно также на 5
            return x % 5 != 0;
        } else {
            // Если число не делится на 3, проверяем, делится ли оно на 5
            return x % 5 == 0;
        }
    }

    // 2.5
    public int max3() {
        int x = -1, y = 4, z = 8;
        System.out.println("Полученные числа: " + x + ", " + y + ", " + z );
        if (x >= y && x >= z) {
            return x;
        }else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    // 2.7
    public int sum2() {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int x = scaner.nextInt(), y = scaner.nextInt();
        int sum = x + y;
        if ( sum <= 19 && sum >= 10 ) {
            return 20;
        }else{
            return sum;
        }
    }

    // 2.9
    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Это не день недели";
        }
    }

    // решение 3 блока заданий: циклы
    // 3.1
    public String listNums() {
        StringBuilder stroka = new StringBuilder();
        Scanner scaner = new Scanner(System.in);
        boolean isValidInput = false;
        int x = 0; // Объявляем x здесь, вне блока try-catch

        while (!isValidInput) {
            try {
                System.out.print("Введите число для строки: ");
                x = scaner.nextInt();

                if (x >= 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Пожалуйста, введите положительное число или ноль.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                scaner.next(); // Очищаем ошибочный ввод
            }
        }

        for (int i = 0; i <= x; i++) {
            if (i > 0) {
                stroka.append(" ");
            }
            stroka.append(i);
        }
        return stroka.toString();
    }


    // 3.3
    public String chet() {
        StringBuilder stroka = new StringBuilder();
        Scanner scaner = new Scanner(System.in);

        // Проверка на ввод неотрицательного числа
        boolean isValidInput = false;
        int x = 0;
        while (!isValidInput) {
            System.out.print("Введите неотрицательное целое число для строки: ");
            if (scaner.hasNextInt()) {
                x = scaner.nextInt();
                if (x >= 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Пожалуйста, введите неотрицательное число.");
                }
            } else {
                System.out.println("Неверный ввод. Пожалуйста, введите целое число.");
                scaner.next(); // Удаляем неверный ввод из буфера
            }
        }

        for (int i = 0; i <= x; i += 2) {
            if (i > 0) {
                stroka.append(" ");
            }
            stroka.append(i);
        }
        return stroka.toString();
    }


    // 3.5
    public int numLen() {
        StringBuilder stroka = new StringBuilder();
        Scanner scaner = new Scanner(System.in);
        System.out.print("Введите число для возвращения знаков в числе: ");
        long x = scaner.nextInt();
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    // 3.7
    public void square() {
        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;
        int x = 0;

        while (!isValidInput) {
            System.out.print("Введите число для квадрата (не меньше нуля): ");

            if (scanner.hasNextInt()) {
                x = scanner.nextInt();

                if (x >= 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Ошибка: число должно быть не меньше нуля.");
                }
            } else {
                System.out.println("Ошибка: пожалуйста, введите целое число.");
                scanner.next(); // Обработка неверного ввода
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // 3.9
    public void rightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для треугольника: ");

        int x = -1; // Инициализируем x с некорректным значением

        while (x < 0) {
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();

                if (x >= 0) {
                    break;
                } else {
                    System.out.println("Пожалуйста, введите неотрицательное число.");
                }
            } else {
                System.out.println("Пожалуйста, введите целое число.");
                scanner.next(); // Удаляем неверный ввод из буфера
            }
        }

        for (int i = 1; i <= x; i++) {
            // Вывод пробелов
            for (int j = 0; j < x - i; j++) {
                System.out.print("  ");
            }
            // Вывод звездочек
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    // решение 4 блока заданий: массивы
    // 4.1
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 4.3
    public int maxAbs(int[] arr, int x) {
        int max = 0;
        for (int i : arr) {
            if (i < 0) {
                i = i * -1;
            }
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // 4.5
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] new_arr = new int[arr.length + ins.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            new_arr[pos + i] = ins[i];
        }
        return new_arr;
    }

    // 4.7
    public int[] reverseBack(int[] arr) {
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[(arr.length - 1) - i];
        }
        return new_arr;
    }

    // 4.9
    public int[] findAll(int[] arr, int x) {
        int[] result = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[count++] = i;
            }
        }
        // Удаление нулей из массива result
        int[] trimmedResult = new int[count];
        System.arraycopy(result, 0, trimmedResult, 0, count);

        return trimmedResult;
    }

}
