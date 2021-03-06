package com.booksroo.classroom.system.admin.listener;

import com.booksroo.classroom.common.pojo.PropertyValue;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author liujianjian
 * @date 2018/6/21 12:27
 */
public class ApplicationLifeListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();

        try {
            WebApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
            PropertyValue propertyValue = (PropertyValue) ac.getBean("propertyValue");
            System.out.println("current env:" + propertyValue.getEnv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
