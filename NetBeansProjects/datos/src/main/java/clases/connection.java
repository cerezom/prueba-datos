/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

/**
 *
 * @author cerezo
 */
class connection {
    private static connection conn;
    private static final String driver ="com.mysql.jdbc.Driver";
            private static final String user = "root";
            private static final String password = "";
            private static final String url = "jdbc:mysql://localhost:3306/datos";
    private static final Logger LOG = Logger.getLogger(connection.class.getName());

    public connection() {
        conn = null;
        try {
            class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            if(conn != null){
                System.out.println("Conexion establecida");
            }
        }catch (ClassNotFoundException SQLException e){ 
            System.out.println("error al conectar + e");
        }
    }

    public static void setConn(connection conn) {
        connection.conn = conn;
    }
        //con este metodo nos retorna la conexion
        public Connection getconnection(){
            return conn;
        }
            
            
}
//Con esto nos desconectamos de la base de datos 
public void desconectar(){
conn = null;
if(conn == null){
Syste,out,println("Conexion terminada..");
}
}