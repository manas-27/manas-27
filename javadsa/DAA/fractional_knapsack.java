import java.util.*;

class knapSack {
    float value;
    int indx;
    boolean accessed;
}

public class fractional_knapsack {

    static knapSack[] sort(knapSack[] indexes) {
        int index;
        float value;
        for (int i = 0; i < indexes.length; i++) {
            for (int j = 0; j < indexes.length - i - 1; j++) {
                if (indexes[j].value < indexes[j + 1].value) {

                    value = indexes[j].value;
                    index = indexes[j].indx;
                    indexes[j].value = indexes[j + 1].value;
                    indexes[j].indx = indexes[j + 1].indx;
                    indexes[j + 1].value = value;
                    indexes[j + 1].indx = index;
                }
            }
        }
        return indexes;
    }

    static void solveKnapsack(float[] weights, float[] values, int n, float capacity) {
        knapSack[] indexes = new knapSack[n];

        for (int i = 0; i < n; i++) {
            indexes[i] = new knapSack();
        }

        float m = capacity;
        float sum = 0;
        float total_profit = 0;

        float valueByWeight[] = new float[n];

        float[] solution = new float[n];

        // calculating value by weight ratio

        for (int i = 0; i < n; i++) {
            valueByWeight[i] = values[i] / weights[i];
            // System.out.println(valueByWeight[i]);
            indexes[i].value = valueByWeight[i];
            indexes[i].indx = i;
        }

        sort(indexes);
        // for (int i = 0; i < n; i++) {
        // System.out.println(valueByWeight[i]);
        // }

        for (int i = 0; i < n; i++) {
            // float temp = valueByWeight[i];
            if (!indexes[i].accessed && capacity > 0) {
                int index = indexes[i].indx;
                // System.out.println(index);
                indexes[i].accessed = true;

                capacity = capacity - weights[index];

                if (capacity <= 0) {
                    solution[index] = (capacity + weights[index]) / weights[index];
                } else {
                    solution[index] = 1;
                }
            }

        }

        System.out.println("Solution for given knapsack problem is \n");
        System.out.println("Objects \tSolution");

        // summation of wi*xi and summation of vi*xi

        for (int i = 0; i < n; i++) {
            sum = sum + (solution[i] * weights[i]);

            total_profit = total_profit + (solution[i] * values[i]);
        }
        // System.out.println(sum);

        // printing the solution

        if ((int) sum == (int) m) {
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + "\t\t" + solution[i]);
            }
            System.out.println();
            // for (int i = 0; i < n; i++) {
            // System.out.print("\t" + solution[i]);
            // }

            System.out.println("\nTotal profit is: " + total_profit);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int n = sc.nextInt();
        float[] values = new float[n];
        float[] weights = new float[n];

        System.out.println("Enter the capacity of knapsack: ");
        float capacity = sc.nextFloat();
        // taking values from user
        System.out.println("Enter the values of objects: ");
        for (int i = 0; i < n; i++) {
            values[i] = (float) sc.nextInt();

        }

        // Taking weights from user
        System.out.println("Enter the Weights of objects: ");
        for (int i = 0; i < n; i++) {
            weights[i] = (float) sc.nextInt();
        }

        solveKnapsack(weights, values, n, capacity);

    }

}
