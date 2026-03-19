public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    public void setTemperatura(int temp) {
        if (temp >= 16 && temp <= 30) {
            this.temperatura = temp;
        } else {
            System.out.println("Temperatura fora do limite");
        }
    }

    public void setMarca(String brand) {
        if (brand != null && brand.trim().length() >= 3) {
            this.marca = brand;
        } else {
            System.out.println("O nome da marca possui menos de 3 letras.");
        }
    }

    private boolean verificarCompressor() {
        double NMR = Math.random() * 5;
        return NMR > 2;
    }

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("Ok");
        } else {
            System.out.println("Compressor com falha");
        }
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + ligado +
                '}';
    }
}