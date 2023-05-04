/* 
* Bus.java 03/05/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Program implementasi polimorfisme inclusion dengan sub class Bus
*/

public class Bus extends Vehicle{
	void calRent(int jarak, float harga){
		float fare = jarak * harga;
		fare = fare - 5.00f;
		System.out.println("harga sewa bis = "+fare);
	}
}