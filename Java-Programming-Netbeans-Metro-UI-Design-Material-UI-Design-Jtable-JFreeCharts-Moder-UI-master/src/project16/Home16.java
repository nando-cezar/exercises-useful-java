/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project16;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author proxc
 */
public class Home16 extends javax.swing.JFrame {

    /**
     * Creates new form Home16
     */
    public Home16() {
        initComponents();
        RenderChart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_sidebar = new javax.swing.JPanel();
        lbl_west = new javax.swing.JLabel();
        lbl_north = new javax.swing.JLabel();
        lbl_south = new javax.swing.JLabel();
        lbl_east = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnl_chart = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pnl_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);

        pnl_sidebar.setBackground(new java.awt.Color(34, 41, 50));
        pnl_sidebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_sidebarMouseDragged(evt);
            }
        });
        pnl_sidebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_sidebarMousePressed(evt);
            }
        });

        lbl_west.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_west.setForeground(new java.awt.Color(166, 166, 166));
        lbl_west.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project16/Icons/plus_18px_1.png"))); // NOI18N
        lbl_west.setText("Western Field");
        lbl_west.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_westMousePressed(evt);
            }
        });

        lbl_north.setBackground(new java.awt.Color(48, 201, 235));
        lbl_north.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_north.setForeground(new java.awt.Color(48, 201, 235));
        lbl_north.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project16/Icons/home_18px.png"))); // NOI18N
        lbl_north.setText("Northern Field");
        lbl_north.setToolTipText("");
        lbl_north.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_northMousePressed(evt);
            }
        });

        lbl_south.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_south.setForeground(new java.awt.Color(166, 166, 166));
        lbl_south.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project16/Icons/clock_18px.png"))); // NOI18N
        lbl_south.setText("Southern Field");
        lbl_south.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_southMousePressed(evt);
            }
        });

        lbl_east.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_east.setForeground(new java.awt.Color(166, 166, 166));
        lbl_east.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project16/Icons/search_18px_2.png"))); // NOI18N
        lbl_east.setText("Eastern Field");
        lbl_east.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_eastMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(22, 27, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("(c) KeepToo 2017");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project16/Icons/speech_bubble_25px.png"))); // NOI18N

        javax.swing.GroupLayout pnl_sidebarLayout = new javax.swing.GroupLayout(pnl_sidebar);
        pnl_sidebar.setLayout(pnl_sidebarLayout);
        pnl_sidebarLayout.setHorizontalGroup(
            pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_sidebarLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_sidebarLayout.createSequentialGroup()
                        .addGroup(pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_north, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_south, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_west, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_east, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_sidebarLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        pnl_sidebarLayout.setVerticalGroup(
            pnl_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sidebarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbl_north, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_south, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_west, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_east, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_chart.setBackground(new java.awt.Color(54, 63, 73));
        pnl_chart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_chartMouseDragged(evt);
            }
        });
        pnl_chart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_chartMousePressed(evt);
            }
        });
        pnl_chart.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(34, 41, 50));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("X  ");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        pnl_chart.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jTextField1.setBackground(new java.awt.Color(54, 63, 73));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText(" Search");
        jTextField1.setToolTipText("");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
        });
        pnl_chart.add(jTextField1, java.awt.BorderLayout.PAGE_END);

        pnl_table.setBackground(new java.awt.Color(255, 255, 255));
        pnl_table.setLayout(new javax.swing.BoxLayout(pnl_table, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        jScrollPane1.setOpaque(false);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Lex Fontier", "EA", "TY"},
                {"2", "Ryan Reynold", "US", "NY"},
                {"3", "Jackie Wuan", "CH", "HK"},
                {"4", "Monty Rattler", "UK", "LD"}
            },
            new String [] {
                "ID", "NAME", "COUNTRY", "STATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(62, 226, 141));
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        pnl_table.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_table, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_chart, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_table, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx;
    int xy;
    private void pnl_chartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_chartMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_pnl_chartMousePressed

    private void pnl_chartMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_chartMouseDragged
        // TODO add your handling code here:


    }//GEN-LAST:event_pnl_chartMouseDragged

    private void lbl_northMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_northMousePressed
        // TODO add your handling code here:
        setLblColor(lbl_north);
        resetLblColor(lbl_south);
        resetLblColor(lbl_east);
        resetLblColor(lbl_west);

    }//GEN-LAST:event_lbl_northMousePressed

    private void lbl_southMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_southMousePressed
        // TODO add your handling code here:
        setLblColor(lbl_south);
        resetLblColor(lbl_north);
        resetLblColor(lbl_east);
        resetLblColor(lbl_west);
    }//GEN-LAST:event_lbl_southMousePressed

    private void lbl_westMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_westMousePressed
        // TODO add your handling code here:
        setLblColor(lbl_west);
        resetLblColor(lbl_south);
        resetLblColor(lbl_east);
        resetLblColor(lbl_north);
    }//GEN-LAST:event_lbl_westMousePressed

    private void lbl_eastMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eastMousePressed
        // TODO add your handling code here:
        RenderChart();
        setLblColor(lbl_east);
        resetLblColor(lbl_south);
        resetLblColor(lbl_north);
        resetLblColor(lbl_west);
    }//GEN-LAST:event_lbl_eastMousePressed

    private void pnl_sidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_sidebarMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnl_sidebarMousePressed

    private void pnl_sidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_sidebarMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnl_sidebarMouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseEntered

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1FocusGained

    public void setLblColor(JLabel lbl) {
        lbl.setForeground(new Color(48, 201, 235));
    }

    public void resetLblColor(JLabel lbl) {
        lbl.setForeground(new Color(166, 166, 166));
    }

    //Let's add a chart to top Jpanel
    //We are going to use JfreeCharts
    //Source will be 
    //Ofcourse before doing anything else you need to download JfreeCharts Lib and import into your project
    public CategoryDataset createDataset() {
        final double[][] data = new double[][]{
            {1.0, 4.0, 3.0, 5.0, 5.0, 7.0, 7.0, 8.0},
            {5.0, 7.0, 6.0, 8.0, 4.0, 4.0, 2.0, 1.0},
            {4.0, 3.0, 2.0, 3.0, 6.0, 3.0, 4.0, 3.0}
        };

        final CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
                "", "", data
        );
        return dataset;
    }

