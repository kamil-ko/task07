package task07;

import java.util.ArrayList;
import java.util.List;

public class CartridgeMagazine {

    private final List<String> cartridgeMagazine = new ArrayList<>();
    private final Integer maxSize;

    public CartridgeMagazine(Integer maxSize) {
        this.maxSize = maxSize;
    }


    public boolean loadBullet(String bullet) {

        if (cartridgeMagazine.size() < maxSize) {
            cartridgeMagazine.add(bullet);
            System.out.println("Załadowano kulę");

        } else {
            System.out.println("magazynek jest pełny");
            return false;
        }
        return true;
    }

    private void shot() {
        if (cartridgeMagazine.isEmpty()) {
            System.out.println("magazynej jest pusty");
        } else {
            System.out.println("Bang!");
            cartridgeMagazine.remove(0);

            System.out.println("Pozostało " + cartridgeMagazine.size()+ " kul");
        }
    }

    private boolean isLoaded() {
        return !cartridgeMagazine.isEmpty();

    }

    public static void main(String[] args) {
        CartridgeMagazine cartridgeMagazine = new CartridgeMagazine(3);

        System.out.println(cartridgeMagazine.maxSize);
        cartridgeMagazine.loadBullet("Bullet");
        cartridgeMagazine.loadBullet("Bullet");
        cartridgeMagazine.loadBullet("Bullet");
        cartridgeMagazine.loadBullet("Bullet");



        System.out.println(cartridgeMagazine.isLoaded());
        cartridgeMagazine.shot();
        cartridgeMagazine.shot();
        cartridgeMagazine.shot();
        cartridgeMagazine.shot();







    }

}
