package com.example.springaop.start;

import com.example.springaop.start.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liurongqi
 * @since 2021/09/24
 */
public class ContainerDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:application-friday.xml"}, true);
        System.out.println("context 启动成功");
        MessageService messageService = context.getBean(MessageService.class);
        System.out.println(messageService.getMessage());
    }
}
