package com.xworkz.repository;

import com.xworkz.DTO.ReserviorDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReserviorRepositoryImpl implements ReserviorRepository{

    private String jdbcUrl = "jdbc:mysql://localhost:3306/RESERVIOR";
    private String username = "root";
    private String password = "root";

    private Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return DriverManager.getConnection(jdbcUrl,username,password);
    }

    @Override
    public boolean save(ReserviorDTO reserviorDTO) {

        String query = "insert into dam ( name, place, state, hight ) values ( ?, ?, ?, ? )";
        try {
            Connection conn = getConnection();
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, reserviorDTO.getName());
            statement.setString(2, reserviorDTO.getPlace());
            statement.setString(3, reserviorDTO.getState());
            statement.setDouble(4, reserviorDTO.getHight());

            statement.execute();
            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean update(String reserviorName, String reserviorPlace, String reseviorState, double reseviorHeight) {

        String query = "Update dam set place = ?, state = ?, hight= ? where name = ?";
        try (Connection conn = getConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,reserviorPlace);
            preparedStatement.setString(2,reseviorState);
            preparedStatement.setDouble(3,reseviorHeight);
            preparedStatement.setString(4,reserviorName);
            preparedStatement.executeUpdate();
            return  true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ReserviorDTO> findAll() {
        List<ReserviorDTO> list = new ArrayList<>();

        String query = "select * from dam";
        try (Connection conn = getConnection()) {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet =  preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(new ReserviorDTO(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDouble(5)));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
