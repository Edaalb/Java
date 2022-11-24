package bootcamp.day_14;

public class Day14_Question2 {

    // Question 2: Get the user's name and surname separately in the main method
    // Create a method that returns : first letters of first and last name as capitals and rest should be in lower case

    // Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun

    // input : name : Ali  surname :YILMAZ.     output : Ali Yilmaz

    public static void main(String[] args) {
        String name="Elif";
        String surname= "ALBAYRAK";
        System.out.println(createNameSurname(name, surname)); // Elif Albayrak
        System.out.println(createNameSurname("Ali","CENK")); // Ali Cenk
    }
    public static String createNameSurname(String name, String surname){
        String newNameSurname= name.substring(0,1).toUpperCase()+
                name.substring(1).toLowerCase() +
                " " +
                surname.substring(0,1).toUpperCase()+
                surname.substring(1).toLowerCase();
        return newNameSurname;
    }
}
