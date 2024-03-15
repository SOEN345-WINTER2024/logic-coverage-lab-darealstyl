public class CheckIt {

   public static boolean checkIt(boolean a, boolean b, boolean c) {
      // Return the result of the predicate directly
      return a || (b && c);
   }

   public static void main(String[] argv) {
      // Driver method for checkIt
      boolean[] inArr = new boolean[argv.length];
      if (argv.length != 3) {
         System.out.println("Usage: java CheckIt v1 v2 v3");
         return;
      }

      for (int i = 0; i < argv.length; i++) {
         inArr[i] = Boolean.parseBoolean(argv[i]);
      }

      // Call checkIt and print the result
      System.out.println("P is " + (checkIt(inArr[0], inArr[1], inArr[2]) ? "true" : "isn't true"));
   }
}
