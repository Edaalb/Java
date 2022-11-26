package bootcamp.day_10;

public class Day10_SM_question2 {
    public static void main(String[] args) {
        /*
          Question 2:
             Get a String from the user and the text to be searched.
             Check the usage of the desired text in the String and print the appropriate one of the following sentences.
                 -String does not contain the searched text
                 -Searched text used only once in the String
                 -Searched text used more than 1 in the String
                                                                                                                      */
        String sentence= "Java is very beautiful, very beautiful.";
        String text= "very";

        if (!sentence.contains(text)){
            System.out.println("Sentence does not contain the searched text");
        }else{
            int firstIndex= sentence.indexOf(text); // 5
            int secondIndex=sentence.indexOf(text, firstIndex+1); // it will be -1 or one index
            if (secondIndex==(-1)){
                System.out.println("Searched text used only once in the sentence");
            }else {
                System.out.println("Searched text used more than 1 in the sentence");
            }
        }
    }
}
