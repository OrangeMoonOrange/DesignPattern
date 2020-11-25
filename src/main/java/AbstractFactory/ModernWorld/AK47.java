package AbstractFactory.ModernWorld;

import AbstractFactory.Weapon;

/**
 * @Author: xk
 * @Date: 2020/11/25 18:00
 * @Desc:
 */
public class AK47 extends Weapon {
    @Override
    public void shoot() {
        System.out.println("现代人用AK47!");
    }
}
