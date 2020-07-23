package com.lrlz.demo.seata.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lrlz
 * @since 2020-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("orders")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("user_id")
    private Integer userId;
    @TableField("product_id")
    private Integer productId;
    @TableField("pay_amount")
    private BigDecimal payAmount;
    private String status;
    @TableField("add_time")
    private Date addTime;
    @TableField("last_update_time")
    private Date lastUpdateTime;


    public static final String ID = "id";

    public static final String USER_ID = "user_id";

    public static final String PRODUCT_ID = "product_id";

    public static final String PAY_AMOUNT = "pay_amount";

    public static final String STATUS = "status";

    public static final String ADD_TIME = "add_time";

    public static final String LAST_UPDATE_TIME = "last_update_time";

}
