package AbstractFactory.ModernWorld;

import AbstractFactory.Food;

/**
 * @Author: xk
 * @Date: 2020/11/25 17:59
 * @Desc:
 */
public class Bread extends Food {
    @Override
    public void printName() {
        System.out.println("现代人产生面包");
    }
}
