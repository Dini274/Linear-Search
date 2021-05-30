/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author Dini Aryani
 */
import java.util.ArrayList;

public class LinearSearch {


  public static void main(String[] args) {

    Mahasiswa[] listMahasiswa = {
      new Mahasiswa("1102021", "Phina Putri", "Bandung"),
      new Mahasiswa("1102022", "Hasna Amelia", "Surabaya"),
      new Mahasiswa("1102023", "Dian Bayu Rini", "Malang"),
      new Mahasiswa("1102024", "Reni Indrayani", "Malang"),
      new Mahasiswa("1102025", "Dini Aryani", "Surabaya"),
      new Mahasiswa("1102026", "Helfi Apriliyandi Firdaos", "Bandung")
    };

    search(listMahasiswa, "Dini");

  }

  public static void search(Mahasiswa[] mahasiswa, String keyword) {
    boolean ditemukan = false;
    for (int i = 0; i < mahasiswa.length; i++) {

      if (mahasiswa[i].nama.toLowerCase().contains(keyword.toLowerCase())) {
        ditemukan = true;
        System.out.println(
            mahasiswa[i].nim + " - "
            + mahasiswa[i].nama + " - " 
            + mahasiswa[i].alamat + " - "
            + "Data nomor " + (i + 1)
        );
      }

    }

    if (!ditemukan) {
      System.out.println("Data yg anda cari tidak ditemukan");
    }

  }
}

class Mahasiswa {
  String nim;
  String nama;
  String alamat;

  public Mahasiswa(String nim, String nama, String alamat) {
    this.nim = nim;
    this.nama = nama;
    this.alamat = alamat;
  }
}
