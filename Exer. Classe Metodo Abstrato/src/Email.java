public class Email extends CanalNotificacao {
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando E-mail para [" + destinatario + "] com o assunto [" + assunto + "]: " + mensagem);
    }
}