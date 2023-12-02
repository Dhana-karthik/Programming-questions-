import java.util.List;
import java.util.UUID;

public class emailId {
    String firstName;
    String lastName;
    String companyName;
    String deptName = " ";
   private String password;
    String employeeEmail = "";


    static void generateEmail(emailId person, String FirstName, String LastName, String CompanyName, String DeptName) {


        System.out.println("enter the number");
//int no =sc.nextInt();


        UUID uuid = UUID.randomUUID();

        person.password = uuid.toString().substring(0, 10);
        person.firstName = FirstName;
        person.lastName = LastName;
        person.companyName = CompanyName;
        person.deptName = DeptName;

        person.employeeEmail = person.firstName.concat(".".concat(person.lastName.concat("@".concat(person.deptName.concat(".".concat(person.companyName.concat(".com")))))));

        System.out.println(person.employeeEmail);
        System.out.println("don't share with anyone your password is \n " + person.password);


    }


    static int changePassword(List<emailId> listOfObjects, String EmailId, String oldPassword, String newPassword) {
        int n = 1;
        for (int i = 0; i < listOfObjects.size(); i++) {
            if ((listOfObjects.get(i).employeeEmail.equals(EmailId))) {
                if (listOfObjects.get(i).password.equals(oldPassword)) {
                    listOfObjects.get(i).password = newPassword;
                    n = 0;
                    System.out.println(" your new password is setted");
                } else {
                    System.out.println(" The password you entered is invalid ");
                }
            } else if (i == listOfObjects.size() - 1 && !(listOfObjects.get(i).employeeEmail.equals(EmailId))) {
                System.out.println("The mail id you entered is not present");
            }
        }

        return n;

    }


}
