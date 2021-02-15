package iterator.kai;

/**
 * @Author: xk
 * @Date: 2021/2/16 12:19 上午
 * @Desc: 容器的接口
 */
public interface Collection_ {
    Iterator_ iterator();
    void add(Object o);
    int size();


}
