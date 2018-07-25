package pastx.guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pastx.guru.springframework.didemo.controllers.ConstructorInjectedController;
import pastx.guru.springframework.didemo.controllers.MyController;
import pastx.guru.springframework.didemo.controllers.PropertyInjectedController;
import pastx.guru.springframework.didemo.controllers.GetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
