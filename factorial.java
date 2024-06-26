import java.lang.*;

public class factorial {
  
  static int interative(int n){
    if (n == 1)
      return 1;

    int value=1;

    for (int i = n; i>0; i--) {
      value*=i;   
    }
    return value; 
  }

  static int recursive(int n){
    if (n==1)
      return 1;
    return n * recursive(n-1);
  }



  public static void main(String[] args) {
    int value = Integer.parseInt(args[0]);


    long startTime = System.nanoTime();
    System.out.println(interative(value));
    long endTime = System.nanoTime();
    long totalTime = endTime-startTime; 
    System.out.println("interative time: " +totalTime);


    startTime=System.nanoTime();
    System.out.println(recursive(value));
    endTime=System.nanoTime();
    totalTime=endTime-startTime;
    System.out.println("recursive time: " +totalTime);
  }
}
