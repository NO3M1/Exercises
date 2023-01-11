package exercitii2;

public class Masina {
    private String marca;
    private int nrUsi;
    private String culoare;
    private int viteza;
    boolean isElectric;

    public Masina(String marca, int nrUsi, String culoare, boolean isElectric) {
        this.marca = marca;
        this.nrUsi = nrUsi;
        this.culoare = culoare;
        this.isElectric = isElectric;
        viteza = 0;
    }

    public String getMarca() {
        return marca;
    }

    public int getViteza() {
        return viteza;
    }

    public void accelereaza() {
        viteza++;
        System.out.println("Accelereaza!");
    }

    public void franeaza() {
        viteza--;
        System.out.println(getMarca() + " franeaza!");
    }
}
