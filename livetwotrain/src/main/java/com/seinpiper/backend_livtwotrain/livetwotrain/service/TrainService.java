package com.seinpiper.backend_livtwotrain.livetwotrain.service;

import com.seinpiper.backend_livtwotrain.livetwotrain.Entity.TrainDetail;
import com.seinpiper.backend_livtwotrain.livetwotrain.repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    @Autowired
    private DetailsRepository repository;

    public TrainDetail saveTrainDetail(TrainDetail trainDetail){
        return repository.save(trainDetail);
    }
    public List<TrainDetail> saveTrainDetails(List<TrainDetail> trainDetails){
        return repository.saveAll(trainDetails);
    }

    public List<TrainDetail> getTrainDetails(){
        return repository.findAll();
    }

    public TrainDetail getTrainDetailById(int id){
        return repository.findById(id).orElse(null);
    }

}
