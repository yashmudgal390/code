import java.util.*;

public class OOPS {
   //  public static void main (String args[]){
   //      pen p1 = new pen();
   //      p1.setcolor("blue");
   //      System.out.println(p1. getcolor());

   //      p1.settip(5);
   //      System.out.println(p1.gettip());

   //  }
    public static void main(String[] args){
      // student s1 = new student();
      // s1.name= "yash";
      // s1.roll = 123;
      // s1.pass = "xyz";
      // s1.marks[0]=100;
      // s1.marks[1]= 90 ;
      // s1.marks[2]=80;

      // student s2 = new student(s1);
      // s2.pass = "abc";

      // s1.marks[2]=100;
      // for(int i =0 ; i<3 ; i++){

      //    System.out.println(s2.marks[i]);

      // }

      // fish shark = new fish();
      // shark.eat();


   // horse h = new horse();
   // h.eat();
   // h.walks();

   // chicken c = new chicken();
   // c.eat();
   // c.walks();


   // mustang m = new mustang();


   // queen q = new queen();
   // q.moves();

   // roook r = new roook();
   // r.moves();
   

   // bear b = new bear();
   // b.eat();
   // b.eats(); 



  
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c, d);
        Complex f = Complex.subtract(c, d);
        Complex g = Complex.multiply(c, d);

        e.printComplex();  // Output: 13+9i
        f.printComplex();  // Output: -5+1i
        g.printComplex();  // Output: 16+61i
  }
}


/*concept of getter and setters where getters are used for returning the value and steers are used to update value  */


// class pen{
//     private String color;
//     private int tip ;
//      String getcolor(){
//         return this.color;
//      }

//      int gettip(){
//         return this.tip;
//      }

//      void setcolor(String color){
//         this.color = color;
//      }
//      void settip(int tip){
//         this.tip= tip;
//      }
//     }



// concept of copy constructors 

// class student{
   // String name;
   // int roll;
   // String pass;
   // int marks[];
   
   
   // //shallow copy 
   // student(student s1){
   //    this.name =s1.name;
   //    this.roll=s1.roll;
   //    marks = new int[3];
   //    this.marks=s1.marks;
      
   // }
   //deep copy constructor
   // student(student s1 ){
   //    marks = new int[3];
   //    this.name = s1.name;
   //    this.roll = s1.roll;
   //    this.pass= s1.pass;
   //    for(int i = 0 ; i < marks.length;i++){
   //       this.marks[i] =s1.marks[i];
   //    }

   // }
   // student(){
   //    marks = new int[3];

   // }
// }



//concept of inhertance

// class animal {
//    String colour; 
//    void eat(){
//       System.out.println("eats");
//       }
//    void breath(){
//       System.out.println("breaths");
//    }   

// }

// // multilevel inheritance
// class fish extends animal{
//    int fins;
//    void swim(){
//       System.out.println("swimms");
//    }
// }

// class mammal extends animal {
//    void walk(){
//       System.out.println("walks");
//    }
// }

// class bird extends animal {
//    void fly(){
//       System.out.println("fly");
//    }
// }




// // ABSTRACTION

// // abstract class
// abstract class animal {
//    animal(){
//       System.out.println("animal constructor called");
//    }
//    void eat(){
//       System.out.println("animal eats");
//    }
//    abstract void walks ();
  
// }

// class horse extends animal{
//    horse(){
//       System.out.println("horse constructor called ");
//    }
//    void walks(){
//       System.out.println("walks on 4 legs");
//    }
// }

// class mustang extends horse{
//    mustang(){
//       System.out.println("mustang constructor called");
//    }
// }
// class chicken extends animal{
//    chicken (){
//       System.out.println("chicken constructor called ");
//    }
//    void walks(){
//       System.out.println("walks on 2 legs");
//    }
// }



// // INTERFACE
// interface chessPlayer {
//    void moves();
// }

// class queen implements chessPlayer{
//    public void moves(){
//       System.out.println("up,down,right,left,diagnoly(in all 4 direction)");
//    }
// }
// class roook implements chessPlayer{
//    public void moves(){
//       System.out.println("up,down,right,left");
//    }
// }


// interface herbivorus{
//    void eats();
// }

// interface carnivorus{
//    void eat();
// }

// class bear implements herbivorus, carnivorus{
//    public void eats(){
//       System.out.println("eats grass");
//    }
//    public void eat(){
//       System.out.println("also eats meat");
//    }
// }


/* Print the sum , difference and product of two complex numbers by creating a class named 'Complex'with separate methods for each operation whose real and imaginary parts
 are entered by the user*/ 


// Class to represent a Complex Number
class Complex {
    int real;
    int imag;

    // Constructor
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Add two complex numbers
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    // Subtract two complex numbers
    public static Complex subtract(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    // Multiply two complex numbers
    public static Complex multiply(Complex a, Complex b) {
        int realPart = a.real * b.real - a.imag * b.imag;
        int imagPart = a.real * b.imag + a.imag * b.real;
        return new Complex(realPart, imagPart);
    }

    // Print complex number in a + bi form
    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else if (imag < 0) {
            System.out.println(real + "" + imag + "i");  // Handles negative imaginary
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}