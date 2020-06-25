package Task2_sber;

public class Gsm
{
    public static double calcGsm (Car[] cars)
    {



        double gsm = 0;
        for (Car car : cars) {
            gsm += car.distance * car.costOil * car.consumption100km;
        }
        return gsm;
    }
}
