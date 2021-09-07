package com.seinpiper.backend_livtwotrain.livetwotrain.Entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TRAINDETAIL_TBL")
public class TrainDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Size(max=40,message="less than 40 characters")
    private String CenterName;
    @Size(max=12,min=12, message="exactly 12 characters")
    private int code;
    private int capacity;
    @OneToMany(targetEntity=Courses.class,cascade=CascadeType.ALL)
    @JoinColumn(name="ocd",referencedColumnName = "id")
    private List<Courses> course;
    private String date;
    @Pattern(regexp="\\\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b")
    @NotBlank(message="enter the email")
    private String Email;
    @NotBlank(message="Enter the phone number")
    private int phone;
    @OneToMany(targetEntity=Address.class,cascade=CascadeType.ALL)
    @JoinColumn(name="ta_fk",referencedColumnName = "id")
    private List<Address> address;
}
