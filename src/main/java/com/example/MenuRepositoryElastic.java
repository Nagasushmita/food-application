package com.example;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;


public interface MenuRepositoryElastic extends ElasticsearchCrudRepository<MenuCard,Integer> {

}
