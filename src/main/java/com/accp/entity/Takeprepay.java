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
@ApiModel(value="Takeprepay对象", description="")
public class Takeprepay extends Model<Takeprepay> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "应付冲款单号")
    @TableId("copewithNo")
    private String copewithNo;

    @ApiModelProperty(value = "来源别")
    private String classified;

    @ApiModelProperty(value = "来源单号")
    @TableField("sourceNo")
    private String sourceNo;

    @ApiModelProperty(value = "预付余额")
    @TableField("paymentYe")
    private Double paymentYe;

    @ApiModelProperty(value = "部门编号")
    private String deptno;

    @ApiModelProperty(value = "部门名称")
    @TableField("deptName")
    private String deptName;

    @ApiModelProperty(value = "取用预付金额")
    @TableField("qYmoney")
    private Double qYmoney;

    @ApiModelProperty(value = "来源摘要")
    @TableField("sourceAbstract")
    private String sourceAbstract;

    private String beiyon;

    private String beiyonr;

    private String beiyons;


    public static final String COPEWITHNO = "copewithNo";

    public static final String CLASSIFIED = "classified";

    public static final String SOURCENO = "sourceNo";

    public static final String PAYMENTYE = "paymentYe";

    public static final String DEPTNO = "deptno";

    public static final String DEPTNAME = "deptName";

    public static final String QYMONEY = "qYmoney";

    public static final String SOURCEABSTRACT = "sourceAbstract";

    public static final String BEIYON = "beiyon";

    public static final String BEIYONR = "beiyonr";

    public static final String BEIYONS = "beiyons";

    @Override
    protected Serializable pkVal() {
        return this.copewithNo;
    }

}
