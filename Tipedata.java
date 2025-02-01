public class Tipedata {
    public static void main(String[] args) {
        /*
        Tipe data adalah sebuah sintax untuk menentukan nilai kedalam sebuah variabel
        karena di java kita harus memiliki tipe data yang jelas
         */
        /*tipe data pertama yaitu number
        dalam tipe data number kita akan memasukkan sebuah nilai angka dalam tipe data number ada beberapa yang sering digunakan
        1. intejer yang kita pakai dengan mengetik Int
         */
        int intejer = 1;
        //lalu ada long sama seperti intejer tetapii ukuran nya lebih besar
        long Cnthlong = 2L;
        //lalu ada tipe data float yang bisa kita isi dengan koma contoh:
        float cnthfloat = 1.2F;
        //Lalu ada double yang bisa mengisi nilai koma tetapi lebih besar dari float untuk ukurannya
        double cnthdbl = 0.0001;

        /*Setelah kita tahu tipe data untuk number lalu ada juga tipe data char
        yang berisi 1 huruf atau 1 angka atau 1 symbol
         */
        char cnthhuruf = 'a';
        char cnthangka = '1';
        char cnthsymbol = '.';

        /*Setelah itu ada juga tipe data Boolean
        dalam tipe data boolean kita hanya ada dua nilai yaitu true(benar), atau false(salah)
         */
        boolean cnthbln1 = true;
        boolean cnthbln2 = false;

        /*yang terakhir yaitu String dimana kita bisa memasukkan nilai huruf
         */
        String cnthString = "ini adalah contoh untuk String";

        /*
        Setelah itu kita akan mencoba untuk membuat output untuk semua tipe data tersebut
         */
        System.out.println(intejer);
        System.out.println(Cnthlong);
        System.out.println(cnthfloat);
        System.out.println(cnthdbl);
        System.out.println(cnthhuruf);
        System.out.println(cnthangka);
        System.out.println(cnthsymbol);
        System.out.println(cnthbln1);
        System.out.println(cnthbln2);
        System.out.println(cnthString);


    }
}
