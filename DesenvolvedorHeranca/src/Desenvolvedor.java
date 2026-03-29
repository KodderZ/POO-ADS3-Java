public class Desenvolvedor {
    protected String nome, linguagens;
    protected float salarioBase;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String linguagens, float salarioBase) {
        this.nome = nome;
        this.linguagens = linguagens;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    public float getsalarioBase() {
        return salarioBase;
    }

    public void setsalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void codar(){
        System.out.println("Desenvolvedor criado código");
    }

    public float calculaBonus(){
        return this.salarioBase * 0.05f;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor: "  + nome +
                "\nLinguagem: " + linguagens +
                "\nSalário base: " + salarioBase;
    }
}