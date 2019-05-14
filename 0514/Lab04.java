public class Lab04 {
  public static void main(String[] args) {
    // 27. Can this be simplified: m / n * n + m % n
    int m = 4, n = 2; 
    System.out.println( m / n * n + m % n ); // 4 (actually m) 
    m = 1;
    n = 2; 
    System.out.println( m / n * n + m % n ); // 1  
    m = (int) (Math.random() * 100) - 50; // random number between -50 and 50
    n = (int) (Math.random() * 100) - 50; // random number between -50 and 50
    System.out.println( "For m " + m + " and n " + n + " the expression is: " + (m / n * n + m % n) ); 
    m = (int) (Math.random() * 100) - 50; // random number between -50 and 50
    n = (int) (Math.random() * 100) - 50; // random number between -50 and 50
    System.out.println( "For m " + m + " and n " + n + " the expression is: " + (m / n * n + m % n) ); 
    m = (int) (Math.random() * 100) - 50; // random number between -50 and 50
    n = (int) (Math.random() * 100) - 50; // random number between -50 and 50
    System.out.println( "For m " + m + " and n " + n + " the expression is: " + (m / n * n + m % n) ); 
    m = (int) (Math.random() * 100) - 50; // random number between -50 and 50
    n = (int) (Math.random() * 100) - 50; // random number between -50 and 50
    System.out.println( "For m " + m + " and n " + n + " the expression is: " + (m / n * n + m % n) ); 

  }
}