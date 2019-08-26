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
@ApiModel(value="Sellissueorderdetails对象", description="")
public class Sellissueorderdetails extends Model<Sellissueorderdetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billId")
    private String billId;

    @ApiModelProperty(value = "栏号")
    @TableField("coteMark")
    private Integer coteMark;

    @ApiModelProperty(value = "物料编号")
    private String matid;

    @ApiModelProperty(value = "物料名称")
    private String matname;

    @ApiModelProperty(value = "规格型号")
    private String matspec;

    @ApiModelProperty(value = "单位名称")
    private String matunit;

    @ApiModelProperty(value = "数量")
    private Integer number;

    @ApiModelProperty(value = "折扣前单价")
    @TableField("agioAgoPrice")
    private Double agioAgoPrice;

    @ApiModelProperty(value = "折数")
    private Double agio;

    @ApiModelProperty(value = "单价")
    private Double price;

    @ApiModelProperty(value = "金额")
    private Double money;

    @ApiModelProperty(value = "税率")
    private Double cess;

    @ApiModelProperty(value = "税额")
    private Double taxmoney;

    @ApiModelProperty(value = "含税金额")
    private Double intaxmoney;

    @ApiModelProperty(value = "赠品")
    private String present;

    @ApiModelProperty(value = "实际成本")
    @TableField("factCost")
    private Double factCost;

    @ApiModelProperty(value = "标准成本")
    @TableField("criterionCost")
    private Double criterionCost;

    @ApiModelProperty(value = "来源单别")
    @TableField("sinName")
    private String sinName;

    @ApiModelProperty(value = "来源单号")
    @TableField("originBillId")
    private String originBillId;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLID = "billId";

    public static final String COTEMARK = "coteMark";

    public static final String MATID = "matid";

    public static final String MATNAME = "matname";

    public static final String MATSPEC = "matspec";

    public static final String MATUNIT = "matunit";

    public static final String NUMBER = "number";

    public static final String AGIOAGOPRICE = "agioAgoPrice";

    public static final String AGIO = "agio";

    public static final String PRICE = "price";

    public static final String MONEY = "money";

    public static final String CESS = "cess";

    public static final String TAXMONEY = "taxmoney";

    public static final String INTAXMONEY = "intaxmoney";

    public static final String PRESENT = "present";

    public static final String FACTCOST = "factCost";

    public static final String CRITERIONCOST = "criterionCost";

    public static final String SINNAME = "sinName";

    public static final String ORIGINBILLID = "originBillId";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billId;
    }

}
