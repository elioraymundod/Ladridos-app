/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capaDatos;

import com.mycompany.capaRecursos.Perros;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elio Raymundo
 */
public class DBPerros {
   
    public static DefaultTableModel Registrar(Perros perro, JTable Jtable1){
        DefaultTableModel modeloDatosTabla = (DefaultTableModel) Jtable1.getModel();
        
        Object[] datosRegistro = {
            perro.getIdLadrido(),
            perro.getColorPerro(),
            perro.getNombrePerro(),
            perro.getRazaPerro()
        };
        
        modeloDatosTabla.addRow(datosRegistro);
        return modeloDatosTabla;
    }
    
    public static List<Perros> LeerTodo(JTable lsPerros){
        List<Perros> listaPerro = new ArrayList<>();
        for (int i=0; i<lsPerros.getRowCount();i++){
            Perros perro = new Perros();
            perro.setIdLadrido(lsPerros.getValueAt(i, 0).toString());
            perro.setNombrePerro(lsPerros.getValueAt(i, 1).toString());
            perro.setColorPerro(lsPerros.getValueAt(i, 2).toString());
            perro.setRazaPerro(lsPerros.getValueAt(i, 3).toString());
            
            listaPerro.add(perro);
        }
        return listaPerro;
    }
}
