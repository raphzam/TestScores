import java.util.Arrays;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //All the variables we're going to need
        int[] scores = new int[10];
        int highestScore = 0;
        int lowestScore = 0;
        double averageScore;
        double sum = 0;

        //Prompt user for scores
        for (int i = 0; i < scores.length; i++) {
            do {
                System.out.println("Enter a score (" + (i+1) + "/10): " );
                scores[i] = input.nextInt();
            } while (scores[i] > 100 || scores[i] < 0);
        }


        //Find the lowest score
        lowestScore = scores[0];
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] < lowestScore){
                lowestScore = scores[i];
            }
        }
        System.out.println("The lowest score is: " + lowestScore);


        //Find the highest score
        highestScore = scores[0];
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] > highestScore){
                highestScore = scores[i];
            }
        }
        System.out.println("The highest score is: " + highestScore);


        //Compute the average
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        averageScore = (sum / scores.length);
        System.out.println("The average score is " + averageScore);


        System.out.println("All the scores are:" + Arrays.toString(scores));

    }

}





















//Bubble Sorting
//        int temp;
//        boolean isSorted = false;
//        do {
//            isSorted = true;
//            for (int i = 0; i < scores.length - 1; i++){
//                for (int j = 0; j < scores.length -1 - i; j++){
//                    if (scores[j] > scores[j+1]){
//                        temp = scores[j];
//                        scores[j] = scores[j+1];
//                        scores[j+1] = temp;
//                        isSorted = false;
//                    }
//                }// j loop
//            }//i loop
//        } while (isSorted);
//        System.out.println("The lowest score is: " + scores[0]);
//        System.out.println("The highest score is: " + scores[9]);


//Failed Code
//            if (scores[i] < scores [i+1]){
//                lowestScore = scores[i];
//            } else {
//                lowestScore = scores[i+1];
//            }


//            if (scores[i] > scores [i+1]){
//                highestScore = scores[i];
//            } else {
//                highestScore = scores[i+1];
//            }
