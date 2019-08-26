package com.accp.entity;

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
@ApiModel(value="Clashfunddetailsone对象", description="")
public class Clashfunddetailsone extends Model<Clashfunddetailsone> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码clashfund(billId)")
    @TableId("billId")
    private String billId;

    @ApiModelProperty(value = "栏号")
    @TableField("coteMark")
    private Integer coteMark;

    @ApiModelProperty(value = "来源单别(销售订单)")
    @TableField("sinName")
    private String sinName;

    @ApiModelProperty(value = "来源单号")
    @TableField("originBillId")
    private String originBillId;

    @ApiModelProperty(value = "原单日期")
    @TableField("originoddDate")
    private LocalDate originoddDate;

    @ApiModelProperty(value = "原单金额")
    @TableField("originoddMoney")
    private Double originoddMoney;

    @ApiModelProperty(value = "现行余额")
    private Double currentlybalance;

    @ApiModelProperty(value = "折让金额")
    @TableField("discountMoney")
    private Double discountMoney;

    @ApiModelProperty(value = "冲款金额")
    @TableField("clashMoney")
    private Double clashMoney;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLID = "billId";

    public static final String COTEMARK = "coteMark";

    public static final String SINNAME = "sinName";

    public static final String ORIGINBILLID = "originBillId";

    public static final String ORIGINODDDATE = "originoddDate";

    public static final String ORIGINODDMONEY = "originoddMoney";

    public static final String CURRENTLYBALANCE = "currentlybalance";

    public static final String DISCOUNTMONEY = "discountMoney";

    public static final String CLASHMONEY = "clashMoney";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billId;
    }

}
