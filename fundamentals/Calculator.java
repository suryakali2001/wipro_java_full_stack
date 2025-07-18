import java.util.*;
class Calculator{
    void powerInt(inta, intb){ 
      System.out.println(Math.pow(a,b)); 
    }
    void powerDouble(double c,double d){
        System.out.println(Math.pow(c,d));
    }
    public static void main(String [] args){
        Calculator b=new Calculator();
        b.powerInt(4,2);
        b.powerDouble(4,2);
   }
}
