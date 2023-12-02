import java.util.*;
public class Main {

    public static void main(String[] arg ){

        List<emailId> person = new ArrayList<>();

        Scanner sc= new Scanner(System.in);
        int n=1;
        for(int i=0;i<4;i++){

            emailId personObject = new emailId();
            person.add(personObject);
        }
        int choice;
        boolean loop = true;
        while (loop){

            System.out.println("1. create your mail Id \n2. change password \n3 or any number to exit");
            choice = sc.nextInt();
            switch(choice){

                case 1:
                {
                    System.out.println("enter the first name ");
                    String FirstName = sc.next().toLowerCase();
                    System.out.println("enter the lastname" );
                    String LastName = sc.next().toLowerCase();
                    System.out.println("enter your company name ");
                    String  CompanyName= sc.next().toLowerCase();
                    System.out.println("enter the department name ");
                    String  DeptName  = sc.next().toLowerCase();
                    emailId.generateEmail(person.get(0) ,   FirstName , LastName,  CompanyName,  DeptName );

                    break;
                }
                case 2:
                {    while(n==1){
                    System.out.println("enter your e-mailId ");
                    String EmailId = sc.next().toLowerCase();
                    System.out.println("enter your old password");
                    String oldPassword= sc.next().toLowerCase();
                    System.out.println("enter your new password");
                    String newPassword= sc.next().toLowerCase();
                    n = emailId.changePassword(person, EmailId,oldPassword ,  newPassword);
                }
                    break;
                }
                default:
                {
                    loop=false;
                    break;
                }


            }
        }



    }
}