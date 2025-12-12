public class KillCilantro {
   public static String killCilantro(String food) {
      String newFood = "";
      for(int i = 0; i < food.length(); i ++) {
         if(food.contains("cilantro")) {
            
           
           newFood += "parsley";
         }
      }
      return newFood;
   
   }
   public static void main(String[] args) {
      System.out.println(killCilantro("cilantro is good"));
   }
  
}