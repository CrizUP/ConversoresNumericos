/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorromanos;

/**
 *
 * @author CrizUP
 */
public class UtileriaRomanos {
    
    public final static int MILES = 1000;
    public final static int CIENTOS = 100;
    public final static int DECENAS = 10;
    public final static String MENSAJE = "Número no válido. Rangos de 1 - 3999";

    public static String covertirRomanos(int numero) {
        String numeroRomano = "";
        if (numero > 0 && numero <= 3999) {//Extender limites para mayores números y tambien cambiar los limites de las pruebas  
            int miles = numero / MILES;
            int centenas = (numero-miles*MILES)/CIENTOS;
            int decenas = (numero-(miles*MILES + centenas*CIENTOS))/DECENAS;
            int digitos = numero-(miles*MILES + centenas*CIENTOS + decenas * DECENAS);

            numeroRomano = convertirMiles(miles)+ convertirCientos(centenas)+ convertirDecenas(decenas) + convertirDigitos(digitos) ;
                    
        } else {
            numeroRomano = MENSAJE;
        }
        return numeroRomano;
    }
    
    private static String convertirMiles(int numero) {
        String resultado = "";
        String[] romanos = {"M", "MM", "MMM", "IV", "V"};
        if(numero > 0)
            resultado = romanos[numero - 1];
        return resultado;
    }

    private static String convertirCientos(int numero) {
        String resultado = "";
        String[] romanos = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        if(numero > 0)
            resultado = romanos[numero - 1];
        return resultado;
    }

    private static String convertirDecenas(int numero) {
        String resultado = "";
        String[] romanos = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        if(numero > 0)
            resultado = romanos[numero - 1];
        return resultado;
    }

    private static String convertirDigitos(int numero) {
        String resultado = "";
        String[] romanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if(numero > 0)
            resultado = romanos[numero - 1];
        return resultado;
    }

}
