package com.app.myschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }*/

    /*@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }*/
    
   /* @Bean
    public UndertowEmbeddedServletContainerFactory embeddedServletContainerFactory() {
        UndertowEmbeddedServletContainerFactory factory = 
          new UndertowEmbeddedServletContainerFactory();
         
        factory.addBuilderCustomizers(new UndertowBuilderCustomizer() {
		{
            @Override
            public void customize(io.undertow.Undertow.Builder builder) {
                builder.addHttpListener(1010, "127.0.0.1");
            }
        });
         
        return factory;
    }*/
    
    @Bean
    public JettyEmbeddedServletContainerFactory  jettyEmbeddedServletContainerFactory() {
        JettyEmbeddedServletContainerFactory jettyContainer = 
          new JettyEmbeddedServletContainerFactory();
         
        jettyContainer.setPort(2020);
        jettyContainer.setContextPath("/app");
        return jettyContainer;
    }

}

