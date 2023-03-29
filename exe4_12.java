public class exe4_12 {
    public static void main(String[] args) {
        funcionario f1 = new funcionario("Joaquim", 100000, "Recursos Humanos", "56hh6hhib5", "24-12-12");

        System.out.println("Ganho anual: " + f1.calculaganhoAnual());

        f1.recebeAumento(1.2);
        System.out.println("Ganho anual apos aumento: " + f1.calculaganhoAnual());
    }
}
