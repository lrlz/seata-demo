package com.lrlz.demo.seata.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseEntity {

    @TableId
    private Long id;

    private Date dateCreate;

    private Date dateUpdate;

}
