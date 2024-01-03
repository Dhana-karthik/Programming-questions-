import java.util.*;
import java.math.*;

import java.lang.*;

public class duplicateLetterRemover{


   public static void main(String[] arg ){
Scanner sc = new Scanner(System.in);
String input = sc.next();
    System.out.println(remmoveDuplicates(input));
    }



  
    static String remmoveDuplicates(String variable ){
     String uniqueString ="";
        Character[] letters = new Character[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     ArrayList<Character> letter = new ArrayList<>();
     for(int i=0;i<letters.length;i++){
        letter.add(letters[i]);
     }
     for(int i=0;i<variable.length();i++){


        if(letter.contains(variable.charAt(i))){
            uniqueString=uniqueString+variable.charAt(i);
        letter.remove(letter.indexOf(variable.charAt(i)));
        }
     }


        return uniqueString;
    }
}
