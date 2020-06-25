package Task2_sber;

// здесь будет выполнятся вычисление наших переменных
public class CarCharacters {

    String car = new String();
    int typeCar;                // Тип авто
    double distance;            // путь
    int stateNumber;            // Гос номер
    double extraParametr;          // доп. параметр

    public CarCharacters(String car) { //достаем необходимые значения из строки
        this.car = car;
        typeCar = Integer.valueOf(car.substring(1, car.indexOf("_")));
        stateNumber = Integer.valueOf(car.substring(car.indexOf("_") + 1, car.indexOf("-")));
        if (typeCar == 100) {
            distance = Double.valueOf(car.substring(7));
        } else {
            distance = Double.valueOf(car.substring(car.indexOf("-") + 1, car.indexOf("-", car.indexOf("-") + 1)));
            extraParametr = Double.valueOf(car.substring(car.indexOf("-", car.indexOf("-") + 1) + 1));


        }
    }
}