public class Fraction {
    int numerator;
    int denominator;  
    public String toString() {
        return numerator + "/" + denominator;    
    }
    public Fraction add(Fraction b ) {
        return null; 
    }   
    public Fraction(int a, int b) {
        numerator = a;
        denominator = b;
    }
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 2); 
        Fraction  b = new Fraction(1, 3);
        Fraction result = a.add(b);
        System.out.println( a + " + " + b + " = " + result );
        System.out.println( b + " + " + a + " = " + b.add(a) );
        
    }
}