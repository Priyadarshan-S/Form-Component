package FormControllers;

import java.util.Scanner;

public class Login {
    public String getRole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Role(Admin,Employer,Employee): ");
        String role = sc.nextLine();
        sc.close();
        return role;
    }
}
