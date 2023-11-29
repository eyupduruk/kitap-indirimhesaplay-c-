
package javaapplication7;

import java.util.Random;
import java.util.Scanner;



public class JavaApplication7 {

   
    public static void main(String[] args) {
// SORU
// Bir kitapçıda ilk 5 kitap için indirim uygulanmamaktadır.
// 6. kitap ve sonrasındaki kitplar için %10 indirim uygulanmaktadır.
// Kullanıcıdan 1 kitabın sabit fiyatını ve alınan kitap sayısını isteyin.
// Toplam tutarı konsola yazdırın.
// İndirim olmazsa, tüm kitapların fiyatı eşittir.
        
  Scanner input = new Scanner(System.in);
  Random rnd = new Random();
  
         while (true) {
        System.out.println("--KAMPANYALAR--");
        System.out.println("-----------------");
        System.out.println("5. kitaptan sonraki kitaplarınız için %10 indirim uygulanmaktadır.");
        System.out.println("10.kitaptan sonraki kitaplarınız için %50 indirim uygulanmaktadır.");
        System.out.println("--------");
        
        System.out.println("KAÇ TANE KİTAP ALACAKSINIZ?");
        int kitapadedi = input.nextInt();
        
        System.out.println("KİTAP FİYATINI GİRİNİZ..");
        int kitapfiyati = input.nextInt();
        
        if (kitapadedi>5) {
            System.out.println("FİYAT:" + ((10/100) * (kitapfiyati*kitapadedi)));
        } else {
            System.out.println("FİYAT:" + (kitapfiyati*kitapadedi));
        }
    
         }
           
            
















    }
    
}
