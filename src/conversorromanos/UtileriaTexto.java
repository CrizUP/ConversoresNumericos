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
public class UtileriaTexto {

    public final static int MILLONES = 10000;
    public final static int MILES = 1000;
    public final static int CIENTOS = 100;
    public final static int DECENAS = 10;
    public final static int NUM_EXCEPTION_TOP = 19;
    public final static String MENSAJE = "Número no válido. Rangos de 0 - 999 999 999 999";
    
     public static String convertirTexto(long numero) {
        String numeroTexto = "";
        
        if (numero >= 0 && numero <= 9999999999L) {
            boolean esMillon = false;
            int millones= calcularMillones(numero);
            int miles =calcularMiles(numero-millones*MILLONES);
            int centenas = calcularCientos(numero-(millones*MILLONES + miles*MILES));
            int decenas = calcularDecenas(numero - (millones*MILLONES + miles*MILES+centenas*centenas));
            int digitos = 0;
            esMillon = (millones > 0);
            
            
            /*long miles = numero / MILES;
            long centenas = (numero-miles*MILES)/CIENTOS;
            long decenas = (numero-(miles*MILES + centenas*CIENTOS))/DECENAS;
            long digitos = numero-(miles*MILES + centenas*CIENTOS + decenas * DECENAS);*/

            //numeroRomano = convertirMiles(miles)+ convertirCientos(centenas)+ convertirDecenas(decenas) + convertirDigitos(digitos) ;
                    
        } else {
            numeroTexto = MENSAJE;
        }
        return numeroTexto;
    }
     
    private static int calcularMillones(long numero) { 
        return (int) (numero/1000000);
    }
    
    private static int calcularMiles(long numero) { 
        return (int) (numero/1000);
    }
    private static int calcularCientos(long numero) { 
        return (int) (numero/100);
    }
    private static int calcularDecenas(long numero) { 
        return (int) (numero/10);
    }
    private static int calcularDigitos(long numero) { 
        return (int) (numero/1000000L);
    }


     
    private static String convertirMiles(int numero, boolean esMillon) {
        String resultado = "";
        String[] romanos = {"M", "MM", "MMM", "IV", "V"};
        if(numero > 0)
            resultado = romanos[numero - 1];
        return resultado;
    }

    private static String convertirCientos(int numero, boolean esMillon) {
        String resultado = "";
        String[] romanos = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        if(numero > 0)
            resultado = romanos[numero - 1];
        return resultado;
    }

    private static String convertirDecenas(int numero, boolean esMillon) {
        String resultado = "";
        String[] romanos = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        if(numero > 0)
            resultado = romanos[numero - 1];
        return resultado;
    }

    private static String convertirDigitos(int numero, boolean esMillon) {
        String resultado = "";
        String[] romanos = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if(numero > 0)
            resultado = romanos[numero - 1];
        return resultado;
    }

    
}
