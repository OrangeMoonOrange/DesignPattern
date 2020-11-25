package AbstractFactory.MagicWord;

import AbstractFactory.Food;

/**
 * @Author: xk
 * @Date: 2020/11/25 18:05
 * @Desc:
 */
public class Mushroom extends Food {

    @Override
    public void printName() {
        System.out.println("魔法世界生产蘑菇！");
    }
}
