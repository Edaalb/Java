package Java_Education.day20_multiDimensionalArrays;

public class EN_MDA_LongestWord {
    public static void main(String[] args) {

        // Write a code that prints the longest String in the given multi-dimensional String array

        String [][] arr= {{"Ilker","Nesrin"} ,{"Hasan","Heysem","Adem","Yusuf Enes"}};

        String longestWord=arr[0][0];

        for (int i = 0; i < arr.length ; i++) { // it controls the elements of outer array
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].length() > longestWord.length()){
                    longestWord=arr[i][j];
                }
            }
        }
        System.out.println("Longest Word : " + longestWord);
    }
}
