//Application that allows the user to enter up to 15 strings and stores them in an array. The user can quit early. 
//The app will then display the strings entered in alphabetical order

import javax.swing.JOptionPane;
import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        
        //variables and constants
        String[] userValues = new String[15];
        int x; //throwaway variable for loop
        int count = 0;
        String userWord;
        final String QUIT = "zzz";
        boolean didUserQuit = false;

        //for loop that fills our array with dummy values so the length starts out at the size of the array
        for(x = 0; x < userValues.length; x++) {
            userValues[x] = "XXXX";

        }

        //reset our throwaway variable to zero
        x = 0;

        //while loop that first checks  if there is space left in the array. While that is true,  It will continue
        while(x < userValues.length) {
            userWord = JOptionPane.showInputDialog(null, "enter a word or type " + QUIT + " to quit now");

            //decide if the user entered the quit command or entered a valid word
            if(userWord.equalsIgnoreCase(QUIT)) {
                x = userValues.length;
                didUserQuit = true;
            }else{
                userValues[x] = userWord;
                x++;
            }
        } //end of while loop
        
        //if user did not quit early, the count variable needs some sort of value. we give it the entire length of the array
        if(!didUserQuit) {
            count = userValues.length;

        }
        
        Arrays.sort(userValues);
        String message = "Values: ";

        for(x = 0; x < count; x++) {
            message = message + " " + userValues[x];
            JOptionPane.showMessageDialog(null, message);
        }
    }
}