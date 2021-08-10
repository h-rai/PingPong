import java.io.*;
import java.util.Scanner;


class Driver{
    public static void main(String[] args){
        int option = 0;
        System.out.println("LOADED.");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();

        while(option != 0){
            Menu.showMenu();
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("ONE");
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



        }



        while(option != 4){
            Menu.showMenu();
        }

    }



    
}