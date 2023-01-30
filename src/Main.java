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
    }

    public static void task6() {
        System.out.println("Задача 6");
    }

    public static void task7() {
        System.out.println("Задача 7");
    }

    public static void task8() {
        System.out.println("Задача 8");
    }
}