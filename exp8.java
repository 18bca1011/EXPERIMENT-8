import java.util.Scanner; 
public class exp8
    { 
      
      static int a;
      static int b;
      static int c;
      static final String adc = "226.90"; 

      static Scanner sc = new Scanner(System.in);
          
   public static void setdata()
                  {
      System.out.println("enter the two numbers");
                
                  a = sc.nextInt();
                  b = sc.nextInt();
              
                  }

        public static void showResult()
        
           {
                 try
                  {
                    c = a/b;
             System.out.println(c);                        
                  }
                 
         
            catch(ArithmeticException e) 
               { 
            System.out.println("does not divide by zero" +e); 
               }
                 try
                    {
           int a = Integer.parseInt(adc);
                    } 

            catch(NumberFormatException e)
 
               { 
            
            System.out.println("NumberFormateException" +e); 
               } 
   
            }
 
     
      
 public static void main(String[] args)
     {
  setdata();
 showResult();
      }
}