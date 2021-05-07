package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rd_task")
public class RdTask implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "ReadYear")
    private Integer readyear;

    @Column(name = "ReadMonth")
    private Integer readmonth;

    @Column(name = "VolumeId")
    private Integer volumeid;

    @Column(name = "EmpId")
    private Integer empid;

    private static final long serialVersionUID = 1L;
}