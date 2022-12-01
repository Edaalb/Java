package practice_03;

public interface Q_02_ShortestWord2 {
    public static void main(String[] args) {
        String [] myString = {"word", "epic","asdhasfjkhaskjfhskjdfdsg", "User", "sentencecasd"};
        String word = getLongestString(myString);
        System.out.println(word);
    }
    public static String getLongestString(String []myString){
        String longestWord = myString[0];

        for (int i =0; i < myString.length; i++){

            if (myString[i].length() > longestWord.length()){
                longestWord = myString[i];

            }
        }
        return longestWord;
    }
}
