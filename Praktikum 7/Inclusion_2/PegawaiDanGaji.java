/* 
* PegawaiDanGaji.java 03/05/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Program polimorfisme inclusion dengan main program PegawaiDanGaji
*/

public class PegawaiDanGaji{
	public static void main (String args[]){
		Pegawai pegawai = new Programmer ("Mira");
		Pegawai pegawai2 = new Manajer("Joko");
		Pegawai pegawai3 = new Manajer("Argo");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}