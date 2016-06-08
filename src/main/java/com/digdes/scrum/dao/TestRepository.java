package com.digdes.dao;

import com.digdes.model.Test;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by artemkopytok on 06.06.16.
 */
public interface TestRepository extends CrudRepository<Test, Long> {
    List<Test> findByName(String name);

}
