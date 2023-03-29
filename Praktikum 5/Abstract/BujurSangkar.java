/* 
* BujurSangkar.java 28/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Class implementasi method dari abstract class bangun datar
*/

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
}

// Jawaban pertanyaan modul
// Jika kelas BangunDatar tidak membuat implementasi metode abstrak yang ada 
// pada kelas BangunDatar maka akan terjadi error
// karena file BujurSangkar tidak dapat dicompile dan tidak dianggap sebagai 
// inherit abstract dari BangunDatar