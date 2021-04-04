/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg151911513018_minggu5;

import java.util.ArrayList;
import java.lang.Character;
import java.lang.String;
/**
 *
 * @author Eto
 */
public class OlahFile {
    public ArrayList pecahDocJadiKalimat(String document){
        int sentenceIndex=0;
        int wordIndex=0;
        String sentence;
        ArrayList hasil=new ArrayList();
        for(int i=0;i<document.length();i++){
            if(document.charAt(i) == ' ')   wordIndex = i+1;
            else {
                if (document.charAt(i) == '?' || document.charAt(i) == '!' ||
                    (i == document.length() - 1)) {
                sentence = document.substring(sentenceIndex, i+1);
                hasil.add(sentence);
//                doPreprocessing(sentence);
                sentenceIndex = i+1;
                }
                else {
                    if(document.charAt(i) == '.' && document.charAt(i+1)==' '){
                        String temp = document.substring(wordIndex, i+1);
//                        if(isAbbreviation(temp)) {
                        sentence = document.substring(sentenceIndex,i+1);
                        hasil.add(sentence);
//                        doPreprocessing(sentence)
                        sentenceIndex = i+1;
//                        }
                        }
                    }
                }
        }
        return hasil;
    }

public String hilangTokenKalimat(String kal){
//    char[] cekChar1 = {'!','@','#','$','%','^','&','*','(',')'};
//    char[] cekChar2 = {'_','+','{','"','}',':','<','>','?',',','.','/',';'};
//    char[] cekChar3 = {'[',']','–','\\','=','|'};
//    String s1=new String(cekChar1);
//    String s2=new String(cekChar2);
//    String s3=new String(cekChar3);
//    String s4=s1.concat(s2).concat(s3);
//    s4=s4.concat("//").concat("'");
//    System.out.println(s4+"\n");
    
    /*
    Debug : sout ini mengganggu pemecahan kalimat
    Solusi : dikomen karena disini menampilkan pembagian file perkalimat jadinya tidak bisa
    */
    //System.out.println("kalimat awal : "+kal);
    
    char[] cekChar1 = {'!','@','#','$','%','^','&','*','(',')','_','+'
            ,'{','"','}',':','<','>','?',',','.','/',';','[',']','–'
            ,'\\','=','|','0','1','2','3','4','5','6','7','8','9'};
    String cek=new String(cekChar1);
    for(int i=0;i<cek.length()-1;i++){
//        char temp=(char)s4.charAt(i);
//        System.out.print(temp);
//        char tp=(char)cekChar1[i];
//        System.out.print(tp);
        String cq=(String)cek.substring(i, i+1);
        kal=kal.replace(cq,"");
        //kal = kal.replaceAll("( )+", " ");
        kal = kal.trim().replaceAll(" +", " ");
    /*
    Debug : sout ini mengganggu pemecahan kalimat juga
    Solusi : dikomen karena disini menampilkan pembagian file perkalimat jadinya tidak bisa
    */
      //  System.out.println(cq+" dan "+kal);
    }
    
    System.out.println(kal);
//    System.out.println();

//    kal=kal.replace("!","");
//     kal=kal.replace("@","");
//      kal=kal.replace("#","");
//       kal=kal.replace("$","");
//        kal=kal.replace("%","");
//         kal=kal.replace("^","");
//          kal=kal.replace("&","");
//           kal=kal.replace("*","");
//            kal=kal.replace("(","");
//             kal=kal.replace(")","");
//              kal=kal.replace("_","");
//               kal=kal.replace("+","");
//                kal=kal.replace("-"," ");
//                 kal=kal.replace("=","");
//    kal=kal.replace("{","");
//     kal=kal.replace("}","");
//      kal=kal.replace("|","");
//       kal=kal.replace("[","");
//        kal=kal.replace("]","");
//         kal=kal.replace("\\","");
//
//   kal=kal.replace(":","");
//    kal=kal.replace("","");
//     kal=kal.replace(";","");
//      kal=kal.replace("'","");
//
//    kal=kal.replace("<","");
//     kal=kal.replace(">","");
//      kal=kal.replace("?","");
//       kal=kal.replace(",","");
//        kal=kal.replace(".","");
//         kal=kal.replace("/","");
//          kal=kal.replace("//","");

    return kal;
    }

    public ArrayList bersihDocDariToken(ArrayList list){
        int n=list.size();
        ArrayList listq=new ArrayList();
        String temp;
        for(int i=0;i<n;i++){
            temp=hilangTokenKalimat((String)list.get(i));
            listq.add(temp);
        }
        return listq;
    }

    public void tampilArrayList(ArrayList list){
        int n=list.size();
        for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }
    }


} // end of class
