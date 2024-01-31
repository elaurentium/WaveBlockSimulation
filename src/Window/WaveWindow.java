package Window;
import wavePanel.WavePanel;

import javax.swing.*;

public class WaveWindow extends JFrame {
    public WaveWindow() {
        setTitle("Wave Simulation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        WavePanel panel = new WavePanel();
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WaveWindow::new);
    }
}

