package Model;

import java.util.Date;

public class Angajat {

    private int id;
    private String nume;
    private String prenume;
    private Date dataAngajare;


    public Angajat() {
    }

    public Angajat(int id, String nume, String prenume, Date dataAngajare) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.dataAngajare = dataAngajare;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Date getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(Date dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", dataAngajare=" + dataAngajare +
                "}\n";
    }
}
