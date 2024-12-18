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
    public static int calculateDeliveryDistance(int km) {

        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else
            return 0;
    }


    public static void main(String[] args) {
        //Задача 1
        int year = 3005;
        calculateLeapYear(year);

        //Задача 2
        int clientOS1 = 0;
        int clientDeviceYear = 2014;
        phoneSelect(clientDeviceYear, clientOS1);

        //Задача 3
        int delDist = 96;
        int days = calculateDeliveryDistance(delDist);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + " срок доставки.");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}


