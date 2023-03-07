/* 
* MOperasiTitik.java 01/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Kelas yang berisi program operasi titik
*/

/* Tugas */
class MOperasiTitik{
	public static void main(String[] args){
		Titik t1 = new Titik(5.0,3.0);
		OperasiTitik op = new OperasiTitik();
		
		System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		op.refleksiX(t1);
		System.out.println("\nTitik setelah refleksi sumbu X");
		System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		op.refleksiY(t1);
		System.out.println("\nTitik setelah refleksi sumbu Y");
		System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
	}
}