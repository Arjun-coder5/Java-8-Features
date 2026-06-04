public class Lambda_Expression_Example_2 {
  interface MathOpr{
    int add(int a,int b);
  }
  public static void main(String[] args) {
     MathOpr adding = (a,b)->{
         System.out.println("Result :");
         return a+b;
     };
    int Result =    adding.add(10, 20);
     System.out.println("Returned Result : "+ Result);
  }
}
