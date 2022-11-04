/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capaNegocio;

import com.mycompany.capaDatos.DBPerros;
import com.mycompany.capaRecursos.Perros;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Elio Raymundo
 */
public class negocioperros {
    public void Registrar(Perros perro, JTable Jtable1){
        try{
            Jtable1.setModel(DBPerros.Registrar(perro, Jtable1));
        } catch(Exception e){
            System.err.println("Error" + e);
        }
    }
    
    public List<Perros> Leer(JTable tabla){
        List<Perros> listaPerros=new ArrayList<>();

        try{
            listaPerros=DBPerros.LeerTodo(tabla);
        } catch(Exception e){
            System.err.println("Error"+e);
        }
        finally{
            return listaPerros;
        }
    }
}
