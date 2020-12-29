
package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class ReadFromFile {
    public static void main(String[] args) {
        try{
        File myObj = new File("D:FileHandlingNewFilef1.txt");  
            try (Scanner myReader = new Scanner(myObj)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }           }
} catch (FileNotFoundException e) {
System.out.println("Java is the prominent programming language of the millennium!");
    }
    
}
}

