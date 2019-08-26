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
@ApiModel(value="Comcustclass对象", description="")
public class Comcustclass extends Model<Comcustclass> {

    private static final long serialVersionUID = 1L;

    @TableId("classId")
    private String classId;

    @TableField("className")
    private String className;

    @TableField("engName")
    private String engName;

    private String memo;


    public static final String CLASSID = "classId";

    public static final String CLASSNAME = "className";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return this.classId;
    }

}
