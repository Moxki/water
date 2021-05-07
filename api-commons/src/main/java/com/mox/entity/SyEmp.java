package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sy_emp")
public class SyEmp implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "EmpName")
    private String empname;

    @Column(name = "EmpNo")
    private String empno;

    @Column(name = "Pwd")
    private String pwd;

    @Column(name = "DeptID")
    private Integer deptid;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "Disabled")
    private Boolean disabled;

    private static final long serialVersionUID = 1L;
}