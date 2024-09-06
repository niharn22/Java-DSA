package Arrays;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        System.out.println("Array = "+array);

        // Adding an element at a specific index
        array.add(1, 15); // Insert 15 at index 1

        System.out.println("After insertion : "+array);

        array.remove(2);
        System.out.println("After deletion : "+array);

        System.out.println("Accessing element at index 2 : "+array.get(2));

        System.out.println("Size of array : "+array.size());
    }
}
