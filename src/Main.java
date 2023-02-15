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
        int freeMoney = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            i++;
            total = total + freeMoney;
            System.out.println("месяц № " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i+++" ");
        }System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int allPeople = 12000000;
        int birthRate =17;
        int mortality =8;
        int difference = birthRate-mortality;
        int peopleYear = allPeople/1000 *difference;
        for (int i = 1;i<=10;i++){
            allPeople = allPeople+peopleYear;
            System.out.println("Год " +i+", численность населения составляет " +allPeople);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int i=0;
        while ( deposit<12000000  ) {
            i++;
            deposit+= deposit*0.07;
            System.out.println("Месяц " + i + " накопилось " + deposit);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int i=0;
        while ( deposit<12000000  ) {
            i++;
            deposit+= deposit*0.07;
            if(i%6==0)
            System.out.println("Месяц " + i + " накопилось " + deposit);
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int year = 9;
        int month = year*12;
        int monthMoney = 15000;
        int deposit = (int) (monthMoney * 0.07);
        int finish = 0;
        for (int i = 1;i<=month;i++) {
            finish = finish +monthMoney;
            finish = finish + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопилось " + finish);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        for (int monthDay = 5;monthDay <=31;monthDay = monthDay+7){
            System.out.println("Сегодня пятница, "+monthDay +" -е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        for (int i = 0; i < 2100; i = i + 79) {
            if (i<=2000 && i > 1823)
            System.out.println(i);
            if (i>2000 && i<2123)
                System.out.println(i);
        }
    }
}