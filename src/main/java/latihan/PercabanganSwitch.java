/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author Acer
 */
public class PercabanganSwitch {
      public static void main(String [] args){
        //nilai x diganti sesuai case
        switch(1){
            case 1 -> System.out.println("Senin");
            case 2 -> System.out.println("Selasa");
            case 3 -> System.out.println("Rabu");
            case 4 -> System.out.println("Kamis");
            case 5 -> System.out.println("Jum’at");
            case 6 -> System.out.println("Sabtu");
            case 7 -> System.out.println("Minggu");
            default -> System.out.println("Salah input hari");
        }
    }
}
