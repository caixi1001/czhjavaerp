package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@ApiModel(value="Clashfunddetailstwo对象", description="")
public class Clashfunddetailstwo extends Model<Clashfunddetailstwo> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码clashfund(billId)")
    @TableId("billId")
    private String billId;

    @ApiModelProperty(value = "栏号")
    @TableField("coteMark")
    private Integer coteMark;

    @ApiModelProperty(value = "预收款单单号")
    @TableField("gatherId")
    private String gatherId;

    @ApiModelProperty(value = "来源单别(销售订单)")
    @TableField("sinName")
    private String sinName;

    @ApiModelProperty(value = "来源单号（销售订单号）")
    @TableField("originBillId")
    private String originBillId;

    @ApiModelProperty(value = "来源单号(行号)")
    @TableField("originoddrowId")
    private String originoddrowId;

    @ApiModelProperty(value = "预收金额")
    @TableField("advanceMoney")
    private Double advanceMoney;

    @ApiModelProperty(value = "预收余额")
    @TableField("Advancebalance")
    private Double Advancebalance;

    @ApiModelProperty(value = "取用预收金额")
    @TableField("adoptAdvanceMoney")
    private Double adoptAdvanceMoney;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLID = "billId";

    public static final String COTEMARK = "coteMark";

    public static final String GATHERID = "gatherId";

    public static final String SINNAME = "sinName";

    public static final String ORIGINBILLID = "originBillId";

    public static final String ORIGINODDROWID = "originoddrowId";

    public static final String ADVANCEMONEY = "advanceMoney";

    public static final String ADVANCEBALANCE = "Advancebalance";

    public static final String ADOPTADVANCEMONEY = "adoptAdvanceMoney";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billId;
    }

}
