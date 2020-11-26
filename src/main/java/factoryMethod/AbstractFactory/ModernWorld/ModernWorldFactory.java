package factoryMethod.AbstractFactory.ModernWorld;

import factoryMethod.AbstractFactory.AbastractFactory;
import factoryMethod.AbstractFactory.Food;
import factoryMethod.AbstractFactory.Weapon;

/**
 * @Author: xk
 * @Date: 2020/11/25 17:58
 * @Desc:
 */
public class ModernWorldFactory extends AbastractFactory {
    @Override
    public Food creatFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}
