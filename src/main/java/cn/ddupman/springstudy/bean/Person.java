package cn.ddupman.springstudy.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware,BeanFactoryAware {
    private String name;
    private Integer age;

    public void init(){
        System.out.println("person init");
    }

    public void destory(){
        System.out.println(this+"-->person destory");
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void work() {
        System.out.println("I am a Big Person,I can do everything!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'+super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("person setBeanName-->"+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("person beanFactory-->"+beanFactory);
    }
}
