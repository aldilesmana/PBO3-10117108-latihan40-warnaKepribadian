import java.util.Scanner;
//NAMA  :Aldi Lesmana 
//NIM   :10117108    
//KELAS :IF-3

/**
 *
 * @author Aldi Lesmana
 */
public class User {
    public String namaUser;
    Scanner scn = new Scanner(System.in);

    public void memasukkanNama() {
        System.out.print("NAMA KAMU : ");
        namaUser = scn.next();
    }
}