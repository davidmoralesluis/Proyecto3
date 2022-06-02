package baseData;

import javax.swing.*;
import java.io.File;
import java.sql.*;

public class Bd {

    public static void select() {

        String url = "jdbc:sqlite:src" + File.separator + "main" + File.separator + "java"+ File.separator + "baseData" + File.separator + "Proyecto3.db";

        try {
            Connection conex = DriverManager.getConnection(url);

            Statement dec = conex.createStatement();

            //PreparedStatement pre = conex.prepareStatement("select * from Slot");
//            {
//                pre.setString(1, JOptionPane.showInputDialog("Introduce Nombre?"));
//                pre.setString(2, JOptionPane.showInputDialog("€€€"));
//                pre.executeUpdate();
//            }

            ResultSet reSet = dec.executeQuery("Select * from Slot");

            for (int i = 0; i < 5; i++) {
                System.out.println("+++++++++");
            }
            while(reSet.next()){
                System.out.println(reSet.getString("Name")+" ---> "+reSet.getString("Cash"));
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("+++++++++");
            }

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }




    public static void insertar(double dinero) {

        String url = "jdbc:sqlite:src" + File.separator + "main" + File.separator + "java"+ File.separator + "baseData" + File.separator + "Proyecto3.db";

        try {
            Connection conex = DriverManager.getConnection(url);

            Statement dec = conex.createStatement();

            PreparedStatement pre = conex.prepareStatement("INSERT INTO Slot(Name,Cash) VALUES(?,?)");
            {
                pre.setString(1, JOptionPane.showInputDialog("Introduce Nombre?"));
                pre.setDouble(2, dinero);
                pre.executeUpdate();
            }

            ResultSet reSet = dec.executeQuery("Select * from Slot");

            for (int i = 0; i < 5; i++) {
                System.out.println("+++++++++");
            }
            while(reSet.next()){
                System.out.println(reSet.getString("Name")+" ---> "+reSet.getString("Cash"));
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("+++++++++");
            }

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
