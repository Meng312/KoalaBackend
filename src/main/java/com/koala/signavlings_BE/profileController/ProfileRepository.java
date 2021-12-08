package com.koala.signavlings_BE.profileController;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.jpa.repository.Query;
//import java.util.List;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long>{

   // @Query(nativeQuery = true, value = "SELECT * FROM TBL_PROFILES")
   // List<Profile> getAllProfiles();

}