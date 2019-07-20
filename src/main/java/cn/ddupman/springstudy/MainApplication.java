package cn.ddupman.springstudy;

import cn.ddupman.springstudy.bean.BeanDefinition;
import cn.ddupman.springstudy.bean.Person;
import cn.ddupman.springstudy.bean.XmlBeanDefinitionReader;
import cn.ddupman.springstudy.factory.AutowireBeanFactory;
import cn.ddupman.springstudy.factory.BeanFactory;
import cn.ddupman.springstudy.io.ResourceLoader;

import java.io.File;
import java.util.Map;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.readerXML("bean.xml");
        BeanFactory beanFactory = new AutowireBeanFactory();
        BeanFactory beanfactory = new AutowireBeanFactory();
        // 循环xml中的所有bean
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            // 将XML容器中的bean注册到bean工厂
            beanfactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
        Person person = (Person) beanFactory.getBean("person");
        person.work();
    }
}
