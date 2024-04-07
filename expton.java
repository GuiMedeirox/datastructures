import java.lang.*; 
public class expton{

  static int iterative(int n, int e){
    if(e == 1 || e == 0)
      return n; 
    
    int i =1; 
    int aux = n; 
    while(i != e){
      i++; 
      n = n * aux;  
    };

    return n; 
  }
  
  static int recursive(int n, int e){
    if(e==0)
      return 1;

    return n * recursive(n,e-1);
  }

  public static void main(String[] args) {
    long startTime=System.nanoTime();
    System.out.println(iterative( Integer.parseInt(args[0]), Integer.parseInt(args[1]) ));
    long endTime=System.nanoTime(); 
    System.out.println("iterative: " +(endTime-startTime));

    startTime=System.nanoTime();
    System.out.println(recursive ( Integer.parseInt(args[0]), Integer.parseInt(args[1]) ));
    endTime=System.nanoTime();
    System.out.println("recursive: " +(endTime-startTime));
  }
}
