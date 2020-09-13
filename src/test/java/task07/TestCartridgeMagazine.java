package task07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCartridgeMagazine {

    @Test
    void shouldSingleBulletBeLoadedIfMagazineIsEmpty() {
        //Given
        CartridgeMagazine cartridgeMagazine = new CartridgeMagazine(3);

        //When

        boolean result = cartridgeMagazine.loadBullet("Bullet");

        //then

        Assertions.assertTrue(result);






    }
}
