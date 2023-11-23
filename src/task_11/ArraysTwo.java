package task_11;

public class ArraysTwo {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int[] row : array) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
