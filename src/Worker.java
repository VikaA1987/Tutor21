public class Worker implements Runnable {

        public void run(){
    for (int i = 0;  i < 200; i++){
        Main.increseNumber();
    }
        }
    }

