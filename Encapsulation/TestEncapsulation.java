package Encapsulation;



public class TestEncapsulation {  
public static void main(String[] args) {  
    //creating instance of Account class  
    Account acc=new Account();  
    //setting values through setter methods  
    acc.setAcc_no(7560504000L);  
    acc.setName("Sonoo Jaiswal");  
    acc.setEmail("sonoojaiswal@javatpoint.com");  
    acc.setAmount(500000f);  
    //getting values through getter methods  
    System.out.println("account No:"+acc.getAcc_no()+" Name: "+acc.getName()+" Email ID:  "+acc.getEmail()+" Amount: "+acc.getAmount());  
}  
} 