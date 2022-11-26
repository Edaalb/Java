package bootcamp.day22_arraysListAndForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class EN_GradeAvarege3 {

    // take all grades from the teacher then calculate avgNumber and which grades are higher then avg


    public static void main(String[] args) {

        List<Integer> gradesFromTheacher = new ArrayList<>();

        gradesFromTheacher = EN_GradeAverage2.takeAllGradesFromTeacher();

        EN_AvgValueAndHigherValues.numbersHigherThanAvg(gradesFromTheacher);

    }
}
