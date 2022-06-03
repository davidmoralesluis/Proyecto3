package reigns;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public final class Imagenes {
        //Instanciamos variables de los tipos JFrame, JPanel y Jlabel
    private JFrame frame;   //JFrame sirve para crear el "marco" de la interfaz.
    private JPanel panel;   //JPanel segmenta ese "marco".
    private JLabel label;   //JLabel contiene el texto y las imágenes
    
    public void inicializar(String text, String img, String titu){  //Este método sirve para crear una interfaz gráfica muy sencilla que usaremmos pocas veces.
        frame = new JFrame();   //Instanciamos un objeto JFrame.
        frame.setTitle(titu);   //Le damos un titulo, que recibe el método.
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    //Determinamos que la acción predeterminada al presionar la "X" sea cerrar la ventana.
        frame.setSize(900, 1000);   //Determinamos el ancho y alto del "marco".
        frame.setLocationRelativeTo(null);  //Hacemos que por defecto aparezca en el centro de la pantalla.
        frame.setResizable(false);  // Hacemos que el tamaño no sea ajustable.
        
        
        panel = new JPanel();   //Instanciamos un objeto JPanel.
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10 ,10)); //Le damos bordes.
        panel.setBackground(Color.DARK_GRAY);   //Establecemos el color del fondo.
        frame.add(panel, BorderLayout.NORTH);   //Lo añadimos al "marco".
        
        label = new JLabel(text);   //Instanciamos un objeto JLabel con un texto que recibe el método.
        label.setForeground(Color.BLACK);   //Declaramos el color de la letra en negro.
        label.setFont(new Font("Sans-serif", Font.BOLD, 14));   //Declaramos el tipo de fuente y más características.
        
        ImageIcon labelIcon = new ImageIcon(img);   //Instanciamos un objeto ImageIcon para enseñar una imagen, que recive un String al ser llamado.
        label.setIcon(labelIcon);   //Metemos la imagen en el JLabel.
        label.setHorizontalTextPosition(SwingConstants.CENTER); //Establecemos la posición horizontal del texto.
        label.setVerticalTextPosition(SwingConstants.BOTTOM);   //Establecemos la posición vertical del texto.
        panel.add(label);   //Añadimos lo establecido al JLabel.
        this.frame.setVisible(true);    //Hacemos que el JFrame sea visible.
    }
}