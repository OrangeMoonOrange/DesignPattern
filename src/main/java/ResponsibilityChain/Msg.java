package ResponsibilityChain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xk
 * @Date: 2020/11/26 13:16
 * @Desc: 责任链模式
 */
public class Msg {

    public static void main(String[] args) {


        Msg msg = new Msg();
        msg.setMsg("测试信息！！！！！！！！！");

        FilterChain filterChain = new FilterChain();
        URLChain urlChain = new URLChain();

        filterChain.add(new HTMLFilter()).add(new someFilter());

        urlChain.add(new twoFilter());
        filterChain.add(urlChain);//多个责任链添加到一起

        filterChain.doFilter(msg);//执行filter


    }

    String name;
    String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }


}

interface Filter {
    boolean doFilter(Msg msg);
}

class HTMLFilter implements Filter {

    public boolean doFilter(Msg msg) {
        System.out.println("this is HTMLFilter" + msg);
        return true;
    }
}

class someFilter implements Filter {
    public boolean doFilter(Msg msg) {
        System.out.println("this is someFilter" + msg);
        return false;
    }
}

class twoFilter implements Filter {
    public boolean doFilter(Msg msg) {
        System.out.println("this is twoFilter" + msg);
        return true;
    }
}

// FilterChain
class FilterChain implements Filter {
    List<Filter> filterList = new ArrayList<Filter>();

    public FilterChain add(Filter f) {
        filterList.add(f);
        return this;
    }

    public boolean doFilter(Msg msg) {
        for (Filter filter : filterList) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}

//多个责任链
class URLChain implements Filter {
    List<Filter> filterList = new ArrayList<Filter>();

    public URLChain add(Filter f) {
        filterList.add(f);
        return this;
    }

    public boolean doFilter(Msg msg) {
        for (Filter filter : filterList) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
