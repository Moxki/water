package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sy_area")
public class SyArea implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "AreaName")
    private String areaname;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "Disabled")
    private Boolean disabled;

    private static final long serialVersionUID = 1L;
}