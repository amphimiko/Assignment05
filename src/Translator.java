
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                             
        Scanner input = new Scanner(System.in);                         //scanner
        String eng = ".";                                               //Initializes string eng
        int length = 0;                                                 //for counting length                                                 //for ending game
        int pos = 0;                                                    //for counting letters removed
        while (!eng.equals("end")) {
            System.out.println("Please enter a word to translate(Type end to quit the program):");  //opening statement
            eng = input.nextLine();                                     //finds eng
            eng = eng.toLowerCase();                                    //converts to lower case
            if (eng.equals("end")) {                                    //if end is typed
                break;                                                  //ends
            }
            String pig = eng;                                           //sets pig as eng to start translating
            while (!pig.startsWith("a") && !pig.startsWith("e") && !pig.startsWith("i") && !pig.startsWith("o") && !pig.startsWith("u")) {  //while a vowel is first
                pos = pos + 1;                                         //counts letters removed
                pig = pig + pig.substring(0, 1);                       //adds the first letter of pig to the back
                length = pig.length();                                       //counts the length of pig
                pig = pig.substring(1, length);                              //removes the first letter of pig
                if(pig.startsWith("y") && pos >= 1) {                   //counts y as vowel if it is after a consonant
                    break;                                              //breaks if vowel y is found
                }
            }
            length = pig.length();                                      //checks length
            pig = pig.substring(1, length);                             //deletes first letter
            pig = "i" + pig;                                            //replaces first letter with i
            if (pig.endsWith("a") || pig.endsWith("e") || pig.endsWith("i") || pig.endsWith("o") || pig.endsWith("u")) {                       //if the word ends in a vowel
                pig = pig + "hee";                                          //adds hee
            } else {
                pig = pig + "ee";                                           //adds ee
            }
            System.out.println(eng + " in Mattenenglisch is " + pig);   //final statement
        }
    }
}
