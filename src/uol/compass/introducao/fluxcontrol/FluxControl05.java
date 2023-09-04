package uol.compass.introducao.fluxcontrol;

public class FluxControl05 {
    public static void main(String[] args) {
        double carTotal = 50000;

        for (int parcela = 1; parcela <= carTotal; parcela++) {
            double valorParcela = carTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
