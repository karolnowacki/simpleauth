package org.pk.siwz.simpleauth.data;

import org.pk.siwz.simpleauth.data.model.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {
    Application findById(long id);
    Boolean existsByAppId(String appId);
    Application findByAppId(String appId);
    List<Application> findAll();
}
