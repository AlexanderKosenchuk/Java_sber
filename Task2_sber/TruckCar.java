package Task2_sber;

public class TruckCar extends Car
{
    double volume;

    public TruckCar (CarCharacters carCharacters)
    {
        super(carCharacters);
        volume = extraParametr;
        double costOil = 48.90;
        double consumption100km = 0.120;
    }

    public void printCar()
    {
        super.printCar();
        System.out.println("Объем перевезенного груза: " + volume);
    }


}
