package hangman;
import java.util.Scanner;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String letter = "b";
     String[] words = {"b","a","m","b","i"};
     String[] dashes = {"-","-","-","-","-"};

     System.out.println("Welcome");
     System.out.println(Arrays.toString(dashes));
int count = 0; 
    while(!Arrays.equals(words, dashes) && count < words.length+3){
     System.out.println("Guess the letter");
        letter = scan.nextLine();

        for (int i =0; i < words.length; i ++){
            if(words[i].equalsIgnoreCase(letter)){
                dashes[i] = words[i];
                
            }
        }

    System.out.println(Arrays.toString(dashes)); 
    count++;

}

if (Arrays.equals(words,dashes)){
    System.out.println("You won!!");
} else {
    System.out.println("You lost, the word is " + Arrays.toString(words));
}
       

    scan.close();
        
    }
}