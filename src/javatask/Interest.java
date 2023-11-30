/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatask;

/**
 *
 * @author Yassmin
 */
public class Interest implements Calculation
{
    Customer c;
    final double percentage=0.05;

    public Interest(Customer c) {
        this.c = c;
    }
    
    @Override
    public void interest_calc() 
    {
      c.setAccountBalance(c.getAccountBalance()- (c.getAccountBalance()*percentage));
    }
    
}
