public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 19;

        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы еще не совершеннолетний, нужно немного подождать");
        }

        // Задача 2
        int temperature = 7;

        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов. Можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов. Нужно надеть шапку");
        }

        // Задача 3
        int speed = 65;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }

        // Задача 4
        int personAge = 15;

        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора на работу.");
        }

        // Задача 5
        int ageOfAChild = 12;

        if (ageOfAChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfAChild + ", то ему нельзя кататься на аттракционе.");
        } else if (ageOfAChild >= 5 && ageOfAChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfAChild + ", то ему можно на аттракцион в сопровождении.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfAChild + ", то ему можно кататься одному.");
        }

        // Задача 6
        int capacity = 102;
        int seats = 60;
        int passengers = 70;
        boolean availableToSeat = passengers <= seats;
        boolean availableOnlyToStand = (passengers > seats && passengers <= capacity);

        if (availableToSeat) {
            System.out.println("В вагоне есть сидячие места");
        } else if (availableOnlyToStand) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("Мест нет");
        }

        // Задача 7
        int one = 100;
        int two = 567;
        int three = 15;

        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }


    }
}