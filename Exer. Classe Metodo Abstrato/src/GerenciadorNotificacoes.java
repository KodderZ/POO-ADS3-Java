import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void main(String[] args) {

        ArrayList<CanalNotificacao> filaDeEnvio = new ArrayList<>();


        filaDeEnvio.add(new Email("DF.Pires@cps.prof.sp.gov.br", "Olá, profesor. Quando é a prova?", "Dúvida sobre data."));
        filaDeEnvio.add(new SMS("Maria (ADS)", "Acabei de perguntar para ele...", 999887766));
        filaDeEnvio.add(new WhatsApp("Grupo ADS Noturno", "Prova próxima Sexta :(", "Entregue."));

        System.out.println("=== Disparo de Notificações ===\n");


        for (CanalNotificacao canal : filaDeEnvio) {

            canal.exibirDados();


            canal.enviar();

            System.out.println("---------------------------------------------------");
        }
    }
}