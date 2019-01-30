package com.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource securityDataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // jdbc authentikace

        auth.jdbcAuthentication().dataSource(securityDataSource);
    /*    auth.jdbcAuthentication().dataSource(securityDataSource).usersByUsernameQuery("select username, password, enabled"
                + " from users where username=?")
                .authoritiesByUsernameQuery("select username, role "
                        + "from users where username=?");*/
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasRole("EMPLOYEE")
                .antMatchers("/leaders/**").hasRole("MANAGER")
                .antMatchers("/users/**").hasRole("MANAGER")
                .antMatchers("/requests/**").hasRole("MANAGER")
                .and()
                .formLogin()
                .loginPage("/showMyLoginPage")
                .loginProcessingUrl("/authenticateTheUser")
                .permitAll()
                .and()
                .logout().permitAll().and()
                .exceptionHandling().accessDeniedPage("/accesDenied");


    }

}
