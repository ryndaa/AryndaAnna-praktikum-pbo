/* 
* MPoligon.java 18/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Main dari Poligon
*/

package org.main;

import org.bangundatar.Segitiga;
import org.bangunruang.LimasSegitiga;

public class MPoligon{
	public static void main(String[] args){
		Segitiga segitiga = new Segitiga(4,5);
		LimasSegitiga limassegitiga = new LimasSegitiga(segitiga);
		System.out.println("Luas Alas Limas Segitiga adalah : "+limassegitiga.hitungLuasAlas());
		System.out.println("Volume Limas Segitiga adalah : "+limassegitiga.hitungVolume());
	}
}