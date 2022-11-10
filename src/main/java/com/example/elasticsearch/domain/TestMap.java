package com.example.elasticsearch.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestMap {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("test", "test");
    map.put("test2", "testssss");
    map.put("test3", "test3");
    map.put(null,null);
    Set<String> keySet = map.keySet();
    log.debug("所有的健为：【{}】", keySet);

    Set<Entry<String, String>> entrySet = map.entrySet();
    log.debug("entrySet为：【{}】", entrySet);
  }
}
