/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalmethod;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class PersonalMethod {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        char choice;
        
        do{
            String barisa = "            Belajar Deret Aritmatika, Geometri, dan Menghitung Faktorial        ";
            String barisb = "Masukkan banyak angka yang mau dicetak [2..10] : ";
            String barisc = "Masukkan beda masing-masing angka [2..9] : ";
            
            System.out.println(barisa);
            System.out.println("");
            System.out.print(barisb);
            int banyak_angka = s.nextInt();
            System.out.print(barisc);
            int beda_angka = s.nextInt();
            System.out.println("");
            
            String dereta = "Deret Aritmatika : ";
            String deretb = "Deret Geometri : ";
            String deretc = "Faktorial dari " + banyak_angka + " : ";
            
            System.out.println(dereta);
            for(int i = 1; i <= banyak_angka * beda_angka; i = i + beda_angka){
                System.out.print(i + " ");
            }
            System.out.println("");
            System.out.print("\n" + deretb + "\n");
            int a = 1, total = 0;
            for(int x = 1; x<= banyak_angka; x++){
                System.out.print(a + total);
                a = a * beda_angka;
                if(x < banyak_angka){
                    System.out.print(" ");
                } else{
                    System.out.print("");
                }
            }
            System.out.println("");
            System.out.println("\n" + deretc);
            for(int i=banyak_angka; i >= 1; i--){
                System.out.print(i+" * ");
            }
            System.out.println("= " + factorial(banyak_angka));
            
            System.out.println("");
            System.out.print("Anda mau ulang [y/t] : ");
            choice = s.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        s.close();
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
   
