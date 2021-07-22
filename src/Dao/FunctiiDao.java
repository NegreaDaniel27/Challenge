package Dao;

import Model.Functii;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FunctiiDao extends GenericDao{

    public List<Functii> findAll() {
        List<Functii> functiiList = new ArrayList<>();
        String query = "select functii.id, functii.functie, functii.salariu\n" +
                "    from functii";

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Functii functii =new Functii();
                functii.setId(resultSet.getInt("functii.id"));
                functii.setFunctie(resultSet.getString("functii.functie"));
                functii.setSalariu(resultSet.getInt("functii.salariu"));


                functiiList.add(functii);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return functiiList;
    }
}
