/*
* MPoligon.java 08/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Driver class untuk poligon, persegi panjang, dan segitiga
*/

package org.main; 
 
import org.bangundatar.*; 
 
public class MPoligon{ 
    public static void main(String[] args){ 
        PersegiPanjang persegi = new PersegiPanjang(10,10,4); 
		Segitiga segitiga = new Segitiga(7,24,25,3); 
        persegi.printInfo(); 
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
        segitiga.printInfo(); 
        System.out.println("Panjang Sisi Miring adalah : "+segitiga.Pythagoras()); 
    } 
}