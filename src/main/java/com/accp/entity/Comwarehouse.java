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
@ApiModel(value="Comwarehouse对象", description="")
public class Comwarehouse extends Model<Comwarehouse> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "仓库编号")
    @TableId("wareHouseID")
    private String wareHouseID;

    @ApiModelProperty(value = "仓库名称")
    @TableField("wareHouseName")
    private String wareHouseName;

    @ApiModelProperty(value = "仓库简称")
    @TableField("shortName")
    private String shortName;

    @ApiModelProperty(value = "英文名称")
    @TableField("engName")
    private String engName;

    @ApiModelProperty(value = "联系人员")
    @TableField("linkMan")
    private String linkMan;

    @ApiModelProperty(value = "联系电话")
    private String telephone;

    @ApiModelProperty(value = "仓库地址")
    @TableField("wareHouseAddress")
    private String wareHouseAddress;

    @ApiModelProperty(value = "备注")
    private String memo;


    public static final String WAREHOUSEID = "wareHouseID";

    public static final String WAREHOUSENAME = "wareHouseName";

    public static final String SHORTNAME = "shortName";

    public static final String ENGNAME = "engName";

    public static final String LINKMAN = "linkMan";

    public static final String TELEPHONE = "telephone";

    public static final String WAREHOUSEADDRESS = "wareHouseAddress";

    public static final String MEMO = "memo";

    @Override
    protected Serializable pkVal() {
        return this.wareHouseID;
    }

}
