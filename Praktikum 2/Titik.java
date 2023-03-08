/* 
* Titik.java 22/02/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas Titik
*/

class Titik { 
    // Atribut
    private double absis;
    private double ordinat;
    static int counterTitik;

    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Overloading
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    Titik(int x, int y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Method
    public void setAbsis(double x) {
        absis = x;
    }

    public void setOrdinat(double y) {
        ordinat = y;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public int getCounterTitik() {
        return counterTitik;
    }

}