/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

/**
 *
 * @author Rawan
 */
public class ATMsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TransactoinHistory t = new TransactoinHistory();
        Admin rawan = new Admin("rawan","rawan" ,1 , "123");
        Account reem = new Account("reem","reem",1,"123");
        Account shahd = new Account("shahd","shahd",2,"123");
        t.creatNewAdmin(rawan);
        t.creatNewCustomer(shahd);
        t.creatNewCustomer(reem);
//        for (Account a : t.users){
//            a.printInfo();
//        }
        t.loginToSystem();
        
    }
    
}
