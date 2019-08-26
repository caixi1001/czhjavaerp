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
@ApiModel(value="Comproductclass对象", description="")
public class Comproductclass extends Model<Comproductclass> {

    private static final long serialVersionUID = 1L;

    @TableId("classID")
    private String classID;

    @TableField("className")
    private String className;

    @TableField("engName")
    private String engName;

    @TableField("accInventoryId")
    private String accInventoryId;

    @TableField("accInventoryName")
    private String accInventoryName;

    @TableField("accSaleID")
    private String accSaleID;

    @TableField("accSaleName")
    private String accSaleName;

    @TableField("accSaleCostID")
    private String accSaleCostID;

    @TableField("accSaleCostName")
    private String accSaleCostName;

    @TableField("giftExpenseID")
    private String giftExpenseID;

    @TableField("giftExpenseName")
    private String giftExpenseName;

    @TableField("otherIncomeID")
    private String otherIncomeID;

    @TableField("otherIncomeName")
    private String otherIncomeName;

    @TableField("otherExpenseID")
    private String otherExpenseID;

    @TableField("otherExpenseName")
    private String otherExpenseName;

    @TableField("otherCostID")
    private String otherCostID;

    @TableField("otherCostName")
    private String otherCostName;

    private String memo;


    public static final String CLASSID = "classID";

    public static final String CLASSNAME = "className";

    public static final String ENGNAME = "engName";

    public static final String ACCINVENTORYID = "accInventoryId";

    public static final String ACCINVENTORYNAME = "accInventoryName";

    public static final String ACCSALEID = "accSaleID";

    public static final String ACCSALENAME = "accSaleName";

    public static final String ACCSALECOSTID = "accSaleCostID";

    public static final String ACCSALECOSTNAME = "accSaleCostName";

    public static final String GIFTEXPENSEID = "giftExpenseID";

    public static final String GIFTEXPENSENAME = "giftExpenseName";

    public static final String OTHERINCOMEID = "otherIncomeID";

    public static final String OTHERINCOMENAME = "otherIncomeName";

    public static final String OTHEREXPENSEID = "otherExpenseID";

    public static final String OTHEREXPENSENAME = "otherExpenseName";

    public static final String OTHERCOSTID = "otherCostID";

    public static final String OTHERCOSTNAME = "otherCostName";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return this.classID;
    }

}
