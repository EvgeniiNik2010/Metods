public class Main {

    //Задача 1

    public static void calculateLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невискосный год");
        }
    }



    public static void main(String[] args) {
            int year = 3005;
        calculateLeapYear(year);
        }
    }

    //Задача 2

