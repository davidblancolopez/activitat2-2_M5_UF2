
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
        private static String letra;
        private static String nif;
        private static String missatge;
        private static char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static String esValid(String dni) {

        int num = 0;
        String numero;
        nif = dni;
        
        letra = nif.substring(nif.length() - 1);
        numero = nif.substring(0, nif.length() - 1);

        // primer mirem que la cadena tingui 8 o 9 caràcters:

        if(comprovarFormat(nif)){
            try {
                num = Integer.parseInt(numero);

                comprovarNif(num);

            } catch (NumberFormatException e) {
                missatge = "Format Incorrecte";
            }
        }else{
            missatge = "Format Incorrecte";
        }
        
        return missatge;
    }
    
    
    
    
    /**
     * Este metodo comprueba el formato del nif introducido.
     * @param nif
     * @return 
     */
    public static boolean comprovarFormat(String nif){
        boolean comprovacio;
        if (nif.length() < 8 || nif.length() > 9) {
            comprovacio = false;
        }else{
            comprovacio = true;
        }
        
        return comprovacio;
    }
    
    
    /**
     * Este metodo comprueba si la letra del nif es correcta con una lista de caracteres.
     * @param num
     * @return 
     */
    public static String comprovarNif(int num){
        String missatge = null;
        if (String.valueOf(llista[num % 23]).equals(letra)) {
                    missatge =  "Nif Vàlid";
                } else {
                    missatge = "Nif Invàlid";
                }
        
        return missatge;
    }
    
}
