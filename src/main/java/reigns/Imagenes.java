package reigns;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public final class Imagenes {
        //Instanciamos variables de los tipos JFrame, JPanel y Jlabel
    private JFrame frame;   //JFrame sirve para crear el "marco" de la interfaz.
    private JPanel panel;   //JPanel segmenta ese "marco".
    private JLabel label;   //JLabel contiene el texto y las imágenes
    private BufferedImage image;
    public void inicializar(String text, String img, String titu){  //Este método sirve para crear una interfaz gráfica muy sencilla que usaremmos pocas veces.
        frame = new JFrame();   //Instanciamos un objeto JFrame.
        frame.setTitle(titu);   //Le damos un titulo, que recibe el método.
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    //Determinamos que la acción predeterminada al presionar la "X" sea cerrar la ventana.
        frame.setSize(900, 1000);   //Determinamos el ancho y alto del "marco".
        frame.setLocationRelativeTo(null);  //Hacemos que por defecto aparezca en el centro de la pantalla.
        frame.setResizable(false);  // Hacemos que el tamaño no sea ajustable.


        panel = new JPanel();   //Instanciamos un objeto JPanel.
        panel.setBounds(75,0,750,850);   //Le damos tamaño al panel
        panel.setBackground(Color.DARK_GRAY);   //Establecemos el color del fondo.
        frame.add(panel);   //Lo añadimos al "marco".

        label = new JLabel(text);   //Instanciamos un objeto JLabel con un texto que recibe el método.
        label.setForeground(Color.BLACK);   //Declaramos el color de la letra en negro.
        label.setFont(new Font("Sans-serif", Font.BOLD, 14));   //Declaramos el tipo de fuente y más características.

        try {
            BufferedImage imagen = ImageIO.read(new File(img));
            JLabel pic = new JLabel(new ImageIcon(imagen));
            panel.add(pic);
        }catch(IOException ex) {
            ex.getMessage();
        }
        panel.add(label);   //Añadimos lo establecido al JLabel.
        this.frame.setVisible(true);    //Hacemos que el JFrame sea visible.
    }

    public void panTitulo(String text, String img, String titu){  //Este método sirve para crear una interfaz gráfica muy sencilla que usaremmos pocas veces.
        frame = new JFrame();   //Instanciamos un objeto JFrame.
        frame.setTitle(titu);   //Le damos un titulo, que recibe el método.
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    //Determinamos que la acción predeterminada al presionar la "X" sea cerrar la ventana.
        frame.setSize(700, 930);   //Determinamos el ancho y alto del "marco".
        frame.setLocationRelativeTo(null);  //Hacemos que por defecto aparezca en el centro de la pantalla.
        frame.setResizable(false);  // Hacemos que el tamaño no sea ajustable.


        panel = new JPanel();   //Instanciamos un objeto JPanel.
        panel.setBounds(0,0,700,850);   //Le damos tamaño al panel
        panel.setBackground(Color.DARK_GRAY);   //Establecemos el color del fondo.
        frame.add(panel);   //Lo añadimos al "marco".

        label = new JLabel(text);   //Instanciamos un objeto JLabel con un texto que recibe el método.
        label.setForeground(Color.BLACK);   //Declaramos el color de la letra en negro.
        label.setFont(new Font("Sans-serif", Font.BOLD, 16));   //Declaramos el tipo de fuente y más características.

        JButton boton = new JButton("Pulsa para continuar");
        boton.setBounds(275,855,155,30);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                Metodos.menu();
            }
        });
        frame.add(boton);

        try {
            BufferedImage imagen = ImageIO.read(new File(img));
            JLabel pic = new JLabel(new ImageIcon(imagen));
            panel.add(pic);
        }catch(IOException ex) {
            ex.getMessage();
        }
        panel.add(label);   //Añadimos lo establecido al JLabel.
        this.frame.setVisible(true);    //Hacemos que el JFrame sea visible.
    }

}