//    private XYDataset createDataset2() {
//        XYSeriesCollection dataset = new XYSeriesCollection();
//        XYSeries series1 = new XYSeries("Object 1");
//        XYSeries series2 = new XYSeries("Object 2");
//        XYSeries series3 = new XYSeries("Object 3");
//
//        series1.add(1.0, 2.0);
//        series1.add(2.0, 3.0);
//        series1.add(3.0, 2.5);
//        series1.add(3.5, 2.8);
//        series1.add(4.2, 6.0);
//
//        series2.add(2.0, 1.0);
//        series2.add(2.5, 2.4);
//        series2.add(3.2, 1.2);
//        series2.add(3.9, 2.8);
//        series2.add(4.6, 3.0);
//
//        series3.add(1.2, 4.0);
//        series3.add(2.5, 4.4);
//        series3.add(3.8, 4.2);
//        series3.add(4.3, 3.8);
//        series3.add(4.5, 4.0);
//
//        dataset.addSeries(series1);
//        dataset.addSeries(series2);
//        dataset.addSeries(series3);
//
//        return dataset;
//    }

    void RenderChart() {
        CategoryDataset ds = createDataset();

        JFreeChart chart = ChartFactory.createStackedAreaChart("", "", "", ds);
//        chart.setBackgroundPaint();
//        chart.setBorderVisible(false);
//        chart.setBorderPaint(new Color(54, 63, 73));
//        chart.getCategoryPlot().setBackgroundPaint(new Color(54, 63, 73));
//        chart.getCategoryPlot().setDomainGridlinePaint(new Color(54, 63, 73));
//        chart.getCategoryPlot().setDomainGridlinesVisible(false);
//        chart.getCategoryPlot().setOutlinePaint(new Color(54, 63, 73));

        ChartPanel cp = new ChartPanel(chart);
        cp.setBackground(new Color(54, 63, 73));

        pnl_chart.add(cp, BorderLayout.CENTER);
        pnl_chart.validate();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home16().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_east;
    private javax.swing.JLabel lbl_north;
    private javax.swing.JLabel lbl_south;
    private javax.swing.JLabel lbl_west;
    private javax.swing.JPanel pnl_chart;
    private javax.swing.JPanel pnl_sidebar;
    private javax.swing.JPanel pnl_table;
    // End of variables declaration//GEN-END:variables
}
