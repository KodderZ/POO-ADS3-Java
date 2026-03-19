import java.util.Random;

public class Drone {
    private float altura;
    private int bateria;
    private boolean emVoo = false;

    public Drone() {

    }

    public Drone(String codigo, float altura, boolean emVoo) {
        this.altura = altura;
        this.bateria = bateria;
        this.emVoo = emVoo;
    }


    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Número de bateria inválida!");
        }
    }


    private boolean TestaMotores() {
        System.out.println("Calibrando helices...");
        System.out.println("\nCalibrando GPS...");

        double NMR = Math.random() * 10;

        return NMR < 8;
    }

    public void decolar() {
        if (bateria <= 20) {
            System.out.println("Bateria insuficiente!");
        }

        if (TestaMotores()) {
            emVoo = true;
            setAltura(2);
            System.out.println("Voando");
        } else {
            System.out.println("Falha no motor");
        }


    }

    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
        } else {
            System.out.println("Altura não compatível a capacidade do drone");
        }
    }

    public void subir(float sobe) {
        if (emVoo) {
            setAltura(this.altura + sobe);
        } else {
            System.out.println("O drone precisa estar em voo");
        }
    }

    public void descer(float desce) {
        if (emVoo) {
            setAltura(this.altura - desce);
        } else {
            System.out.println("O drone precisa estar em voo");
        }
    }
}