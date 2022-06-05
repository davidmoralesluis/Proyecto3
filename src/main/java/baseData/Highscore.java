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
    JLabel tragaperra, highscore, reigns;
    Timer halfsec;
    ResultSet test, prueba;
    boolean sec;


    String [] columnas={"Nombre","Puntos"};
    String [] valores={"Nombre","Puntos"};
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel model = new DefaultTableModel();

    JTable tabla = new JTable (modelo);
    JTable table = new JTable (model);

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

        table.setBounds(330,150,200,350);
        model.addColumn("Nombre");
        model.addColumn("Puntos");
        model.setColumnIdentifiers(valores);

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

        reigns = new JLabel("Reigns", SwingConstants.CENTER);
        reigns.setBounds(330,100,200,30);
        reigns.setBackground(Color.decode("#EABE3F"));
        reigns.setVerticalAlignment(SwingConstants.CENTER);
        reigns.setOpaque(true);

        panel.add(reigns);
        panel.add(tragaperra);
        panel.add(highscore);
        panel.add(tabla);
        panel.add(table);


        ventana.add(panel);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra Aplicacion cuando X;
        ventana.setVisible(true);


        test=Bd.connect();
        prueba=Bd.conecta();
        while(test.next()){
            modelo.addRow(new Object[]{test.getString("Name"),test.getString("Cash")});
        }

        while(prueba.next()){
            model.addRow(new Object[]{prueba.getString("Nombre"),prueba.getString("Puntos")});
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
