package com.brunaluni.greenheart.GreenHeart.repository;

import com.brunaluni.greenheart.GreenHeart.model.Location;
import com.brunaluni.greenheart.GreenHeart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
