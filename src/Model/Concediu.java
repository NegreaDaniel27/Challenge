package Model;

import java.sql.Date;

public class Concediu {

    private Date dataConcediu;
    private Angajat angajat;

    public Concediu() {
    }

    public Concediu(Date dataConcediu, Angajat angajat) {
        this.dataConcediu = dataConcediu;
        this.angajat = angajat;
    }

    public Date getDataConcediu() {
        return dataConcediu;
    }

    public void setDataConcediu(Date dataConcediu) {
        this.dataConcediu = dataConcediu;
    }

    public Angajat getAngajat() {
        return angajat;
    }

    public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }


    @Override
    public String toString() {
        return "Concediu{" +
                "dataConcediu=" + dataConcediu +
                ", angajat=" + angajat +
                "}\n";
    }


}
