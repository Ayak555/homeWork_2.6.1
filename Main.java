import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", 2015, 2.5));
        cars.add(new Car("Lexus LX 570", 2017, 5.7));
        cars.add(new Car("Mercedes S 222", 2016, 5.5));
        cars.add(new Car("Toyota Land Cruiser", 2009, 4.7));
        cars.add(new Car("BMW X5", 2017, 4.8));
        cars.add(new Car("Audi A8", 2018, 4.2));
        cars.add(new Car("Nissan Juke", 2014, 2.5));
        cars.add(new Car("Hummer H1", 1994, 5.0));
        cars.add(new Car("Porsche Carrera", 2015, 5.2));
        cars.add(new Car("Bugatti Veyron", 2003, 6.0));

        Collections.sort(cars);

        Iterator iter = cars.iterator();
        while (iter.hasNext()) {
            Car c = (Car) iter.next();
            System.out.println(c.getModel() + ", год выпуска - " + c.getYear() + ", объем -  " + c.getVolume());
        }


    }

}
