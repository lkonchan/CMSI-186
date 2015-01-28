public class ChangeMaker {
       public static void main(String[] args) {
          try {
          int numArgs = Integer.parseInt(args[0]);
             if (numArgs < 0) {
                  System.out.println("Cannot make change for negative amount.");
             }
          } catch (ArrayIndexOutOfBoundsException e) {
                  System.out.println("Given value is not an integer.");
          }
       }
  public static int getQuarters(int cents) {
      int quarters = (cents/25);
      return(quarters);
  }
  public static int getDimes(int cents) {
   //this is a stub
   return 0;
  }
  public static int getNickels(int cents) {
   //this is a stub
   return 0;
  }
  public static int getPennies(int cents) {
   //this is a stub
   return 0;
  }
  public static int[] getChange(int cents) {
   //this is a stub
   return null;
  }
}

//understanding exceptions (null) (IOException)
//how to command it to ignore an arg
//how to use each separate commit as a working team
