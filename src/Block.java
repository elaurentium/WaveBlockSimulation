import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Block {
    int x, y, width, height;

    public Block(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawing(Graphics g) {
        g.setColor(Color.Blue);
        g.fillRect(x, y, largura, altura);
    }

    class PanelWaves extends JPanel {
        private ArrayList<Block> blocks;

        public PanelWaves() {
            blocks = new ArrayList<>();
            buildBlocks();
        }

        private void buildBlocks() {
            int startX = 50;
            int startY = 200;
            int widthBlock = 20;
            int heightBlock = 10;
            int spaceBetweenBlocks = 5;

            for (int i = 0; i < 20; i++) {
                Block block = new Block(startX + (widthBlock + spaceBetweenBlocks) * i, startY, widthBlock, heightBlock);
                blocks.add(block);
            }
        }
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (Block block : blocks) {
                block.drawing(g);
            }
        }
        class WaveWindowInput extends JFrame {
            public WaveWindowInput() {
                setTitle("Wave Simulation");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(500, 400);

                PanelWaves panel = new PanelWaves();
                add(panel);

                setVisible(true);
            }
        }
        public class WaveSimulation {
            public static void Main(String[] args) {
                SwingUtilities.invokeLater(() -> {
                    new WaveWindowInput();
                });
            }
        }
    }
}