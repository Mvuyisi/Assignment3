package za.ac.cput.student.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.student.StudentClass;
import za.ac.cput.student.StudentInterface;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {
    @Bean(name = "studentD")
    public StudentInterface getSudentN() { return new StudentClass();}
}
