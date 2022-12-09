package Java_Education.day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class EN_UnwantedLetters {
    public static void main(String[] args) {

        //Question 3- Create a method that deletes the elements containing unwanted letters
        // in a given String list and returns the remaining part to us as a list.


        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Elif");
        names.add("Eda");
        names.add("Cenk");

        System.out.println(names); //[Ali, Elif, Eda, Cenk]

        System.out.println("iDontWantToSeeThisLetter(names) = " + iDontWantToSeeThisLetter(names, "e"));
    } // [Ali, Elif, Eda]R

    public static List<String> iDontWantToSeeThisLetter(List<String> names, String unwantedLetter) {

        List<String> newList = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {

            if (!names.get(i).contains(unwantedLetter)) {

                newList.add(names.get(i));
            }
        }
        return newList;

    }
}
