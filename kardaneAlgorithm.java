import java.util.*;
import java.math.*;
import java.io.*;

/*find the maximum sum of sub array in time complexity of O(n) and no extra space 0(1)*/
static import java.lang.Character.*;
public class {

   public static void main(String[] args) {
        
int[] arr = {2,6,-4,-8,-2,9,1};
int max=0;
for(int i=0;i<arr.length;i++)  max= Math.max(max,arr[i]); 
int currentSum=0;
for(int i =0 ;i<arr.length;i++)
{

    if (currentSum<0) {
        currentSum=0;
      
    }else{
        currentSum+=arr[i];
       max= Math.max(max, currentSum);
    }
}
System.out.println(max);



    }
}
