package com.example.elasticsearch.web.model.res;

import com.example.elasticsearch.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gengaoliu
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRes {
  private String id;
  private String name;
  private Integer age;

  public static UserRes fromDomain(User user) {
    return UserRes.builder().id(user.getId()).name(user.getName()).age(user.getAge()).build();
  }
}
