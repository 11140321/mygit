public class Taxi{
         public static void main(String[] args) {
             FiveTaxi ft=new FiveTaxi();
                new Thread(ft,"���⳵1").start();
                new Thread(ft,"���⳵2").start();
                 new Thread(ft,"���⳵3").start();
                 new Thread(ft,"���⳵4").start();
                new Thread(ft,"���⳵5").start();
            }
}
class FiveTaxi implements Runnable{
             private int chengke=100;
             public void run(){
               while(true){
                 if(chengke>0){
                      Thread th=Thread.currentThread();
                       String th_name=th.getName();
                        System.out.println(th_name+"�����͵�"+chengke--+"λ�˿�");
                         }
                  }
           }
}