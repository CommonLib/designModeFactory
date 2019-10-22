package action.responsibility;

import java.util.ArrayList;

/**
 * Created by byang059 on 2019-01-23
 */
public class FilterChain implements Filter {
    ArrayList<Filter> filters;
    int pos;

    public FilterChain() {
        filters = new ArrayList<>();
    }

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (pos >= filters.size()) {
            throw new IndexOutOfBoundsException();
        }
        Filter filter = filters.get(pos);
        pos++;
        filter.doFilter(request, response, this);
    }

    public void release() {
        pos = 0;
    }
}
