import java.util.HashMap;

public class HashMapClass{

    public static void main(String[] args) {
        
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("Argentina", "Buenos Aires");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("United States of America", "Washington DC");
        System.out.println(capitalCities);

        capitalCities.put("Germany","Example"); //Replace the other value using the same key 
        System.out.println(capitalCities); 
        System.out.println(capitalCities.get("Argentina"));
        System.out.println(capitalCities.size());
        capitalCities.remove("Germany");
        System.out.println(capitalCities.size()); 
        capitalCities.put("España","Madrid");
    }
}
