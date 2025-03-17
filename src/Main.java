public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 1:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("\nЗадача 2:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("\nЗадача 3:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println("\nЗадача 4:");
        friend += 2; // увеличиваем на 2
        System.out.println("friend после увеличения на 2: " + friend);
        friend /= 7; // делим на 7
        System.out.println("friend после деления на 7: " + friend);

        var frog = 3.5;
        System.out.println("\nЗадача 5:");
        frog *= 10; // увеличиваем в 10 раз
        System.out.println("frog после умножения на 10: " + frog);
        frog /= 3.5; // делим на 3.5
        System.out.println("frog после деления на 3.5: " + frog);
        frog += 4; // добавляем 4
        System.out.println("frog после добавления 4: " + frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;

        System.out.println("\nЗадача 6:");
        System.out.println("Общая масса двух бойцов: " + totalWeight);
        System.out.println("Разница между массами бойцов: " + weightDifference);

        var remainder = boxer2Weight % boxer1Weight;
        System.out.println("\nЗадача 7:");
        System.out.println("Остаток от деления масс бойцов: " + remainder);

        var totalWorkHours = 640;
        var employees = totalWorkHours / 8;

        System.out.println("\nЗадача 8:");
        System.out.println("Всего работников в компании — " + employees + " человек");

        var increasedEmployees = employees + 94;
        var totalWorkHoursForNewEmployees = increasedEmployees * 8;
        System.out.println("Если в компании работает " + increasedEmployees + " человек, то всего " + totalWorkHoursForNewEmployees + " часов работы может быть поделено между сотрудниками");
    }
}

