/**
 * Created by Murat on 15.04.2017.
 */
public class Challenge1 {
 public static void main(String [ ] args){

  int son;

  for(int b =1; b<=9; b++) {
      for (int a = 1; a <= 9; a++) {
          son = a * b;
          System.out.println(b + " x " + a + " = " + son);
      }
  }

 }
}
