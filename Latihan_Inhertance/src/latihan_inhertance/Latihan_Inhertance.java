/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_inhertance;

/**
 *
 * @author TOSHIBA
 */
public class Latihan_Inhertance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        PersegiPanjang a= new PersegiPanjang();
        a.setPanjang(4);
        a.setLebar(5);
        System.out.println(" ");
        System.out.println("CONTOH PROGRAM PEWARISAN");
        System.out.println(" ");
        System.out.println("Superclass PersegiPanjang");
        System.out.println("Panjang     :   "+a.getPanjang());
        System.out.println("Lebar       :   "+a.getLebar());
        System.out.println("Luas        :   "+a.luas());
        System.out.println("");
        
        Balok b= new Balok();
        b.setPanjang(4);
        b.setLebar(3);
        b.setTinggi(5);
        
        System.out.println("Subclass Balok");
        System.out.println("Panjang     : "+b.getPanjang());
        System.out.println("Lebar       : "+b.getLebar());
        System.out.println("Tinggi      : "+b.getTinggi());
        System.out.println("Volume      : "+b.Volume());
    
    }
    
}
