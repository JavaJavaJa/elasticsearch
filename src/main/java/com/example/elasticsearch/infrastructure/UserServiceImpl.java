package com.example.elasticsearch.infrastructure;

import com.example.elasticsearch.domain.IUserService;
import com.example.elasticsearch.domain.User;
import com.example.elasticsearch.infrastructure.db.UserDAO;
import com.example.elasticsearch.infrastructure.db.UserDO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author gengaoliu
 */
@Service
public class UserServiceImpl implements IUserService {
  private final UserDAO dao;

  public UserServiceImpl(UserDAO dao) {
    this.dao = dao;
  }

  @Override
  public void save(User user) {
    dao.save(UserDO.from(user));
  }

  @Override
  public List<User> findAll() {
    Iterable<UserDO> all = dao.findAll();
    List<UserDO> list = new ArrayList<>();
    all.forEach(list::add);
    return list.stream().map(UserDO::toDomain).toList();
  }

  @Override
  public void delete(String id) {
    dao.deleteById(id);
  }

  @Override
  public void update(User user) {
    dao.save(UserDO.from(user));
  }
}
