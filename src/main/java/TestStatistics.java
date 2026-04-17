import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {

        int[] scores = {85, 83, 92, 93, 44, 22, 94, 94, 74, 34};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;

            if (score > high) {

                high = score;
            }
            if (score < low) {
                low = score;
            }


            double average = (double) sum / scores.length;

            System.out.println("Average: " + average);
            System.out.println("High score: " + high);
            System.out.println("Low score: " + low);


        }
        Arrays.sort(scores);
        double median = ((scores[4] + scores[5]) / 2.0);
        System.out.println("Median: " + median);


    }
}
