package com.leyou.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author James han
 * @create 2019-12-16 21:19
 */
@Data
@Table(name = "tb_category")
public class Category {
    @Id
    @KeySql(useGeneratedKeys = true)
    private long id;
    private String name;
    private long parentId;
    private Boolean isParent;
    private Integer sort;
}
