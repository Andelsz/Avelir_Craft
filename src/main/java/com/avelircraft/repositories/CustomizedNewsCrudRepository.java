package com.avelircraft.repositories;

import com.avelircraft.models.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomizedNewsCrudRepository extends CrudRepository<News, Long> {
}
