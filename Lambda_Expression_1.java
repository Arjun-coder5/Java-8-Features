// This is simple java way : 
public class Lambda_Expression_1{
   interface Greeting {
        void sayHello(); 
    }

  public static void main(String[] args) {
    Greeting message = ()->{System.out.println("Hello Bhai");

    };
      message.sayHello();
  };
 
}

// This is Lambda Expression: 
