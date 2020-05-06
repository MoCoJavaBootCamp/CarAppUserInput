import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        Car myCar = new Car("Andrew");
        Car bobsCar = new Car("Bob");

        cars.add(myCar);
        cars.add(bobsCar);

        myCar.setYear(2020);
        myCar.setMake("Volkswagon");
        myCar.setModel("Jetta");
        myCar.setColor("Gray");
        myCar.setPrice(20000.00);
        myCar.setQty(1);
        myCar.setFeatures("GPS");
        myCar.setFeatures("automatic headlights");

        bobsCar.setYear(1988);
        bobsCar.setMake("Volkswagon");
        bobsCar.setModel("Beetle");
        bobsCar.setColor("Red");
        bobsCar.setPrice(12000);
        bobsCar.setQty(1);
        bobsCar.setFeatures("FM radio");
        bobsCar.setFeatures("Rolling windows");

        String response = "y";
        do {
            createCar(cars, input);
            System.out.println("Would you like to add another car? (y/n)");
            response = input.nextLine();
        } while (response.equalsIgnoreCase("y"));

        System.out.println("Here are all the cars:");
        int i = 1;
        for (Car car : cars) {
            System.out.println(i++ + ") " + car.getCarInfo());
        }
    }

    private static void createCar(ArrayList<Car> cars, Scanner input) {
        System.out.println("Lets create a new car.");
        Car userCar = new Car();
        cars.add(userCar);

        System.out.println("First, what's your name?");
        String user = input.nextLine();
        userCar.setOwner(user);
        System.out.println("Great " + user + ". Now, what's the make of your car? (Ford, Toyota, BMW, etc)");
        userCar.setMake(input.nextLine());
        System.out.println("Now, what's the model of your car? (F-150, Corolla, 6 Series");
        userCar.setModel(input.nextLine());
        System.out.printf("Ok, what year is the %s %s?\n", userCar.getMake(), userCar.getModel());
        userCar.setYear(input.nextInt());
        System.out.println("Great, what color is your car?");
        input.nextLine();
        userCar.setColor(input.nextLine());
        System.out.println("Now, how much did you purchase your car for? (ex: 25000.00)");
        userCar.setPrice(input.nextDouble());
        input.nextLine();
        String feature = "";
        System.out.println("What type of features does it have?");

        do {
            System.out.println("Enter the feature or type none or done");
            feature = input.nextLine();
            if (feature.equalsIgnoreCase("none") || feature.equalsIgnoreCase("done")) break;
            userCar.setFeatures(feature);
        } while (!feature.equalsIgnoreCase("none"));

        System.out.println("Here's the information on your car:");
        System.out.println(userCar.getCarInfo());
    }
}
