/* 
* Lingkaran.java 21/05/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : implementasi Lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}