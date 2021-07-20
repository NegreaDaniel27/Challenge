package Model;

import java.util.Date;

public class Angajati {

    private String nume;
    private String prenume;
    private Date dataAngajare;


    public Angajati() {
    }

    public Angajati(String nume, String prenume, Date dataAngajare) {
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

    @Override
    public String toString() {
        return "Angajati{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", dataAngajare=" + dataAngajare +
                "}\n";
    }
}
