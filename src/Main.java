// Пшеничникова ПМИ-10
// Нечетный вариант

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main n = new Main();
        Scanner scanner = new Scanner(System.in);

        // 1 блок заданий: методы
        System.out.println("Ответы по 1 блоку заданий:\n");

        // вывод 1.1 задания
        System.out.println("1.1 задача:");
        System.out.println("Введите число: ");
        double x = scanner.nextDouble();
        System.out.printf("Ответ: " + "%.2f%n", n.fraction(x));

        // вывод 1.3 задания
        System.out.println("\n1.3 задача:");
        System.out.print("Введите цифру от 0 до 9: ");
        char inputChar = scanner.next().charAt(0);
        try {
            int result = charToNum(inputChar);
            System.out.println("Введенная цифра " + inputChar + " равна числу: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // вывод 1.5 задания
        System.out.println("\n1.5 задача:");
        System.out.println("Проверка на двузначное число: False - не двузначное, True - двузначное");
        System.out.print("Введите число для проверки на двузначность: ");
        int x1 = scanner.nextInt();
        System.out.println("Ответ: " + n.is2Digits(x1));

        // вывод 1.7 задания
        System.out.println("\n1.7 задача:");
        System.out.println("Входит ли число в диапазон? True - да, False - нет");
        System.out.println("Введите левую границу диапазона:");
        int a = scanner.nextInt();
        System.out.println("Введите правую границу диапазона:");
        int b = scanner.nextInt();
        System.out.print("Введите число для проверки в этом диапазоне: ");
        int num = scanner.nextInt();
        System.out.println("Ответ: " + n.isInRange(a, b, num));


        // вывод 1.9 задания
        System.out.println("\n1.9 задача:");
        System.out.println("Все ли три числа равны? True - да, False - нет");
        System.out.println("Введите первое число:");
        int a1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b1 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        System.out.println("Ответ: " + n.isEqual(a1, b1, c));



        // 2 блок заданий: условия
        System.out.println("Ответы по 2 блоку заданий:");

        // вывод 2.1 задания
        System.out.println("\n2.1 задача:");
        System.out.println("Образуем модуль числа.");
        System.out.print("Введите число: ");
        int x21 = scanner.nextInt();
        System.out.println("Ответ: " + n.abs(x21));

        // вывод 2.3 задания
        System.out.println("\n2.3 задача:");
        System.out.println("Делится ли число на 3 или на 5? True - да, False - нет");
        System.out.print("Введите число для проверки: ");
        int x23 = scanner.nextInt();
        System.out.println("Ответ: " + n.is35(x23));


        // вывод 2.5 задания
        System.out.println("\n2.5 задача:");
        System.out.println("Какое из трёх чисел больше?");
        System.out.println("Введите первое число:");
        int x25 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int y = scanner.nextInt();
        System.out.println("Введите третье число:");
        int z = scanner.nextInt();
        System.out.println("Ответ: " + n.max3(x25, y, z));

        // вывод 2.7 задания
        System.out.println("\n2.7 задача:");
        System.out.println("Сумма двух чисел.");
        System.out.println("!Условие: если сумма попадает в диапазон от 10 до 19, то выводится 20");
        System.out.print("Введите два числа для суммирования: ");
        int x27 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.println("Ответ: " + n.sum2(x27, y1));


        // вывод 2.9 задания
        System.out.println("\n2.9 задача:");
        System.out.println("Получение дня недели по соответствующему числу.");
        System.out.print("Введите число: ");
        int x29 = scanner.nextInt();
        System.out.println("Ответ: " + n.day(x29));

        // 3 блок заданий: циклы
        System.out.println("Ответы по 3 блоку заданий:\n");

        // вывод 3.1 задания
        System.out.println("\n3.1 задача:");
        System.out.println("Строка от 0 до x чисел");
        int x31 = getValidPositiveNumber(scanner);
        System.out.println("Ответ: " + n.listNums(x31));

        // вывод 3.3 задания
        System.out.println("\n3.3 задача:");
        System.out.println("Строка от 0 до x только из четных чисел");
        int x33 = getValidPositiveNumber(scanner);
        System.out.println("Ответ: " + n.chet(x33));

        // вывод 3.5 задания
        System.out.println("\n3.5 задача:");
        System.out.println("Получение количества знаков в числе x.");
        long x35 = getValidPositiveNumber(scanner);
        System.out.println("Ответ: " + n.numLen(x35));

        // вывод 3.7 задания
        System.out.println("\n3.7 задача:");
        System.out.println("Квадрат с размерами x*x: ");
        int x37 = getValidPositiveNumber(scanner);
        n.square(x37);

        // вывод 3.9 задания
        System.out.println("\n3.9 задача:");
        System.out.println("Треугольник из символов * ");
        int x39 = getValidPositiveNumber(scanner);
        n.rightTriangle(x39);

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
        return x - integerX; // Вычисление дробной части путем вычитания целой части из дробного числа
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
    public boolean is2Digits(int x1) {
        if ((x1 > 99 || x1 < 10) && (x1 < -99 || x1 > -10)) {
            return false;
        }
        return true;
    }


    // 1.7
    public boolean isInRange(int a, int b, int num) {
        if (a < b && num >= a && num <= b) {
            return true;
        }else if(a > b && num <= a && num >= b){
            return true;
        }
        return false;
    }

    // 1.9
    public boolean isEqual(int a1, int b1, int c) {
        if (a1 == b1 && b1 == c) {
            return true;
        }
        return false;
    }

    // решение 2 блока заданий: условия

    // 2.1
    public int abs(int x) {
        if (x >= 0){
            return x;
        }
        return x * -1;
    }

    // 2.3
    public boolean is35(int x1) {
        if (x1 % 3 == 0 && x1 % 5 != 0 || x1 % 3 != 0 && x1 % 5 == 0) {
            return true;
        }
        return false;
    }


    // 2.5
    public int max3(int x2, int y, int z) {
        if (x2 >= y && x2 >= z) {
            return x2;
        }else if (y >= x2 && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    // 2.7
    public int sum2(int x3, int y1) {
        int sum = x3 + y1;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }else{
            return sum;
        }
    }

    // 2.9
    public String day(int x4) {
        switch (x4) {
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
    public String listNums(int x) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            if (i > 0) {
                str.append(" ");
            }
            str.append(i);
        }
        return str.toString();
    }


    // 3.3
    public String chet(int x1) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= x1; i += 2) {
            if (i > 0) {
                str.append(" ");
            }
            str.append(i);
        }
        return str.toString();
    }


    // 3.5
    public int numLen(long x2) {
        int count = 0;
        while (x2 != 0) {
            x2 = x2 / 10;
            count++;
        }
        return count;
    }

    // 3.7
    public void square(int x3){
        for (int i = 0; i < x3; i++) {
            for (int j = 0; j < x3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // 3.9
    public void rightTriangle(int x4) {
        for (int i = 1; i <= x4; i++) {
            // Вывод пробелов
            for (int j = 0; j < x4 - i; j++) {
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

    // Проверка на положительные числа для 3 раздела заданий
    private static int getValidPositiveNumber(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Введите число x: ");
                int x = scanner.nextInt();

                if (x > 0) {
                    return x;
                } else {
                    System.out.println("Пожалуйста, введите положительное целое число.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
            }
        }
    }
}
