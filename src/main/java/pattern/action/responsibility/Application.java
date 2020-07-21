package pattern.action.responsibility;


/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        FilterChain chain = new FilterChain();
        chain.addFilter(new FirstLetterFilter()).addFilter(new SecondLetterFilter());
        Request request = new Request();
        Response response = new Response();
        response.setOutput("处理后结果");
        request.setInput("处理前输入");
        chain.doFilter(request, response, chain);
        System.out.println(request.getInput());
        System.out.println(response.getOutput());
    }
}
