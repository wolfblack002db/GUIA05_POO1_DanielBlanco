/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class EquipoCtrl {
    private final Connection conn;
    
    public EquipoCtrl()
    {
        this.conn=new Conexion().getConn();
    }
    
    public boolean guar(String nombEqui,String descEqui){
        boolean resp=false;
        try 
        {
            PreparedStatement cmd = this.conn.prepareStatement("INSERT INTO equipos VALUES(NULL, ?, ?)");
            cmd.setString(1, nombEqui);
            cmd.setString(2, descEqui);
            cmd.executeUpdate();
            resp=true;
        } catch (Exception e) {
            System.out.println("Error al guardar equipos "+ e.getMessage());
        }
        finally{
            try 
            {
                if (this.conn != null) 
                {
                    if (!this.conn.isClosed()) 
                    {
                        this.conn.close();
                    }
                }
            }catch(SQLException e) 
            {
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
        return resp;
    }
}
