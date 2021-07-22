package Dao;

import Model.Angajat;
import Model.Departamente;
import Model.Director;
import Model.Functii;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartamenteDao extends GenericDao{

    public List<Departamente> findAll(int id) {
        List<Departamente> departamenteList = new ArrayList<>();
        String query = "select departamente.id, departamente.departament, angajat.id, angajat.nume, angajat.prenume, angajat.data_angajare, director.id, director.nume, director.prenume\n" +
                "    from departamente\n" +
                "    inner join angajat on angajat.id = departamente.angajat_id\n" +
                "    inner join director on director.id = departamente.director_id\n" +
                "    where departamente.id = ?;";

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Departamente departamente =new Departamente();
                departamente.setId(resultSet.getInt("departamente.id"));
                departamente.setDepartament(resultSet.getString("departamente.departament"));


                Angajat angajat = new Angajat();
                angajat.setId(resultSet.getInt("angajat.id"));
                angajat.setNume(resultSet.getString("angajat.nume"));
                angajat.setPrenume(resultSet.getString("angajat.prenume"));
                angajat.setDataAngajare(resultSet.getDate("angajat.data_angajare"));
                departamente.setAngajat(angajat);


                Director director = new Director();
                director.setId(resultSet.getInt("director.id"));
                director.setNume(resultSet.getString("director.nume"));
                director.setPrenume(resultSet.getString("director.prenume"));
                departamente.setDirector(director);


                departamenteList.add(departamente);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return departamenteList;
    }



    public Departamente findById(int id) {
        Departamente departamente = new Departamente();
        Angajat angajat = new Angajat();
        Director director = new Director();
        String query = "select departamente.id, departamente.departament, angajat.id, angajat.nume, angajat.prenume, angajat.data_angajare, director.id, director.nume, director.prenume\n" +
                "    from departamente\n" +
                "    inner join angajat on angajat.id = departamente.angajat_id\n" +
                "    inner join director on director.id = departamente.director_id\n" +
                "    where departamente.id = ?;";

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                departamente.setId(resultSet.getInt("departamente.id"));
                departamente.setDepartament(resultSet.getString("departamente.departament"));


                angajat.setId(resultSet.getInt("angajat.id"));
                angajat.setNume(resultSet.getString("angajat.nume"));
                angajat.setPrenume(resultSet.getString("angajat.prenume"));
                angajat.setDataAngajare(resultSet.getDate("angajat.data_angajare"));
                departamente.setAngajat(angajat);


                director.setId(resultSet.getInt("director.id"));
                director.setNume(resultSet.getString("director.nume"));
                director.setPrenume(resultSet.getString("director.prenume"));
                departamente.setDirector(director);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return departamente;
    }

    }

