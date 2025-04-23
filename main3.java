     
    public class main3
    {    
        public static void main(String[] args) 
        {    
	int a[]=new int[5];
            try 
            {    
                 	a[4]=20;   
                      
                System.out.println( "inserted");
            } 
            catch (ArrayIndexOutOfBoundsException e)
             {    
                System.out.println("Error: Index is out of bounds.");    
                   
            }    
        }    
    }   
