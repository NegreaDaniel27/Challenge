package Model;

import java.util.Date;

public class Proiecte {

    private int id;
    private String proiect;
    private Angajat angajat;
    private Date dataInceput;
    private Date deadline;

    public Proiecte() {
    }

    public Proiecte( int id, String proiect, Angajat angajat, Date dataInceput, Date deadline) {
        this.id = id;
        this.proiect = proiect;
        this.angajat = angajat;
        this.dataInceput = dataInceput;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProiect() {
        return proiect;
    }

    public void setProiect(String proiect) {
        this.proiect = proiect;
    }

    public Angajat getAngajat() {
        return angajat;
    }

    public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }


    public Date getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(Date dataInceput) {
        this.dataInceput = dataInceput;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Proiecte{" +
                "id='" + id + '\'' +
                "proiect='" + proiect + '\'' +
                ", angajat=" + angajat +
                ", dataInceput=" + dataInceput +
                ", deadline=" + deadline +
                "}\n";
    }
}
