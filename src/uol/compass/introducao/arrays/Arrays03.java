package uol.compass.introducao.arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

        for(int aux : numeros){
            System.out.println(aux);
        }
    }
}
