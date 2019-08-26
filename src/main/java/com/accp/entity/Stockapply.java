package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 采购请购表主表
 * </p>
 *
 * @author ChenZhihao
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Stockapply对象", description="采购请购表主表")
public class Stockapply extends Model<Stockapply> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识列")
    private Integer flag;

    @ApiModelProperty(value = "请购单单据号码")
    @TableField("billNo")
    private String billNo;

    @ApiModelProperty(value = "请购单单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "采购请购类型")
    @TableField("billStyleID")
    private Integer billStyleID;

    @ApiModelProperty(value = "采购请购类型名称")
    @TableField("billStyleName")
    private String billStyleName;

    @ApiModelProperty(value = "单况:(已结案/未结案/无效)")
    @TableField("billStatus")
    private Integer billStatus;

    @ApiModelProperty(value = "请购人员")
    @TableField("salesName")
    private String salesName;

    @ApiModelProperty(value = "请购人员id")
    @TableField("salesID")
    private Integer salesID;

    @ApiModelProperty(value = "请购部门")
    @TableField("departName")
    private String departName;

    @ApiModelProperty(value = "请购部门id")
    @TableField("departID")
    private Integer departID;

    @ApiModelProperty(value = "制单人员")
    private String maker;

    @ApiModelProperty(value = "复核人员")
    private String permitter;

    @ApiModelProperty(value = "审核状态:(未审核/已审核/无效)")
    private String permittering;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段1")
    private String safetyone;

    @ApiModelProperty(value = "保留字段2")
    private String safetytwo;


    public static final String FLAG = "flag";

    public static final String BILLNO = "billNo";

    public static final String BILLDATE = "billDate";

    public static final String BILLSTYLEID = "billStyleID";

    public static final String BILLSTYLENAME = "billStyleName";

    public static final String BILLSTATUS = "billStatus";

    public static final String SALESNAME = "salesName";

    public static final String SALESID = "salesID";

    public static final String DEPARTNAME = "departName";

    public static final String DEPARTID = "departID";

    public static final String MAKER = "maker";

    public static final String PERMITTER = "permitter";

    public static final String PERMITTERING = "permittering";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.flag;
    }

}
