/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobshee8;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Praktikum {
    public static void main(String[] args) {
        
        //membuat variabel
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while( running ){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [yakin/tidak]> ");
            
            jawab = scan.nextLine();
            
            //cek jawabannya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("yakin")){
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + "kali");
    }
    
}
