/* 
* MPoligon.java 18/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Representasi dasar dari objek Poligon (segi banyak)
*/

package org.poligon; 
 
public class Poligon{ 
	protected int jumlahSisi; 
	public Poligon(){ 
		this.jumlahSisi = 0; 
	} 
	
	public int getJumlahSisi(){ 
		return this.jumlahSisi; 
	} 
	
	public void setJumlahSisi(int sisi){ 
		this.jumlahSisi = sisi; 
	} 
}