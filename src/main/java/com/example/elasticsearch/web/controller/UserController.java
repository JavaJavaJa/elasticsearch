package com.example.elasticsearch.web.controller;

import com.example.elasticsearch.domain.IUserService;
import com.example.elasticsearch.domain.User;
import com.example.elasticsearch.web.model.req.UserAddReq;
import com.example.elasticsearch.web.model.res.UserRes;
import com.example.elasticsearch.web.utils.AddressAnnotationUtil;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gengaoliu
 */
@RestController
@RequestMapping("/user/es")
public class UserController {
  private final IUserService userService;

  public UserController(IUserService userService) {
    this.userService = userService;
  }

  @GetMapping("/list")
  public List<UserRes> list() {
    userService.save(User.builder().name("浩浩").age(22).build());
    userService.save(User.builder().name("滔滔").age(22).build());
    List<UserRes> res = userService.findAll().stream().map(UserRes::fromDomain).toList();
    System.out.println(res);
    return res;
  }

  @PostMapping("/add")
  public List<UserRes> add(@RequestBody UserAddReq req) throws IllegalAccessException {
    AddressAnnotationUtil.validateAddressAnnotation(req);
    userService.save(req.to());
    return userService.findAll().stream().map(UserRes::fromDomain).toList();
  }

  @DeleteMapping("delete/{id}")
  public void delete(@PathVariable String id) {
    userService.delete(id);
  }

  @PostMapping("update")
  public List<UserRes> update(@RequestBody UserAddReq req) {
    userService.update(req.to());
    return userService.findAll().stream().map(UserRes::fromDomain).toList();
  }
}
