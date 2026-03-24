/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_loginusers;
import Vista.Login;
import Modelo.Conexion;
import java.sql.Connection;

/**
 *
 * @author Rosales
 */
public class Sistema_LoginUsers {

    public static void main(String[] args) {
        
        /*----------------ABRIR LOGIN-----------_LoginUsersVistaLoginMdi*/

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login log = new Login();
                log.setVisible(true);
                log.setLocationRelativeTo(null);
            }
        });
    }
}
