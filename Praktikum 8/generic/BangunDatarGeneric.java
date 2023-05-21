/* 
* BangunDatarGeneric.java 21/05/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : kelas konstruksi generic untuk BangunDatar
*/

//public class BangunDatarGeneric<T extends BangunDatar>{
	//private T bangunDatar;
	
	//public void set(T tipeBangunDatar){
	//	bangunDatar = tipeBangunDatar;
	//}
	
	//public T get(){
	//	return bangunDatar;
	//}
	
	//public double hitungKeliling();
	//	return bangunDatar.hitungKeliling();
	//}
//}

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
	//dengan mengganti T menjadi T1 maka akan mengubah parameter generik
	//yang mana dapat memberi penamaan pada parameter generik
	//secara lebih spesifik dan deskriptif sehingga dapat membedakannya 
	//ketika menggunakan lebih dari 1 parameter generik di kelas tersebut
}

