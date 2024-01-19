public class Shop {
    private int item = 0;

    public synchronized void add() {
        while (item >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item++;
        System.out.println("Items have arrived. Now items in the shop: " + item);
        notify();
    }

    public synchronized void buy() {
        while (item == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item--;
        System.out.println("Items purchased. Now items in the shop: " + item);
        notify();
    }
}
