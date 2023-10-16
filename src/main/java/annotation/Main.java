package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ct = new AnnotationConfigApplicationContext(Config.class);
        Man man = ct.getBean(Man.class);
        man.print();
    }
}
