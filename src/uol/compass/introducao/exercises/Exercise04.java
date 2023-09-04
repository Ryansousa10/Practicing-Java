package uol.compass.introducao.exercises;

public class Exercise04 {
    public static void main(String[] args) {
        byte number = 2;
        switch (number) {
            case 7:
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia-útil");
                break;
            default:
                System.out.println("Opção inválida");


        }
    }
}
