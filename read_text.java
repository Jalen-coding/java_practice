import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read_text {
    
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.print("What file would you like for me to open (must include the path and text file): ");
        String fileName;

        try{
            fileName = reader.readLine();
        }catch(IOException e){
            System.out.println("Error reading input.");
            return;
        }

        int numChars = 0;
        int numWords = 0;
        int numLines = 0;

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = fileReader.readLine()) != null) {
                numLines++;

                String[] words = line.split(" ");

                for (String word : words) {
                    numWords++;
                    numChars += word.length();
                }
            }
        } catch (IOException e) {
            System.err.println("File does not exist.");
            return;
        }

        System.out.println("Number of characters: " + numChars);
        System.out.println("Number of words: " + numWords);
        System.out.println("Number of lines: " + numLines);
    }
}
