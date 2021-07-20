package Model;

public class Functii {

    private int id;
    private int salariu;


    public Functii(int id, int salariu) {
        this.id = id;
        this.salariu = salariu;
    }

    public Functii() {
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
                "id=" + id +
                ", salariu=" + salariu +
                "}\n";
    }
}
