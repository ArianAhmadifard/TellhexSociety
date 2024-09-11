package com.TellhexSociety.Api.Repository;

import com.TellhexSociety.Api.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM \"User\" u WHERE u.\"Id\" = :userid", nativeQuery = true)
    User findById(@Param("userid") long id);

}
