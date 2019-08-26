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
@ApiModel(value="Comproduct对象", description="")
public class Comproduct extends Model<Comproduct> {

    private static final long serialVersionUID = 1L;

    @TableId("prodId")
    private String prodId;

    @TableField("className")
    private String className;

    @TableField("prodName")
    private String prodName;

    @TableField("classId")
    private String classId;

    @TableField("productclassName")
    private String productclassName;

    @TableField("suggestPrice")
    private Double suggestPrice;

    @TableField("suggestPriceA")
    private Double suggestPriceA;

    @TableField("suggestPriceB")
    private Double suggestPriceB;

    @TableField("suggestPriceC")
    private Double suggestPriceC;

    @TableField("suggestPriceD")
    private Double suggestPriceD;

    @TableField("suggestPriceE")
    private Double suggestPriceE;

    @TableField("stdPrice")
    private Double stdPrice;

    @TableField("prodForm")
    private String prodForm;

    @TableField("priceOfTax")
    private Integer priceOfTax;

    @TableField("busiTaxRate")
    private Float busiTaxRate;

    @TableField("advanceDays")
    private Integer advanceDays;

    @TableField("majorSupplierId")
    private String majorSupplierId;

    @TableField("majorSupplierName")
    private String majorSupplierName;

    @TableField("sluggishDays")
    private Integer sluggishDays;

    @TableField("invalidDate")
    private LocalDate invalidDate;

    private String memo;

    @TableField("stdUnitId")
    private String stdUnitId;

    @TableField("stdUnitName")
    private String stdUnitName;

    private String safetyone;

    private String safetytwo;

    private Integer enables;


    public static final String PRODID = "prodId";

    public static final String CLASSNAME = "className";

    public static final String PRODNAME = "prodName";

    public static final String CLASSID = "classId";

    public static final String PRODUCTCLASSNAME = "productclassName";

    public static final String SUGGESTPRICE = "suggestPrice";

    public static final String SUGGESTPRICEA = "suggestPriceA";

    public static final String SUGGESTPRICEB = "suggestPriceB";

    public static final String SUGGESTPRICEC = "suggestPriceC";

    public static final String SUGGESTPRICED = "suggestPriceD";

    public static final String SUGGESTPRICEE = "suggestPriceE";

    public static final String STDPRICE = "stdPrice";

    public static final String PRODFORM = "prodForm";

    public static final String PRICEOFTAX = "priceOfTax";

    public static final String BUSITAXRATE = "busiTaxRate";

    public static final String ADVANCEDAYS = "advanceDays";

    public static final String MAJORSUPPLIERID = "majorSupplierId";

    public static final String MAJORSUPPLIERNAME = "majorSupplierName";

    public static final String SLUGGISHDAYS = "sluggishDays";

    public static final String INVALIDDATE = "invalidDate";

    public static final String MEMO = "memo";

    public static final String STDUNITID = "stdUnitId";

    public static final String STDUNITNAME = "stdUnitName";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.prodId;
    }

}
