public class Example20{
         public static void main(String[] args) {
             ThreeTeacher tw=new ThreeTeacher();
                new Thread(tw,"��ʦ1").start();
                new Thread(tw,"��ʦ2").start();
                 new Thread(tw,"��ʦ3").start();
            }
}
class ThreeTeacher implements Runnable{
             private int notes=1;
             public void run(){
               while(true){
                 if(notes<=80){
                      Thread th=Thread.currentThread();
                       String th_name=th.getName();
                        System.out.println(th_name+"���ڷ���"+notes+++"ѧϰ�ʼ�");
                         }
                  }
           }
}