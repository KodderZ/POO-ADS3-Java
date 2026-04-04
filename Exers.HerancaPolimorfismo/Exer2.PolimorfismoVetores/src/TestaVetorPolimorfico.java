public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] equipe = new Desenvolvedor[4];


        equipe[0] = new Junior("Marcos (TechLead)", "Lucas Silva", "Java", 4500.0f);
        equipe[1] = new Pleno(15, "Mariana Costa", "Java e SQL", 7800.0f);
        equipe[2] = new Senior(35000.0f, "Roberto Almeida", "Java, AWS e Arquitetura", 14500.0f);
        equipe[3] = new Desenvolvedor("João Genérico", "Lógica Básica", 3000.0f);


        System.out.println("=== PROCESSAMENTO DA FOLHA DE PAGAMENTO ===\n");


        for (Desenvolvedor dev : equipe) {

            dev.codar();

            System.out.println(dev.toString());
            System.out.println("Bônus Calculado: R$ " + dev.calculaBonus());

            System.out.println("\n---------------------------------------------------\n");
        }
    }
}