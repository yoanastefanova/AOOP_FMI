/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceasarCipher;

public class CeasarCipher {
    private int SHIFT_LENGTH;

    public CeasarCipher() {
        setCipherCode(3); // default encryption
    }

    public CeasarCipher(int cipherCode) {
        setCipherCode(cipherCode);
    }
    
    public int getCipherCode() {
        return SHIFT_LENGTH;
    }

    //26 заради броя на буквите в азбуката
    public void setCipherCode(int cipherCode) {
        if(cipherCode > 26 || cipherCode < -26) //Пр. код 29 разглеждаме като код 3.
            cipherCode = cipherCode % 26;
        if (cipherCode != 0) {
            SHIFT_LENGTH = cipherCode;
        } else {
            SHIFT_LENGTH = 3; // default encryption
        }   
    }
    
    public String encrypt(String plainText){
        
        char[] plainTextChars = plainText.toCharArray();
        char[] cipherTextChars = new char[plainTextChars.length];
        
        for (int i = 0; i < cipherTextChars.length; i++) {
            //System.out.println(plainTextChars[i] - 'A'); // пореден брой в азбуката започвайки от 0 A = 0, B = 1, т.н.
            //System.out.println((plainTextChars[i] - 'A' + SHIFT_LENGTH + 26) % 26); // увеличаваме освен с кода и с 26, за да работи и с отрицателни ключове
            cipherTextChars[i] = (char) ('A' + (plainTextChars[i] - 'A' + SHIFT_LENGTH + 26) % 26);
        }
        
        return new String(cipherTextChars);
    }
    
    public String decrypt(String cipherText){
        
        char[] cipherTextChars  = cipherText.toCharArray();
        char[] plainTextChars = new char[cipherTextChars.length];
        
        for (int i = 0; i < cipherTextChars.length; i++) {
            plainTextChars[i] = (char) ('A' + (cipherTextChars[i] - 'A' - SHIFT_LENGTH + 26) % 26);
        }
        
        return new String(plainTextChars);
    }


    @Override
    public String toString() {
        return String.format("CeasarCipher code =  %d", SHIFT_LENGTH );
    }
  
}
