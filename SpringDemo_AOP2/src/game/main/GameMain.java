package game.main;

import game.interceptor.Interceptor;
import game.ProxyBeanFactory;
import game.pojo.Role;
import game.interceptor.RoleInterceptorImpl;
import game.service.RoleService;
import game.service.RoleServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameMain {
//    public static void main(String[] args) {
//        RoleService roleService = new RoleServiceImpl();
//        Interceptor interceptor = new RoleInterceptorImpl();
//        RoleService proxy = ProxyBeanFactory.getBean(roleService, interceptor);
///*      1.new方式
//        Role role = new Role(1, "role_name_1", "role_note_1");
//        2.xml配置装配Bean
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("Demo_Bean.xml");*/
////      3.注解方式装配Bean
//        AnnotationConfigApplicationContext context=
//                new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        Role role = context.getBean("role",Role.class);
//
//        proxy.printRole(role);
//        System.out.println("##########测试 afterThrowing 方法##########");
//        role = null;
//        proxy.printRole(role);
//    }
    @Test
    public void testGame() {
        RoleService roleService = new RoleServiceImpl();
        Interceptor interceptor = new RoleInterceptorImpl();
        RoleService proxy = ProxyBeanFactory.getBean(roleService, interceptor);
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Role role = context.getBean("role",Role.class);

        proxy.printRole(role);
        System.out.println("##########测试 afterThrowing 方法##########");
        role = null;
        proxy.printRole(role);

    }
}
