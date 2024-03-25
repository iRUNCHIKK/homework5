public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task2
        System.out.println("Task 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task3
        System.out.println("Task 3");
        int year = 2024;
        if (year/4==0 && year/400==0 && year/100!=0 && year>1584){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //task4
        System.out.println("Task 4");
        int deliveryDistance = 91;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставки нет");
        }

        //task5
        System.out.println("Task 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас зима");
                break;
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
                System.out.println("Сейчас весна");
                break;
            case 4:
                System.out.println("Сейчас весна");
                break;
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
                System.out.println("Сейчас лето");
                break;
            case 7:
                System.out.println("Сейчас лето");
                break;
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
                System.out.println("Сейчас осень");
                break;
            case 10:
                System.out.println("Сейчас осень");
                break;
            case 11:
                System.out.println("Сейчас осень");
                break;
            case 12:
                System.out.println("Сейчас зима");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}