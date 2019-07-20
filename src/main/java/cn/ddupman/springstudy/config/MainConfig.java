
package cn.ddupman.springstudy.config;

import cn.ddupman.springstudy.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = {"cn.ddupman.springstudy"},includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class, Repository.class, Service.class})},
        useDefaultFilters = false
        )
public class MainConfig {

    @Bean(initMethod = "init",destroyMethod = "destory")
    @Scope("prototype")
    public Person perso3333n() {
        return new Person("李四", 12);
    }


//    @Bean
//    public MyInstantiationAwareBeanPostProcessor MyInstantiationAwareBeanPostProcessor(){
//     return   new MyInstantiationAwareBeanPostProcessor();
//    }
}

