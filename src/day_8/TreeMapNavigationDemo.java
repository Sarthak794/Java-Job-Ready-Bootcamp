package day_8;

import java.util.Random;
import java.util.TreeMap;

public class TreeMapNavigationDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        Random random = new Random();

        
        while (map.size() < 10) {
            int key = random.nextInt(100);
            map.put(key, "Value" + key);
        }

        System.out.println("Sorted TreeMap:");
        System.out.println(map);

        
        System.out.println("\nFirst Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

       
        int testKey = 50;
        System.out.println("\nTest Key: " + testKey);

        System.out.println("Higher Key: " + map.higherKey(testKey));
        System.out.println("Lower Key: " + map.lowerKey(testKey));
        System.out.println("Ceiling Key: " + map.ceilingKey(testKey));
        System.out.println("Floor Key: " + map.floorKey(testKey));
    }
}
