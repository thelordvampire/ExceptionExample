/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author Bao
 */
public class DataCheck {
    
    public static boolean checkNotNull(Object object)
    {
        if(object==null)
            throw new NullPointerException("null");
        
        return true;
    }
    
    public class NameCheck
    {
        public void getMessage()
        {
        
        }
    }
    
    public static class AgeCheck
    {
        static int minAge = 18;
        static int maxAge = 40;
        
        public static boolean checkAge(int age) throws AgeException
        {
            if(age<minAge)
                throw  new AgeException("Duoi 18 tuoi");
            else if(age>maxAge)
                throw  new AgeException("Tren 40 tuoi");
            
            return true;
        }
    }
    
}
