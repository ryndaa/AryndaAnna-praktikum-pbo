/* 
* Vehicle.java 03/05/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Program implementasi polimorfisme inclusion dengan super class Vehicle
*/

public class Vehicle{
	void calRent(int distance, float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}