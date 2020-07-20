package com.mxy.demo.mapper;

import com.mxy.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
//@Repository需要在Spring中配置扫描地址，然后生成Dao层的Bean才能被注入到Service层中，它可以用在任何类表示和数据库相关
//@Mapper不需要配置扫描地址，通过xml里面的namespace里面的接口地址，生成了Bean后注入到Service层中。
//@Component就是跟<bean>一样，可以托管到Spring容器进行管理。
public interface StudentMapper {
    //如果使用@Select就不需要xml注解了
   // @Select("select * from student where id =1")
    List<Student> selectAll();
}
