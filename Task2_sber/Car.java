package Task2_sber;

public class Car
{

    int typeCar;                // Тип авто
    double costOil;                // стоимость топлива
    double consumption100km;       // расход на 100 км
    double distance;            // путь
    int stateNumber;            // Гос номер
    double extraParametr;          // доп. параметр


    public Car (CarCharacters carCharacters)
    {
        typeCar = carCharacters.typeCar;
        stateNumber = carCharacters.stateNumber;
        distance = carCharacters.distance;
        extraParametr = carCharacters.extraParametr;
    }

    public void printCar ()
    {
        String nameTypeCar = new String();
        switch (typeCar)
        {
            case 100:
            {
                nameTypeCar = "Легковые авто";
                break;
            }
            case 200:
            {
                nameTypeCar = "Грузовые авто";
                break;
            }
            case 300:
            {
                nameTypeCar = "Пассажирский транспорт";
                break;
            }
            case 400:
            {
                nameTypeCar = "Тяжелая техника";
                break;
            }
        }

        System.out.println("Наименование типа авто: " + nameTypeCar);
        System.out.println("Гос номер: " + stateNumber);
        System.out.println("Пробег авто: " + distance);
    }

}
