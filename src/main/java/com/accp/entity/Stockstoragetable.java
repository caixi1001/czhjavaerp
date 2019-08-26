package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalTime;
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
@ApiModel(value="Stockstoragetable对象", description="")
public class Stockstoragetable extends Model<Stockstoragetable> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "单据编号")
    private String stockstorageno;

    @ApiModelProperty(value = "入库日期")
    private LocalTime storagedate;

    @ApiModelProperty(value = "供货商ID")
    private String purveyid;

    @ApiModelProperty(value = "供货商名称")
    private String purveyname;

    @ApiModelProperty(value = "供货商地址")
    private Integer purveyaddress;

    @ApiModelProperty(value = "仓库ID")
    private String depotid;

    @ApiModelProperty(value = "仓库名称")
    private String depotname;

    @ApiModelProperty(value = "单价是否含税")
    private String pricerevenue;

    @ApiModelProperty(value = "采购人员")
    private String stoperson;

    @ApiModelProperty(value = "采购人员所属部门名称")
    private String stodept;

    @ApiModelProperty(value = "部门ID")
    private String stodeptid;

    @ApiModelProperty(value = "审核人员ID")
    private String audituserid;

    @ApiModelProperty(value = "复核人员ID")
    private String repeatuserid;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "单据状态")
    private Integer estate;

    @ApiModelProperty(value = "保存")
    private String stockstoragetablename;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String STOCKSTORAGENO = "stockstorageno";

    public static final String STORAGEDATE = "storagedate";

    public static final String PURVEYID = "purveyid";

    public static final String PURVEYNAME = "purveyname";

    public static final String PURVEYADDRESS = "purveyaddress";

    public static final String DEPOTID = "depotid";

    public static final String DEPOTNAME = "depotname";

    public static final String PRICEREVENUE = "pricerevenue";

    public static final String STOPERSON = "stoperson";

    public static final String STODEPT = "stodept";

    public static final String STODEPTID = "stodeptid";

    public static final String AUDITUSERID = "audituserid";

    public static final String REPEATUSERID = "repeatuserid";

    public static final String REMARK = "remark";

    public static final String ESTATE = "estate";

    public static final String STOCKSTORAGETABLENAME = "stockstoragetablename";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return this.stockstorageno;
    }

}
