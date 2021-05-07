package com.mox.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sy_menu")
public class SyMenu implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "MenuName")
    private String menuname;

    @Column(name = "Parent")
    private Integer parent;

    @Column(name = "Url")
    private String url;

    @Column(name = "OnClick")
    private String onclick;

    @Column(name = "Icon")
    private String icon;

    @Column(name = "OrderIndex")
    private Integer orderindex;

    @Column(name = "FlowID")
    private Integer flowid;

    @Column(name = "Disabled")
    private Boolean disabled;

    private static final long serialVersionUID = 1L;
}