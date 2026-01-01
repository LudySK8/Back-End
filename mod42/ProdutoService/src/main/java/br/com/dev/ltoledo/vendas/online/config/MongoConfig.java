package br.com.dev.ltoledo.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "br.com.dev.ltoledo.vendas.online.repository")
public class MongoConfig {

}