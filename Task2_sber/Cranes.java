package Task2_sber;

public class Cranes extends Car
{
    double weight;

    public Cranes(CarCharacters carCharacters)
    {
        super(carCharacters);
        weight = extraParametr;
        double costOil = 48.90;
        double consumption100km = 0.2;
    }

    public void printCar()
    {
        super.printCar();
        System.out.println("Вес поднятого груза: " + weight);
    }


}
