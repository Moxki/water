package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sy_empareapower")
public class SyEmpareapower implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "EmpID")
    private Integer empid;

    @Column(name = "AreaID")
    private Integer areaid;

    private static final long serialVersionUID = 1L;
}