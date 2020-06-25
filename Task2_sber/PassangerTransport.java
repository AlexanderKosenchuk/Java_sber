package Task2_sber;

public class PassangerTransport extends Car
{
    double passangers;

    public PassangerTransport (CarCharacters carCharacters)
    {
        super(carCharacters);
        passangers = extraParametr;
        double costOil = 47.50;
        double consumption100km = 0.115;
    }

    public void printCar ()
    {
        super.printCar();
        System.out.println("Число перевезенных пасажиров: " + passangers);
    }

}
