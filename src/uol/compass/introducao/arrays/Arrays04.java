package uol.compass.introducao.arrays;

public class Arrays04 {
    public static void main(String[] args) {
        int[][] days = new int[2][2];
        days[0][0] = 28;
        days[0][1] = 29;
        days[1][0] = 30;
        days[1][1] = 31;

        int[][] dias = {{0,0}, {1,2,3}, {0,0,0,0}}; // exemplo de declaração de arrays multidimensional

        for (int[] ref : days ) {
            for (int day : ref){
                System.out.println(day);
            }
        }

    }
}