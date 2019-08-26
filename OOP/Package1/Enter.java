package OOP.Package1;

import java.util.Arrays;
import java.util.Random;

public class Enter {
    static Car[] cars;
    static final String[] vendors = {
            "Audi",
            "BMW",
            "Lamborgini",
            "Lada"
    };
    static final String[] colours = {
            "red",
            "blue",
            "white",
            "orange"
    };
    static {
        Random r = new Random();
        cars = new Car[10];
        for(int i = 0; i<cars.length; i++){
            Car car = new Car();
            car.setEngineVolume(r.nextDouble()*100);
            car.setColour(colours[r.nextInt(4)]);
            car.setSeats(r.nextInt(6+1));
            car.setVendor(vendors[r.nextInt(4)]);
            cars[i] = car;
        }

    }

    public static void main(String[] args) {

        printCar();
        Arrays.sort(cars);
        System.out.println("After sorting by default");
        printCar();

        Car.CarComparator comp = new Car.CarComparator(1);

        Arrays.sort(cars,comp);
        System.out.println("After sorting by colour");
        printCar();

        Car.CarComparator comp1 = new Car.CarComparator(Car.CarComparator.SORTING_FIELD_VENDOR);

        Arrays.sort(cars,comp1);
        System.out.println("After sorting by Vendors");
        printCar();



        }
    static void printCar(){
        for(Car car: cars){
            System.out.println(car);
        }


    }
}
