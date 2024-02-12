package com.xworkz.JDBC.Repository;

import com.xworkz.JDBC.DTO.FlightBooking;
import com.xworkz.JDBC.Repository.FlightBookingRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightBookingRepositoryImpl implements FlightBookingRepository{
    @Override
    public void saveFlightBookingDetails(FlightBooking booking) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "root";

        String insertQuery = "INSERT INTO AIRTICKET" +
                "(flight_name, source, destination, ticket_price)" +
                "VALUES(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, booking.getFlightName());
            preparedStatement.setString(2,booking.getSource());
            preparedStatement.setString(3,booking.getDestination());
            preparedStatement.setDouble(4,booking.getTicketPrice());
            preparedStatement.execute();
            System.out.println("Data Inserted");
            System.out.println("DataBase Connection Successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void saveAll(List<FlightBooking> bookings) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "root";

        String insertQuery = "INSERT INTO AIRTICKET" +
                "(flight_name, source, destination, ticket_price)" +
                "VALUES(?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            for (FlightBooking flightBooking: bookings){
                preparedStatement.setString(1,flightBooking.getFlightName());
                preparedStatement.setString(2,flightBooking.getSource());
                preparedStatement.setString(3,flightBooking.getDestination());
                preparedStatement.setDouble(4,flightBooking.getTicketPrice());
                preparedStatement.execute();
                System.out.println("Inserted Data Successfully"+flightBooking);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(String flight_name, String source, String destination) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "root";

        String updateQuery = "UPDATE AIRTICKET SET source = ?, destination = ? " +
                "where flight_name = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1,source);
            preparedStatement.setString(2,destination);
            preparedStatement.setString(3,flight_name);
            preparedStatement.executeUpdate();
            System.out.println("Updated data !!!!!!!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String flight_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "root";

        String deleteQuery = "DELETE FROM AIRTICKET WHERE flight_name = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1,flight_name);
            preparedStatement.execute();
            System.out.println("Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public FlightBooking findByName(String flightName) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "root";

        FlightBooking booking = null;

        String query = "SELECT * FROM AIRTICKET WHERE flight_name = ?";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,flightName);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                booking = new FlightBooking();
                booking.setFlightName(resultSet.getString("flight_name"));
                booking.setDestination(resultSet.getString("destination"));
                booking.setSource(resultSet.getString("source"));
                booking.setTicketPrice(resultSet.getDouble("ticket_price"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return booking;
    }

    @Override
    public List<FlightBooking> findAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/TICKETSYSTEM";
        String userName = "root";
        String password = "root";

        List<FlightBooking> flightBookingList = new ArrayList<>();

        String query = "SELECT * FROM AIRTICKET";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString("source"));

                FlightBooking booking = new FlightBooking();
                booking.setFlightName(resultSet.getString("flight_name"));
                booking.setDestination(resultSet.getString("destination"));
                booking.setSource(resultSet.getString("source"));
                booking.setTicketPrice(resultSet.getDouble("ticket_price"));

                flightBookingList.add(booking);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flightBookingList;
    }


}
