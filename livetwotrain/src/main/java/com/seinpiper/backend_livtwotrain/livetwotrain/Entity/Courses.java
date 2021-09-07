package com.seinpiper.backend_livtwotrain.livetwotrain.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="COURSES_TBL")
public class Courses {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int course_id;
    private String course1;
    private String course2;
    private int ocd;
}
