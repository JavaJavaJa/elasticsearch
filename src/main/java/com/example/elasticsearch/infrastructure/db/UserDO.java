package com.example.elasticsearch.infrastructure.db;

import com.example.elasticsearch.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author gengaoliu
 */
@Document(indexName = "user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDO {
  @Id private String id;
  private String name;
  private Integer age;

  public static UserDO from(User user) {
    return UserDO.builder().id(user.getId()).name(user.getName()).age(user.getAge()).build();
  }

  public User toDomain() {
    return User.builder().id(this.id).name(this.name).age(this.age).build();
  }
}
