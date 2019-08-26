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
@ApiModel(value="Inventory对象", description="")
public class Inventory extends Model<Inventory> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "栏号")
    private String columnno;

    @ApiModelProperty(value = "物料编号")
    private String stocknumber;

    @ApiModelProperty(value = "物料名称")
    @TableField("stockName")
    private String stockName;

    @ApiModelProperty(value = "规格型号")
    private String specifications;

    @ApiModelProperty(value = "单位名称")
    @TableField("organizationName")
    private String organizationName;

    @ApiModelProperty(value = "数量")
    private Integer quantity;

    @ApiModelProperty(value = "单价")
    private Double univalence;

    @ApiModelProperty(value = "金额")
    private Double moneyy;

    @ApiModelProperty(value = "税率")
    private Double taxrate;

    @ApiModelProperty(value = "税额")
    private Double tax;

    @ApiModelProperty(value = "含税金额")
    private Double taxamount;

    @ApiModelProperty(value = "来源单号")
    @TableField("sourceOdd")
    private String sourceOdd;

    @ApiModelProperty(value = "来源单别")
    private String singlesource;

    @ApiModelProperty(value = "分录备注")
    private String journalizingremark;

    @ApiModelProperty(value = "汇差")
    private Double rate;

    @ApiModelProperty(value = "价差")
    private Double differenceprice;

    @ApiModelProperty(value = "价差本位币")
    private String differencepricebwb;

    @ApiModelProperty(value = "差额合计")
    private Double balancetotal;

    private String beiyon;

    private String beiyonr;

    private String beiyons;

    private String beiyonf;

    private String beiyonw;


    public static final String COLUMNNO = "columnno";

    public static final String STOCKNUMBER = "stocknumber";

    public static final String STOCKNAME = "stockName";

    public static final String SPECIFICATIONS = "specifications";

    public static final String ORGANIZATIONNAME = "organizationName";

    public static final String QUANTITY = "quantity";

    public static final String UNIVALENCE = "univalence";

    public static final String MONEYY = "moneyy";

    public static final String TAXRATE = "taxrate";

    public static final String TAX = "tax";

    public static final String TAXAMOUNT = "taxamount";

    public static final String SOURCEODD = "sourceOdd";

    public static final String SINGLESOURCE = "singlesource";

    public static final String JOURNALIZINGREMARK = "journalizingremark";

    public static final String RATE = "rate";

    public static final String DIFFERENCEPRICE = "differenceprice";

    public static final String DIFFERENCEPRICEBWB = "differencepricebwb";

    public static final String BALANCETOTAL = "balancetotal";

    public static final String BEIYON = "beiyon";

    public static final String BEIYONR = "beiyonr";

    public static final String BEIYONS = "beiyons";

    public static final String BEIYONF = "beiyonf";

    public static final String BEIYONW = "beiyonw";

    @Override
    protected Serializable pkVal() {
        return this.stocknumber;
    }

}
