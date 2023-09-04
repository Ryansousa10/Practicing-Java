package uol.compass.introducao.exercises;

public class Exercise03 {
    public static void main(String[] args) {
        double wage = 2600;
        double taxes;
        if (wage < 1000) {
            taxes = +wage * 0.05;
        } else if (wage >= 1000 && wage < 2000) {
            taxes = +wage * 0.1;
        } else if (wage >= 2000 && wage < 5000) {
            taxes = +wage * 0.15;
        } else {
            taxes = +wage * 0.2;
        }
        System.out.println("O total de imposto é de: R$" + taxes);
    }
}
