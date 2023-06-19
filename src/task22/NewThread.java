package task22;

public class NewThread extends java.lang.Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i ++){
            System.out.println("s");
        }
    }
}
