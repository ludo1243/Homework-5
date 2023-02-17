import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача 1");

        Scanner input = new Scanner(System.in);
        System.out.println("Если у вас iOS нажмите 0");
        System.out.println("Если у вас Android нажмите 1");
        int cleinOS = input.nextInt();
        switch (cleinOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке\n");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке\n");
                break;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        Scanner input = new Scanner(System.in);
        System.out.println("Какой у вас год выпуска телефона?");
        int clientDeviceYear = input.nextInt();
        System.out.println("Если у вас iOS нажмите 0");
        System.out.println("Если у вас Android нажмите 1");
        int cleintOS = input.nextInt();
        switch (cleintOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке\n");
                }
                break;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        Scanner input = new Scanner(System.in);
        System.out.println("Какой сейчас год?");
        int year = input.nextInt();
        boolean leapyear = (
                year > 1584 &&
                        (
                                (year % 400 == 0) ||
                                        (year %4 == 0 && year % 100 != 0)
                        )
        );
        if (leapyear)
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный\n");
    }


    public static void task4() {
        System.out.println("Задача 4");
        Scanner input = new Scanner(System.in);
        System.out.println("Какой предел доставки?");
        System.out.println("Если доставка в пределах 20 км напишите 20");
        System.out.println("Если доставка в пределах 20-60 км напишите 60");
        System.out.println("Если доставка в пределах 60-100 км напишите 100");
        System.out.println("Если доставка свыше 100 км напишите 101");
        int deliveryDistance = input.nextInt();
        switch (deliveryDistance) {
            case 20:
                System.out.println("Доставка занимает сутки");
                break;
            case 60:
                System.out.println("Доствка занимает двое суток");
                break;
            case 100:
                System.out.println("Доставка занимает трое суток");
                break;
            default:
                System.out.println("Доставки нет\n");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца");
        int monthNumber = input.nextInt();
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Сейчас зима");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("Сейчас весна");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Сейчас лето");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Сейчас осень");
        } else {
            System.out.println("Такого года нет\n");
        }
    }
}