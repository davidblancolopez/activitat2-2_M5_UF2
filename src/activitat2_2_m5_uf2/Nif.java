
package activitat2_2_m5_uf2;




/**
 * El metodo Nif se encarga de revisar el NIF que se le pasa por parametro y 
 * comprueba que este és correcto (primero comprueba la longitud de este y despues 
 * comprueba mediante un calculo que conosiste en hacer el modulo del numero del NIF
 * con 23 y el numero que salga se compara con una lista de caracteres, 
 * si encaja la letra introducida con el caracter posicion es correcto, si no, es incorrecto).
 * @author ALUMNEDAM
 */
public class Nif {
        private static String nif;
        private static String missatge;

    public static String esValid(String dni) {
         
        char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int num = 0;
        String letra;
        String numero;
        char[] charnif;
        nif = dni;
        
        letra = nif.substring(nif.length() - 1);
        numero = nif.substring(0, nif.length() - 1);

        // primer mirem que la cadena tingui 8 o 9 caràcters:

        if (nif.length() < 8 || nif.length() > 9) {
            missatge = "Format Incorrecte";
        } // Després mirem que el número sigui convertible a enter.
        else {
            try {
                num = Integer.parseInt(numero);

                if (String.valueOf(llista[num % 23]).equals(letra)) {
                    missatge =  "Nif Vàlid";
                } else {
                    missatge = "Nif Invàlid";
                }

            } catch (NumberFormatException e) {
                missatge = "Format Incorrecte";
            }

        }
        return missatge;
    }
    
}
