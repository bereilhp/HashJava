import java.util.HashSet;

public class HashSetClass {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();

            cars.add("Ferrari");
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Audi");
            cars.add("Mazda");
            cars.add("Ford");

            System.out.println(cars);

            System.out.println(cars.contains("Volvo"));
            System.out.println(cars.size());
            cars.remove("Volvo");
            System.out.println(cars.size());
    }
}
