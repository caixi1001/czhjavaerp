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
@ApiModel(value="Content对象", description="")
public class Content extends Model<Content> {

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
    private Double money;

    @ApiModelProperty(value = "税率")
    private Double taxrate;

    @ApiModelProperty(value = "税额")
    private Double tax;

    @ApiModelProperty(value = "含税金额")
    private Double taxamount;

    @ApiModelProperty(value = "未进数量")
    private Integer nonequantity;

    @ApiModelProperty(value = "采购订单号")
    private String ordernumber;

    @ApiModelProperty(value = "分录备注")
    private String journalizingremark;

    private String beiyon;

    private String beiyone;

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

    public static final String MONEY = "money";

    public static final String TAXRATE = "taxrate";

    public static final String TAX = "tax";

    public static final String TAXAMOUNT = "taxamount";

    public static final String NONEQUANTITY = "nonequantity";

    public static final String ORDERNUMBER = "ordernumber";

    public static final String JOURNALIZINGREMARK = "journalizingremark";

    public static final String BEIYON = "beiyon";

    public static final String BEIYONE = "beiyone";

    public static final String BEIYONS = "beiyons";

    public static final String BEIYONF = "beiyonf";

    public static final String BEIYONW = "beiyonw";

    @Override
    protected Serializable pkVal() {
        return this.columnno;
    }

}
