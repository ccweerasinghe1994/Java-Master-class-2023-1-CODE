import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        board[0][0] = 'O';
        board[0][1] = 'O';
        board[0][2] = 'O';
//        System.out.println(Arrays.deepToString(board));
//        Arrays.stream(board).forEach(System.out::println);

        char[][] board2 = {
                {'0', '-', '-'},
                {'0', '-', '-'},
                {'0', '-', '-'}
        };
        Arrays.stream(board2).forEach(System.out::println);
    }
}
