/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Windows 10
 */
public class DataMhs {
    private String Nim;
    private String Nama;
    private double Nilai;
    String getNim;
    String getNama;
    String getNilai;
    
    public void setNim(String vnim){
        try{
            if(Nim==null){
                throw new NullPointerException();
            }
        } catch (NullPointerException npe){
            System.out.println("KESALAHAN: "+"NIM tidak boleh null");
        }
    }
    public String getNim(){
        return Nim;
    }
    public void setNama(String vNama){
        try{
            Nama = vNama;
            if (Nama==null){
                throw new NullPointerException();
            }
        } catch (NullPointerException npe){
            System.out.println("KESALAHAN: "+"Nama tidak boleh null");
        }
    }
    public String getNama(){
        return Nama;
    }
    public void setNilai(int vnilai){
        Nilai = vnilai;
    }
    public double getNilai(){
        return Nilai;
    }
}
