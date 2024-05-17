package player;

import java.util.Scanner;

public class Player {
    private String name;
    private String emailid;
    private String contactNo;
    private String address;
    private int age;

    public void setPlayerDetails(String name, String emailid,String contactNo,String address,int age){
        this.name=name;
        this.emailid=emailid;
        this.contactNo=contactNo;
        this.address=address;
        this.age=age;
    }
    public void setPlayerName(String name){
        this.name=name;
    }

    public String getPlayerName(){
        return this.name;
    }
    public String getPlayerMail(){
        return this.emailid;
    }
    public String getContactNo(){
        return this.contactNo;
    }
    public String getAddress(){
        return this.address;
    }
    public int getAge(){
        return this.age;
    }
    public void getPlayerDetails(){
        System.out.println("Name is "+this.name);
        System.out.println("Contact Number is "+this.contactNo);
        System.out.println("Email Id is "+this.emailid);
        System.out.println("Age is "+this.age);
        System.out.println("Address is "+this.address);
       
    }
     public void setPlayerDetailsfromUserInput(Player p){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the player details");
        System.out.println("Enter the player name :");
        String name=scn.nextLine();
        System.out.println("Enter the player contact number: ");
        String contactNo=scn.nextLine();
        System.out.println("Enter the player Email id");
        String emailId=scn.nextLine();
        System.out.println("Enter the player age :");
        int age=scn.nextInt();
        scn.nextLine();
        System.out.println("Enter the player address :");
        String address=scn.nextLine();
        
        
        p.setPlayerDetails(name,emailId,contactNo,address,age);




    }




}
