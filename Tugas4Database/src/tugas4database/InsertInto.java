/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInto {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/Db_Mahasiswa";
    static final String USER = "postgres";
    static final String PASS = "12345";
    static final String QUERY = "insert into tb_mahasiswa (nim, nama_mahasiswa, prodi, alamat)\n" +
"values\n" +
"('22040','Safriya Puspita','Ilmu Kelautan', 'Surabaya'),\n" +
"('22041','Wilis Arum','Biologi','Sidoarjo'),\n" +
"('22042','Rizki Cahyani','Matematika','Temanggung'),\n" +
"('22043','Anisa Husna','Sistem Informasi','TulungAgung'),\n" +
"('22044','Fauziah Afrisa','Biologi','Sidoarjo'),\n" +
"('22045','Ageng Putra','Ilmu Sipil','Blitar'),\n" +
"('22046','Fitriya','sistem informasi','Surabaya')\n" +
";";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement()) {

            // Eksekusi pernyataan SQL
            int rowsAffected = stmt.executeUpdate(QUERY);
            if (rowsAffected > 0) {
                System.out.println("Data berhasil ditambahkan!");
            } else {
                System.out.println("Gagal menambahkan data.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
