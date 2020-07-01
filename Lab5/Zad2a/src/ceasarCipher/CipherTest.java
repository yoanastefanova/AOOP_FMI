/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceasarCipher;

import java.util.Scanner;

/**
 * @author Petya
 */
public class CipherTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Write 1 for encrypt or 2 for decrypt: ");
            choice = input.nextInt();
        } while(choice < 1 || choice > 2);

        System.out.print("Write a code: ");
        int code = input.nextInt();
        CeasarCipher cipher = new CeasarCipher(code);

        System.out.print("Write a word: ");
        String text = input.next();
        text = text.toUpperCase();

        if (choice == 1){
            System.out.println(cipher.encrypt(text));
        }else{
            System.out.println(cipher.decrypt(text));
        }

        /*
        System.out.println( "Encrypt \"TOY\" by default...");
        System.out.println(cipher.encrypt("TOY"));
        System.out.println( "Decrypt \"WRB\" by default...");
        System.out.println(cipher.decrypt("WRB"));
        System.out.println( );

        System.out.println( "Encrypt \"ABCD\" by key -3...");
        cipher = new CeasarCipher(-3);
        System.out.println(cipher.encrypt("ABCD"));
        System.out.println( "Decrypt \"XYZA\" by key -3...");
        System.out.println(cipher.decrypt("XYZA"));
*/
    }

}
