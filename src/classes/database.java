package classes;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class database {

    private final static String url = "jdbc:mysql://localhost:3306/";
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String dbName = "Library";
    private final static String userName = "root";
    private final static String password = "root";
    static Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet result = null;

    public static Connection connect() throws ClassNotFoundException {
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);

        } catch (Exception ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return null;
        }
        return conn;
    }

    public int add(String tableName, String[] values, byte[] image) {
        String insert = "insert into " + tableName + " values (";
        for (int i = 0; i < values.length; i++) {
            insert += "?,";
        }
        insert = insert.substring(0, insert.length() - 1) + ")";
        if (image != null) {
            try {
                pstm = conn.prepareStatement(insert);
                for (int i = 1; i <= values.length; i++) {
                    pstm.setString(i, values[i - 1]);
                }
                pstm.setBytes(values.length, image);
                pstm.executeUpdate();
                return -1;
            } catch (SQLException e) {
                return e.getErrorCode();
            }
        } else {

            try {
                pstm = conn.prepareStatement(insert);
                for (int i = 1; i <= values.length; i++) {
                    pstm.setString(i, values[i - 1]);
                }
                pstm.setBytes(values.length, image);
                pstm.executeUpdate();
                return -1;
            } catch (SQLException e) {
                return e.getErrorCode();
            }

        }
    }

    public int getMaxPrimaryKey() {
        String sql = "select max(id) from member";
        int max = 0;
        try {
            pstm = connect().prepareStatement(sql);
            result = pstm.executeQuery();
            if (result.next()) {
                max = result.getInt(1);
                max += 1;
            }
            return max;
        } catch (Exception e) {

            return 0;
        }
    }

    public int getMaxPrimaryKey(String x, String y) {
        String sql = "select max(" + x + ") from " + y;
        int max = 0;
        try {
            pstm = connect().prepareStatement(sql);
            result = pstm.executeQuery();
            if (result.next()) {
                max = result.getInt(1);
                max += 1;
            }
            return max;
        } catch (Exception e) {

            return 0;
        }
    }

    public ResultSet select(String tableName, String[] choosenFields, String[] whereFields, String[] values, String operator, String sep) {
        String sql = "select ";
        ResultSet resultSet = null;
        for (int i = 0; i < choosenFields.length; i++) {
            sql += choosenFields[i] + ",";
        }
        sql = sql.substring(0, sql.length() - 1);
        sql += " from " + tableName + " where";
        String select = makeWhere(sql, whereFields, operator, sep);
        try {
            pstm = connect().prepareStatement(select);
            for (int i = 1; i <= values.length; i++) {
                pstm.setString(i, values[i - 1]);
            }
            resultSet = pstm.executeQuery();
        } catch (Exception e) {
        }
        return resultSet;
    }

    public String makeWhere(String sql, String[] fields, String operator, String sep) {
        String sql1 = sql;
        for (int i = 0; i < fields.length; i++) {
            sql1 += " " + fields[i] + " " + operator + "? " + sep;
        }
        sql1 = sql1.substring(0, sql1.length() - sep.length());
        return sql1;
    }

    public int delete(String tableName, String[] whereFields, String[] whereValues, String seperator, String operator) throws SQLException, ClassNotFoundException {
        String delete = "delete from " + tableName + " where ";
        delete = makeWhere(delete, whereFields, operator, seperator);
        try {
            pstm = connect().prepareStatement(delete);
            for (int i = 1; i <= whereValues.length; i++) {
                pstm.setString(i, whereValues[i - 1]);
            }
            pstm.executeUpdate();
            return -1;

        } catch (SQLException ex) {
            return ex.getErrorCode();
        }
    }

    public int update(String tableName, String[] updateFields, String[] updateValues, String[] whereFields, String[] whereValues, byte[] image, String operator, String seperator) {
        String update = "update " + tableName + " set ";
        update = makeWhere(update, updateFields, operator, ",");
        update += makeWhere(" where ", whereFields, operator, seperator);
        try {
            pstm = connect().prepareStatement(update);
            int i;
            if (image != null) {

                for (i = 1; i < updateValues.length; i++) {
                    pstm.setString(i, updateValues[i - 1]);
                }
                pstm.setBytes(updateValues.length, image);
            } else {
                for (i = 1; i <= updateValues.length; i++) {
                    pstm.setString(i, updateValues[i - 1]);
                }
            }
            i = updateValues.length + 1;
            for (int y = i; y < whereValues.length + i; y++) {
                pstm.setString(y, whereValues[y - i]);
            }
            pstm.executeUpdate();
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
