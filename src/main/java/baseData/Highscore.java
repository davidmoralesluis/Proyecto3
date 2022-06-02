package baseData;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Highscore extends JFrame implements ActionListener {

    JFrame ventana;
    JPanel panel;
    JLabel tragaperra, highscore;
    Timer halfsec;
    ResultSet test;
    boolean sec;


    String [] columnas={"Nombre","Puntos"};
    DefaultTableModel modelo = new DefaultTableModel();

    JTable tabla = new JTable (modelo);

    public Highscore() throws SQLException {
        super("Highscore");

        // Timer
        halfsec = new Timer(500,this);
        halfsec.start();

        ventana = new JFrame();
        ventana.setBounds(1200,50,600,600);
        ventana.setLayout(null);

        panel = new JPanel();
        panel.setBounds(0,0,600,600);
        panel.setBackground(new Color(53, 104, 45));
        panel.setLayout(null);


        tabla.setBounds(50,150,200,350);
        modelo.addColumn("Nombre");
        modelo.addColumn("Puntos");
        modelo.setColumnIdentifiers(columnas);


        tragaperra = new JLabel("Supertragaperras", SwingConstants.CENTER);
        tragaperra.setBounds(50,100,200,30);
        tragaperra.setBackground(Color.decode("#EABE3F"));
        tragaperra.setVerticalAlignment(SwingConstants.CENTER);
        tragaperra.setOpaque(true);


        highscore = new JLabel("HIGHSCORE", SwingConstants.CENTER);
        highscore.setBounds(100,10,400,50);
        highscore.setBackground(new Color(133,133,133));
        highscore.setFont(new Font("SansSerif", Font.BOLD, 50));
        highscore.setForeground(Color.decode("#EABE3F"));
        highscore.setOpaque(false);




        panel.add(tragaperra);
        panel.add(highscore);
        panel.add(tabla);


        ventana.add(panel);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra Aplicacion cuando X;
        ventana.setVisible(true);


        test=Bd.connect();
        while(test.next()){
            modelo.addRow(new Object[]{test.getString("Name"),test.getString("Cash")});
        }

    }

    @Override
    public void actionPerformed(ActionEvent action) {

        if (sec) {
            sec = false;
        } else {
            sec = true;
        }

        if (action.getSource() == halfsec) {

            if (sec) {
                highscore.setForeground(Color.BLUE);
            } else {
                highscore.setForeground(Color.decode("#EABE3F"));
            }
        }
    }
}
