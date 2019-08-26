package com.accp.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
@ApiModel(value="Employee对象", description="")
public class Employee extends Model<Employee> {

    private static final long serialVersionUID = 1L;

    private String empid;

    private String empname;

    private String empename;

    private String depid;

    private String empsex;

    private String empcard;

    private String empstate;

    private String empduty;

    private String empphoneone;

    private String empphonetwo;

    private String empphonethree;

    private String empbankaccounts;

    private LocalDate empbirthday;

    private String empjob;

    @TableField("Empemail")
    private String Empemail;

    private String empweb;

    private String empfaxes;

    private String empopenbank;

    private String emptop;

    private String empdegree;

    private LocalDate empgotime;

    private LocalDate empgraduatetime;

    private LocalDate emppactstarttime;

    private LocalDate emppactendtime;

    private String empnowmailid;

    private String empfamilyphone;

    private String empfamilyplace;

    private String empnowphone;

    private String empnowplace;

    private String empexigenceman;

    private String empfamilymailid;

    private String empremark;

    private Integer emptrash;

    private String safetyone;

    private String safetytwo;

    private Integer enables;


    public static final String EMPID = "empid";

    public static final String EMPNAME = "empname";

    public static final String EMPENAME = "empename";

    public static final String DEPID = "depid";

    public static final String EMPSEX = "empsex";

    public static final String EMPCARD = "empcard";

    public static final String EMPSTATE = "empstate";

    public static final String EMPDUTY = "empduty";

    public static final String EMPPHONEONE = "empphoneone";

    public static final String EMPPHONETWO = "empphonetwo";

    public static final String EMPPHONETHREE = "empphonethree";

    public static final String EMPBANKACCOUNTS = "empbankaccounts";

    public static final String EMPBIRTHDAY = "empbirthday";

    public static final String EMPJOB = "empjob";

    public static final String EMPEMAIL = "Empemail";

    public static final String EMPWEB = "empweb";

    public static final String EMPFAXES = "empfaxes";

    public static final String EMPOPENBANK = "empopenbank";

    public static final String EMPTOP = "emptop";

    public static final String EMPDEGREE = "empdegree";

    public static final String EMPGOTIME = "empgotime";

    public static final String EMPGRADUATETIME = "empgraduatetime";

    public static final String EMPPACTSTARTTIME = "emppactstarttime";

    public static final String EMPPACTENDTIME = "emppactendtime";

    public static final String EMPNOWMAILID = "empnowmailid";

    public static final String EMPFAMILYPHONE = "empfamilyphone";

    public static final String EMPFAMILYPLACE = "empfamilyplace";

    public static final String EMPNOWPHONE = "empnowphone";

    public static final String EMPNOWPLACE = "empnowplace";

    public static final String EMPEXIGENCEMAN = "empexigenceman";

    public static final String EMPFAMILYMAILID = "empfamilymailid";

    public static final String EMPREMARK = "empremark";

    public static final String EMPTRASH = "emptrash";

    public static final String SAFETYONE = "safetyone";

    public static final String SAFETYTWO = "safetytwo";

    public static final String ENABLES = "enables";

    @Override
    protected Serializable pkVal() {
        return this.empid;
    }

}
