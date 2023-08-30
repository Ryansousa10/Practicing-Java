package Classes;

public class FluxControl04 {
    public static void main(String[] args) {
        int contador = 11;
        while (contador < 10) {
            System.out.println(++contador);
        }
        contador = 0;
        do {
            System.out.println("dentro do do-while " + contador++);
        } while (contador < 10);

        for (int i = 1; i < 11; ++i) {
            System.out.println("Valor de i é: " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
