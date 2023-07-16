package game.main;

import game.component.PanelGame;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Md. Rahim
 */
public class Main extends JFrame {

    public Main() {
        init();
    }

    private void init() {
        setTitle("Plane Shooter");
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelGame panelGame = new PanelGame();
        getContentPane().add(panelGame, BorderLayout.CENTER); // Add the panel to the content pane

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                panelGame.start();
            }
        });
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}
