/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author khalid
 */
public class SharedClass {

    database db = new database();
    int memberId = 0;
    int bookId = 0;
    int operationsId = 0;
    ResultSet result;

    public void getStatistics() {
        result = db.select("member", new String[]{" count(id) id"}, new String[]{"id"}, new String[]{"99999"}, "!=", "and");
        try {
            if (result.next()) {
                memberId = result.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SharedClass.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        //book
        result = db.select("book", new String[]{"count(id)"}, new String[]{"id"}, new String[]{"99999"}, "!=", "and");
        try {
            if (result.next()) {
                bookId = result.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SharedClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        //operations
        result = db.select("operations", new String[]{"count(id)"}, new String[]{"type"}, new String[]{"borrowed"}, "=", "and");
        try {
            if (result.next()) {
                operationsId = result.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SharedClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.setValue(memberId, "Percent", "Members");
        dataSet.setValue(bookId, "Percent", "Books");
        dataSet.setValue(operationsId, "Percent", "Borrowe books");
        JFreeChart chart = ChartFactory.createBarChart3D("Statistics", "Fields", "Percent", dataSet, PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.yellow);
        chart.getTitle().setPaint(Color.red);
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.blue);
        ChartFrame frame = new ChartFrame("Statistics", chart);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 550);
        frame.setVisible(true);
    }

    public static void print(String message, JTable table) {
        MessageFormat header = new MessageFormat(message);
        MessageFormat footer = new MessageFormat("(0,number,nteger)");
        try {
            boolean result = table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
            if (result) {
                JOptionPane.showMessageDialog(null, "تمت عمليه الطباعه بنجاح");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(SharedClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
