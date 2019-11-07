/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan55.handphone;

/**
 *
 * @author
 * NAMA : Agus Awaludin
 * NIM : 10118067
 * KELAS : PBO2
 * Latihan ini berisi tentang cara menampilkan data handphone dengan metode
 * polymorpism
 */
public class PBO210118067Latihan55Handphone {
    
    public static String keyStore;
    public static String pinBB;
    public static String wpKeyStore;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android andro = new Android("Samsung", "Android", "Grand", 3000000);
        andro.setKeyStore("234ib4d3840fo");
        andro.displayProduct();
        System.out.println("Android Key Store : " + andro.getKeyStore()+"\n");
        
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB()+"\n");
        
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        wp.setWpKeyStore("UUUQIJIORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store : " + wp.getWpKeyStore());
        
    }
    
}
