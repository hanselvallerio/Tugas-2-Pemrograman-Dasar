/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathOp;

/**
 *
 * @author Hansel Vallerio H
 */
public class Matematika {
    int hasil;
    
    void tambah (int a, int b) {
        hasil = a + b;
        System.out.println(a+" + "+b+" = "+hasil);
    }
    
    void kurang (int a, int b) {
        hasil = a - b;
        System.out.println(a+" - "+b+" = "+hasil);
    }
    
    void kali (int a, int b) {
        hasil = a * b;
        System.out.println(a+" x "+b+" = "+hasil);
    }
    
    void bagi (int a, int b) {
        hasil = a / b;
        System.out.println(a+" : "+b+" = "+hasil);
    }
    
    void modulus (int a, int b) {
        hasil = a % b;
        System.out.println(a+" % "+b+" = "+hasil);
    }
}
