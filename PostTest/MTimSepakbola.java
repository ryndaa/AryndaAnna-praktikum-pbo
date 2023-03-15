/* 
* MTimSepakbola.java 15/03/2023
* Penulis : Arynda Anna Salsabiela
* NIM : 24060121120023
* Deskripsi : Driver class TimSepakbola
*/

	// TODO: Make an instance called 'liverpool' -> use constructor which you have made before
		
    // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
    

    // TODO: call startTandingBola()
		

		// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
  		liverpool.goal();

			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + liverpool.nama + " " + [SKOR LIVERPOOL] + " - " + [SKOR MANCHESTERUNITED] + " " + manchesterUnited.nama);
    }

		// TODO: call endTandingBola()

class MTimSepakbola {
  public static void main(String[] args) {
    // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
    TimSepakBola liverpool = new TimSepakBola("Liverpool FC", "Merseyside", "Anfield");

    // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
    TimSepakbola manchesterUnited = new TimSepakbola("Manchester United FC", "Greater Manchester", "Old Trafford");

    // TODO: call startTandingBola()
 liverpool.startTandingBola();
    manchesterUnited.startTandingBola();
  }
} 

  // Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
    liverpool.goal();

   // TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
   // Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
   System.out.println("Skor sementara: " + liverpool.getNama() + " " + liverpool.getSkor() + " - " + manchesterUnited.getSkor() + " " + manchesterUnited.getNama());
    }

  // TODO: call endTandingBola()
 manchesterUnited.endTandingBola(liverpool); 
  }
}

/* 
Expected output:

Pertandingan antara Liverpool dan Manchester United dimulai!

Skor sementara: Liverpool 1 - 0 Manchester United
Skor sementara: Liverpool 2 - 0 Manchester United
Skor sementara: Liverpool 3 - 0 Manchester United
Skor sementara: Liverpool 4 - 0 Manchester United
Skor sementara: Liverpool 5 - 0 Manchester United
Skor sementara: Liverpool 6 - 0 Manchester United
Skor sementara: Liverpool 7 - 0 Manchester United

Pertandingan antara Manchester United dan Liverpool selesai!
*/
