/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bao
 */
public class ViDu_Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ViDu_Exception a = new ViDu_Exception();
        
        
        try {
//                    DataCheck b = new DataCheck().new AgeCheck.getMessage();
//            boolean checkAge = (new DataCheck()).AgeCheck.checkAge(0);
            boolean checkAge = DataCheck.AgeCheck.checkAge(0);
        } catch (AgeException ex) {
            Logger.getLogger(ViDu_Exception.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        try {
            if(DataCheck.AgeCheck.checkAge(35))
            {
                System.out.println("tuoi cua ban hop le");
            }
        } catch (AgeException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
