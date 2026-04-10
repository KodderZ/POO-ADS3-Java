public abstract class CanalNotificacao {
    protected String destinatario;
    protected String mensagem;


    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }


    public void exibirDados() {
        System.out.println("Destinatário: " + destinatario + " | Mensagem: " + mensagem);
    }

    public abstract void enviar();
}