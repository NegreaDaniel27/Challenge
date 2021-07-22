package Model;

public class Departamente {

    private int id;
    private String departament;
    private Angajat angajat;
    private Director director;

    public Departamente() {
    }

    public Departamente(int id, String departament, Angajat angajat, Director director) {
        this.id = id;
        this.departament = departament;
        this.angajat = angajat;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Departamente(String departament) {
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
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
        return "Departamente{" +
                "id=" + id +
                ", departament='" + departament + '\'' +
                ", angajat=" + angajat +
                ", director=" + director +
                " }\n ";
    }
}
