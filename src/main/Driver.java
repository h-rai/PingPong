import java.io.*;
import java.util.Scanner;


class Driver{
    public static void main(String[] args){

        int terminalOption = -1;
        String terminalString = "";
        Person customer = new Person();
        Scanner sc = new Scanner(System.in);

        do{
            Menu.showMenu();
            terminalOption = sc.nextInt();

            switch(terminalOption){
            case 1:
                System.out.println("\n------------------");
                System.out.print("Username: ");
                terminalString = sc.next();
                customer.setUsername(terminalString);
                System.out.print("Password: ");
                terminalString = sc.next();
                customer.setPassword(terminalString);
                System.out.println("Status:   failed");
                System.out.println("------------------\n");

                // We can change the framework, so it would work with authentication. Verify if the password is strong enough... 
                // Condtions, must have a Capital, non-capital, numbers, symbols, and min of length of 8.
                break; 
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default:
                break;
                
            }
        }while(terminalOption != 0);

            sc.close();

    }
}


