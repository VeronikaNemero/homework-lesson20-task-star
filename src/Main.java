public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();
        Fabricator fabricator = new Fabricator(shop);
        Consumer consumer = new Consumer(shop);

        Thread fabricatorT = new Thread(fabricator);
        Thread consumerT = new Thread(consumer);

        fabricatorT.start();
        consumerT.start();
    }
}
