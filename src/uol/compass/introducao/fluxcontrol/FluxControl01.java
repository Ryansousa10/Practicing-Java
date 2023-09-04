package uol.compass.introducao.fluxcontrol;

public class FluxControl01 {
    public static void main(String[] args) {
        int age = 22;
        String category;
        if (age < 15) {
            category = "Categoria infantil!";
        } else if (age > 15 && age < 18) {
            category = "Categoria juvenil!";
        } else {
            category = "Categoria adulto!";
        }
        System.out.println(category);
    }
}
