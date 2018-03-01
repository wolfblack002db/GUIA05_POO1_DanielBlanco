/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;
import com.sv.udb.modelo.ModeloEquipo;
import com.sv.udb.modelo.ModeloJugadores;

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
public class JugadoresCtrl {
    private final Connection conn;

    public JugadoresCtrl() {
        this.conn = new Conexion().getConn();
    }
    
    public boolean guar(ModeloEquipo codiEqui, String nombJuga, int edadJuga, int altuJuga, int pesoJuga)
    {
        boolean resp = false;
        try
        {
            PreparedStatement cmd = this.conn.prepareStatement("INSERT INTO jugadores VALUES(NULL,?,?,?,?,?)");
            cmd.setInt(1, codiEqui.getCodiEqui());
            cmd.setString(2, nombJuga);
            cmd.setInt(3, edadJuga);
            cmd.setInt(4, altuJuga);
            cmd.setInt(5, pesoJuga);
            cmd.executeUpdate();
            resp=true;
        }
        catch (SQLException ex)
        {
            System.err.println("Error al guardar Jugadores: " + ex.getMessage());
        }
        finally
        {
            try
            {
                if(this.conn != null)
                {
                    if(!this.conn.isClosed())
                    {
                        this.conn.close();
                    }
                }
            }
            catch(SQLException ex)
            {
                System.err.println("Error al cerrar la conexión");
            }
        }
        return resp;
    }
    
    public List<ModeloJugadores> consTodo()
    {
       List<ModeloJugadores> resp = new ArrayList<>();
        try
        {
            PreparedStatement cmd = this.conn.prepareStatement("SELECT j.codi_juga, e.*, "
                    + "j.nomb_juga, j.edad_juga, j.altu_juga, " +
"                j.peso_juga FROM jugadores j INNER JOIN equipos e ON j.codi_equi = e.codi_equi");
            //Vea la siguiente ayuda
            /*Una opción de query podría ser: 
                SELECT j.codi_juga, e.*, j.nomb_juga, j.edad_juga, j.altu_juga, 
                j.peso_juga FROM jugadores j INNER JOIN equipos e ON j.codi_equi = e.codi_equi;
            */
            ResultSet rs = cmd.executeQuery();
            while(rs.next())
            {
                resp.add(new ModeloJugadores(rs.getInt(1),new ModeloEquipo(rs.getInt(2), 
                        rs.getString(3), rs.getString(4)), rs.getString(5),rs.getInt(6),
                        rs.getInt(7),rs.getInt(8))); // <----- Hay que llenar con los objetos
            }
        }
        catch(SQLException ex)
        {
            System.err.println("Error al consultar Jugadores: " + ex.getMessage());
        }
        finally
        {
            try
            {
                if(this.conn != null)
                {
                    if(!this.conn.isClosed())
                    {
                        this.conn.close();
                    }
                }
            }
            catch(SQLException ex)
            {
                System.err.println("Error al cerrar la conexión");
            }
        }
        return resp;
    }
    
//    public boolean modificar(int id, String nomb, int edad, int altura, int peso){
//        boolean resp = false;
//        
//        try {
//            PreparedStatement cmd = this.conn.prepareStatement("UPDATE jugadores SET nomb_equi = ?, desc_equi=? WHERE codi_equi=?");
//            cmd.setString(1, nomb);
//            cmd.setString(2, desc);
//            cmd.setInt(3, id);
//            cmd.executeUpdate();
//            resp = true;
//        } catch (Exception ex) {
//            System.err.println("Error al modificar equipos" + ex.getMessage());
//        } finally {
//            try {
//                if (this.conn != null) {
//                    if (!this.conn.isClosed()) {
//                        this.conn.close();
//                    }
//                }
//            } catch (SQLException e) {
//                System.err.println("Error al cerrar la conexion en equipos: " + e.getMessage());
//            }
//        }
//        
//        return resp;
//    }
//    
//    public boolean eliminar(int id){
//        boolean resp = false;
//        
//        try {
//            PreparedStatement cmd = this.conn.prepareStatement("DELETE FROM equipos WHERE codi_equi = ?");
//            cmd.setInt(1, id);
//            cmd.executeUpdate();
//            resp = true;
//        } catch (Exception ex) {
//            System.err.println("Error al eliminar equipos" + ex.getMessage());
//        } finally {
//            try {
//                if (this.conn != null) {
//                    if (!this.conn.isClosed()) {
//                        this.conn.close();
//                    }
//                }
//            } catch (SQLException e) {
//                System.err.println("Error al cerrar la conexion en equipos: " + e.getMessage());
//            }
//        }
//        
//        return resp;
//    }
}
