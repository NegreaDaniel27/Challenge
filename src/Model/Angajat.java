package Model;

import java.sql.Date;

//import java.util.Date;

public class Angajat {

    private int id;
    private String nume;
    private String prenume;
    private Date dataAngajare;
    private Functii functii;

    public Angajat(Date dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public Angajat(String nume, String prenume, Date dataAngajare, Functii functii) {
        this.nume = nume;
        this.prenume = prenume;
        this.dataAngajare = dataAngajare;
        this.functii = functii;
    }

    public Angajat(int id, String nume, String prenume, Date dataAngajare, Functii functii) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.dataAngajare = dataAngajare;
        this.functii = functii;
    }

    public Angajat() {

    }

    public Angajat(java.util.Date dataAngajare) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Functii getFunctii() {
        return functii;
    }

    public void setFunctii(Functii functii) {
        this.functii = functii;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", dataAngajare=" + dataAngajare +
                ", functii=" + functii +
                "}\n";
    }


}
