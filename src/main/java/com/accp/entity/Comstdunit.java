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
@ApiModel(value="Comstdunit对象", description="")
public class Comstdunit extends Model<Comstdunit> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单位编号")
    @TableId("unitId")
    private String unitId;

    @ApiModelProperty(value = "单位名称")
    @TableField("unitName")
    private String unitName;

    @ApiModelProperty(value = "英文名称")
    @TableField("engName")
    private String engName;

    @ApiModelProperty(value = "备注")
    private String memo;


    public static final String UNITID = "unitId";

    public static final String UNITNAME = "unitName";

    public static final String ENGNAME = "engName";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return this.unitId;
    }

}
