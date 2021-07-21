package Dao;

import Model.Angajat;
import Model.Functii;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AngajatDao extends GenericDao {

    public List<Angajat> findAll(int functieId) {
        List<Angajat> angajatList = new ArrayList<>();
        String query = "select angajat.id, angajat.nume, angajat.prenume, angajat.data_angajare, functii.id, functii.functie, functii.salariu\n" +
                "    from angajat\n" +
                "    inner join functii on functii.id = angajat.functii_id\n" +
                "    where angajat.functii_id = ?";
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, functieId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Angajat angajat = new Angajat();
                angajat.setId(resultSet.getInt("angajat.id"));
                angajat.setNume(resultSet.getString("angajat.nume"));
                angajat.setPrenume(resultSet.getString("angajat.prenume"));
                angajat.setDataAngajare(resultSet.getDate("angajat.data_angajare"));

                Functii functii =new Functii();
                functii.setId(resultSet.getInt("functii.id"));
                functii.setFunctie(resultSet.getString("functii.functie"));
                functii.setSalariu(resultSet.getInt("functii.salariu"));
                angajat.setFunctii(functii);

                angajatList.add(angajat);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return angajatList;
    }






    public Angajat findById(int angajatId) {
        Angajat angajat = new Angajat();
        String query = "select a.id, a.nume, a.prenume, a.data_angajare, f.functie, f.salariu" +
                "from angajat as a " +
                "inner join functii_f on a.functii_id = f.id"+
                "where a.id = ?";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setInt(1, angajatId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("angajat.id");
                String nume = resultSet.getString("nume");
                String prenume = resultSet.getString("Prenume");
                Date dataAngajare = resultSet.getDate("data_angajare");

                int functieId = resultSet.getInt("functii.id");
                String functie = resultSet.getString("functii.funcie");
                int salariu = resultSet.getInt("functii.salariu");
                Functii functii = new Functii(functieId, functie, salariu);


                return new Angajat(id, nume, prenume, dataAngajare, functii);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return angajat;
    }

    public Angajat findDataAngajat(int angajatId) {
        Angajat dataAngajat = new Angajat();
        String query = "select data_angajare" +
                "from angajat \n" +
                "where angajat.id = ?";

        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(query);
            preparedStatement.setInt(1, angajatId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("angajat.id");
                String nume = resultSet.getString("nume");
                String prenume = resultSet.getString("Prenume");
                Date dataAngajare = resultSet.getDate("data_angajare");

                int functieId = resultSet.getInt("functii.id");
                String functie = resultSet.getString("functii.funcie");
                int salariu = resultSet.getInt("functii.salariu");
                Functii functii = new Functii(functieId, functie, salariu);


                return new Angajat(id, nume, prenume, dataAngajare, functii);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return dataAngajat;
    }

}
