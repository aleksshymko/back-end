public class MyThread extends Thread{
    private String name;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from " + name + "" + i);
        }
    }

    public MyThread(String name) {
        this.name = name;
    }
}
