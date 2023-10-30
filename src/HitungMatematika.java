import java.util.Scanner;

public class HitungMatematika {
    int segitiga,persegi,persegiPanjang,pilih,hasil;
    float hasilpy;

    Scanner input = new Scanner(System.in);
    public void HitungSegitiga(){
        int a,t;
        System.out.println("Masukan nilai alas : ");
        a = input.nextInt();
        System.out.println("Masukan nilai tinggi : ");
        t = input.nextInt();

        hasil =  a * t/2;
        System.out.println("Hasil Luas Segita adalah " + hasil);
    }

    public void HitungPersegi(){
        int s1,s2;
        System.out.println("Masukan nilai alas : ");
        s1 = input.nextInt();
        System.out.println("Masukan nilai tinggi : ");
        s2 = input.nextInt();

        hasil =  s1 * s2;
        System.out.println("Hasil Luas Persegi adalah " + hasil);
    }
    public void HitungLingkaran(){
        int jari2;
        float lingkaran = 3.14F;
        System.out.println("Masukan jari2 : ");
        jari2 = input.nextInt();

       int hasiljari2 = jari2 * jari2;

        hasilpy = lingkaran * hasiljari2;
        System.out.println("Hasil Luas Lingkaran adalah " + hasilpy);
    }
    public void HitungPersegiPanjang(){
        int p,l;
        System.out.println("Masukan nilai panjang : ");
        p = input.nextInt();
        System.out.println("Masukan nilai lebar : ");
        l = input.nextInt();

        hasil =  p * l;
        System.out.println("Hasil Luas Persegi Panjang adalah " + hasil);
    }


    public void ulang(){
        char opr = 'y';
        System.out.println("Apakah ingin mengulang lagi : Y/N ? ");
        opr = input.next().charAt(0);
        if (opr == 'Y' || opr == 'y'){
            Display();
        }else {
          return;
        }

    }
    public void Display(){
        int ulang;
        char opr ='y';
        System.out.println("Masukan Luas yang ingin dicari:");
        System.out.println("1. Segitiga ");
        System.out.println("2. Persegi ");
        System.out.println("3. Persegi Panjang ");
        System.out.println("4. Lingkaran ");
        System.out.println("Pilih : ");
        pilih = input.nextInt();

           if (pilih == 1){
               HitungSegitiga();
           } else if (pilih == 2) {
               HitungPersegi();
           } else if (pilih == 3) {
               HitungPersegiPanjang();
           } else if (pilih == 4) {
               HitungLingkaran();
           }else {
               System.out.println("Inputan salah ngab,silahkan ulang ngab");
               ulang();
           }
    }

    public static void main(String[] args) {
        HitungMatematika run = new HitungMatematika();
        run.Display();
    }

}
