package com.example.elasticsearch.web.utils;

import com.example.elasticsearch.web.annotation.AddressAnnotation;
import com.example.elasticsearch.web.exception.NotContainsStrException;
import java.lang.reflect.Field;

/**
 * @author gengaoliu
 */
public class AddressAnnotationUtil {
  private AddressAnnotationUtil() {}

  public static void validateAddressAnnotation(Object obj) throws IllegalAccessException {
    Class<?> clazz = obj.getClass();
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      field.setAccessible(true);
      boolean flag = field.isAnnotationPresent(AddressAnnotation.class);
      if (flag) {
        if ("java.lang.String".equals(field.getType().getName())) {
          AddressAnnotation addressAnnotation = field.getAnnotation(AddressAnnotation.class);
          String containStr = addressAnnotation.mustContainStr();
          String s = (String) field.get(obj);
          if (!s.contains(containStr)) {
            throw new NotContainsStrException(field.getName() + "中必须包含" + containStr);
          }
        }
      }
    }
  }
}
