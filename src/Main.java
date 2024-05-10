public class Main {
    public static void main(String[] args) {
//        Задача 1

        int one = 1;
        byte two = 2;
        short three = 3;
        long four = 4000_000_000_000L;
        float five = 5.0F;
        double six = 6.0;

        System.out.println("Значение переменной " + "one" + " с типом " + "int" + " равно " + one );
        System.out.println("Значение переменной " + "two" + " с типом " + "byte" + " равно " + two );
        System.out.println("Значение переменной " + "three" + " с типом " + "short" + " равно " + three );
        System.out.println("Значение переменной " + "four" + " с типом " + "long" + " равно " + four );
        System.out.println("Значение переменной " + "five" + " с типом " + "float" + " равно " + five );
        System.out.println("Значение переменной " + "six" + " с типом " + "double" + " равно " + six );

//        Задача 2

        float firstValue = 27.12F;
        long secondValue = 987678965549L;
        double thirdValue = 2.786;
        short fourthValue = 569;
        int fifthValue = -159;
        int sixthValue = 27897;
        byte seventhValue = 67;

//        Задача 3
        System.out.println();
        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;
        int sheetsOfPapers = 480;
        float result = sheetsOfPapers / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика расчитано " + result + " листов бумаги");

//        Задача 4
        System.out.println();
        int efficiencyPerMinute = 16 / 2;
        int twentyM = efficiencyPerMinute * 20;
        System.out.println("За " + "20 минут " + " машина произвела " + twentyM + " бутылок."  );
        int perDay = efficiencyPerMinute * (24 * 60);
        System.out.println("За " + "сутки" + " машина произвела " + perDay + " бутылок."  );
        int perThreeDay = efficiencyPerMinute * (perDay * 3);
        System.out.println("За " + "трое суток" + " машина произвела " + perThreeDay + " бутылок."  );
        int perMonth = efficiencyPerMinute * (perDay * 31);
        System.out.println("За " + "месяц" + " машина произвела " + perMonth + " бутылок."  );

//        Задача 5
        System.out.println();
        int totalNumberOfCans = 120;
        int cansOfWhitePaintPerClass = 2;
        int cansOfBrownPaintPerClass = 4;
        int cansPerClass = cansOfBrownPaintPerClass + cansOfWhitePaintPerClass;
        int countsOfClass = totalNumberOfCans / cansPerClass;
        float cansOfWhitePaint = countsOfClass * cansOfWhitePaintPerClass;
        float cansOfBrownPaint = countsOfClass * cansOfBrownPaintPerClass;
        System.out.println("В школе, где " + countsOfClass + " классов, нужно " + cansOfWhitePaint + " банок белой краски и " + cansOfBrownPaint + " банок коричневой краски." );

//        Задача 6
        System.out.println();

        int countsOfBananas = 5;
        int weightOfBanana = 80;
        int totalWeightOfBananas = countsOfBananas * weightOfBanana;

        int amountOfMilk = 200;
        double weightOfMilk = 105D/100D;
        double totalWeightOfMilk = amountOfMilk * weightOfMilk;

        int countOfIceCream = 2;
        int weightOfIceCream = 100;
        int totalWeightOfIceCream = countOfIceCream * weightOfIceCream;

        int countOfEggs = 4;
        int weightOfEgg = 70;
        int totalWeightOfEggs = countOfEggs * weightOfEgg;

        double weightOfBreakfast1 = totalWeightOfEggs + totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream;
        System.out.println("Вес завтрака в граммах " + weightOfBreakfast1);
        double weightOfBreakfast2 = weightOfBreakfast1 / 1000;
        System.out.println("Вес завтрака в килограммах " + weightOfBreakfast2);

//        Задача 7
        System.out.println();

        short summaryWeight  = 7000;
        short loseWeightPerDay1 = 250;
        short loseWeightPerDay2 = 500;

        byte firstDiet = (byte) (summaryWeight / loseWeightPerDay1);
        byte secondDiet = (byte) (summaryWeight / loseWeightPerDay2);

        System.out.println("худея на 250 грамм в день потребуется " + firstDiet + " дней.");
        System.out.println("худея на 500 грамм в день потребуется " + secondDiet + " дней.");

//        Задача 8
        System.out.println();

        float increaseOfSalary = 1.1F;

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        float increasedSalaryMasha = salaryMasha * increaseOfSalary;
        float increasedSalaryDenis = salaryDenis * increaseOfSalary;
        float increasedSalaryKristina = salaryKristina * increaseOfSalary;

        float differenceMasha = increasedSalaryMasha - salaryMasha;
        float differenceDenis = increasedSalaryDenis - salaryDenis;
        float differenceKristina = increasedSalaryKristina - salaryKristina;

        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + "рублей." );
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + "рублей." );
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + "рублей." );
    }
}