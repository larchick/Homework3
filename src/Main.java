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

    public static void task1() {
        System.out.println("Задача 1");

        byte b = 22;
        System.out.println(b);

        short c = 15000;
        System.out.println(c);

        int a = 40000;
        System.out.println(a);

        long d = 365L;
        System.out.println(d);

        float e = 0.75f;
        System.out.println(e);

        double f = 1.01210885;
        System.out.println(f);
    }

    public static void task2() {
        System.out.println("Задача 2");

        byte k = 67;
        System.out.println(k);

        short m = -159;
        System.out.println(m);

        short n = 569;
        System.out.println(n);

        int z = 27897;
        System.out.println(z);

        long t = 987678965549L;
        System.out.println(t);

        float h = 2.786F;
        System.out.println(h);

        float r = 27.12f;
        System.out.println(r);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short sheets = 480;
        int totalStudents = firstTeacher + secondTeacher + thirdTeacher;
        int sheetsEach = sheets/totalStudents;
        System.out.println("На каждого ученика расчитано " + sheetsEach + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte  bottle = 16;
        byte time = 2;
        int minute = bottle/time;
        byte gap = 20;
        int result = minute * gap ;
        System.out.println("За " + gap + " минут машина произвела " + result + " штук бутылок");

        byte day = 24;
        int timeDay = day * 60;
        int bottleDay = timeDay*minute;
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок");

        int threeDays = timeDay*3;
        int bottleThreeDays = threeDays*minute;
        System.out.println("За трое суток машина произвела " + bottleThreeDays + " штук бутылок");

        int month = timeDay*31;
        int bottleMonth = month*minute;
        System.out.println("За 1 месяц машина произвела " + bottleMonth + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        byte white = 2;
        byte brown = 4;
        byte total = 120;
        int sumColor = white + brown;
        int oneClass = total/sumColor;
        int totalWhite = oneClass * white;
        int totalBrown = oneClass * brown;

        System.out.println("В школе, где " + oneClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");

    }

    public static void task6() {
        System.out.println("Задача 6");

       byte banana = 5;
       byte weightBanana = 80;
       int totalBanana = banana * weightBanana;

       short milk = 200;
       byte weightMilk = 105;
       byte milliliterMilk = 100;
       int weightMilliliter = milk/milliliterMilk;
       int totalMilk = weightMilk*weightMilliliter;


       byte ice = 2;
       byte weightIce = 100;
       int totalIce = ice*weightIce;

       byte eggs = 4;
       byte weightEgs = 70;
       int totalEgs = eggs*weightEgs;

       int weightBreakfast = totalBanana+totalEgs+totalIce+totalMilk;

       short kg = 1000;

        float kgBreakfast = (float) weightBreakfast / kg;

        System.out.println("Вес спортзавтрака в граммах - " +weightBreakfast+ ". Вес спортзавтрака в килограммах - " +kgBreakfast);


    }

    public static void task7() {
        System.out.println("Задача 7");

        byte initialWeight = 7;
        short gramWight = 1000;
        int totalWeightSport = initialWeight*gramWight;
        short loss = 250;
        short bigLoss = 500;

        int dayLoss = totalWeightSport/loss;
        System.out.println(dayLoss+ " дней уйдет на похудение, если спортсмен будет терять каждый день по " +loss+ " грамм.");

        int dayBigLoss = totalWeightSport/bigLoss;
        System.out.println(dayBigLoss+ " дней уйдет на похудение, если спортсмен будет терять каждый день по " +bigLoss+ " грамм.");

        int sumDay = dayLoss+dayBigLoss;
        byte numberSum = 2;
        int numberDay = sumDay/numberSum;
        System.out.println(numberDay+ " день может потребоваться в среднем, чтобы добиться результата похудения.");
    }

    public static void task8() {
        System.out.println("Задача 8");
        byte percent = 10;
        byte number = 100;
        float increase = (float) percent/number;
        byte year = 12;


        int salaryMasha = 67760;
        int increaseMasha = (int) (salaryMasha*increase);
        int totalSalary = salaryMasha+increaseMasha;
        int differenceMasha = (totalSalary*year)-(salaryMasha*year);


        System.out.println("Маша теперь получает " +totalSalary+ " рублей. Годовой доход вырос на " +differenceMasha);


        int salaryDenis = 83690;
        int increaseDenis = (int) (salaryDenis*increase);
        int totalSalaryDenis = salaryDenis+increaseDenis;
        int differenceDenis = (totalSalaryDenis*year)-(salaryDenis*year);
        System.out.println("Денис теперь получает " +totalSalaryDenis+ " рублей. Годовой доход вырос на " +differenceDenis);

        int salaryCris = 76230;
        int increaseCris = (int) (salaryCris*increase);
        int totalSalaryCris = salaryCris+increaseCris;
        int differenceCris = (totalSalaryCris*year)-(salaryCris*year);
        System.out.println("Кристина теперь получает " +totalSalaryCris+ " рублей. Годовой доход вырос на " +differenceCris);
    }
}