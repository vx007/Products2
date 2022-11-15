import java.util.HashMap;
import java.util.Map;

public class Main {
    public static HashMap<Product, Double> products1 = new HashMap<>();
    public static HashMap<Product, Double> products2 = new HashMap<>();
    public static HashMap<String, HashMap<Product, Double>> recipes = new HashMap<>();

    public static void main(String[] args) {
        products1.put(new Product("Помидор", 100d), 10d);
        products1.put(new Product("Огурец", 50d), 10d);
        products1.put(new Product("Майонез", 75d), 1d);

        products2.put(new Product("Хлеб", 30d), 1.0);
        products2.put(new Product("Масло", 150d), 0.5);

        recipes.put("Салат", products1);
        recipes.put("Хлеб с маслом", products2);

        for (Map.Entry<String, HashMap<Product, Double>> entry: recipes.entrySet()){
            System.out.println(entry + ",Цена=" + sumPrice(entry.getValue()));
        }

    }

    public static Double sumPrice(HashMap<Product, Double> map) {
        double sum = 0d;
        for (Map.Entry<Product, Double> entry : map.entrySet()) {
            sum += entry.getKey().getPrice() * entry.getValue();
        }
        return sum;
    }
}
