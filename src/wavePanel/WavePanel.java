package wavePanel;

import blocks.Block;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WavePanel extends JPanel {
    private final ArrayList<Block> blocks;

    public WavePanel() {
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Block block : blocks) {
            block.draw(g);
        }
    }
}

