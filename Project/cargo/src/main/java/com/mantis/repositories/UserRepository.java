package com.mantis.repositories;

import com.mantis.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select * from tbl_user where email = :email",nativeQuery = true)
    User findUserByEmail(@Param("email") String email);



}
