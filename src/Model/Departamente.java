package Model;

public class Departamente {

    private String departament;
    private Angajat angajat;
    private Director director;

    public Departamente() {
    }

    public Departamente(String departament, Angajat angajat, Director director) {
        this.departament = departament;
        this.angajat = angajat;
        this.director = director;
    }

    public Departamente(String departament) {
        this.departament = departament;
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
                "nume departament=" + departament +
                "angajat=" + angajat +
                ", director=" + director +
                "}\n";
    }
}
