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
@ApiModel(value="Advancegatherdetails对象", description="")
public class Advancegatherdetails extends Model<Advancegatherdetails> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码Advancegather(billId)")
    @TableId("billId")
    private String billId;

    @ApiModelProperty(value = "栏号")
    @TableField("coteMark")
    private Integer coteMark;

    @ApiModelProperty(value = "预收金额")
    @TableField("PromisedMoney")
    private Integer PromisedMoney;

    @ApiModelProperty(value = "预收余额")
    @TableField("advanceMoney")
    private Integer advanceMoney;

    @ApiModelProperty(value = "来源单别")
    @TableField("sinName")
    private String sinName;

    @ApiModelProperty(value = "来源单号")
    @TableField("originBillId")
    private String originBillId;

    @ApiModelProperty(value = "摘要")
    private String summary;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLID = "billId";

    public static final String COTEMARK = "coteMark";

    public static final String PROMISEDMONEY = "PromisedMoney";

    public static final String ADVANCEMONEY = "advanceMoney";

    public static final String SINNAME = "sinName";

    public static final String ORIGINBILLID = "originBillId";

    public static final String SUMMARY = "summary";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billId;
    }

}
