package action.responsibility;

public class SecondLetterFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("处理输入2");
        request.setInput(request.getInput().replace("输入","写入"));
        System.out.println("处理输出2");
    }
}
