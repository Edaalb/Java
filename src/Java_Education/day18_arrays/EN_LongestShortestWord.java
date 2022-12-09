package Java_Education.day18_arrays;

public class EN_LongestShortestWord {

    public static void main(String[] args) {

        // Create a method that prints the longest and shortest words in a given String array.

        String[] arr ={"Eda", "Elif","Ali","Mark Eliyahu"};
        printLongestShortestWords(arr);
    }
    public static void  printLongestShortestWords(String[] arr){
        String longestWord=arr[0];
        String shortestWord=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length()>=longestWord.length()){
                longestWord=arr[i];
            }
            if (arr[i].length()<=shortestWord.length()){
                shortestWord=arr[i];
            }
        }
        System.out.println("Longest word : " + longestWord); // Mark Eliyahu
        System.out.println("Shortest word : " + shortestWord); //Ali
    }
}
