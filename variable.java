public class variable {
    //variable adalah tempat kita untuk menyimpan nilai yang akan kita isi nanti
    //misalnya kita mau membuat kata kata yang ada kotanya tapi kita mau agar kota ini gampang diubah dengan sekali ubah
    //maka kita bisa memakai variable
    public static void main(String[] args) {
        String kota1, kota2, kota3;
        kota1 = "Pekanbaru";
        kota2 = "Jakarta";
        kota3 = "Padang";

        //nahh disini kita telah membuat variabel dan bisa kita keluarkan
        System.out.println("saya adalah orang " + kota1 +" yang tinggal di " +kota2+" dan sekarang sedang berjalan jalan di " +kota3);


        //kita bisa menggunakan angak juga misalnya kita buat sebuah perkenalam
        String nama, alamat, hobby;
        int umur, tinggi, BeratBadan;
        nama = "Andre";
        alamat = "ngawi";
        hobby = "main rudal";
        umur = 19;
        tinggi = 176;
        BeratBadan = 83;


        //nahh ini contoh variable yang kita isi untuk membuat data diri dan bisa kita keluarkan
        System.out.println("Hallo nama saya "+nama+" saya saat ini sedang tinggal di "+alamat+" tinggi badan saya adalah "+tinggi+" berat badan saya adalah "+BeratBadan + "Kg Saya memiliki hobby "+hobby);


        //jika kita punya 1 nilai dan kita membuat nilai baru maka nilai akan yang sudah kita buat sebelumnya akan berubah
        nama = "Azril";
        alamat = "ngawi";
        hobby = "Andre";
        umur = 19;
        tinggi = 176;
        BeratBadan = 83;
        System.out.println("Hallo nama saya "+nama+" saya saat ini sedang tinggal di "+alamat+" tinggi badan saya adalah "+tinggi+" berat badan saya adalah "+BeratBadan + "Kg Saya memiliki hobby "+hobby);
    }

}
