import java.util.Random;

public class Hasard
{
  public static void main( String args[] )
  {
  
   int tabResultat[]; 
   tabResultat = new int[12]; 
   Random r = new Random();
  
   try
   {
    
     
     for( int i = 0; i < Integer.parseInt( args[ 0 ] ); i++)
      {       
          tabResultat[r.nextInt( 6 ) + r.nextInt( 6 )]++;             
      }       
         System.out.println( "valeur" + " :"+ " Nombre d'occurences" );
         System.out.println( "-------" + ":"+ "-------------------" );
         
       for( int i = 0; i < 11; i++)
      {  
          System.out.print("    " +( i + 2) + " " + ":" ); 
         
          for( int y = 0 ; y < tabResultat[i]/6 ; y++)
          {
           System.out.print( "#" );      
          }
           System.out.println(tabResultat[i]);
      }
    
   }
  catch( NumberFormatException e ) 
   {
        System.out.println("Valeur invalide");
   }
  
   
   
   
   
   
   
   
   
   
   
   
  }

}