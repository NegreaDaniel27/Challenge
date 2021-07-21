package Dao;

import Model.Angajat;
import Model.Functii;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AngajatDao extends GenericDao {

    public List <Angajat> findAll() {
        String query = "select angajat.id, nume, prenume, data_angajare, functie, salariu \n" +
                "from angajat \n" +
                "inner join functii on functii.id = angajat.functii_id\n" +
                "where functii.id = ?";

        List<Angajat> angajatList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("angajat.id");
                String nume = resultSet.getString("nume");
                String prenume = resultSet.getString("Prenume");
                Date dataAngajare = resultSet.getDate("data_angajare");

                int functieId = resultSet.getInt("functii.id");
                String functie = resultSet.getString("functii.funcie");
                int salariu = resultSet.getInt("functii.salariu");
                Functii functii = new Functii(functieId, functie, salariu);


                Angajat angajat = new Angajat(id, nume, prenume, dataAngajare, functii);
                angajatList.add(angajat);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return angajatList;
    }





    public Angajat findById(int angajatId) {
        String query = "select angajat.id, nume, prenume, data_angajare, functii.functie, functii.salariu" +
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

        return null;
    }


}
