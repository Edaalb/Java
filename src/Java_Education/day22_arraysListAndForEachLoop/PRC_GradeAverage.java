package Java_Education.day22_arraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRC_GradeAverage {
    public static void main(String[] args) {
          /*
          Take student notes from the teacher and create a list
          When the teacher enters a number greater than 100 and finishes entering
          print the number of classes, class average and how many people got above average grades
         */

        List<Double> grades= createList();
        System.out.println(grades);
        raporla(grades);
    }
    public static void raporla(List<Double> grades) {

        //print the number of classes, class average and how many people got above average grades
        int  studentNumber=grades.size();
        double gradesTotal=0.0;
        double classGradeAvarage=0.0;
        int aboveAverageNumberOfStudents=0;

        // find the notes total
        for (int i = 0; i <grades.size() ; i++) {
            gradesTotal += grades.get(i);
        }
        // find the grades avarage
        classGradeAvarage=gradesTotal/studentNumber;

        // find the student numbers above avarage / ortalama ustundeki ogrenci sayisini bulalim
        for (int i = 0; i <grades.size() ; i++) {
            if (grades.get(i)>classGradeAvarage){
                aboveAverageNumberOfStudents++;
            }
        }
        // print for the report
        System.out.print("Number of entered grades : " + studentNumber +
                "\nAvarage of entered numbers : " + classGradeAvarage +
                "\nNumber of students above avarage : " + aboveAverageNumberOfStudents);
    }
    public static List<Double> createList(){
        List<Double> grades= new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        Double enteredGrade=5.0;
        while (enteredGrade<=100){
            System.out.println("Please enter a grade to add the list" +
                    "\nEnter a grade above 100 to finish");
            enteredGrade= scan.nextDouble();
            if (enteredGrade<=100){
                grades.add(enteredGrade);
            }
        }
        return grades;
    }
}
