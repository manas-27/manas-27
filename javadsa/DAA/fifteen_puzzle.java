import java.util.Arrays;

public class fifteen_puzzle {
    private int[][] grid;
    private int xspace; // xspace,yspace are the current coordinates of the space
    private int yspace;
    private final int size; // the number of tiles across and down
    private final int[][] goal; // the tile positions in the goal state
    private int movecount = 1000;

    // sets up the grid using initialGrid

    public fifteen_puzzle(int[][] initialGrid) {
        size = initialGrid.length;
        goal = setGoal();
        grid = initialGrid;

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (grid[x][y] == 0) {
                    xspace = x;
                    yspace = y;
                }
            }
        }

    }

    // sets up the grid by copying goal and then making random moves.

    public fifteen_puzzle(int size) {

        if (size < 2 || size > 10) {
            throw new IllegalArgumentException("Invalid size");
        }
        this.size = size;
        goal = setGoal();

        grid = new int[size][size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                grid[x][y] = goal[x][y];
                if (goal[x][y] == 0) {
                    xspace = x;
                    yspace = y;
                }
            }
        }
        scramble();
    }

    public void scramble() {

        for (int moves = 1; moves <= movecount; moves++) {
            // do a set amount of random moves.

            boolean done = false;
            while (!done) {
                double num = Math.random();

                if (num <= 0.25) {
                    if (legalClick(xspace + 1, yspace)) {
                        moveTile(xspace + 1, yspace);
                        done = true;
                    }
                }
                if (num > 0.25 && num <= 0.5) {
                    if (legalClick(xspace - 1, yspace)) {
                        moveTile(xspace - 1, yspace);
                        done = true;
                    }
                }
                if (num > 0.5 && num <= 0.75) {
                    if (legalClick(xspace, yspace + 1)) {
                        moveTile(xspace, yspace + 1);
                        done = true;
                    }
                }
                if (num > 0.75) {
                    if (legalClick(xspace, yspace - 1)) {
                        moveTile(xspace, yspace - 1);
                        done = true;
                    }
                }
            }
        }
    }

    public int[][] setGoal() {
        int[][] goal = new int[size][size];
        for (int a = 1; a <= size; a++) {
            for (int b = 1; b <= size; b++) {
                goal[a - 1][b - 1] = a + size * (b - 1);
            }
        }
        goal[size - 1][size - 1] = 0;
        return goal;
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getSize() {
        return size;
    }

    // Returns true if x,y is on the board and adjacent to the blank space.

    public boolean legalClick(int x, int y) {

        if (x < 0 || y < 0 || x > size - 1 || y > size - 1) {
            return false;
        }

        return ((x == xspace && (y == yspace - 1 || y == yspace + 1))
                || (y == yspace && (x == xspace - 1 || x == xspace + 1)));
    }

    public boolean finished() {

        return Arrays.deepEquals(grid, goal);
    }

    // swaps the tile at x,y with the space;

    public void moveTile(int x, int y) {

        if (!legalClick(x, y)) {
            return;
        }
        grid[xspace][yspace] = grid[x][y];
        xspace = x;
        yspace = y;
        grid[xspace][yspace] = 0;
    }

}