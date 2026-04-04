public class TestaVeiculo {
    public static void main(String[] args) {

        // Instanciando as máquinas
        Aviao f22Raptor = new Aviao("Lockheed Martin", "F-22", 2414.0f, 15000.0f);
        CarroEletrico modelS = new CarroEletrico("Tesla", "Model S Plaid", 120.0f, 600);

        //Polimorfismo 1: Caça
        Veiculo transporte = f22Raptor;
        System.out.println(transporte.toString());
        transporte.mover();
        transporte.abastecer();

        System.out.println("\n----------------------------------");

        //Polimorfismo 2: Carro
        transporte = modelS;
        System.out.println(transporte.toString());
        transporte.mover();
        transporte.abastecer();
    }
}