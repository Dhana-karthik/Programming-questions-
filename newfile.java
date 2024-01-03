public class newfile {

public static void  main(String[] arg ){

    int r,sum=0,temp;    
    int n=4554;//It is the number variable to be checked for palindrome  
    
    temp=n;    
    while(n>0){    
     r=n%10;  //getting remainder  
     sum=(sum*10)+r;    
     n=n/10;    
    }    
    if(temp==sum)    
     System.out.println("palindrome number ");    
    else    
     System.out.println("not palindrome");    

// i have edited this file in vscode if u see this in github u pushed this file sucessfully

}

}