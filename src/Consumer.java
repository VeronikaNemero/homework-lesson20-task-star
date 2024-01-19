public class Consumer implements Runnable {
    private final Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            shop.buy();
        }
    }
}