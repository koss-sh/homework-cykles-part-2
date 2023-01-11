public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int monthDeposit = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100 + monthDeposit;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertilityPer1000 = 17; // рождаемость на 1000 чел.
        int mortalityPer1000 = 8; // смертность на 1000 чел.
        for (int year = 1; year <= 10; year++) {
            population = population + (fertilityPer1000 - mortalityPer1000) * population / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deposit = 15000;
        int month = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * 7 / 100;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int deposit = 15000;
        int month = 0;
        while (deposit <= 12_000_000) {
            deposit = deposit + deposit * 7 / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit);
            }
        }
        System.out.println("Итого: " + month + " месяцев");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int deposit = 15000;
        int month = 0;
        int depositTerm = 9 * 12;  // срок  вклада 9 лет
        while (month <= depositTerm) {
            deposit = deposit + deposit * 7 / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit);
            }
        }
        System.out.println("Итого: " + depositTerm + " месяцев");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int firstFridayDate = 5;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFridayDate) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
    }public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;
        for (int i = startYear; i <= finishYear ; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}