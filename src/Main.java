public class Main {
    public static void main(String[] args) {

        // Задача 1
        int age = 19;
        boolean fullAge = age >= 18;

        if (fullAge) {
            System.out.printf("Если возраст человека равен %d, то он совершеннолетний.%n", age);
        } else {
            System.out.printf("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно немного подождать.%n", age);
        }
        // Задача 2
        int temperature = 6;
        boolean notWearAHat = temperature > 5;

        if (!notWearAHat) {
            System.out.printf("\nНа улице %d градусов, нужно надеть шапку.%n", temperature);
        } else {
            System.out.printf("\nНа улице %d градусов, можно идти без шапки.%n", temperature);
        }
        // Задача 3
        int speed = 70;
        boolean overSpeed = speed > 60;

        if (overSpeed) {
            System.out.printf("\nЕсли скорость %d, то придется заплатить штраф.%n", speed);
        } else {
            System.out.printf("\nЕсли скорость %d, то можно ездить спокойно.%n", speed);
        }
        // Задача 4
        int nextAge = 18;
        boolean infantSchool = (nextAge >= 2 && nextAge <= 6);
        boolean school = (nextAge >= 7 && nextAge <= 17);
        boolean university = (nextAge >= 18 && nextAge <= 24);
        boolean worker = (nextAge > 24);

        if (infantSchool) {
            System.out.printf("\nЕсли возраст человека равен %d, то ему нужно ходить в детский сад.%n", nextAge);
        } else if (school) {
            System.out.printf("\nЕсли возраст человека равен %d, то ему нужно ходить в школу.%n", nextAge);
        } else if (university) {
            System.out.printf("\nЕсли возраст человека равен %d, то ему нужно ходить в университет.%n", nextAge);
        } else if (worker){
            System.out.printf("\nЕсли возраст человека равен %d, то ему нужно ходить на работу.%n", nextAge);
        }
        //Задача 5
        int year = 15;
        boolean upTo5YearsOld = year < 5;
        boolean withAParent = true; // предположим, что взрослый есть
        boolean from5To14YearsOld = (year >= 5 && year < 14 && withAParent);
        boolean over14YearsOld = year >= 14;

        if (upTo5YearsOld) {
            System.out.printf("\nЕсли возраст ребенка равен %d, то ему нельзя кататься на аттракционе.%n", year);
        } else if (from5To14YearsOld) {
            System.out.printf("\nЕсли возраст ребенка равен %d, то ему можно кататься на аттракционе в сопровождении.%n", year);
        } else if (over14YearsOld) {
            System.out.printf("\nЕсли возраст ребенка равен %d, то ему можно кататься на аттракционе без сопровождения взрослого.%n", year);
        }
        //Задача 6
        // Переменные для изменения значений выводов
        int numberOfPeople = 60; // ввести сюда количество людей
        boolean allPeopleTookTheirSeats = false; // условие если все люди решили занять сидячие места (true или false)

        // Характеристики вместимости вагона для справки
        int totalCapacity = 102; // вместимость вагона
        int seatingCapacity = 60; // количество сидячих мест

        //Определение условий в логических переменных
        boolean freeSeatingAndStandingPlaces = numberOfPeople < 60 ||
                (numberOfPeople >= 60 && numberOfPeople < 102 && !allPeopleTookTheirSeats);
        boolean onlyStandingPlacesAreAvailable = numberOfPeople >= 60 && numberOfPeople < 102 && allPeopleTookTheirSeats;
        boolean carriageIsFull = numberOfPeople == 102;

        if (freeSeatingAndStandingPlaces) {
            System.out.println("\nЕсть свободные сидячие и стоячие места в вагоне.");
        } else if (onlyStandingPlacesAreAvailable) {
            System.out.println("\nСвободны только стоячие места.");
        } else if (carriageIsFull) {
            System.out.println("\nВагон полон, мест нет.");
        }
        //Задача 7
        int one = 8;
        int two = 5;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("\n" + one);
        } else if (two > one && two > three) {
            System.out.println("\n" +two);
        } else {
            System.out.println("\n" +three);
        }
    }
}