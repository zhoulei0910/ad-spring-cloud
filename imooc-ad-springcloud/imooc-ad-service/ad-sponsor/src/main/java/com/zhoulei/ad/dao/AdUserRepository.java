package com.zhoulei.ad.dao;

import com.zhoulei.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdUserRepository extends JpaRepository<AdUser,Long> {

    AdUser findByUsername(String username);
}
