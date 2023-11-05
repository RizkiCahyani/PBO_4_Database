/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/Db_Mahasiswa";
    static final String USER = "postgres";
    static final String PASS = "12345";
    static final String QUERY = "update tb_mahasiswa set nama_mahasiswa = 'Agustina' where nim = '22046'";

    public static void main(String[] args) {
        // Open a connection
        try { 
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);
            while (rs.next()) {
                //Display values
                System.out.print("nim: " + String.valueOf(rs.getObject(1)));
                System.out.print("nama: " + String.valueOf(rs.getObject(2)));
                System.out.print("prodi: " + String.valueOf(rs.getObject(3)));
                System.out.print("alamat: " + String.valueOf(rs.getObject(4)));
                System.out.println("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


