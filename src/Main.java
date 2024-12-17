public class Main {

    //Задача 1

    public static void calculateLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невискосный год");
        }
    }
//Задача 2

    public static void phoneSelect(int clientDeviceYear, int clientOS1) {


        if (clientDeviceYear < 2015 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    //Задача 3
    public static void calculateDeliveryDistance() {

    }


    public static void main(String[] args) {
            int year = 3005;
        calculateLeapYear(year);

        int clientOS1 = 0;
        int clientDeviceYear = 2014;
        phoneSelect(clientDeviceYear, clientOS1);
        }
    }


