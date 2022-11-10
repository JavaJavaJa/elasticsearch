package com.example.elasticsearch.web.model.req;

import com.example.elasticsearch.domain.User;
import com.example.elasticsearch.web.annotation.AddressAnnotation;
import lombok.Builder;
import lombok.Data;

/**
 * @author gengaoliu
 */
@Data
@Builder
public class UserAddReq {
  private String id;

  @AddressAnnotation(mustContainStr = "浩浩")
  private String name;

  private Integer age;

  public User to() {
    return User.builder().id(this.id).name(this.name).age(this.age).build();
  }
}
