package action.responsibility;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
