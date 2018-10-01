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
class DemoThrow {
    public static void main(String[] args) {
        DataMhs obj = new DataMhs();
        obj.setNim("0811111111");
        obj.setNama("Fais");
        obj.setNilai(80);
        
        System.out.println("NIM : "+obj.getNim);
        System.out.println("Nama : "+obj.getNama);
        System.out.println("Nilai : "+obj.getNilai);
    }
}
