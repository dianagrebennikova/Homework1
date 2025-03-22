public class Main
    {
    public static void main(String[] args)
        {
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println("dog: " + dog);
            System.out.println("cat: " + cat);
            System.out.println("paper: " + paper);
            dog = dog + 4;
            System.out.println("dog: " + dog);
            cat = cat + 4;
            System.out.println("cat: " + cat);
            paper = paper + 4;
            System.out.println("paper: " + paper);
            dog = dog - 3.5;
            System.out.println("dog: " + dog);
            cat = cat - 1.6;
            System.out.println("cat: " + cat);
            paper = paper - 7639;
            System.out.println("paper: " + paper);
            var friend = 12;
            System.out.println("friend: " + friend);
            friend = friend + 2;
            System.out.println("friend: " + friend);
            friend = friend / 7;
            System.out.println("friend: " + friend);
            var frog = 3.5;
            System.out.println("frog:" + frog);
            frog = frog * 10;
            System.out.println("frog:" + frog);
            frog = frog / 3.5;
            System.out.println("frog:" + frog);
            frog = frog + 4;
            System.out.println("frog:" + frog);
            var boxerMass1 = 78.2;
            System.out.println("Масса боксера 1: " + boxerMass1 + "кг");
            var boxerMass2 = 82.7;
            System.out.println("Масса боксера 2: " + boxerMass2 + "кг");
            var totalMassBoxer = (boxerMass1 + boxerMass2);
            System.out.println("Общая масса боксеров: " + totalMassBoxer);
            var differenceInMass = boxerMass1 - boxerMass2;
            System.out.println("Разница масс боксеров: " + differenceInMass);
            var differenceInMass2 = totalMassBoxer % boxerMass1;
            System.out.println("Разница масс боксеров: " + differenceInMass2);
            var generalOpeningHours = 640;
            System.out.println("Общие часы работы - " + generalOpeningHours + " часов");
            var workingHours = 8;
            System.out.println("Часы работы одного сотрудника - " + workingHours);
            var totalEmployees = (generalOpeningHours / workingHours);
            System.out.println("Всего работников в компании — " + totalEmployees + " человек");
            var moreEmployees = totalEmployees + 94;
            var hours = generalOpeningHours / moreEmployees;
            System.out.println("Если в компании работает " + moreEmployees + " человека, то всего "
                                       + hours + " часа работы может быть поделено между сотрудниками");
            int a;
            System.out.println("Значение переменной a с типом int равно a");
            byte b;
            System.out.println("Значение переменной b с типом byte равно b");
            short c;
            System.out.println("Значение переменной c с типом short равно c");
            long d;
            System.out.println("Значение переменной d с типом long равно d");
            float e;
            System.out.println("Значение переменной e с типом float равно e");
            double f;
            System.out.println("Значение переменной f с типом double равно f");
            a = 27897;
            System.out.println("a = " + a);
            b = 67;
            System.out.println("b = " + b);
            c = 569;
            System.out.println("c = " + c);
            d = 987678965549L;
            System.out.println("d = " + d);
            e = 27.12f;
            System.out.println("e = " + e);
            f = 2.786;
            System.out.println("f = " + f);

            byte teacherOne = 23;
            System.out.println("У первого учителя " + teacherOne + " учеников");
            byte teacherTwo = 27;
            System.out.println("У второго учителя " + teacherTwo + " учеников");
            byte teacherThree = 30;
            System.out.println("У третьего учителя " + teacherThree + " учеников");
            short sheetOfPaper = 480;
            System.out.println("Всего листов бумаги на 3 класса " + sheetOfPaper);
            int totalStudents = teacherOne + teacherTwo + teacherThree;
            System.out.println("Всего учеников " + totalStudents);
            int papersForTheStudent = sheetOfPaper / totalStudents;
            System.out.println("На каждого ученика рассчитано " + papersForTheStudent
                                       + " листов бумаги");
            byte bottle = 16;
            byte time = 2;
            int productivity = bottle / time;
            System.out.println("За минуту машина произвела " + productivity
                                       + " штук бутылок");
            byte time2 = 20;
            int productivityTime20 = productivity * time2;
            System.out.println("За " + time2 + " минут машина произвела " + productivityTime20
                                       + " штук бутылок");

            byte hour = 60;
            int day = hour * 24;
            int productivityDay = productivity * day;
            System.out.println("За " + day + " минут машина произвела " + productivityDay
                                       + " штук бутылок");
            int day3 = day * 3;
            int productivityDay3 = productivity * day3;
            System.out.println("За " + day3 + " минут машина произвела " + productivityDay3
                                       + " штук бутылок");
            int month = day * 30;
            long productivityMonth = productivity * month;
            System.out.println("За " + month + " минут машина произвела " + productivityMonth
                                       + " штук бутылок");
            byte totalJar = 120;
            byte whiteJarRoom = 2;
            byte brownJarRoom = 4;
            int jar = whiteJarRoom + brownJarRoom;
            int room = totalJar / jar;
            int whiteJar = room * whiteJarRoom;
            int brownJar = room * brownJarRoom;
            System.out.println("В школе, где " + room + " классов, нужно "
                                       + whiteJar + " банок белой краски и " + brownJar + " банок коричневой краски.");

            short banana = 80 * 5;
            short milk = 105 * 2;
            short iceCream = 100 * 2;
            short egg = 70 * 4;
            int breakfast = banana + milk + iceCream + egg;
            System.out.println("В спортзавтраке  " + breakfast + " грамм");
            float breakfastK = breakfast / 1000F;
            System.out.println("В спортзавтраке " + breakfastK + " килограмм");

            byte loseWeight = 7;
            int diet1 = 250;
            int diet2 = 500;
            int lose = 7 * 1000;
            int diet1Day = lose / diet1;
            int diet2Day = lose / diet2;
            System.out.println(diet1Day + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
            System.out.println(diet2Day + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
            int averageDay = (diet1Day + diet2Day) / 2;
            System.out.println(averageDay + " дней в среднем уйдет на похудение");

            int mariaMount = 67760;
            int denisMount = 83690;
            int kristinMount = 76230;
            int mariaYear = mariaMount * 12;
            int denisYear = denisMount * 12;
            int kristinYear = kristinMount * 12;
            double mariaMountNew = mariaMount + (mariaMount * 0.1);
            double denisMountNew = denisMount + (denisMount * 0.1);
            double kristinMountNew = kristinMount + (kristinMount * 0.1);
            double maria = (mariaMountNew * 12) - mariaYear;
            double denis = (denisMountNew * 12) - denisYear;
            double kristin = (kristinMountNew * 12) - kristinYear;
            System.out.println("Маша теперь получает " + mariaMountNew + "рублей. Годовой доход вырос на " +
                                       +maria + " рублей");
            System.out.println("Денис теперь получает " + denisMountNew + "рублей. Годовой доход вырос на " +
                                       +denis + " рублей");
            System.out.println("Кристина теперь получает " + kristinMountNew + "рублей. Годовой доход вырос на " +
                                       +kristin + " рублей");

        }
    }