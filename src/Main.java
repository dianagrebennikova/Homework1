public class Main {
    public static void main(String[] args) {
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











    }
}