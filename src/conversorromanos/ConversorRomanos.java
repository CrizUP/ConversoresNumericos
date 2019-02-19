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
public class ConversorRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(UtileriaRomanos.covertirRomanos(1));
        System.out.println(UtileriaRomanos.covertirRomanos(10));
        System.out.println(UtileriaRomanos.covertirRomanos(100));
        System.out.println(UtileriaRomanos.covertirRomanos(1000));
        System.out.println(UtileriaRomanos.covertirRomanos(3999));
        System.out.println(UtileriaRomanos.covertirRomanos(11));
        System.out.println(UtileriaRomanos.covertirRomanos(111));
        System.out.println(UtileriaRomanos.covertirRomanos(450));
        System.out.println(UtileriaRomanos.covertirRomanos(560));
        System.out.println(UtileriaRomanos.covertirRomanos(909));
    }
    
}
