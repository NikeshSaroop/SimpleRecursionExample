/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikesh
 */
public class recursion 
{
    
   public static void recursion(int num)
   {
     if(num!=0)
     {
     System.out.println(num);
     num--;
     recursion(num);  
     }
     else
     {
     System.out.println("stop");  
     }
   }
   
   
    
    public static void main(String[] args)
    {
      recursion(5);
        
    }
}
