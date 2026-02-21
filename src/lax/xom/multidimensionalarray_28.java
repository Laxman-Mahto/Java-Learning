package lax.xom;

public class multidimensionalarray_28 {
    public static void main(String[] args) {
        int[] marks; //one d array
        int[][] flats; //2-d array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 202;
        flats[0][2] = 204;
        flats[1][0] = 206;
        flats[1][1] = 495;
        flats[1][2] = 433;
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.println(" ");
            }
            System.out.print("\n");
        }
    }
}