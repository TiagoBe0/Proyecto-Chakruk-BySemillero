/*


package com.sbs.web.Configuraciones;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Order(1)
public class ConfiguracionesSeguridad extends WebSecurityConfigurerAdapter{
protected void configure(HttpSecurity http) throws Exception {
http
.authorizeRequests()
.antMatchers("/css/*", "/js/*","/img/*", "/**").permitAll()
//        .antMatchers("/**").authenticated()

.and().formLogin()
.loginPage("/login") // Que formulario esta mi login
.loginProcessingUrl("/logincheck")
.usernameParameter("username") // Como viajan los datos del logueo
.passwordParameter("d48829d6-da99-48fd-9117-12b3a7e21473")// Como viajan los datos del logueo
.defaultSuccessUrl("/inicio") // A que URL viaja
.permitAll()
.and().logout() // Aca configuro la salida
.logoutUrl("/logout")
.logoutSuccessUrl("/")
.permitAll().and().csrf().disable();
}
}
*/