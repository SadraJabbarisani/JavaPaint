import PaintPackage.*;
import java.awt.Color;
import java.util.Arrays;

public class MyPaint extends javax.swing.JFrame {
    
    Point p1, p2, p3;
    Point[] pArr;
    Color borderColor = Color.black; 
    Color fillColor = Color.white;
    ShapeType currentShape = ShapeType.Line;
    ActionType currentAction = ActionType.Draw;
    PaintingArea myArea;
    Shape selectedShape;
    boolean isFillSelected = false;
    
    
    public MyPaint() {
        initComponents();
        myArea = new PaintingArea(paintPanel.getGraphics(), paintPanel.getHeight(), paintPanel.getWidth());
        //---------------------------
        Line.shapeNumber = 1;
        Rectangl.shapeNumber = 1;
        Circle.shapeNumber = 1;
        Triangle.shapeNumber = 1;
        Polygon.shapeNumber = 1;
        Oval.shapeNumber = 1;
        Square.shapeNumber = 1;
        //---------------------------
        setColorPanel();
    }
    
    private void setColorPanel(){
        
        fillColorPnl.setBackground(fillColor);
        borderColorPnl.setBackground(borderColor);
        
        ColorBTN1.setBackground(Color.BLUE);
        ColorBTN2.setBackground(Color.RED);
        ColorBTN3.setBackground(Color.GREEN);
        ColorBTN4.setBackground(Color.ORANGE);
        ColorBTN5.setBackground(Color.BLACK);
        ColorBTN6.setBackground(Color.DARK_GRAY);
        ColorBTN7.setBackground(Color.GRAY);
        ColorBTN8.setBackground(Color.CYAN);
        ColorBTN9.setBackground(Color.PINK);
        ColorBTN10.setBackground(Color.MAGENTA);
        ColorBTN11.setBackground(Color.YELLOW);
        ColorBTN12.setBackground(Color.WHITE);
        ColorBTN13.setBackground(Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        shapesPanel = new javax.swing.JPanel();
        btnLine = new javax.swing.JButton();
        btnCircle = new javax.swing.JButton();
        btnRect = new javax.swing.JButton();
        btnTri = new javax.swing.JButton();
        btnOval = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();
        btnLine6 = new javax.swing.JButton();
        fillCheck = new javax.swing.JCheckBox();
        shapeLbl = new javax.swing.JLabel();
        colorsPanel = new javax.swing.JPanel();
        borderColorPnl = new javax.swing.JPanel();
        fillColorPnl = new javax.swing.JPanel();
        colorHoder = new javax.swing.JPanel();
        ColorBTN1 = new javax.swing.JButton();
        ColorBTN2 = new javax.swing.JButton();
        ColorBTN3 = new javax.swing.JButton();
        ColorBTN4 = new javax.swing.JButton();
        ColorBTN5 = new javax.swing.JButton();
        ColorBTN6 = new javax.swing.JButton();
        ColorBTN7 = new javax.swing.JButton();
        ColorBTN8 = new javax.swing.JButton();
        ColorBTN9 = new javax.swing.JButton();
        ColorBTN10 = new javax.swing.JButton();
        ColorBTN11 = new javax.swing.JButton();
        ColorBTN12 = new javax.swing.JButton();
        ColorBTN13 = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        eraseBtn = new javax.swing.JButton();
        moveBtn = new javax.swing.JButton();
        scaleBtn = new javax.swing.JButton();
        paintPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Paint ");
        setBackground(new java.awt.Color(255, 51, 51));

        backGround.setBackground(new java.awt.Color(51, 51, 51));

        topPanel.setBackground(new java.awt.Color(102, 102, 102));

        shapesPanel.setBackground(new java.awt.Color(51, 51, 51));
        shapesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        shapesPanel.setForeground(new java.awt.Color(255, 255, 255));
        shapesPanel.setAutoscrolls(true);
        shapesPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnLine.setForeground(new java.awt.Color(255, 255, 255));
        btnLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/diagonal-line.png"))); // NOI18N
        btnLine.setIconTextGap(0);
        btnLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });

