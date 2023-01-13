package com.locationweb17.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationweb17.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
