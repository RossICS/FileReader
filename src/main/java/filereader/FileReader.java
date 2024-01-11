/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filereader;
import java.io.*;

 /**
  * A program that displays the contents of a file.
  */
public class FileReader {

    /**
     * This is the main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File textFile = new File("wonder.txt");
        java.io.FileReader in;
        BufferedReader readFile;
        String lineOfText;
        int age;

        try {
            in = new java.io.FileReader(textFile);
            readFile = new BufferedReader(in);
            while ((lineOfText = readFile.readLine()) != null ) {
                    System.out.println(lineOfText);
            }
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
    	}
    }
}
    

