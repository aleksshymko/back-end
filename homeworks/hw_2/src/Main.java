public class Main {
    public static void main(String[] args) throws InterruptedException {

//        System.out.println("---main is start");
//        System.out.flush();

        Thread numberDiv2 = new Thread(() -> {
            int i = 0;
            while (true) {
                if (i % 2 == 0) {
                    System.out.println(i + " делится на " + 2);
                }
                i++;
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        });

        Thread numberDiv3 = new Thread(() -> {
            int i = 0;
            while (true) {
                if (i % 3 == 0) {
                    System.out.println(i + " делится на " + 3);
                }
                i++;
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        });

        numberDiv2.setDaemon(true);
        numberDiv2.start();

        numberDiv3.setDaemon(true);
        numberDiv3.start();

        Thread.sleep(3000);

//        System.out.println("---main is finish");
//        System.out.flush();
    }
}