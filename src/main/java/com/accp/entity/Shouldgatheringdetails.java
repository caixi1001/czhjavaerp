package com.accp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Shouldgatheringdetails对象", description="")
public class Shouldgatheringdetails extends Model<Shouldgatheringdetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "minusaddid", type = IdType.AUTO)
    private Integer minusaddid;

    @ApiModelProperty(value = "来源单别")
    @TableField("sinId")
    private Integer sinId;

    @ApiModelProperty(value = "来源单别名称")
    @TableField("sinName")
    private String sinName;

    @ApiModelProperty(value = "来源单号")
    @TableField("originBillId")
    private String originBillId;

    @ApiModelProperty(value = "来源单据日期")
    private LocalDate nowdate;

    @ApiModelProperty(value = "客户编号client(cliid)")
    private String cliid;

    @ApiModelProperty(value = "日期")
    @TableField("showDate")
    private LocalDate showDate;

    @ApiModelProperty(value = "原单金额")
    @TableField("originoddMoney")
    private Integer originoddMoney;

    @ApiModelProperty(value = "现行余额")
    private Integer currentlybalance;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String MINUSADDID = "minusaddid";

    public static final String SINID = "sinId";

    public static final String SINNAME = "sinName";

    public static final String ORIGINBILLID = "originBillId";

    public static final String NOWDATE = "nowdate";

    public static final String CLIID = "cliid";

    public static final String SHOWDATE = "showDate";

    public static final String ORIGINODDMONEY = "originoddMoney";

    public static final String CURRENTLYBALANCE = "currentlybalance";

    public static final String REMARK = "remark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.minusaddid;
    }

}
