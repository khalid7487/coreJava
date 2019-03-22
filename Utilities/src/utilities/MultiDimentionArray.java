package utilities;

public class MultiDimentionArray {

    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];

        int arr1[][] = {{1, 2, 3}, {3, 4}, {4, 5, 6}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

}
