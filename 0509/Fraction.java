public class Fraction {
    int numerator;
    int denominator;  
    public String toString() {
        return this.numerator + "/" + this.denominator;    
    }
    public Fraction add(Fraction other) {
        Fraction result = null; 
        int n = this.numerator * other.denominator + this.denominator * other.numerator;
        int d = this.denominator * other.denominator;
        result = new Fraction(n, d); 
        return result;
    }   
    public Fraction(int numerator, int denominator) { // constructor
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 2); 
        Fraction b = new Fraction(1, 2);
        Fraction result = a.add(b);
        System.out.println( a + " + " + b + " = " + result );
        System.out.println( b + " + " + a + " = " + b.add(a) );
        
    }
}