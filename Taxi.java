public class Taxi{
         public static void main(String[] args) {
             FiveTaxi ft=new FiveTaxi();
                new Thread(ft,"出租车1").start();
                new Thread(ft,"出租车2").start();
                 new Thread(ft,"出租车3").start();
                 new Thread(ft,"出租车4").start();
                new Thread(ft,"出租车5").start();
            }
}
class FiveTaxi implements Runnable{
             private int chengke=100;
             public void run(){
               while(true){
                 if(chengke>0){
                      Thread th=Thread.currentThread();
                       String th_name=th.getName();
                        System.out.println(th_name+"正在送第"+chengke--+"位乘客");
                         }
                  }
           }
}