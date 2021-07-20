package Model;

public class Departamente {

    private Angajat angajat;
    private Director director;

    public Departamente() {
    }

    public Departamente(Angajat angajat, Director director) {
        this.angajat = angajat;
        this.director = director;
    }

    public Angajat getAngajat() {

        return angajat;
    }

    public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "angajat=" + angajat +
                ", director=" + director +
                "}\n";
    }
}
