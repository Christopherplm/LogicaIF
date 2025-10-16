public class MyClass {
  public static void main(String args[]) {
    int x=7;
    int meio = (x/2);
    int offset = 0;
    
    for(int i = 0; i < x; i++){
        for(int j = 0; j < x; j++){
            if(i<=meio){
                if(j >= meio - offset && j <= meio + offset){
                    System.out.print("x");
                }else {
                    System.out.print(" ");
                }
            }else{
                if(j>= meio - offset && j<= meio + offset){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
        }if(i<meio){
            offset++;
        }else{
            offset--;}
         System.out.println();
    }
    
    
  }
}