
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alu20924612v
 */
public class NextPiecePanel extends javax.swing.JPanel {

    /**
     * Creates new form NextPiecePanel
     */
    Shape nextShape;
    private static final int MATRIX_SIZE = 4;
    private Board board;

    private Tetrominoes[][] nextMatrix;

    public NextPiecePanel() {
        super();
        initComponents();
        nextShape = new Shape();
        nextMatrix = new Tetrominoes[MATRIX_SIZE][MATRIX_SIZE];
    }

    public void initGame() {
        for (int row = 0; row < MATRIX_SIZE; row++) {
            for (int col = 0; col < MATRIX_SIZE; col++) {
                nextMatrix[row][col] = Tetrominoes.NoShape;
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        if (nextShape != null) {
            nextShape.draw(g, 1, 1, squareWidth(), squareHeight());
        }

    }

    public void drawBoard(Graphics g) {

        for (int row = 0; row < MATRIX_SIZE; row++) {
            for (int col = 0; col < MATRIX_SIZE; col++) {

                board.drawSquare(g, row, col, nextMatrix[row][col]);
            }
        }
    }

    public void changeShape(Shape shape) {
        nextShape = shape;
        repaint();
    }

    public Shape getShape() {

        return nextShape;
    }

    private int squareWidth() {

        return getWidth() / 4;
    }

    private int squareHeight() {

        return getHeight() / 4;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelnextPiecePanel = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanelnextPiecePanelLayout = new javax.swing.GroupLayout(jPanelnextPiecePanel);
        jPanelnextPiecePanel.setLayout(jPanelnextPiecePanelLayout);
        jPanelnextPiecePanelLayout.setHorizontalGroup(
            jPanelnextPiecePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );
        jPanelnextPiecePanelLayout.setVerticalGroup(
            jPanelnextPiecePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelnextPiecePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelnextPiecePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelnextPiecePanel;
    // End of variables declaration//GEN-END:variables
}