import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Сравнение бинов HelloWorld");
        System.out.println("Сылка на первый бин = " + bean1);
        System.out.println("Сылка на второй бин = " + bean2);
        System.out.println(bean1 == bean2);
        System.out.println();
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Сравнение бинов Cat");
        System.out.println("Сылка на первый бин = " + cat1);
        System.out.println("Сылка на второй бин = " + cat2);
        System.out.println(cat1 == cat2);
    }
}