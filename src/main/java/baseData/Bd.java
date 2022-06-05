package baseData;

import javax.swing.*;
import java.io.File;
import java.sql.*;

public class Bd {

    public static void insert(int score) {
        File fich = new File("fichero.txt");
        String url = "jdbc:sqlite:src" + File.separator + "main" + File.separator + "java"+ File.separator + "baseData" + File.separator + "Proyecto3.db";

        try {
            Connection conex = DriverManager.getConnection(url);

            Statement dec = conex.createStatement();

            PreparedStatement pre = conex.prepareStatement("INSERT INTO Core(Nombre,Puntos) VALUES(?,?)");
            {
                pre.setString(1, reigns.Metodos.leer(fich));
                pre.setDouble(2, score);
                pre.executeUpdate();
            }


        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

    public static ResultSet connect(){
        String url = "jdbc:sqlite:src" + File.separator + "main" + File.separator + "java"+ File.separator + "baseData" + File.separator + "Proyecto3.db";

        try {
            Connection conex = DriverManager.getConnection(url);

            Statement dec = conex.createStatement();
            ResultSet reSet = dec.executeQuery("Select * from Slot");

            return reSet;


        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return null;
    }

    public static ResultSet conecta(){
        String url = "jdbc:sqlite:src" + File.separator + "main" + File.separator + "java"+ File.separator + "baseData" + File.separator + "Proyecto3.db";

        try {
            Connection conex = DriverManager.getConnection(url);

            Statement dec = conex.createStatement();
            ResultSet reSet = dec.executeQuery("Select * from Core ORDER BY Puntos DESC");

            return reSet;


        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        return null;
    }

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
