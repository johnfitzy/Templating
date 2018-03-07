package components;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MyStupidComponentBean {

    private String message;

    @PostConstruct
    private void init() {
        this.message = "-----> This is a silly message created by MyStupidComponentBean - Blah!";
    }

    public String getMessage() {
        return message;
    }
}
