package lobby;

import baseData.Bd;
import supertragaperras.Supertragaperras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

public class Lobby extends JFrame implements ActionListener {

    private final String ruta = "src" + File.separator + "main" + File.separator + "java" + File.separator + "lobby" + File.separator + "img" + File.separator;


    JLabel fondo;
    JLabel titulo;
    JButton slot;
    JButton highscore;
    Timer halfsec;
    boolean sec;

    // Imagenes
    ArrayList<Icon> img = new ArrayList<Icon>();

    public Lobby() {
        super("GAMES");

        // maquina
        this.setBounds(1000, 100, 600, 600);
        this.setLayout(null);
        // Timer
        halfsec = new Timer(500, this);
        halfsec.start();

        // Imagenes

        img.add(new ImageIcon(ruta +"espacio.jpg"));// 0
        img.add(new ImageIcon(ruta+"xogos.png"));// 1
        img.add(new ImageIcon(ruta+"red777.png"));// 2
        img.add(new ImageIcon(ruta+"podio.png"));// 3


        // #EABE3F oro
        // SLOT

        titulo = new JLabel();
        titulo.setBounds(125, 110, 325, 100);
        titulo.setIcon(img.get(1));
        add(titulo);

        slot = new JButton();
        slot.setBounds(50, 300, 100, 145);
        slot.setBackground(Color.BLACK);
        slot.setOpaque(true);
        slot.setIcon(img.get(2));
        slot.addActionListener(this);
        add(slot);

        highscore = new JButton();
        highscore.setBounds(500, 10, 64, 64);
        highscore.setBackground(Color.decode("#EABE3F"));
        highscore.setOpaque(true);
        highscore.setIcon(img.get(3));
        highscore.addActionListener(this);
        add(highscore);


        fondo = new JLabel();
        fondo.setBounds(0, 0, 600, 600);
        fondo.setIcon(img.get(0));
        add(fondo);
        System.out.println("fin");
    }

    @Override
    public void actionPerformed(ActionEvent action) {

        if (sec) {
            sec = false;
        } else {
            sec = true;
        }

        if (action.getSource() == slot) {
            Supertragaperras window = new Supertragaperras();

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
            window.setResizable(true);
        }

        if (action.getSource()==highscore){
           // Bd.insertar();
            Bd.select();
        }

        if (action.getSource() == halfsec) {

            if (sec) {
                slot.setBackground(Color.BLACK);
            } else {
                slot.setBackground(Color.decode("#EABE3F"));
            }
        }
    }
}

