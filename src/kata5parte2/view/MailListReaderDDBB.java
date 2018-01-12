package kata5parte2.view;

import kata5parte2.model.Mail;

import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderDDBB {
    public static List<Mail> read(String fileName) {
        ArrayList<Mail> list = new ArrayList<>();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:"+fileName);
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM mails");

            while(rs.next()) {
                list.add(new Mail(rs.getString("mail")));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
