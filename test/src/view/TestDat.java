package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;

public class TestDat {
    public static void main(String[] args) {
        String dateString = "31/12/2222"; // Replace with your actual input
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate localDate = LocalDate.parse(dateString, formatter);
            Date sqlDate = Date.valueOf(localDate);
            System.out.println("Parsed SQL date: " + sqlDate);
        } catch (Exception e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
    }
}