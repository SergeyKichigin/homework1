package java2.homework2;

public class Main {
    public static void main(String[] args) {

        String[][] arr1 = new String[][]{
                {"100", "200", "300", "400"},
                {"500", "600", "700", "800", "900"},
                {"1000", "1100", "1200", "1300"},
                {"1400", "1500", "1600", "1700"}};

        String[][] arr2 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"fail", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] arr3 = new String[][]{
                {"-8", "-7", "-6", "-5"},
                {"-4", "-3", "-2", "-1"},
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"}};


            try {
                ArraySum.sum(arr1);
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }

            try {
                ArraySum.sum(arr2);
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }

            try {
                ArraySum.sum(arr3);
            } catch (MyArrayDataException e) {
                e.printStackTrace();
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
    }
}
