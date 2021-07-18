package java2.homework2;

public class ArraySum {

    public static final int SIZE = 4;

    public static int sum(String[][] arr) {
        if (arr.length != SIZE) throw new MyArraySizeException("Only array 4x4!");
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != SIZE) throw new MyArraySizeException("Only array 4x4!");
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Not a number data at cell [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Sum = " + sum);
        return sum;
    }

}
