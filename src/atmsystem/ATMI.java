/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.util.ArrayList;

/**
 *
 * @author Rawan
 */
public interface ATMI {
    Account getCustomerInfo(int accountNumber);
    ArrayList<String> getCustomerTransaction(int accountNumer);
    boolean creatNewCustomer(Account customer);
    
}
