import lobby.Lobby;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Lobby menu=new Lobby();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
        menu.setResizable(true);
    }
}
