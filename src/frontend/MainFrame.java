package frontend;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    //rollenbilder, wie haben sich die lebensverhältnisse verändert frauen gleichberechtigung, zusammenleben heute
    private static int WIDTH = 675;
    private static int HEIGHT = 580;

    //TODO: set dynamic window size
    public MainFrame() throws HeadlessException {
        initFrame();
    }

    public void initFrame(){
        setTitle("Kalender 2023");
        pack();
        setResizable(false);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