        btnCircle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/rec.png"))); // NOI18N
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });

        btnRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/rectangle.png"))); // NOI18N
        btnRect.setAlignmentY(0.3F);
        btnRect.setAutoscrolls(true);
        btnRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectActionPerformed(evt);
            }
        });

        btnTri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/triangle.png"))); // NOI18N
        btnTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriActionPerformed(evt);
            }
        });

        btnOval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/oval.png"))); // NOI18N
        btnOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOvalActionPerformed(evt);
            }
        });

        btnSquare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/check-box-empty.png"))); // NOI18N
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        btnLine6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/square.png"))); // NOI18N
        btnLine6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLine6ActionPerformed(evt);
            }
        });

        fillCheck.setForeground(new java.awt.Color(255, 255, 255));
        fillCheck.setText("Fill Shape");
        fillCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillCheckActionPerformed(evt);
            }
        });

        shapeLbl.setBackground(new java.awt.Color(255, 255, 255));
        shapeLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        shapeLbl.setForeground(new java.awt.Color(255, 255, 255));
        shapeLbl.setText("Shapes");

        javax.swing.GroupLayout shapesPanelLayout = new javax.swing.GroupLayout(shapesPanel);
        shapesPanel.setLayout(shapesPanelLayout);
        shapesPanelLayout.setHorizontalGroup(
            shapesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shapesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shapesPanelLayout.createSequentialGroup()
                        .addComponent(fillCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(shapeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLine, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRect, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTri, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOval, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLine6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        shapesPanelLayout.setVerticalGroup(
            shapesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shapesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shapesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRect, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOval, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLine6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(shapesPanelLayout.createSequentialGroup()
                        .addComponent(shapeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fillCheck)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        colorsPanel.setBackground(new java.awt.Color(51, 51, 51));

        borderColorPnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        borderColorPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borderColorPnlMouseClicked(evt);
            }
        });

        fillColorPnl.setBackground(new java.awt.Color(255, 255, 255));
        fillColorPnl.setPreferredSize(new java.awt.Dimension(40, 40));
        fillColorPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fillColorPnlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fillColorPnlLayout = new javax.swing.GroupLayout(fillColorPnl);
        fillColorPnl.setLayout(fillColorPnlLayout);
        fillColorPnlLayout.setHorizontalGroup(
            fillColorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );
        fillColorPnlLayout.setVerticalGroup(
            fillColorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout borderColorPnlLayout = new javax.swing.GroupLayout(borderColorPnl);
        borderColorPnl.setLayout(borderColorPnlLayout);
        borderColorPnlLayout.setHorizontalGroup(
            borderColorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderColorPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fillColorPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );
        borderColorPnlLayout.setVerticalGroup(
            borderColorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderColorPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fillColorPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        colorHoder.setBackground(new java.awt.Color(102, 102, 102));

        ColorBTN1.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_1(evt);
            }
        });

        ColorBTN2.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_2(evt);
            }
        });

        ColorBTN3.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_3(evt);
            }
        });

        ColorBTN4.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_4(evt);
            }
        });

        ColorBTN5.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_5(evt);
            }
        });

        ColorBTN6.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_6(evt);
            }
        });

        ColorBTN7.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_7(evt);
            }
        });

        ColorBTN8.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_8(evt);
            }
        });

        ColorBTN9.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_9(evt);
            }
        });

        ColorBTN10.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_10(evt);
            }
        });

        ColorBTN11.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_11(evt);
            }
        });

        ColorBTN12.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_12(evt);
            }
        });

        ColorBTN13.setBackground(new java.awt.Color(255, 51, 51));
        ColorBTN13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 5));
        ColorBTN13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBTN_13(evt);
            }
        });

        javax.swing.GroupLayout colorHoderLayout = new javax.swing.GroupLayout(colorHoder);
        colorHoder.setLayout(colorHoderLayout);
        colorHoderLayout.setHorizontalGroup(
            colorHoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorHoderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorHoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorHoderLayout.createSequentialGroup()
                        .addComponent(ColorBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(colorHoderLayout.createSequentialGroup()
                        .addComponent(ColorBTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorBTN13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorHoderLayout.setVerticalGroup(
            colorHoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorHoderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorHoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ColorBTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(colorHoderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ColorBTN13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout colorsPanelLayout = new javax.swing.GroupLayout(colorsPanel);
        colorsPanel.setLayout(colorsPanelLayout);
        colorsPanelLayout.setHorizontalGroup(
            colorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borderColorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorHoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        colorsPanelLayout.setVerticalGroup(
            colorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(colorsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borderColorPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorHoder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shapesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(colorsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(colorsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shapesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePanel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tools");

        eraseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eraser (1).png"))); // NOI18N
        eraseBtn.setIconTextGap(2);
        eraseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseBtnActionPerformed(evt);
            }
        });

        moveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/expand-arrows.png"))); // NOI18N
        moveBtn.setIconTextGap(2);
        moveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBtnActionPerformed(evt);
            }
        });

        scaleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/scale (1).png"))); // NOI18N
        scaleBtn.setIconTextGap(2);
        scaleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scaleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eraseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eraseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(moveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scaleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        paintPanel.setBackground(new java.awt.Color(255, 255, 255));
        paintPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                paintPanelMouseDragged(evt);
            }
        });
        paintPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paintPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paintPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                paintPanelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout paintPanelLayout = new javax.swing.GroupLayout(paintPanel);
        paintPanel.setLayout(paintPanelLayout);
        paintPanelLayout.setHorizontalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paintPanelLayout.setVerticalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backGroundLayout.setVerticalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paintPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineActionPerformed
        currentAction = ActionType.Draw;
        currentShape = ShapeType.Line;
        p1 = p2 = p3 = null;
        
    }//GEN-LAST:event_btnLineActionPerformed

    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircleActionPerformed
        currentAction = ActionType.Draw;
        currentShape = ShapeType.Circle;
        p1 = p2 = p3 = null;
    }//GEN-LAST:event_btnCircleActionPerformed

    private void btnRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectActionPerformed
        currentAction = ActionType.Draw;
        currentShape = ShapeType.Rectangle;
        p1 = p2 = p3 = null;
    }//GEN-LAST:event_btnRectActionPerformed

    private void btnTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriActionPerformed
        currentAction = ActionType.Draw;
        currentShape = ShapeType.Triangle;
        p1 = p2 = p3 = null;
    }//GEN-LAST:event_btnTriActionPerformed

    private void btnOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOvalActionPerformed
        currentAction = ActionType.Draw;
        currentShape = ShapeType.Oval;
        p1 = p2 = p3 = null;
    }//GEN-LAST:event_btnOvalActionPerformed

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareActionPerformed
        currentAction = ActionType.Draw;
        currentShape = ShapeType.Square;
        p1 = p2 = p3 = null;
    }//GEN-LAST:event_btnSquareActionPerformed

    private void btnLine6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLine6ActionPerformed
        currentAction = ActionType.Draw;
        currentShape = ShapeType.Polygon;
        p1 = p2 = p3 = null;
    }//GEN-LAST:event_btnLine6ActionPerformed

    private void fillCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillCheckActionPerformed

    private void paintPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanelMouseReleased
        switch (currentAction){
            case Draw:
            switch (currentShape){
                case Line:
                    if (p1 != null){
                        p2 = new Point(evt.getX(), evt.getY());
                        Line l = new Line(p1,p2,borderColor);
                        myArea.addShape(l);
                    }
                    p1 = p2 = null;
                    break;
                
                case Circle:
                    if (p1 != null){
                        p2 = new Point(evt.getX(), evt.getY());
                        Circle c = new Circle(p1,(int)p1.distance(p2),borderColor, fillColor, fillCheck.isSelected());
                        myArea.addShape(c);
                    }
                    p1 = p2 = null;
                    break;
                    
                case Rectangle:
                    if(p1 != null){
                        p2 = new Point(evt.getX(), evt.getY());
                        Rectangl r = new Rectangl(p1, p2, borderColor, fillColor, fillCheck.isSelected());
                        myArea.addShape(r);
                    }
                    p1 = p2 = null;
                    break;
                    
                case Oval:
                    if(p1 != null){
                        p2 = new Point(evt.getX(), evt.getY());
                        Oval O = new Oval(p1, p2, borderColor, fillColor, fillCheck.isSelected());
                        myArea.addShape(O);
                    }
                    p1 = p2 = null;
                    break;
                    
                case Square:
                    if(p1 != null){
                        p2 = new Point(evt.getX(), evt.getY());
                        Square s = new Square(p1, p2, borderColor, fillColor, fillCheck.isSelected());
                        myArea.addShape(s);
                    }
                    p1 = p2 = null;
                    break;
                    
                case Triangle:
                    if(p1 == null){
                        p1 = new Point(evt.getX(),evt.getY());
                    }else if(p2 == null){
                        p2 = new Point(evt.getX(),evt.getY());
                        paintPanel.getGraphics().drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
                    }else{
                        p3 = new Point(evt.getX(),evt.getY());
                        Triangle t = new Triangle(p1, p2, p3, borderColor, fillColor, fillCheck.isSelected());
                        myArea.addShape(t);
                        p1 = p2 = p3 = null;
                        myArea.reDrawAll();
                    }
                    break;
                    
                case Polygon:
                    if(pArr == null){
                        pArr = new Point[1];
                        pArr[0] = new Point(evt.getX(), evt.getY());
                    }else if(pArr[0].distance(evt.getX(), evt.getY())< 10 && pArr.length > 2){
                        Polygon p = new Polygon(pArr, borderColor, fillColor, fillCheck.isSelected());
                        myArea.addShape(p);
                        pArr = null;
                        myArea.reDrawAll();
                    }
                    else{
                        pArr = Arrays.copyOf(pArr, pArr.length+1);
                        pArr[pArr.length-1] = new Point(evt.getX(), evt.getY());
                    }
                    break;
            }
            break;
            
            case Move:
                p1 = null;
                break;
                
            case Scale:
                p1 = null;
                break;
        }

    }//GEN-LAST:event_paintPanelMouseReleased

    private void paintPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanelMousePressed
        switch (currentAction) {
            case Draw:
                switch (currentShape) {

                    case Line:

                    case Circle:
                    
                    case Oval:
                    
                    case Square:
                
                    case Rectangle:
                        if(p1 == null)
                            p1 = new Point(evt.getX(), evt.getY());
                        break;
                    
                case Triangle:

                case Polygon:
                    break;
                }
                break;
                
            case Move:
                p1 = new Point(evt.getX(), evt.getY());
                selectedShape = myArea.searchShapeByPoint(p1);
                break;
                
            case Scale:
                p1 = new Point(evt.getX(), evt.getY());
                selectedShape = myArea.searchShapeByPoint(p1);
                break;
   
        }
    }//GEN-LAST:event_paintPanelMousePressed

    private void paintPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanelMouseClicked
        switch (currentAction) {
            case Draw:
                break;
                
            case Erase:
                p1 = new Point(evt.getX(), evt.getY());
                Shape s = myArea.searchShapeByPoint(p1);
                if(s != null)
                    myArea.removeShape(s);
                p1 = null;
                break;
                
            case Move:

            break;
            
            case Scale:
          
            break;

        }
    }//GEN-LAST:event_paintPanelMouseClicked

    private void paintPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paintPanelMouseDragged
        switch (currentAction){
            case Draw:
                switch (currentShape){
                    case Line:
                    if (p1 != null){
                        myArea.reDrawAll();
                        paintPanel.getGraphics().drawLine(p1.getX(), p1.getY(), evt.getX(), evt.getY());
                    }
                    break;
                    
                    case Circle:
                    if (p1 != null){
                        myArea.reDrawAll();
                        paintPanel.getGraphics().drawOval(p1.getX() - (int)p1.distance(evt.getX(),/*\*/ evt.getY()), p1.getY() - (int)p1.distance(evt.getX(), evt.getY()),
                            2*(int)p1.distance(evt.getX(), evt.getY()), 2*(int)p1.distance(evt.getX(), evt.getY()));
                    }
                    break;
                    
                    case Square:
                        if (p1 != null){
                            int distance = (int)p1.distance(evt.getX(),evt.getY());
                            myArea.reDrawAll();
                            paintPanel.getGraphics().drawRect(p1.getX()-distance, p1.getY()-distance, 2*distance, 2*distance);
                        }
                        break;
                    
                    case Rectangle:
                        if(p1 != null){
                            myArea.reDrawAll();
                            if(p1.getX() < evt.getX() && p1.getY() < evt.getY()){
                                paintPanel.getGraphics().drawRect(p1.getX(), p1.getY(), evt.getX()-p1.getX(), evt.getY()-p1.getY());
                            }
                            else if(p1.getX() > evt.getX() && p1.getY() < evt.getY()){
                                paintPanel.getGraphics().drawRect(evt.getX(), p1.getY(), p1.getX()-evt.getX(), evt.getY()-p1.getY());
                            }
                            else if(p1.getX() < evt.getX() && p1.getY() > evt.getY()){
                                paintPanel.getGraphics().drawRect(p1.getX(), evt.getY(), evt.getX()-p1.getX(), p1.getY()-evt.getY());
                            }
                            else if(p1.getX() > evt.getX() && p1.getY() > evt.getY()){
                                paintPanel.getGraphics().drawRect(evt.getX(), evt.getY(), p1.getX()-evt.getX(), p1.getY()-evt.getY());
                            }
                        }
                        break;
                        
                    case Oval:
                        if(p1 != null){
                            myArea.reDrawAll();
                            if(p1.getX() < evt.getX() && p1.getY() < evt.getY()){
                                paintPanel.getGraphics().drawOval(p1.getX(), p1.getY(), evt.getX()-p1.getX(), evt.getY()-p1.getY());
                            }
                            else if(p1.getX() > evt.getX() && p1.getY() < evt.getY()){
                                paintPanel.getGraphics().drawOval(evt.getX(), p1.getY(), p1.getX()-evt.getX(), evt.getY()-p1.getY());
                            }
                            else if(p1.getX() < evt.getX() && p1.getY() > evt.getY()){
                                paintPanel.getGraphics().drawOval(p1.getX(), evt.getY(), evt.getX()-p1.getX(), p1.getY()-evt.getY());
                            }
                            else if(p1.getX() > evt.getX() && p1.getY() > evt.getY()){
                                paintPanel.getGraphics().drawOval(evt.getX(), evt.getY(), p1.getX()-evt.getX(), p1.getY()-evt.getY());
                            }
                        }
                        break;
                        
                    case Triangle:
                        if(p1 == null){
                            myArea.reDrawAll();
                            paintPanel.getGraphics().drawOval(evt.getX()-10, evt.getY()-10, 20, 20);
                        }else if(p2 == null){
                            myArea.reDrawAll();
                            paintPanel.getGraphics().drawOval(p1.getX()-10, p1.getY()-10, 20, 20);
                            paintPanel.getGraphics().drawOval(evt.getX()-10, evt.getY()-10, 20, 20);
                            paintPanel.getGraphics().drawLine(p1.getX(), p1.getY(), evt.getX(), evt.getY());
                        }
                        else{
                            myArea.reDrawAll();
                            paintPanel.getGraphics().drawOval(p1.getX()-10, p1.getY()-10, 20, 20);
                            paintPanel.getGraphics().drawOval(p2.getX()-10, p2.getY()-10, 20, 20);
                            paintPanel.getGraphics().drawOval(evt.getX()-10, evt.getY()-10, 20, 20);
                            paintPanel.getGraphics().drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
                            paintPanel.getGraphics().drawLine(p1.getX(), p1.getY(), evt.getX(), evt.getY());
                            paintPanel.getGraphics().drawLine(p2.getX(), p2.getY(), evt.getX(), evt.getY());
                        }
                        break;
                        
                    case Polygon:
                        myArea.reDrawAll();
                        if(pArr == null){
                            //myArea.reDrawAll();
                            paintPanel.getGraphics().drawOval(evt.getX()-10, evt.getY()-10, 20, 20);
                        }else{
                            //myArea.reDrawAll();
                            for(Point po : pArr){
                                paintPanel.getGraphics().drawOval(po.getX()-10, po.getY()-10, 20, 20);
                            }
                            for(int i = 0; i < pArr.length-1; i++){
                                paintPanel.getGraphics().drawLine(pArr[i].getX(), pArr[i].getY(), pArr[i+1].getX(), pArr[i+1].getY());
                            }
                            paintPanel.getGraphics().drawLine(pArr[pArr.length-1].getX(), pArr[pArr.length-1].getY(), evt.getX(), evt.getY());
                            paintPanel.getGraphics().drawOval(evt.getX()-10, evt.getY()-10, 20, 20);
                        }
                        break;
                }
                break;
                
            case Erase:
                p1 = new Point(evt.getX(), evt.getY());
                Shape s = myArea.searchShapeByPoint(p1);
                if(s != null)
                    myArea.removeShape(s);
                p1 = null;
                break;
                
            case Move:
                if (selectedShape != null){
                    selectedShape.move(evt.getX() - p1.getX(),evt.getY() - p1.getY());
                    myArea.reDrawAll();
                    p1 = new Point (evt.getX(),evt.getY());
                }
                break;
                
            case Scale:
                switch (currentShape){
                    //case Triangle:
                    
                    case Circle:
                        
                    case Square:
                        if (selectedShape != null){
                            selectedShape.scale(evt.getX() - p1.getX());
                            myArea.reDrawAll();
                            p1 = new Point (evt.getX(),evt.getY());
                        }
                        break;
                        
                    case Line:
                        
                    case Triangle:
                        
                    case Polygon:
                        
                    case Oval:
                        
                    case Rectangle:
                        if (selectedShape != null && (p1.distance(evt.getX(), p1.getY()) > 10)){
                            selectedShape.scale(evt.getX() - p1.getX());
                            myArea.reDrawAll();
                            p1 = new Point (evt.getX(),evt.getY());
                        }
                        break;
                }
                
        }
    }//GEN-LAST:event_paintPanelMouseDragged

    private void eraseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseBtnActionPerformed
        currentAction = ActionType.Erase;
        p1 = null;
    }//GEN-LAST:event_eraseBtnActionPerformed

    private void moveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBtnActionPerformed
        currentAction = ActionType.Move;
        p1 = null;
    }//GEN-LAST:event_moveBtnActionPerformed

    private void scaleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleBtnActionPerformed
        currentAction = ActionType.Scale;
        p1 = null;
    }//GEN-LAST:event_scaleBtnActionPerformed

    private void colorBTN_1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_1
        if (isFillSelected){
            fillColor = Color.BLUE;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.BLUE;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_1

    private void colorBTN_2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_2
        if (isFillSelected){
            fillColor = Color.RED;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.RED;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_2

    private void colorBTN_3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_3
        if (isFillSelected){
            fillColor = Color.GREEN;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.GREEN;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_3

    private void colorBTN_4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_4
        if (isFillSelected){
            fillColor = Color.ORANGE;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.ORANGE;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_4

    private void colorBTN_5(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_5
        if (isFillSelected){
            fillColor = Color.BLACK;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.BLACK;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_5

    private void colorBTN_6(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_6
        if (isFillSelected){
            fillColor = Color.DARK_GRAY;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.DARK_GRAY;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_6

    private void colorBTN_7(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_7
        if (isFillSelected){
            fillColor = Color.GRAY;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.GRAY;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_7

    private void colorBTN_8(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_8
        if (isFillSelected){
            fillColor = Color.CYAN;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.CYAN;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_8

    private void colorBTN_9(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_9
        if (isFillSelected){
            fillColor = Color.PINK;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.PINK;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_9

    private void colorBTN_10(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_10
        if (isFillSelected){
            fillColor = Color.MAGENTA;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.MAGENTA;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_10

    private void colorBTN_11(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_11
        if (isFillSelected){
            fillColor = Color.YELLOW;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.YELLOW;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_11

    private void colorBTN_12(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_12
        if (isFillSelected){
            fillColor = Color.WHITE;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.WHITE;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_12

    private void colorBTN_13(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBTN_13
        if (isFillSelected){
            fillColor = Color.LIGHT_GRAY;
            fillColorPnl.setBackground(fillColor);
        }else{
            borderColor = Color.LIGHT_GRAY;
            borderColorPnl.setBackground(borderColor);
        }
    }//GEN-LAST:event_colorBTN_13

    private void borderColorPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borderColorPnlMouseClicked
        isFillSelected = false;
    }//GEN-LAST:event_borderColorPnlMouseClicked

    private void fillColorPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillColorPnlMouseClicked
        isFillSelected = true;
    }//GEN-LAST:event_fillColorPnlMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ColorBTN1;
    private javax.swing.JButton ColorBTN10;
    private javax.swing.JButton ColorBTN11;
    private javax.swing.JButton ColorBTN12;
    private javax.swing.JButton ColorBTN13;
    private javax.swing.JButton ColorBTN2;
    private javax.swing.JButton ColorBTN3;
    private javax.swing.JButton ColorBTN4;
    private javax.swing.JButton ColorBTN5;
    private javax.swing.JButton ColorBTN6;
    private javax.swing.JButton ColorBTN7;
    private javax.swing.JButton ColorBTN8;
    private javax.swing.JButton ColorBTN9;
    private javax.swing.JPanel backGround;
    private javax.swing.JPanel borderColorPnl;
    private javax.swing.JButton btnCircle;
    private javax.swing.JButton btnLine;
    private javax.swing.JButton btnLine6;
    private javax.swing.JButton btnOval;
    private javax.swing.JButton btnRect;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnTri;
    private javax.swing.JPanel colorHoder;
    private javax.swing.JPanel colorsPanel;
    private javax.swing.JButton eraseBtn;
    private javax.swing.JCheckBox fillCheck;
    private javax.swing.JPanel fillColorPnl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton moveBtn;
    private javax.swing.JPanel paintPanel;
    private javax.swing.JButton scaleBtn;
    private javax.swing.JLabel shapeLbl;
    private javax.swing.JPanel shapesPanel;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
