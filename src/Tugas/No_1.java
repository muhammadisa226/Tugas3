package Tugas;
import java.util.Scanner;
 // @author Muhammad Isa
public class No_1 {
       public static void main(String[] args) {
           Scanner Inputan = new Scanner(System.in);
        String data[] ={"Galileo","Archimedes","Alkhawarizmi","Aljabar","Muhammad Isa","Tesla"};
        String key;
        System.out.println("Isi data adalah : ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.print("Masukkan Data Yang akan dicari : ");
        key = Inputan.nextLine();
        for (int i =0; i<data.length; i++){
            if(key.equalsIgnoreCase(data[i])){
               System.out.print("Data " + key + " Berada Di Indeks Ke : " + i);
               break;
            }
        }
        System.out.println("\n");
        System.out.println("Muhammad Isa Nuruddin ");
        
    }     
    }
        