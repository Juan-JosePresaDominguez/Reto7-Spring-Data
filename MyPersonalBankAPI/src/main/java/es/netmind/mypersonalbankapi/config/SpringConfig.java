package es.netmind.mypersonalbankapi.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// #Reto6-Spring-JPA
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"es.netmind.mypersonalbankapi.persistencia", "es.netmind.mypersonalbankapi.controladores"})
@EntityScan("es.netmind.mypersonalbankapi.modelos")
@EnableJpaRepositories(basePackages = {"es.netmind.mypersonalbankapi.persistencia", "es.netmind.mypersonalbankapi.controladores"})
public class SpringConfig {
}

// #Reto5-AplicacionStandaloneSpring
//@Configuration
//@Import({RepoConfig.class, ControllerConfig.class})
//@ComponentScan(basePackages = {"es.netmind.mypersonalbankapi.persistencia", "es.netmind.mypersonalbankapi.controladores"})
//@PropertySource("classpath:config.properties")
//public class SpringConfig {
//}
