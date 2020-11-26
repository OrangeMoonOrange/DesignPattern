package ResponsibilityChain.ServletFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xk
 * @Date: 2020/11/26 13:16
 * @Desc:
 *  模仿
 *     javax.servlet.Filter
 *     javax.servlet.FilterChain
 *     完成对Request，Response 的过滤 ，Request 的顺序为 Request1、Request2、Request3 。
 *     对Response的过滤顺序是Response3、Response2、Response1
 */
public class ServletMain {

    public static void main(String[] args) {

    }


}

class Request {
    String msg;
}

class Response {
    String msg;
}

interface Filter {
    boolean doFilter(Request request, Response response);
}

class HTMLFilter implements Filter {

    public boolean doFilter(Request request, Response response) {

        return true;
    }
}

class someFilter implements Filter {
    public boolean doFilter(Request request, Response response) {

        return false;
    }
}



// FilterChain
class FilterChain implements Filter {
    List<Filter> filterList = new ArrayList<Filter>();

    public FilterChain add(Filter f) {
        filterList.add(f);
        return this;
    }

    public boolean doFilter(Request request, Response response) {
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

    public boolean doFilter(Request request, Response response) {
        return true;
    }
}
