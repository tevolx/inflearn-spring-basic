package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("Test")
    void findAllBean() {
        String[] beanDefNames = ac.getBeanDefinitionNames();
        for (String beanDefName : beanDefNames) {
            Object bean = ac.getBean(beanDefName);
            System.out.println("bean = " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean() {
        String[] beanDefNames = ac.getBeanDefinitionNames();
        for (String beanDefName : beanDefNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefName);


            //ROLE_APPLICATION : 직접 등록한 어플리케이션 빈
            //ROLE_INFRASTRUCTURE: 스프링이 내부에서 사용하는 빈
            if(beanDefinition.getRole() == BeanDefinition.ROLE_INFRASTRUCTURE) {
                Object bean = ac.getBean(beanDefName);
                System.out.println("bean = " + bean);
            }
        }
    }
}
