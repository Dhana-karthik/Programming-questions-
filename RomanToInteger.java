import java.util.HashMap;
import java.util.Map;

public class RomanToInteger{


public static void main(String[] arg ){
 
   System.out.println(romanToDecimal("XVII"));
}

static int romanToDecimal(String roman ){
             int i =0;
             
             Map<Character,Integer> refer = new HashMap<>();
             refer.put('I',1);
             refer.put('V',5);
             refer.put('X',10);
             refer.put('L',50);
             refer.put('C',100);
             refer.put('D',500);
             refer.put('M',1000);
             
             int result =0;
             int n =roman.length();
             System.out.println(n);
             if( n>1 ){
          while( i<n-1){
              if(refer.get( roman.charAt(i) ) >= refer.get(roman.charAt(i+1) )  ){
                  
                  result += refer.get( roman.charAt(i) );
                  System.out.println(result);
              }else{
                   result +=  refer.get( roman.charAt(i+1) )-refer.get(roman.charAt(i) );
              }
           i++;

          }
          result += refer.get(roman.charAt(n-1));
         
        }
             return result ;
         }


}
