package iterator.kai;

/**
 * @Author: xk
 * @Date: 2021/2/16 12:21 上午
 * @Desc:
 */
public class ArrayList_ implements Collection_ {
    private int size = 0;
    private Object[] o = new Object[10];


    @Override
    public void add(Object o1) {
        if (size == o.length) {
            Object[] newa = new Object[o.length * 2];
            System.arraycopy(o, 0, newa ,0, o.length);
            o = newa;
        }
        o[size] = o1;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return new arrayListIterator();
    }

    private class arrayListIterator implements Iterator_ {
        private int currIndex = 0;

        public Object next() {
            Object res = o[currIndex];
            currIndex++;
            return res;

        }

        public boolean hashNext() {
            if (currIndex >= size) {
                return false;
            }
            return true;
        }

    }
}
