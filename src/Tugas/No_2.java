package Tugas;
import java.util.Scanner;
public class No_2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int data[]= {2,4,6,8,10,12,14,16,18,20};
        int cari;
        int IndeksAwal = 0;
        int IndeksAkhir = data.length-1;
        int ketemu =0;
        int point =0;
        
        System.out.println("Isi Data adalah : ");
        for (int i=0;i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
        System.out.print("Masukkan Data Yang Akan Dicari : ");
        cari = inputan.nextInt();
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu ==0)){
            point = (IndeksAwal + IndeksAkhir)/2;
            System.out.println("Indeks Pointer : "+ point);
            if(cari == data[point]){
                ketemu =1;
                System.out.println("Data " +cari + " Telah Ditemukan Di indeks ke : " + point );   
            }else if (cari < data[point]){
                System.out.println("Cari Dikiri ");
                IndeksAkhir = point -1;
            }
            else {
                IndeksAwal = point+1;
                System.out.println("Cari Dikanan ");
            }
            
        }
        if(ketemu ==1 ){
        System.out.println("Data Dapat Ditemukan ");
        }else {
            System.out.println("Data Tidak  Dapat Ditemukan ");
        }
        
        
    } 
}
