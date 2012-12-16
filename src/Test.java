 class Sup {
      <T> void say(T a) {
              System.out.println("1");
      }
     void say(String a) {
             System.out.println("2");
      }
  }
   
  public class Test extends Sup {
      public static void main(String[] args) { new Test().say(3); }
}