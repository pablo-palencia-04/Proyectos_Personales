/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Rosales
 */
public class UsuarioConectado {
    private static int idUsuario;
    private static String userName;

    public static int getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(int idUsuario) {
        UsuarioConectado.idUsuario = idUsuario;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UsuarioConectado.userName = userName;
    }
    
}
