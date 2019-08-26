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
@ApiModel(value="Clashfund对象", description="")
public class Clashfund extends Model<Clashfund> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据号码")
    @TableId("billId")
    private String billId;

    @ApiModelProperty(value = "单据日期")
    @TableField("billDate")
    private LocalDate billDate;

    @ApiModelProperty(value = "单据类型singleType(sinId)")
    @TableField("sinId")
    private Integer sinId;

    @ApiModelProperty(value = "客户编号client(cliid)")
    private String cliid;

    @ApiModelProperty(value = "客户简称")
    private String clishortname;

    @ApiModelProperty(value = "币别")
    @TableField("currencyType")
    private String currencyType;

    @ApiModelProperty(value = "结算方式一")
    @TableField("ReckonTypeF")
    private String ReckonTypeF;

    @ApiModelProperty(value = "结算方式二")
    @TableField("ReckonTypeS")
    private String ReckonTypeS;

    @ApiModelProperty(value = "结算方式三")
    @TableField("ReckonTypeT")
    private String ReckonTypeT;

    @ApiModelProperty(value = "金额")
    @TableField("ReckonMoneyF")
    private Double ReckonMoneyF;

    @ApiModelProperty(value = "金额")
    @TableField("ReckonMoneyS")
    private Double ReckonMoneyS;

    @ApiModelProperty(value = "金额")
    @TableField("ReckonMoneyT")
    private Double ReckonMoneyT;

    @ApiModelProperty(value = "折扣率")
    @TableField("GatherDiscount")
    private Double GatherDiscount;

    @ApiModelProperty(value = "终止帐月")
    @TableField("GatherendaccountMonth")
    private LocalDate GatherendaccountMonth;

    @ApiModelProperty(value = "业务人员编号，也就是人员编号employee(empid)")
    private String empid;

    @ApiModelProperty(value = "业务人员")
    @TableField("empName")
    private String empName;

    @ApiModelProperty(value = "部门编号depttab(depid)")
    private String depid;

    @ApiModelProperty(value = "所属部门")
    @TableField("depName")
    private String depName;

    @ApiModelProperty(value = "制单人员")
    @TableField("makeEmpName")
    private String makeEmpName;

    @ApiModelProperty(value = "复核人员")
    @TableField("AuditingEmpName")
    private String AuditingEmpName;

    @ApiModelProperty(value = "审核状态")
    private Integer checkstate;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String BILLID = "billId";

    public static final String BILLDATE = "billDate";

    public static final String SINID = "sinId";

    public static final String CLIID = "cliid";

    public static final String CLISHORTNAME = "clishortname";

    public static final String CURRENCYTYPE = "currencyType";

    public static final String RECKONTYPEF = "ReckonTypeF";

    public static final String RECKONTYPES = "ReckonTypeS";

    public static final String RECKONTYPET = "ReckonTypeT";

    public static final String RECKONMONEYF = "ReckonMoneyF";

    public static final String RECKONMONEYS = "ReckonMoneyS";

    public static final String RECKONMONEYT = "ReckonMoneyT";

    public static final String GATHERDISCOUNT = "GatherDiscount";

    public static final String GATHERENDACCOUNTMONTH = "GatherendaccountMonth";

    public static final String EMPID = "empid";

    public static final String EMPNAME = "empName";

    public static final String DEPID = "depid";

    public static final String DEPNAME = "depName";

    public static final String MAKEEMPNAME = "makeEmpName";

    public static final String AUDITINGEMPNAME = "AuditingEmpName";

    public static final String CHECKSTATE = "checkstate";

    public static final String REMARK = "remark";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.billId;
    }

}
