/* 
* LimasSegitiga.java 18/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Representasi dasar dari LimasSegitiga
*/

package org.bangunruang;

import org.bangundatar.Segitiga;

public class LimasSegitiga{
	private Segitiga permukaan;
	
	public LimasSegitiga(Segitiga permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		double tinggi = permukaan.getTinggi();
		return 0.5 * panjangSisi * tinggi * 4;
	}
	
	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi();
		double tinggi = permukaan.getTinggi();
		return 0.5 * panjangSisi * tinggi;
	}
}