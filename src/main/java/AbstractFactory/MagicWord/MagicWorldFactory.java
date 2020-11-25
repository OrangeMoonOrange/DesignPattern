package AbstractFactory.MagicWord;

import AbstractFactory.AbastractFactory;
import AbstractFactory.Food;
import AbstractFactory.Weapon;

/**
 * @Author: xk
 * @Date: 2020/11/25 18:07
 * @Desc:
 */
public class MagicWorldFactory extends AbastractFactory {
    @Override
    public Food creatFood() {
        return new Mushroom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicWand();
    }
}
