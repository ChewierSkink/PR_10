public class PR_10 extends Thread{
    @Override
    public void run() {
        System.out.println(getName());
    }

    public static void main(String[] args) {
        int i = 0;
        while (true){
            PR_10 thread = new PR_10();
            if (i % 2 == 0) {
                thread.setName("Ping");
            } else {
                thread.setName("Pong");
            }
            i++;
            thread.start();
        }
    }
}
