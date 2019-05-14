Lab 04 Adrian German dgerman@indiana.edu

1. Simplify b == false 
Answer: !b 
Proof:
         b     b == false    f(b) = ?     !b
     ----------------------------------------------
        true    false         false      false   
        false   true          true       true 

public class Lab04 {
  public static void main(String[] args) {
    boolean b = true; 
    System.out.println( ! b == (b == false) ); // should print true 
    b = false; 
    System.out.println( ! b == (b == false) ); // should print true 
  }
}

7. Simplify  P(n) = n < 3 || n > 5 
Answer: n != 3 && n != 4 && n != 5 equivalent (because n is an integer) 

  n            3           5    
----------------------------------------------
P(n) T T T T T F F F F F F F T T T T T T T 

(not (<= 3 n 5)) in Scheme 

not (3 <= n <= 5) in Python 

(n-3) * (n-4) * (n-5) != 0 also equivalent but not simpler 

n not in  {3, 4, 5} math 

8. Simplify n < 3 && n > 5 
Answer: false 

27. 

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
















  