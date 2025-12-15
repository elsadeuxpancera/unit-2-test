public class KillCilantro {
   public static String killCilantro(String food) {
      String newFood = "";
      for(int i = 0; i < food.length(); i ++) {
         if(i + 8 <= food.length() && food.substring(i, i+8).equals("cilantro")) {           
           newFood += "parsley";
           i += 7;
         } else {
            newFood += food.charAt(i);
         }
      }
      return newFood;
   
   }
   public static void main(String[] args) {
      System.out.println(killCilantro("I dont like cilantro"));
   }
  
}