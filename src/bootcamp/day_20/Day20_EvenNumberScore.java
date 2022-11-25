package bootcamp.day_20;

public class Day20_EvenNumber {

    public static void main(String[] args) {

        //Write a code that prints even numbers' number in the given two-dimensional int array
        //Verilen iki katli bir int array'deki cift sayi adedini bulan kod yaziniz

        int[][] arr= {{4,6},{3,5,8},{1,0,4}};
        int count=0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] %2 == 0){
                count++;
            }
        }
    }
        System.out.println("Even number number of the array : " + count); //5
}
}

