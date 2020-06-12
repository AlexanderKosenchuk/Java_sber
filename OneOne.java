public class OneOne {
    public static void main(String[] args) {
        String[] cars = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50",
                "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100",
                "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};

        //        Стоимость литра топлива для каждого типа транспорта
        double costLitrC100 = 46.10;
        double costLitrC300 = 47.50;
        double costLitrC200 = 48.90;
        double costLitrC400 = 48.90;

        //        Расход топлива на 100км для каждого типа транспорта
        double rasC100 = 0.125;
        double rasC200 = 0.120;
        double rasC300 = 0.115;
        double rasC400 = 0.2;

        double allGsm;
        // переменные гсм для каждого типа авто
        double gsmC100;
        double gsmC200;
        double gsmC300;
        double gsmC400;

        // путь каждого типа авто
        double distC100 = 0;
        double distC200 = 0;
        double distC300 = 0;
        double distC400 = 0;


        for (String car : cars) {
            char[] chr = car.toCharArray();
            // ищем пробег каждого типа авто
            switch (chr[1]) {
                case '1':
                    distC100 += distC100 + Integer.valueOf(car.substring(7));
                    break;
                case '2':
                    distC200 += distC200 + Integer.valueOf(car.substring(7, 9));
                    break;
                case '3':
                    distC300 += distC300 + Integer.valueOf(car.substring(7, 9));
                    break;
                case '4':
                    distC400 += distC400 + Integer.valueOf(car.substring(7, 9));
                    break;
            }

        }

        gsmC100 = distC100 * rasC100 * costLitrC100;
        gsmC200 = distC200 * rasC200 * costLitrC200;
        gsmC300 = distC300 * rasC300 * costLitrC300;
        gsmC400 = distC400 * rasC400 * costLitrC400;
        allGsm = gsmC100 + gsmC200 + gsmC300 + gsmC400;

        System.out.println(allGsm);


        if (gsmC100 < gsmC200 && gsmC100 < gsmC300 && gsmC100 < gsmC400) {
            System.out.println("Минимальный расход у типа C100");
        } else if (gsmC200 < gsmC300 && gsmC200 < gsmC400 && gsmC200 < gsmC100) {
            System.out.println("Минимальный расход у типа С200");
        } else if (gsmC300 < gsmC100 && gsmC300 < gsmC200 && gsmC300 < gsmC400) {
            System.out.println("Минимальный расход у типа С200");
        } else System.out.println("Минимальный расход у типа С400");

        if (gsmC100 > gsmC200 && gsmC100 > gsmC300 && gsmC100 > gsmC400) {
            System.out.println("Максимальный расход у типа C100");
        } else if (gsmC200 > gsmC300 && gsmC200 > gsmC400 && gsmC200 > gsmC100) {
            System.out.println("Максимальный расход у типа С200");
        } else if (gsmC300 > gsmC100 && gsmC300 > gsmC200 && gsmC300 > gsmC400) {
            System.out.println("Максимальный расход у типа С200");
        } else System.out.println("Максимальный расход у типа С400");
    }
}








