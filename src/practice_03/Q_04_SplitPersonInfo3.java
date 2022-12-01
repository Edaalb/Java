package practice_03;

public class Q_05_SplitInfo3 {
    public static void main(String[] args) {

        String myInfo [] [] = {

                {"Person name : ", "Last name : ", "Age: "},
                {"Jon", "Doe", "30"}
        };

        for (int i = 0; i <= myInfo.length; i++){
            System.out.println(myInfo[0][i] + myInfo[1][i]);
        }
    }
}

