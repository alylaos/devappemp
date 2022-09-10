package com.isil.jdbc;

import java.sql.*;

public class MainApp {
    public static void main (String []args) throws Exception{
        String jdbcUrl = "jdbc:mysql://localhost:3306/DESA1";
        // cargar el driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //crear la conexion
        Connection con = DriverManager.getConnection(jdbcUrl,"root","root");

        //crear el statement
        Statement st=con.createStatement();

        //ejecutar la sentencia sql
        ResultSet rs=st.executeQuery("select * from Users");

        //procesar el resultado
        while (rs.next()){
            System.out.print(rs.getString("idUser")+" "
                    +rs.getString("name")+" "
                    +rs.getString("phone")+" "
                    +rs.getString("city")+"\n");
        }
    }
}
