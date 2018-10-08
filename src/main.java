import java.util.Scanner;
//NAMA  :Aldi Lesmana 
//NIM   :10117108    
//KELAS :IF-3

/**
 *
 * @author Aldi Lesmana
 */
public class main {
     public static void main(String[] args) {
        Warna wrn = new Warna();
        User usr = new User();
        Scanner scn = new Scanner(System.in);

        wrn.menampilkanTemplate();
        wrn.pilihWarnaFavorit();
        usr.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "+ usr.namaUser.toUpperCase()+"====");
        wrn.tesKepribadian(wrn.namaWarna,usr.namaUser);


    }
    
}