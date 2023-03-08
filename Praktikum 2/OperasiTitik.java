/* 
* OperasiTitik.java 01/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Kelas yang berisi program operasi titik
*/

public class OperasiTitik {

    // Private method - Tugas
    private void refleksiSumbuX(Titik t1){
        t1.setAbsis(t1.getAbsis());
        t1.setOrdinat(-1*(t1.getOrdinat()));
    }

    private void refleksiSumbuY(Titik t1){
        t1.setAbsis(-1*(t1.getAbsis()));
        t1.setOrdinat(t1.getOrdinat());
    }

    // Public method - Latihan
    public Titik refleksiX(Titik t1){
        refleksiSumbuX(t1);
        return t1;
    }

    public Titik refleksiY(Titik t1){
        refleksiSumbuY(t1);
        return t1;
    }
}