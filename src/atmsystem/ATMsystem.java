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
        Admin rawan = new Admin("rawan","alhrbi" ,1 , "123");
        Account thekra = new Account("thekra","alatwi",1,"123");
        Account fay = new Account("fay","albliw",2,"123");
        t.creatNewAdmin(rawan);
        t.creatNewCustomer(thekra);
        t.creatNewCustomer(fay);
//        for (Account a : t.users){
//            a.printInfo();
//        }
        t.loginToSystem();
        
    }
    
}
