package factoryMethod.AbstractFactory;

import factoryMethod.AbstractFactory.MagicWord.MagicWorldFactory;

/**
 * @Author: xk
 * @Date: 2020/11/25 18:02
 * @Desc:
 */
public class Main {
    public static void main(String[] args) {
        AbastractFactory f=new MagicWorldFactory();
        Weapon weapon = f.createWeapon();
        weapon.shoot();
        Food food = f.creatFood();
        food.printName();

    }
}
