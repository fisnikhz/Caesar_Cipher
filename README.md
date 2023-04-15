#Project2 DataSecurity Gr19 
Caesar Cipher

This repository contains a Java implementation of the Caesar Cipher encryption and decryption algorithm, as well as a frequency analysis method to calculate the percentage of each letter in a given text.
 

Implementation Details

The CaesarCipher class contains the following methods:

readPlainTextFromFile(String fileName)
This method reads the plaintext from a file with the given filename and returns it as a String.

encrypt(String text, int key)
This method takes a String text and an integer key as input and returns the encrypted text as a String. The algorithm shifts each letter in the text by key positions in the alphabet.

decrypt(String text, int key)
This method takes a String text and an integer key as input and returns the decrypted text as a String. The algorithm shifts each letter in the text by 26 - key positions in the alphabet.

calculateFrequency(String text)
This method takes a String text as input and calculates the frequency of each letter in the text. It returns a String containing the percentage of each letter in alphabetical order.

Collaborators: Ferdeze Nurkasa, Festina Mjeku, Festim Krasniqi, Fisnik Hazrolli
