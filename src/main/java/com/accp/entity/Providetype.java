package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ChenZhihao
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Providetype对象", description="")
public class Providetype extends Model<Providetype> {

    private static final long serialVersionUID = 1L;

    private String peeid;

    private String peename;

    @TableField("peeEname")
    private String peeEname;

    private String peeremark;

    private Integer peetrash;

    private String safetyone;

    private String safetytwo;

    private Integer enables;


    public static final String PEEID = "peeid";

    public static final String PEENAME = "peename";

    public static final String PEEENAME = "peeEname";

    public static final String PEEREMARK = "peeremark";

    public static final String PEETRASH = "peetrash";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.peeid;
    }

}
