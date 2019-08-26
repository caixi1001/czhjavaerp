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
@ApiModel(value="Comdepartment对象", description="")
public class Comdepartment extends Model<Comdepartment> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "部门编号")
    @TableId("departId")
    private String departId;

    @ApiModelProperty(value = "部门名称")
    @TableField("departName")
    private String departName;

    @ApiModelProperty(value = "英文名称")
    @TableField("EngName")
    private String EngName;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "女性")
    private Integer female;

    @ApiModelProperty(value = "男性")
    private Integer male;

    @ApiModelProperty(value = "行事历")
    @TableField("calID")
    private String calID;

    @ApiModelProperty(value = "工资方案")
    @TableField("salaryTypeID")
    private String salaryTypeID;

    @ApiModelProperty(value = "工资方案名称")
    @TableField("salaryClassName")
    private String salaryClassName;


    public static final String DEPARTID = "departId";

    public static final String DEPARTNAME = "departName";

    public static final String ENGNAME = "EngName";

    public static final String MEMO = "memo";

    public static final String FEMALE = "female";

    public static final String MALE = "male";

    public static final String CALID = "calID";

    public static final String SALARYTYPEID = "salaryTypeID";

    public static final String SALARYCLASSNAME = "salaryClassName";

    @Override
    protected Serializable pkVal() {
        return this.departId;
    }

}
