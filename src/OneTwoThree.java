public class OneTwoThree {


    private static class Foo {
        private static int n;
        public void one()throws InterruptedException {
            if(n!=0){
                synchronized (this){
                    wait();
                }
                return;
            }
            System.out.println("one");
            n=1;
        }

        public void two()throws InterruptedException {
            if(n!=1){
                synchronized (this){
                    wait();
                }
                return;
            }
            System.out.println("two");
            n=2;
        }

        public void three()throws InterruptedException {
            if(n!=2){
                synchronized (this){
                    wait();
                }

            }
            System.out.println("three");
            n=0;
        }
    }

    private static Foo foo = new Foo();

    private static class OneThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    foo.one();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class TwoThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    foo.two();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class ThreeThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    foo.three();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread one = new OneThread();
        Thread two = new TwoThread();
        Thread three = new ThreeThread();
        one.start();
        two.start();
        three.start();

    }
}
