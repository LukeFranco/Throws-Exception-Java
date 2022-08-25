public class Calculator{
  
  public static void throwANumber(int throwMe)throws Exception{
    throw new Exception("I do not want this code" + throwMe + ",I do not want this code!");
  }
  
  public static void catchIt(int catchMe){
    try{
      throwANumber(catchMe);
    }catch(RuntimeException ex){
      System.out.println("This won't be seen");
    }catch(Exception e){
      System.out.println(e.getMessage());
    }finally{
      System.out.println("Finally");
    }
  }

  // Your code will go here

  public static void calculate(int x, int y) throws ArithmeticException{
    System.out.println(x/y);
  }
  public static void use(int x, int y){
    try{
      calculate(x, y);
    }catch(ArithmeticException ab){
      System.out.println("You cannot divide by zero!");
    }catch(Exception bc){
      System.out.println("Another One");
    }finally{
      System.out.println("Print this at all times");
    }
   }
  }
  
