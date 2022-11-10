package com.example.elasticsearch.infrastructure.db;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author gengaoliu
 */
public interface UserDAO extends ElasticsearchRepository<UserDO,String> {

}
