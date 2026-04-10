public class WhatsApp extends CanalNotificacao {
    private String statusLeitura;

    public WhatsApp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar() {
        // Incluí o status de leitura na exibição para demonstrar o uso do atributo
        System.out.println("Enviando Zap para [" + destinatario + "]... Mensagem: " + mensagem + " (Status: " + statusLeitura + ")");
    }
}