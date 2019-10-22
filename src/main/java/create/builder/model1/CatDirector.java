package create.builder.model1;

/**
 * Created by byang059 on 2018/11/26.
 */
public class CatDirector {

    private final CatBuilder catBuilder;

    public CatDirector(CatBuilder catBuilder) {
        this.catBuilder = catBuilder;
    }

    public Cat buildCat() {
        catBuilder.buildAge();
        catBuilder.buildColor();
        catBuilder.buildName();
        return catBuilder.build();
    }

}
