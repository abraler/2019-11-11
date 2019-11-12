public class Exercise3{
    private static  Object object=new Object();
    public static class A extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(1);
            }

            synchronized (object){
                try {
                    object.wait();
                    /*
                    1,释放object中的锁
                    2，把线程放到object对象中的等待集
                    3，把线程状态变为wating
                     */
                    /*
                    被唤醒后，
                    1，把A线程针中的等待集中取出
                    2，把A线程的状态变为RUNNABLE
                    3,尝试重新抢object
                     */
                    /*
                     1,wait 会是状态发生变化，RUNNABLE->WAITING
                                           WAITING->RUNNABLE



                     */

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i <10 ; i++) {
                System.out.println(1);
            }
        }
    }
    public static void main(String[] args) {
        Thread a=new A();
    }
}
