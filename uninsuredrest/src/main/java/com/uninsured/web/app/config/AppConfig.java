package com.uninsured.web.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@ComponentScan({"com.spytutorsrest"})
@EnableMongoRepositories({"com.spytutorsrest.web.app.config"})
@Import({MongoDBConfig.class})
public class AppConfig {

}
