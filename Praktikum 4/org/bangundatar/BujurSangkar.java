/* 
* BujurSangkar.java 18/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Representasi dasar dari BujurSangkar
*/

package org.bangundatar; 
 
import org.poligon.Poligon; 
 
public class BujurSangkar extends Poligon{ 
	private double panjangSisi; 
  
	public BujurSangkar(double panjangSisi){ 
		this.jumlahSisi = 4; 
		this.panjangSisi = panjangSisi; 
	} 
  
	public double hitungLuas(){ 
		return panjangSisi * panjangSisi; 
	} 
  
	public double getPanjangSisi(){ 
		return this.panjangSisi; 
	} 
}