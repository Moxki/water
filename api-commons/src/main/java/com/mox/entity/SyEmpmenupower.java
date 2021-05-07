package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sy_empmenupower")
public class SyEmpmenupower implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "EmpID")
    private Integer empid;

    @Column(name = "MenuID")
    private Integer menuid;

    private static final long serialVersionUID = 1L;
}