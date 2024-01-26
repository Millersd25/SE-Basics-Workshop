public class FizzBuzz
   {
   public static void main(String[] args)
      {
      for(int i = 0; i < 20; i++)
         {
         boolean hasPrint = false;
	      if(i % 3 == 0)
            {
	         System.out.print("Fizz");
            hasPrint = true;
            }
         if(i % 5 == 0)
            {
	         System.out.print("Buzz");
            hasPrint = true;
            }  
         if(hasPrint)
            {
	         System.out.println();
            }
         }
      }
   }
