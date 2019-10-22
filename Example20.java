public class Example20{
         public static void main(String[] args) {
             ThreeTeacher tw=new ThreeTeacher();
                new Thread(tw,"老师1").start();
                new Thread(tw,"老师2").start();
                 new Thread(tw,"老师3").start();
            }
}
class ThreeTeacher implements Runnable{
             private int notes=1;
             public void run(){
               while(true){
                 if(notes<=80){
                      Thread th=Thread.currentThread();
                       String th_name=th.getName();
                        System.out.println(th_name+"正在发第"+notes+++"学习笔记");
                         }
                  }
           }
}