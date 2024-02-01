package com.nasctecnology.subscribe.repositories;

import com.nasctecnology.subscribe.domain.UserSubscribe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSubscribeRepository extends JpaRepository<UserSubscribe, Long> {

}
