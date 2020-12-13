import java.util.Scanner;

public class GTLNTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row;
        int column;
        System.out.print("Nhập số hàng của mảng: ");
        row = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        column = scanner.nextInt();
        //Khai báo mảng
        int[][] arr = new int[row][column];

        //Nhập giá trị các phần tử cho mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        //Hiển thị mảng đã nhập
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println("\n");
        }

        //Hiển thị GTLN của mảng 2 chiều
        System.out.print("GTLN của mảng 2 chiều là: " + checkMax(arr, row, column));
    }

    //Tìm GTLN
    public static int checkMax (int [][]arr, int row, int column) {
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}
