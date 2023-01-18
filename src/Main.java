import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
        public static void task1 () {
            System.out.println("Задача 1");
            byte one = 100;
            short two = 30000;
            int tree = 2000000000;
            long four = 1000000;
            float five = 3.55f;
            double six = 3.555555;
            System.out.println("Значение переменной -one с типом -int равно " + one + ".");
            System.out.println("Значение переменной -two с типом -short равно " + two + ".");
            System.out.println("Значение переменной -tree с типом -int равно " + tree + ".");
            System.out.println("Значение переменной -four с типом -long равно " + four + ".");
            System.out.println("Значение переменной -five с типом -float равно " + five + ".");
            System.out.println("Значение переменной -six с типом -double равно " + six + ".");
            System.out.println(" ");
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float one = 27.12f;
        long two = 987678965549L;
        float tree = 2.786f;
        short four = 569;
        short five = -159;
        short six = 27897;
        byte seven = 67;
        System.out.println(" ");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int numberOfStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short paper = 480;
        int personalPaper = paper / numberOfStudents;
        System.out.println("На каждого ученика рассчитано " + personalPaper + " листов бумаги.");
        System.out.println(" ");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte performance2min = 16;
        byte performance1min = 16/2;
        int performance20min = performance1min * 20;
        System.out.println("За 20 мин. машина произвела " + performance20min + " штук бутылок");
        short oneDay = 24*60; // 24 часа умножели на 60 минут
        int performanceDay = oneDay*performance1min;
        System.out.println("За сутки машина произвела " + performanceDay + " штук бутылок");
        int perfThreeDay = performanceDay * 3;
        System.out.println("За три дня машина произвела " + perfThreeDay + " штук бутылок");
        int oneMonth = performanceDay * 30;
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок");
        System.out.println(" ");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short totalPaint = 120;
        byte oneClassWhitePaint = 2;
        byte oneClassBrownPaint = 4;
        int oneClassTotalPaint = oneClassBrownPaint + oneClassWhitePaint;
        int quantityClass = totalPaint / oneClassTotalPaint;
        int totalWhitePaint = quantityClass * oneClassWhitePaint;
        int totalBrownPaint = quantityClass * oneClassBrownPaint;
        System.out.println("В школе, где " + quantityClass + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");
        System.out.println(" ");
    }
    public static void task6 () {System.out.println("Задача 6");
        byte bananas = 5;
        short weightOneBananasInGramms = 80;
        short milkInMl = 200;
        short oneHundredMlMilkInG = 105;
        byte iceCreamPlombir = 2;
        short iceCreamInGr = 100;
        byte egg = 4;
        short eggInG = 70;
        int allWeight = (bananas * weightOneBananasInGramms) + ((milkInMl / 100) * oneHundredMlMilkInG) + (iceCreamPlombir * iceCreamInGr) + (egg * eggInG);
        float allWeightInKg = allWeight / 1000f;
        System.out.println(allWeightInKg);
        System.out.println(" ");
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte haveToLoseWeightInKg = 7;
        int haveToLoseWeigthInG = haveToLoseWeightInKg * 1000;
        int method1 = 250;
        int daysNeedIfTwoHFeefty = haveToLoseWeigthInG / method1;
        System.out.println("Eсли спортсмен будет терять по 250 грамм, ему понадобится " + daysNeedIfTwoHFeefty + " дней.");
        int method2 = 500;
        int daysNeedIfFeeftyHandredGLose = haveToLoseWeigthInG / method2;
        System.out.println("Eсли спортсмен будет терять по 500 грамм, ему понадобится " + daysNeedIfFeeftyHandredGLose + " дней.");
        int oneAParDaysNeed = (daysNeedIfTwoHFeefty + daysNeedIfFeeftyHandredGLose) / 2;
        System.out.println("В среднем спортсмену понадобиться " + oneAParDaysNeed + " день.");
        System.out.println(" ");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristinaSalary = 76230;
        int mashaSalary2 = (mashaSalary / 100) * 10 + mashaSalary;
        int differenceMasha = mashaSalary2 - mashaSalary;
        System.out.println("Маша теперь получает " + mashaSalary2 + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        int denisSalary2 = (denisSalary / 100) * 10 + denisSalary;
        int differenceDenis = denisSalary2 - denisSalary;
        System.out.println("Денис теперь получает " + denisSalary2 + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        int cristinaSalary2 = (cristinaSalary / 100) * 10 + cristinaSalary;
        int differenceCristina = cristinaSalary2 - cristinaSalary;
        System.out.println("Кристина теперь получает " + cristinaSalary2 + " рублей. Годовой доход вырос на " + differenceCristina + " рублей.");
    }
}