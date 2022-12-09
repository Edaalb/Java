package Java.day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class EN_RemoveAll {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Hasan");
        names.add("Huseyin");

        System.out.println(names); //[Ali, Veli, Hasan, Huseyin]

        List<String> toDelete =new ArrayList<>();
        toDelete.add("Hasan");
        toDelete.add("Huseyin");
        System.out.println("toDelete = " + toDelete); // [Hasan, Huseyin]

        names.removeAll(toDelete);

        System.out.println("names = " + names); // [Ali, Veli]

    }

}
