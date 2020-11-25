package AbstractFactory.MagicWord;

import AbstractFactory.Weapon;

/**
 * @Author: xk
 * @Date: 2020/11/25 18:06
 * @Desc:
 */
public class MagicWand extends Weapon {
    @Override
    public void shoot() {
        System.out.println("魔法世界的人用魔法杖！");
    }
}
