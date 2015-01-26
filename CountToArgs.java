public class CountDown {
   public static void main(String[] args) {
      try {
        int numArgs = Integer.parseInt(args[0]);
        if ( numArgs <= 0) {
             System.out.println("Inconceivable! Error!");
        }
            for (int i = numArgs; i > 0; i--) {
              System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Try Again! (with an integer)");
        } catch (NumberFormatException e2) {
              System.out.println("Error; must insert an integer.");
        } 
   }
}
