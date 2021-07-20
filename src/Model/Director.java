package Model;

public class Director {

    private int id;
    private String nume;
    private String prenume;


    public Director() {
    }

    public Director(int id, String nume, String prenume) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
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




    @Override
    public String toString() {
        return "Director{" +
                "id='" + id + '\'' +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                "}\n";
    }
}
