package com.example.elasticsearch.domain;

import java.util.List;

/**
 * @author gengaoliu
 */
public interface IUserService {
  void save(User user);

  List<User> findAll();

  void delete(String id);

  void update(User user);
}
