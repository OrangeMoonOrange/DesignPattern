package factoryMethod.AbstractFactory;

/**
 * @Author: xk
 * @Date: 2020/11/25 17:54
 * @Desc: 抽象工厂
 * <p>
 * 适用于一族 产品的更新
 */
public abstract class AbastractFactory {
    public abstract Food creatFood();

    public abstract Weapon createWeapon();
}
