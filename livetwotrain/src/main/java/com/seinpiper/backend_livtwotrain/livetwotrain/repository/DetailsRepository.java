package com.seinpiper.backend_livtwotrain.livetwotrain.repository;

import com.seinpiper.backend_livtwotrain.livetwotrain.Entity.TrainDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<TrainDetail,Integer> {
}
