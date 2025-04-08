import java.util.Arrays;

public class Main
    {
    public static int[] main(String[] args)
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

            int clientOS = 0;
            int clientDeviceYear = 2016;
            if (clientOS == 0) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            }
            if (clientOS == 1) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }
            System.out.println();

            int year = 2024;
            if (year > 1584) {
                if (year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                } else if (year % 100 == 0) {
                    System.out.println(year + " год не является високосным");
                } else if (year % 4 == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
            } else {
                System.out.println("Проверка года принимается только с 1584");

            }
            System.out.println();

            int deliveryDistance = 95;
            int deliveryTime = 0;
            if (deliveryDistance < 100) {
                if (deliveryDistance <= 20) {
                    deliveryTime = 1;
                } else if (deliveryDistance <= 60) {
                    deliveryTime = 2;
                } else if (deliveryDistance <= 100) {
                    deliveryTime = 3;
                }
                System.out.println("Потребуется дней: " + deliveryTime);
            } else {
                System.out.println("Доставка не существляется");
            }
            System.out.println();

            int monthNumber = 1;
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
            System.out.println();

            for (int f = 0; f <= 10; f = f + 1) {
                System.out.println("Число " + f);
            }
            System.out.println();
            for (int a = 10; a >= 1; a = a - 1) {
                System.out.println("Число " + a);
            }
            System.out.println();
            for (int b = 0; b <= 17; b = b + 2) {
                System.out.println("Четные числа " + b);
            }
            System.out.println();
            for (int c = 10; c >= -10; c = c - 1) {
                System.out.println("Числа " + c);
            }
            System.out.println();
            for (int d = 1904; d <= 2096; d = d + 4) {
                System.out.println(d + " год является високосным");
            }
            System.out.println();
            for (int g = 7; g <= 98; g = g + 7) {
                System.out.println("Последовательность чисел " + g);
            }
            System.out.println();
            for (int h = 1; h <= 512; h = h * 2) {
                System.out.println("Последовательность чисел " + h);
            }
            System.out.println();
            int sum = 29000;
            int total = 0;
            for (int i = 0; i < 12; i++) {
                total = total + total / 100;
                total = total + sum;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей ");
            }
            System.out.println(total);
            System.out.println();

            for (int i = 1; i <= 10; i++) {
                int result = 2 * i;
                System.out.println("2 * " + i + " = " + result);
            }
            System.out.println();

            int sum1 = 15000; // сумма внесения
            int total1 = 0; // сумма накоплений
            int i = 0; // месяц
            while (total1 < 2_459_000) {
                i++;
                total1 = total1 + total1 / 100;
                total1 = total1 + sum1;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + "рублей ");
            }
            System.out.println(total1);
            System.out.println();

            int start = 0;
            while (start < 10) {
                start++;
                System.out.print(" " + start + " ");
            }
            System.out.println();
            for (start = 10; start > 0; start--) {
                System.out.print(" " + start + " ");
            }
            System.out.println();

            int population = 12_000_000; //Население страны Y
            int birthRite = population / 1000 + 17; //Рождаемость 17 человек на 1000 людей
            int mortality = 8; // Смертность 8 человек в год
            int populationNew = 0; // Население новое
            int year1 = 0; // год
            while (year1 <= 10) {
                year1++;
                populationNew = birthRite - mortality;
                populationNew = populationNew + population;
                System.out.println("Год " + year1 + ", численность населения составляет " + populationNew);
            }
            System.out.println();

            double savingsAccount = 15000;
            double interest = 0.07;
            int period = 0;
            while (savingsAccount < 12_000_000) {
                period++;
                savingsAccount = savingsAccount + savingsAccount * interest;
                if (period % 6 == 0)
                    System.out.println("Месяц" + period + ", сумма накоплений равна " + savingsAccount + "рублей");
            }
            System.out.println();

            double sumAccount = 15000;
            double interest2 = 0.07;
            for (int period2 = 1; period2 <= 108; period2++) {
                sumAccount = sumAccount + sumAccount * interest2;
                if (period2 % 6 == 0)
                    System.out.println("Месяц " + period2 + ", сумма накоплений равна " + sumAccount + "рублей");
            }
            System.out.println();

            int friday = 5;
            int dayNumber = 31;
            for (int dayInMonth = friday; dayInMonth <= dayNumber; dayInMonth = dayInMonth + 7) {
                System.out.println("Сегодня пятница, " + dayInMonth + "-е число. Необходимо подготовить отчет");
            }

            System.out.println();

            int comet = 79; // появление кометы
            int currentYear = 2025; // текущий год
            int futureYears = currentYear + 100; // текущий год + 100 лет
            int pastYears = currentYear - 200; // текущий год - 200 лет
            for (int year3 = 0; year3 <= futureYears; year3 = year3 + comet) {
                if (year3 >= pastYears) {
                    System.out.println(year3);
                }
            }
            System.out.println();

            //задача 1
            int[] x = new int[3];
            x[0] = 1;
            x[1] = 2;
            x[2] = 3;
            for (int i1 = 1; i1 <= 3; i1++) {
                System.out.println(i1);
            }
            System.out.println();


            double[] fraction = {1.57, 7.654, 9.986};
            for (int j = 0; j < fraction.length; j++) {
                System.out.println(fraction[j]);
            }
            System.out.println();

            int[] k = {1, 9, 5};
            for (int z = 0; z < k.length; z++) {
                System.out.println(k[z]);
            }
            System.out.println();

            //задача 2
            System.out.println(Arrays.toString(x));
            System.out.println(Arrays.toString(fraction));
            System.out.println(Arrays.toString(k));

            System.out.println();

            //задача 3

            for (int i2 = x.length - 1; i2 >= 0; i2--) {
                System.out.print(x[i2]);
                if (i2 > 0)
                    System.out.print(", ");
            }
            System.out.println();

            for (int j2 = fraction.length - 1; j2 >= 0; j2--) {
                System.out.print(fraction[j2]);
                if (j2 > 0)
                    System.out.print(" ,");
            }
            System.out.println();

            for (int z2 = k.length - 1; z2 >= 0; z2--) {
                System.out.print(k[z2]);
                if (z2 > 0)
                    System.out.print(" ,");
            }
            System.out.println();

            //задание 4

            int[] p = new int[3];
            p[0] = 1;
            p[1] = 2;
            p[2] = 3;
            for (int w = 0; w < p.length; w++) {
                if (p[w] % 2 != 0) {
                    p[w] = p[w] + 1;
                }
                System.out.print(p[w] + " ,");
            }
            System.out.println();


        }

    }