package uol.compass.introducao.arrays;

public class Arrays05 {
    public static void main(String[] args) {
        int[][] dias = new int[3][];
        dias[0] = new int[]{1,2};
        dias[1] = new int[]{3,4,5};
        dias[2] = new int[]{6,7,8};

        for (int[] arr : dias) {
            for (int num : arr) {
                System.out.println(num);
            }
        }
    }
}
