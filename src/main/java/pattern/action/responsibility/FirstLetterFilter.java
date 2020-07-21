package pattern.action.responsibility;

public class FirstLetterFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("处理输入1");
        filterChain.doFilter(request, response, filterChain);
        System.out.println("处理输出1");
    }
}
