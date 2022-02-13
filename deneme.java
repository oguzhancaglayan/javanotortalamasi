import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

      int mat, fizik, kimya, biyoloji, turkce;
      Scanner inp= new Scanner(System.in);
      System.out.println("Matematik notunu giriniz");
      mat = inp.nextInt();

      System.out.println("fizik notunu giriniz");
      fizik = inp.nextInt();

      System.out.println("kimya notunu giriniz");
      kimya = inp.nextInt();

      System.out.println("biyoloji notunu giriniz");
      biyoloji = inp.nextInt();

      System.out.println("türkçe notunu giriniz");
      turkce = inp.nextInt();

      int toplam = fizik+mat+kimya+biyoloji+turkce;
      double sonuc= toplam/5;
      boolean durum = sonuc>60;
      String str= durum ? "Sınıfı Geçti" : "Sınıfta Kaldı";
      System.out.println(str);




    }
}
