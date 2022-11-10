package com.example.elasticsearch;

import com.example.elasticsearch.web.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gengaoliu
 */
@SpringBootApplication(scanBasePackages = {"com.example.elasticsearch"})
public class ElasticsearchApplication {

  private final UserController userController;

  public ElasticsearchApplication(UserController userController) {
    this.userController = userController;
    userController.list();
  }

  public UserController getUserController() {
    return userController;
  }

  public static void main(String[] args) {
    SpringApplication.run(ElasticsearchApplication.class, args);
  }
}
