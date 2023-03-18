/* 
* MKubus.java 18/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Main dari Kubus
*/

package org.main; 
 
import org.bangunruang.*; 
import org.bangundatar.*; 
 
public class MKubus{ 
	public static void main(String[] args){ 
		BujurSangkar bujurSangkar = new BujurSangkar(4); 
		Kubus kubus = new Kubus(bujurSangkar); 
		System.out.println("Luas Alas Kubus dengan panjang sisi 4 satuan : "+kubus.hitungLuasAlas()); 
		System.out.println("Volume Kubus dengan panjang sisi 4 satuan : "+kubus.hitungVolume()); 
	} 
}