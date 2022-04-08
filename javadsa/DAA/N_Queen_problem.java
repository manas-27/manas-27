import java.util.*;

public class N_Queen_problem {

    public static void problem_solver(char[][] onesolution, List<List<String>> allsolutions, int col) {
        if (col == onesolution.length) {
            saveSolution(onesolution, allsolutions);
            return;
        }

        for (int row = 0; row < onesolution.length; row++) {
            if (safePlace(row, col, onesolution)) {
                onesolution[row][col] = 'Q';
                problem_solver(onesolution, allsolutions, col + 1);

            }
            onesolution[row][col] = '.';
        }
    }

    public static void saveSolution(char[][] onesolution, List<List<String>> allsolutions) {
        String row;
        List<String> newSolution = new ArrayList<>();

        for (int i = 0; i < onesolution.length; i++) {
            row = "";
            for (int j = 0; j < onesolution[0].length; j++) {
                if (onesolution[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newSolution.add(row);
        }
        allsolutions.add(newSolution);
    }

    public static boolean safePlace(int row, int col, char[][] onesolution) {

        // horizontal check
        for (int j = 0; j < onesolution.length; j++) {
            if (onesolution[row][j] == 'Q') {
                return false;
            }
        }

        // vertical check
        for (int j = 0; j < onesolution.length; j++) {
            if (onesolution[j][col] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; r--, c--) {
            if (onesolution[r][c] == 'Q') {
                return false;
            }
        }

        // upper right
        r = row;
        for (int c = col; c < onesolution.length && r >= 0; r--, c++) {
            if (onesolution[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        r = row;
        for (int c = col; r < onesolution.length && c < onesolution.length; r++, c++) {
            if (onesolution[r][c] == 'Q') {
                return false;
            }
        }

        // Lower left
        r = row;
        for (int c = col; r < onesolution.length && c >= 0; r++, c--) {
            if (onesolution[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static List<List<String>> n_queen_solution(int n) {
        List<List<String>> allsolutions = new ArrayList<>();
        char[][] onesolution = new char[n][n];
        problem_solver(onesolution, allsolutions, 0);
        return allsolutions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens to be placed: ");
        int n = sc.nextInt();

        System.out.println(n_queen_solution(n));
        sc.close();
    }
}
