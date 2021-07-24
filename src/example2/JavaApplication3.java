/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bao
 */
public class JavaApplication3 {

    
    public static void doSomething() throws Exception
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("e"+i);
            throw new Exception("abc");
        }
    }
    
    public static void main(String[] args) {
//        try {
//            doSomething();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        try{
            throw new Exception("1111 error");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println("22222");
        }
        finally{
            System.out.println("33333333");
        }
        
    }
}
