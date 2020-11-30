package com.wxx.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
 * @ConfigurationProperties 作用：
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 * 参数 prefix = "person" : 将配置文件中的person下面的属性一一对应
 *
 * 只有这个组件(这里是指Person)是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 */

/*
 * 也可以不适用yaml注入，可以使用properties注入值
 * @PropertySource(value = "classpath:wxx.properties")
 * 前提要在resources文件中新建wxx.properties这个文件
 *
 * 之后在属性上标注：@Value("$(name)")  取出 wxx.properties 中的name属性给属性赋值
 * $(name)：SPEL表达式
 *
 * 这种方式不推荐使用，因为需要给每个属性单独注解赋值，比较麻烦
 */
@Component  // 注册bean
@ConfigurationProperties(prefix = "person")
@Validated  // JSR303校验
public class Person {

    @NotNull(message = "名字不能为空")  // JSR303校验
    private String name;
    @Max(value = 120, message = "年龄不能超过120岁")
    private Integer age;

    private Boolean happy;
    private Date birth;
    private Map<String, Object> map;
    private List<Object> books;
    private Dog dog;

    public Person() {
    }

    public Person(String name, Integer age, Boolean happy, Date birth, Map<String, Object> map, List<Object> books, Dog dog) {
        this.name = name;
        this.age = age;
        this.happy = happy;
        this.birth = birth;
        this.map = map;
        this.books = books;
        this.dog = dog;
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

    public Boolean getHappy() {
        return happy;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getBooks() {
        return books;
    }

    public void setBooks(List<Object> books) {
        this.books = books;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", happy=" + happy +
                ", birth=" + birth +
                ", map=" + map +
                ", books=" + books +
                ", dog=" + dog +
                '}';
    }
}
