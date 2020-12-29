
package FileHandling;

import java.io.FileWriter; 
import java.io.IOException;


public class WriteToFile {
    public static void main(String[] args) {
try {
    FileWriter myWriter = new FileWriter("D:FileHandlingNewFilef1.txt");
            {
       String name;
        name = "myWriter.write(Java is the prominent programming language of the millenium!"; 
    }
System.out.print("Successfully wrote to the file.");
} catch (IOException e) {
System.out.println("An error occurred.");
}
 }
}
