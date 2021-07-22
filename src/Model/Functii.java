package Model;

public class Functii {

    private int id;
    private String functie;
    private int salariu;

    public Functii(int id, String functie, int salariu) {
        this.id = id;
        this.functie = functie;
        this.salariu = salariu;
    }

    public Functii() {
    }


    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Functii{" +
                "nume functie= " + functie +
                ", id=" + id +
                ", salariu=" + salariu +
                "}\n";
    }
}
