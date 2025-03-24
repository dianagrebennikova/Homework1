public class Main
    {
    public static void main(String[] args)
        {
            System.out.println("Hello, World!");

            int age = 18;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
            System.out.println();

            int temperature = -5;
            if (temperature <= -5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            }
            if (temperature >= 5) {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }
            System.out.println();

            int speed = 50;
            if (speed > 60) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + ", можно ездить спокойно");
            }
            System.out.println();

            int ageOfPeople = 23;
            if (ageOfPeople >= 2 && ageOfPeople <= 6) {
                System.out.println("Если возраст человека равен " + ageOfPeople + ", то ему нужно ходить в детский сад");
            }
            if (ageOfPeople >= 7 && ageOfPeople <= 17) {
                System.out.println("Если возраст человека равен " + ageOfPeople + ", то ему нужно ходить в школу");
            }
            if (ageOfPeople >= 18 && ageOfPeople <= 24) {
                System.out.println("Если возраст человека равен " + ageOfPeople + ", то ему нужно ходить в университет");
            }
            if (ageOfPeople > 24) {
                System.out.println("Если возраст человека равен " + ageOfPeople + ", то ему нужно ходить на работу");
            }
            System.out.println();

            int ageKid = 13;
            if (ageKid < 5) {
                System.out.println("Если возраст ребенка равен " + ageKid + ", то ему нельзя кататься на аттракционе");
            }
            if (ageKid <= 14) {
                System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
            } else {
                System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься без сопровождения взрослого");
            }
            System.out.println();

            int freeSeats = 102;
            if (freeSeats < 60) {
                System.out.println("В вагоне занято " + freeSeats + " мест, есть свободные сидячие и стоячие места");
            } else {
                if (freeSeats >= 60 && freeSeats < 102) {
                    System.out.println("В вагоне занято " + freeSeats + " мест, есть стоячие места");
                } else {
                    System.out.println("Вагон полностью забит");
                }
            }
            System.out.println();

            int one = 6;
            int two = 2;
            int three = 1;

            if (one > two && one > three) {
                System.out.println("Большее число " + one);
            } else {
                if (two > one && two > three) {
                    System.out.println("Большее число " + two);
                } else {
                    if (three > one && three > two) {
                        System.out.println("Большее число " + three);
                    }
                }
            }

            System.out.println();


        }

    }