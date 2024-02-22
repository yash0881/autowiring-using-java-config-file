package org.setter.dependency.injection.using.autowiring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddressObj(){
         Address ad = new Address();
         ad.setCity("Pune");
         ad.setHno(809);
         ad.setPincode(908765);
         return ad;
    }



    @Bean
    public Subjects  createSubjectsObj(){
        Subjects sub = new Subjects();
        List<String> sub_list= new ArrayList<>();
        sub_list.add("Java");
        sub_list.add("CPP");
        sub_list.add("DSA");
        sub_list.add("OOPS");

        sub.setSubjects(sub_list);
        return sub;
    }


    @Bean
    public Student createStudentObj(){
        Student st = new Student();
        st.setName("Yash");
        st.setRoll(200);
// manual dependency injection
//        st.setAddress(createAddressObj());


//        st.setSubjects(createSubjectsObj());
        return st;
    }

}
