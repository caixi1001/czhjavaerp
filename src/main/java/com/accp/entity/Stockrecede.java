package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Stockrecede对象", description="")
public class Stockrecede extends Model<Stockrecede> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购退货单号")
    private String recid;

    @ApiModelProperty(value = "单据日期")
    private LocalDate recdate;

    @ApiModelProperty(value = "供应商编号")
    private String peoid;

    @ApiModelProperty(value = "供货商名称")
    private String purveyname;

    @ApiModelProperty(value = "供应商地址")
    private String peoaddress;

    @ApiModelProperty(value = "仓库编号")
    private String stoid;

    @ApiModelProperty(value = "仓库名称")
    private String depotname;

    @ApiModelProperty(value = "是否含税")
    private Integer containtax;

    @ApiModelProperty(value = "是否重新入库")
    private Integer anewstorage;

    @ApiModelProperty(value = "采购人员姓名")
    private String stoperson;

    @ApiModelProperty(value = "采购人员ID")
    private String stopersonid;

    @ApiModelProperty(value = "请购部门")
    private String stodept;

    @ApiModelProperty(value = "部门编号")
    private String stodeptid;

    @ApiModelProperty(value = "制单人员")
    private String makeperson;

    @ApiModelProperty(value = "复核人员")
    private String auditingperson;

    @ApiModelProperty(value = "备注")
    private String recremark;

    @ApiModelProperty(value = "单据状态")
    private String estate;

    @ApiModelProperty(value = "保存")
    private String stockrecedename;

    @ApiModelProperty(value = "标识是否删除")
    private Integer enables;

    @ApiModelProperty(value = "保留字段")
    private String safetyone;

    @ApiModelProperty(value = "保留字段")
    private String safetytwo;


    public static final String RECID = "recid";

    public static final String RECDATE = "recdate";

    public static final String PEOID = "peoid";

    public static final String PURVEYNAME = "purveyname";

    public static final String PEOADDRESS = "peoaddress";

    public static final String STOID = "stoid";

    public static final String DEPOTNAME = "depotname";

    public static final String CONTAINTAX = "containtax";

    public static final String ANEWSTORAGE = "anewstorage";

    public static final String STOPERSON = "stoperson";

    public static final String STOPERSONID = "stopersonid";

    public static final String STODEPT = "stodept";

    public static final String STODEPTID = "stodeptid";

    public static final String MAKEPERSON = "makeperson";

    public static final String AUDITINGPERSON = "auditingperson";

    public static final String RECREMARK = "recremark";

    public static final String ESTATE = "estate";

    public static final String STOCKRECEDENAME = "stockrecedename";

    public static final String ENABLES = "enables";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
