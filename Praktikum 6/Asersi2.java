/* 
* Asersi2.java 29/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*/

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

// Pertanyaan modul: Ada yang kurang tepat pada program Asersi2 di atas?
// Ada, yang kurang tepat adalah jariJari > 0, seharusnya sintaks yang benar adalah jariJari != 0 bukan > 0 karena jika yang diinginkan
// angka yang bukan nol maka angka negatif juga bisa masuk sehingga jika > 0 digunakan maka untuk
// jari-jari yang bernilai negatif akan tidak dapat dijalankan. Maka, tanda yang paling tepat adalah jariJari != 0