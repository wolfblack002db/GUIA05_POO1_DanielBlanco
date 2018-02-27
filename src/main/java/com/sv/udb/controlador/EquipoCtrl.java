/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;
import com.sv.udb.modelo.ModeloEquipo;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public List<ModeloEquipo> obtenerTodo(){
        List<ModeloEquipo> resp = new ArrayList<>();
        try {
            PreparedStatement cmd = this.conn.prepareStatement("SELECT * FROM equipos");
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                resp.add(new ModeloEquipo(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            System.err.println("Error al consultar: " + ex.getMessage());
        } finally {
            try {
                if (this.conn != null) {
                    if (!this.conn.isClosed()) {
                        this.conn.close();
                    }
                }
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión");
            }
        }
        return resp;
    }
    
    
    public boolean modificar(int id, String nomb, String desc){
        boolean resp = false;
        
        try {
            PreparedStatement cmd = this.conn.prepareStatement("UPDATE equipos SET nomb_equi = ?, desc_equi=? WHERE codi_equi=?");
            cmd.setString(1, nomb);
            cmd.setString(2, desc);
            cmd.setInt(3, id);
            cmd.executeUpdate();
            resp = true;
        } catch (Exception ex) {
            System.err.println("Error al modificar equipos" + ex.getMessage());
        } finally {
            try {
                if (this.conn != null) {
                    if (!this.conn.isClosed()) {
                        this.conn.close();
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion en equipos: " + e.getMessage());
            }
        }
        
        return resp;
    }
    
    public boolean eliminar(int id){
        boolean resp = false;
        
        try {
            PreparedStatement cmd = this.conn.prepareStatement("DELETE FROM equipos WHERE codi_equi = ?");
            cmd.setInt(1, id);
            cmd.executeUpdate();
            resp = true;
        } catch (Exception ex) {
            System.err.println("Error al eliminar equipos" + ex.getMessage());
        } finally {
            try {
                if (this.conn != null) {
                    if (!this.conn.isClosed()) {
                        this.conn.close();
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion en equipos: " + e.getMessage());
            }
        }
        
        return resp;
    }
}
