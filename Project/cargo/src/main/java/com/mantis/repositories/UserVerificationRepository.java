package com.mantis.repositories;

import com.mantis.data.entity.UserVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UserVerificationRepository extends JpaRepository<UserVerification, UUID> {
    @Query(value = "select  * from tbl_user_verification where user_id_id=:userId",nativeQuery = true)
    UserVerification getUserVerificationByUserId(@Param("userId") Integer userId);
}
