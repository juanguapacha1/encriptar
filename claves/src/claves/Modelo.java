
package claves;

import java.util.Base64;

public class Modelo {

     public String encriptar(String texto) {
        return Base64.getEncoder().encodeToString(texto.getBytes());
    }
    
    public String desencriptar(String textoEncriptado) {
        return new String(Base64.getDecoder().decode(textoEncriptado));
    }
}

