import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class words {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        boolean run = true;
        String input="";
        while (run){
            System.out.println("\nEnter words here and press enter when you are finished");
            input = scan.nextLine();
            if(input.equals("")){
                System.out.println("No input recieved");
                break;
            }
            run=false;
        }

        List<Character> letters = new ArrayList<>();
        for(char c:input.toCharArray()){
            if(c!=' '){
                letters.add(c);
            }
        }
        int count = letters.size();
        System.out.println("total letters: "+count);

        String[] words = input.split(" ");

        for (int j = 0; j < words.length; j++) {
            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].compareTo(words[i + 1]) > 0) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                }
            }
        }

        System.out.println("Words in sorted order:");
        for(String word : words){
            System.out.println(word + "");
        }
    
    }
}
