import java.io.*;
import java.util.Scanner;
import java.util.UUID;




// Person class will act like an individual customers.
// In contrast to there being multiple people for a Company class.
public class Person {

    // Should it be private? Yes since it is sensetive, but would you like other classes to use it?
    private String id, auth, first_name, last_name, username, password;

    // Default 
    public Person(){
        this.id = UUID.randomUUID().toString();
        this.auth = UUID.randomUUID().toString();
        this.first_name = "";
        this.last_name = "";
        this.username = "";
        this.password = "";
    }

    // Constructor
    // 
    public Person(String f, String l, String u, String p){
        this.first_name = f;
        this.last_name = l;
        this.username = u;
        this.password = p;
    }

    // Mutators for ID, AUTH, FIRST, LAST, USER, PASS
    public String getUsername(){
        return username;
    }
    public void setUsername(String u){
        this.username = u;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String p){
        this.password = p;
    }
    public String getFirstname(){
        return first_name;
    }
    public void setFirstname(String f){
        this.first_name = f;
    }
    public String getLastname(){
        return last_name;
    }
    public void setLastname(String l){
        this.last_name = l;
    }
    public String getID(){
        return id;
    }
    public String getAUTH(){
        return auth;
    }

    

}
