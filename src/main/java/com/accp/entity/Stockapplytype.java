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
 * 采购请购类型表
 * </p>
 *
 * @author ChenZhihao
 * @since 2019-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Stockapplytype对象", description="采购请购类型表")
public class Stockapplytype extends Model<Stockapplytype> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类型编号")
    @TableId("classID")
    private String classID;

    @ApiModelProperty(value = "类型名称")
    @TableField("className")
    private String className;

    @ApiModelProperty(value = "英文名称")
    @TableField("engName")
    private String engName;

    @ApiModelProperty(value = "备注")
    private String meno;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;


    public static final String CLASSID = "classID";

    public static final String CLASSNAME = "className";

    public static final String ENGNAME = "engName";

    public static final String MENO = "meno";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.classID;
    }

}
