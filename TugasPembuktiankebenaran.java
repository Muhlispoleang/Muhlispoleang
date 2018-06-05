/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspembuktiankebenaran;

/**
 *
 * @author Acer
 */
public class TugasPembuktiankebenaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Membuktikan perbedaan antara == dan equals");
        System.out.println("st1 =saya suka makan bakso");
        System.out.println("st2 =saya suka makan bakso");
        System.out.println("st3 =saya ");
        System.out.println("st4 =suka ");
        System.out.println("st5 =makan bakso");
        System.out.println(" ");
        
        String st1 = "saya suka makan bakso";
        String st2 = "saya suka makan bakso";
        String st3 = "saya ";
        String st4 = "suka ";
        String st5 = "makan bakso";
        String st6 = st3+st4+st5; 
        
        System.out.println("1. Percobaan dengan Samadengan-samadengan (==) ");
        System.out.println("a>. st1 == st2");
        if (st1==st2){
            System.out.println(st1 + " = " + st2);
            System.out.println("Terbukti Benar");
        }
        else {
            System.out.println(st1 + " != " + st2);
            System.out.println("Terbukti Salah");
        }
        System.out.println(" ");
        System.out.println("b>. st1==st6");
        if (st1==st6){
            System.out.println(st1 + " = " + st6);
            System.out.println("Terbukti Benar");
        }
        else {
            System.out.println(st1 + " != " + st6);
            System.out.println("Terbukti Salah");
        }
        System.out.println(" ");
        System.out.println("c>. st2==st6");
        if (st2==st6){
            System.out.println(st2 + " = " + st6);
            System.out.println("Terbukti Benar");
        }
        else {
            System.out.println(st2 + " != " + st6);
            System.out.println("Terbukti Salah");
        }
        System.out.println("Penggunaan == pada st1, st2 dan st6 hanya pada st1==st2 yang terbukti BENAR");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("2. Penggunaan equals");
        System.out.println("a>. st1 equals st2");
        if (st1.equals(st2)){
            System.out.println(st1 + " = " + st2);
            System.out.println("Terbukti Benar");
        }
        else{
            System.out.println(st1 + " != " + st2);
            System.out.println("Terbukti Salah");
        }
        System.out.println(" ");
        System.out.println("b>. st1 equals st6");
        if (st1.equals(st6)){
            System.out.println(st1 + " = " + st6);
            System.out.println("Terbukti Benar");
        }
        else{
            System.out.println(st1 + " != " + st6);
            System.out.println("Terbukti Salah");
        }
        System.out.println(" ");
        System.out.println("c>. st2 equals st6");
        if (st2.equals(st6)){
            System.out.println(st2 + " = " + st6);
            System.out.println("Terbukti Benar");
        }
        else{
            System.out.println(st2 + " != " + st6);
            System.out.println("Terbukti Salah");
        }
        System.out.println("Penggunaan equals pada st1,st2 dan st6 terbukti BENAR ");
        System.out.println(" ");
        System.out.println("MAKA DAPAT DISIMPULKAN BAHWA PENGGUNAAAN EQUALS LEBIH AKURAT");
    }
}
        
        
              
      // TODO code application logic here
    
