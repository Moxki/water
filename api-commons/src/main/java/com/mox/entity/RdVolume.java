package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rd_volume")
public class RdVolume implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "VolumeName")
    private String volumename;

    @Column(name = "AreaID")
    private Integer areaid;

    @Column(name = "OrderIndex")
    private Integer orderindex;

    @Column(name = "Remark")
    private String remark;

    @Column(name = "Disabled")
    private Boolean disabled;

    private static final long serialVersionUID = 1L;
}