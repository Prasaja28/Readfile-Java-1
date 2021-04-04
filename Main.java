/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg151911513018_minggu5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Prasaja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        *    Create Object
        */
        BacaFile bData=new BacaFile();
        OlahFile oFile=new OlahFile();
        
          /*
         *  Baca file .txt berukuran besar
         *  File file = new File("nama file.txt");
         *  File file = new File("docq\\teks coba.txt"); // jika file berada di folder docq
         *  object.readDoc(file);
         */

        //File file = new File("docq\\teks coba.txt");
        File file = new File("teks coba 3.txt");
        String hasil = bData.readDoc(file);
        
        /*
         *  Baca file .txt berukuran besar
         *  object.readFile("nama file.txt");
         */

        //String hasil=bData. readFile (("docq\\teks coba.txt");
        //hasil=bData. readFile ("teks coba 3.txt");
        
        /*
        *    fungsi ini untuk meng-konversi dokumen (yang dibaca oleh readFile(…) atau readDoc(…) )
        *    outputnya berupa ArrayList yang berisi kalimat  {kalimat-1, kalimat-2, …, kalimat-n}
        */

        ArrayList hasOlah = oFile.pecahDocJadiKalimat(hasil);
        
        /*
        *    untuk menampilkan ArrayList
        */

        //oFile.tampilArrayList(hasOlah);

        
        /*
        *    untuk membersihkan token dari ArrayList yang dihasilkan oleh fungsi pecahDocJadiKalimat(…)
        *    di dalam fungsi ini akan me-call fungsi  hilangTokenKalimat(…)
        */

        ArrayList hasBersih =oFile.bersihDocDariToken(hasOlah);

        
        /*
        *    untuk menghilangkan token di suatu kalimat
        */
        //oFile.hilangTokenKalimat(hasil));
        oFile.hilangTokenKalimat(hasil);

        
        
    }
    
}
