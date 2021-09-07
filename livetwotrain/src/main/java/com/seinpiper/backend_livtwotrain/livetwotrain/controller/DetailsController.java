package com.seinpiper.backend_livtwotrain.livetwotrain.controller;

import com.seinpiper.backend_livtwotrain.livetwotrain.Entity.TrainDetail;
import com.seinpiper.backend_livtwotrain.livetwotrain.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailsController {
    @Autowired
    private TrainService service;

    @PostMapping("/addTrainDetail")
    public TrainDetail addTrainDetail(@RequestBody TrainDetail trainDetail){
        return service.saveTrainDetail(trainDetail);
    }

    @PostMapping("/addTrainDetails")
    public List<TrainDetail> addTrainDetails(@RequestBody List<TrainDetail> trainDetails){
        return service.saveTrainDetails(trainDetails);
    }


    @GetMapping("/trainDetails")
    public List<TrainDetail> findAllTrainDetails(){
        return service.getTrainDetails();
    }

    @GetMapping("/trainDetail/{id}")
    public TrainDetail findTrainDetailById(@PathVariable int id){
        return service.getTrainDetailById(id);
    }

}
