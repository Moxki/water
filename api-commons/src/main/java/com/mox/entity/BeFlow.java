package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "be_flow")
public class BeFlow implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "StepName")
    private String stepname;

    @Column(name = "DeptID")
    private Integer deptid;

    @Column(name = "Type1")
    private Integer type1;

    @Column(name = "Type2")
    private Integer type2;

    @Column(name = "Type3")
    private Integer type3;

    @Column(name = "Type4")
    private Integer type4;

    @Column(name = "Type5")
    private Integer type5;

    @Column(name = "Type6")
    private Integer type6;

    @Column(name = "Type7")
    private Integer type7;

    private static final long serialVersionUID = 1L;
}