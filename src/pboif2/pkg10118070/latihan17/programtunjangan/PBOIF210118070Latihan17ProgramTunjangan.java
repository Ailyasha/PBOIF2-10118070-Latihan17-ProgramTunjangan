/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class PBOIF210118070Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tunjangan =0;
        System.out.println("===========Program Tunjangan============");
        System.out.println("Berapa gaji pokok anda perbulan?: Rp ");
        Scanner scanner = new Scanner(System.in);
        double gaji = scanner.nextDouble();
        
        System.out.print("Status anda? (Menikah/Belum)");
        String status = scanner.next();
        
        System.out.println("========Hasil Perhitungan Gaji=========");
        System.out.println("Gaji Pokok " +gaji);
        if (status.equalsIgnoreCase("menikah")) {tunjangan = (int) (0.35*gaji);
        } else{
               tunjangan=0;
        }
        System.out.println("Tunjangan " + tunjangan);
        System.out.println("Total Gaji " + (gaji+tunjangan));
        System.out.println("(Developed by : Aufa Ilyasha)");
     }
 }