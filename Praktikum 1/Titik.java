/* 
* MTitik.java 22/02/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas Titik
*/

class Titik {
 double absis;
 double ordinat;
 static int counterTitik;
 
 Titik() {
  absis = 0;
  ordinat = 0;
  counterTitik++;
 }
 
 Titik(double x, double y){
  absis = x;
  ordinat = y;
  counterTitik++;
 }
 
 void setAbsis(double a) {
  absis = a;
 }
 
 double getAbsis() {
  return absis;
 }
 
 void setOrdinat(double b) {
  ordinat = b;
 }
 
 double getOrdinat() {
  return ordinat;
 }
 
 double getCounterTitik() {
  return counterTitik;
 }
 
 void printTitik() {
  System.out.println("("+absis+","+ordinat+")");
 }
}