/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claves;


public class Controlador {
    Modelo modelo;
    Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void hacerEncriptacion() {
    String texto = vista.getTxtCadena().getText(); // Obtener el texto del JTextField
    String textoEncriptado = modelo.encriptar(texto); // Encriptar el texto
    vista.getTxtResultado().setText(textoEncriptado);
}

    public void hacerDesencriptacion() {
    String textoEncriptado = vista.getTxtResultado().getText(); // Obtener texto encriptado
    String textoDesencriptado = modelo.desencriptar(textoEncriptado); // Desencriptar el texto
    vista.getTxtCadena().setText(textoDesencriptado); // Mostrar el resultado
}

}
