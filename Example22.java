 public class Example22 {
        private static int b=100;
            public static void main (String[] args) {

               Mythread mythread = new Mythread() ;

              Thread thread = new Thread (mythread) ;
               thread.start () ;
              while (true) { 
               if(b>0) {
              System. out. println ("main") ;
                          b--;
                             }
                     } 
                 }
}
class Mythread implements Runnable{
                 private  int a=50;
                     public void run(){
                            while(a>0){
                                        System.out.println("new");
                                                     a--;
                   }
              }
}