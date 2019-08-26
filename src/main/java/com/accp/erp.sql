/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.60 : Database - erpproject
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`erpproject` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `erpproject`;

/*Table structure for table `adjustmain` */

DROP TABLE IF EXISTS `adjustmain`;

CREATE TABLE `adjustmain` (
  `adjustNO` varchar(14) NOT NULL COMMENT '单据编号',
  `adjustStyle` varchar(5) NOT NULL COMMENT '单据类型（0为盘点单，1为调价单）',
  `adjustDate` date DEFAULT NULL COMMENT '单据日期',
  `maker` varchar(10) DEFAULT NULL COMMENT '制单人员名称',
  `makerID` varchar(20) DEFAULT NULL COMMENT '制单人员编号',
  `permitter` varchar(10) DEFAULT NULL COMMENT '复核人员名称',
  `permitterID` varchar(20) DEFAULT NULL COMMENT '复核人员编号',
  `sumQty` int(11) DEFAULT NULL COMMENT '数量合计',
  `sumCost` float(14,2) DEFAULT NULL COMMENT '金额合计',
  `udef1` varchar(50) DEFAULT NULL COMMENT '自定义一',
  `udef2` varchar(50) DEFAULT NULL COMMENT '自定义二',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `departID` varchar(8) DEFAULT NULL COMMENT '所属部门编号',
  `hasCheck` tinyint(1) DEFAULT NULL COMMENT '是否过审',
  `wareID` varchar(6) DEFAULT NULL COMMENT '仓库编号',
  `salesID` varchar(8) DEFAULT NULL COMMENT '盘点人员编号',
  `zeroFilter` tinyint(1) DEFAULT NULL COMMENT '账面数量为零载入',
  `sumCurQty` int(11) DEFAULT NULL COMMENT '账面数量合计',
  `sumCheckQty` int(11) DEFAULT NULL COMMENT '盘点数量合计',
  `incSubjectID` varchar(16) DEFAULT NULL COMMENT '增值科目编号',
  `decSujectID` varchar(16) DEFAULT NULL COMMENT '减值科目编号',
  `columOne` varchar(200) DEFAULT NULL,
  `columTow` varchar(200) DEFAULT NULL,
  `columThree` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`adjustNO`,`adjustStyle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adjustmain` */

/*Table structure for table `adjustsub` */

DROP TABLE IF EXISTS `adjustsub`;

CREATE TABLE `adjustsub` (
  `adjustNO` varchar(14) NOT NULL COMMENT '单据编号',
  `adjustStyle` varchar(5) NOT NULL COMMENT '单据类型',
  `serNO` smallint(6) NOT NULL COMMENT '栏号',
  `adjustDate` date DEFAULT NULL COMMENT '单据日期',
  `curQty` int(11) DEFAULT NULL COMMENT '账面数量/库存量',
  `checkQty` int(11) DEFAULT NULL COMMENT '盘点数量',
  `quantity` int(11) DEFAULT NULL COMMENT '亏盈数量',
  `price` float(14,2) DEFAULT NULL COMMENT '单价',
  `amount` float(14,2) DEFAULT NULL COMMENT '亏盈金额/调价金额',
  `itemRemark` varchar(1000) DEFAULT NULL COMMENT '原因/分录备注',
  `prodID` varchar(14) DEFAULT NULL COMMENT '物料编号',
  `columOne` varchar(200) DEFAULT NULL,
  `columTow` varchar(200) DEFAULT NULL,
  `columThree` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`adjustNO`,`adjustStyle`,`serNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `adjustsub` */

/*Table structure for table `advancegather` */

DROP TABLE IF EXISTS `advancegather`;

CREATE TABLE `advancegather` (
  `billId` varchar(50) NOT NULL COMMENT '单据号码',
  `billDate` date NOT NULL COMMENT '单据日期',
  `sinId` int(11) DEFAULT NULL COMMENT '单据类型singleType(sinId)',
  `Cliid` varchar(50) NOT NULL COMMENT '客户编号client(cliid)',
  `clishortname` varchar(50) NOT NULL COMMENT '客户简称',
  `currencyType` varchar(50) NOT NULL COMMENT '币别',
  `ReckonTypeF` varchar(50) NOT NULL COMMENT '结算方式一',
  `ReckonTypeS` varchar(50) NOT NULL COMMENT '结算方式二',
  `ReckonTypeT` varchar(50) NOT NULL COMMENT '结算方式三',
  `ReckonMoneyF` double NOT NULL COMMENT '金额',
  `ReckonMoneyS` double NOT NULL COMMENT '金额',
  `ReckonMoneyT` double NOT NULL COMMENT '金额',
  `GatherDiscount` double NOT NULL COMMENT '折扣率',
  `GatherendaccountMonth` date NOT NULL COMMENT '终止帐月',
  `Empid` varchar(50) NOT NULL COMMENT '业务人员编号，也就是人员编号employee(empid)',
  `empName` varchar(50) NOT NULL COMMENT '业务人员',
  `Depid` varchar(50) NOT NULL COMMENT '部门编号depttab(depid)',
  `depName` varchar(50) NOT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) NOT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `checkstate` int(11) NOT NULL COMMENT '审核状态',
  `Remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(20) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(20) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`,`ReckonMoneyS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `advancegather` */

/*Table structure for table `advancegatherdetails` */

DROP TABLE IF EXISTS `advancegatherdetails`;

CREATE TABLE `advancegatherdetails` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码Advancegather(billId)',
  `coteMark` int(11) NOT NULL COMMENT '栏号',
  `PromisedMoney` int(11) DEFAULT NULL COMMENT '预收金额',
  `advanceMoney` int(11) DEFAULT NULL COMMENT '预收余额',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `originBillId` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `summary` varchar(2000) DEFAULT NULL COMMENT '摘要',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `advancegatherdetails` */

/*Table structure for table `apportiondetails` */

DROP TABLE IF EXISTS `apportiondetails`;

CREATE TABLE `apportiondetails` (
  `adeid` varchar(50) DEFAULT NULL COMMENT '采购分摊单号(采购分摊外键)',
  `adesequ` int(11) DEFAULT NULL COMMENT '序号',
  `adeexesid` varchar(50) DEFAULT NULL COMMENT '费用编号',
  `adeexesname` varchar(50) DEFAULT NULL COMMENT '费用名称',
  `adeamtmoney` double DEFAULT NULL COMMENT '金额',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apportiondetails` */

/*Table structure for table `apportionresult` */

DROP TABLE IF EXISTS `apportionresult`;

CREATE TABLE `apportionresult` (
  `atiid` varchar(50) DEFAULT NULL COMMENT '采购分摊单号(采购分摊外键)',
  `atisequ` int(11) DEFAULT NULL COMMENT '序号',
  `storageid` varchar(50) DEFAULT NULL COMMENT '采购入库单',
  `matid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `stockprice` double DEFAULT NULL COMMENT '采购金额',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `atinum` int(11) DEFAULT NULL COMMENT '数量',
  `ademoney` double DEFAULT NULL COMMENT '分摊金额',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apportionresult` */

/*Table structure for table `apportionwise` */

DROP TABLE IF EXISTS `apportionwise`;

CREATE TABLE `apportionwise` (
  `wisid` varchar(50) DEFAULT NULL COMMENT '分摊方式编号',
  `wisname` varchar(50) DEFAULT NULL COMMENT '分摊方式名称',
  `wisename` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `wisremark` varchar(50) DEFAULT NULL COMMENT '备注',
  `enables` varchar(50) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apportionwise` */

/*Table structure for table `clashfund` */

DROP TABLE IF EXISTS `clashfund`;

CREATE TABLE `clashfund` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码',
  `billDate` date NOT NULL COMMENT '单据日期',
  `sinId` int(11) DEFAULT NULL COMMENT '单据类型singleType(sinId)',
  `cliid` varchar(50) DEFAULT NULL COMMENT '客户编号client(cliid)',
  `clishortname` varchar(50) DEFAULT NULL COMMENT '客户简称',
  `currencyType` varchar(50) DEFAULT NULL COMMENT '币别',
  `ReckonTypeF` varchar(50) DEFAULT NULL COMMENT '结算方式一',
  `ReckonTypeS` varchar(50) DEFAULT NULL COMMENT '结算方式二',
  `ReckonTypeT` varchar(50) DEFAULT NULL COMMENT '结算方式三',
  `ReckonMoneyF` double NOT NULL COMMENT '金额',
  `ReckonMoneyS` double DEFAULT NULL COMMENT '金额',
  `ReckonMoneyT` double DEFAULT NULL COMMENT '金额',
  `GatherDiscount` double DEFAULT NULL COMMENT '折扣率',
  `GatherendaccountMonth` date NOT NULL COMMENT '终止帐月',
  `empid` varchar(50) NOT NULL COMMENT '业务人员编号，也就是人员编号employee(empid)',
  `empName` varchar(50) NOT NULL COMMENT '业务人员',
  `depid` varchar(50) NOT NULL COMMENT '部门编号depttab(depid)',
  `depName` varchar(50) NOT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) NOT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `checkstate` int(11) NOT NULL COMMENT '审核状态',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`,`ReckonMoneyF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clashfund` */

/*Table structure for table `clashfunddetailsone` */

DROP TABLE IF EXISTS `clashfunddetailsone`;

CREATE TABLE `clashfunddetailsone` (
  `billId` varchar(50) NOT NULL COMMENT '单据号码clashfund(billId)',
  `coteMark` int(11) NOT NULL COMMENT '栏号',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别(销售订单)',
  `originBillId` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `originoddDate` date DEFAULT NULL COMMENT '原单日期',
  `originoddMoney` double DEFAULT NULL COMMENT '原单金额',
  `currentlybalance` double DEFAULT NULL COMMENT '现行余额',
  `discountMoney` double DEFAULT NULL COMMENT '折让金额',
  `clashMoney` double DEFAULT NULL COMMENT '冲款金额',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`,`coteMark`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clashfunddetailsone` */

/*Table structure for table `clashfunddetailstwo` */

DROP TABLE IF EXISTS `clashfunddetailstwo`;

CREATE TABLE `clashfunddetailstwo` (
  `billId` varchar(50) NOT NULL COMMENT '单据号码clashfund(billId)',
  `coteMark` int(11) NOT NULL COMMENT '栏号',
  `gatherId` varchar(50) DEFAULT NULL COMMENT '预收款单单号',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别(销售订单)',
  `originBillId` varchar(50) DEFAULT NULL COMMENT '来源单号（销售订单号）',
  `originoddrowId` varchar(50) DEFAULT NULL COMMENT '来源单号(行号)',
  `advanceMoney` double DEFAULT NULL COMMENT '预收金额',
  `Advancebalance` double DEFAULT NULL COMMENT '预收余额',
  `adoptAdvanceMoney` double DEFAULT NULL COMMENT '取用预收金额',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`,`coteMark`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `clashfunddetailstwo` */

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `cliid` varchar(50) NOT NULL,
  `clitypeid` varchar(50) DEFAULT NULL,
  `cliname` varchar(50) DEFAULT NULL,
  `clishortname` varchar(50) DEFAULT NULL,
  `cliaddress` varchar(50) DEFAULT NULL,
  `cliarea` varchar(50) DEFAULT NULL,
  `cliename` varchar(50) DEFAULT NULL,
  `clieshortname` varchar(50) DEFAULT NULL,
  `cliprincipal` varchar(50) DEFAULT NULL,
  `clilinkman` varchar(50) DEFAULT NULL,
  `cliphoneone` varchar(50) DEFAULT NULL,
  `cliphonetwo` varchar(50) DEFAULT NULL,
  `cliphonethree` varchar(50) DEFAULT NULL,
  `clibankaccounts` varchar(50) DEFAULT NULL,
  `cliopenbank` varchar(50) DEFAULT NULL,
  `empid` varchar(50) DEFAULT NULL,
  `climobilephone` varchar(50) DEFAULT NULL,
  `cliemail` varchar(50) DEFAULT NULL,
  `cliweb` varchar(100) DEFAULT NULL,
  `clifaxes` varchar(100) DEFAULT NULL,
  `clioldoutdate` date DEFAULT NULL,
  `clioldintodate` date DEFAULT NULL,
  `clinewoutdate` date DEFAULT NULL,
  `clinewintodate` date DEFAULT NULL,
  `clidiscount` varchar(50) DEFAULT NULL,
  `clipricestep` varchar(50) DEFAULT NULL,
  `clicreatedate` date DEFAULT NULL,
  `clistopdate` date DEFAULT NULL,
  `clizhangkuanedu` double DEFAULT NULL,
  `cliremainedu` double DEFAULT NULL,
  `clicondition` varchar(50) DEFAULT NULL,
  `climonthreckoning` date DEFAULT NULL,
  `clicreditstep` varchar(50) DEFAULT NULL,
  `cliqcdealmoney` double DEFAULT NULL,
  `cliqmpremoney` double DEFAULT NULL,
  `cliqmdealmoney` double DEFAULT NULL,
  `cliotherremark` varchar(200) DEFAULT NULL,
  `clitrash` varchar(50) DEFAULT NULL,
  `safetyone` varchar(100) DEFAULT NULL,
  `safetytwo` varchar(100) DEFAULT NULL,
  `enables` int(11) DEFAULT NULL,
  PRIMARY KEY (`cliid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `client` */

/*Table structure for table `comcustclass` */

DROP TABLE IF EXISTS `comcustclass`;

CREATE TABLE `comcustclass` (
  `classId` varchar(50) NOT NULL,
  `className` varchar(100) DEFAULT NULL,
  `engName` varchar(100) DEFAULT NULL,
  `memo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`classId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comcustclass` */

/*Table structure for table `comdepartment` */

DROP TABLE IF EXISTS `comdepartment`;

CREATE TABLE `comdepartment` (
  `departId` varchar(50) NOT NULL COMMENT '部门编号',
  `departName` varchar(200) DEFAULT NULL COMMENT '部门名称',
  `EngName` varchar(100) DEFAULT NULL COMMENT '英文名称',
  `memo` varchar(250) DEFAULT NULL COMMENT '备注',
  `female` int(11) DEFAULT NULL COMMENT '女性',
  `male` int(11) DEFAULT NULL COMMENT '男性',
  `calID` varchar(50) DEFAULT NULL COMMENT '行事历',
  `salaryTypeID` varchar(50) DEFAULT NULL COMMENT '工资方案',
  `salaryClassName` varchar(100) DEFAULT NULL COMMENT '工资方案名称',
  PRIMARY KEY (`departId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comdepartment` */

/*Table structure for table `comproduct` */

DROP TABLE IF EXISTS `comproduct`;

CREATE TABLE `comproduct` (
  `prodId` varchar(50) NOT NULL,
  `className` varchar(100) DEFAULT NULL,
  `prodName` varchar(100) DEFAULT NULL,
  `classId` varchar(50) DEFAULT NULL,
  `productclassName` varchar(100) DEFAULT NULL,
  `suggestPrice` double DEFAULT NULL,
  `suggestPriceA` double DEFAULT NULL,
  `suggestPriceB` double DEFAULT NULL,
  `suggestPriceC` double DEFAULT NULL,
  `suggestPriceD` double DEFAULT NULL,
  `suggestPriceE` double DEFAULT NULL,
  `stdPrice` double DEFAULT NULL,
  `prodForm` varchar(100) DEFAULT NULL,
  `priceOfTax` int(11) DEFAULT NULL,
  `busiTaxRate` float DEFAULT NULL,
  `advanceDays` int(11) DEFAULT NULL,
  `majorSupplierId` varchar(50) DEFAULT NULL,
  `majorSupplierName` varchar(100) DEFAULT NULL,
  `sluggishDays` int(11) DEFAULT NULL,
  `invalidDate` date DEFAULT NULL,
  `memo` varchar(200) DEFAULT NULL,
  `stdUnitId` varchar(50) DEFAULT NULL,
  `stdUnitName` varchar(50) DEFAULT NULL,
  `safetyone` varchar(100) DEFAULT NULL,
  `safetytwo` varchar(100) DEFAULT NULL,
  `enables` int(11) DEFAULT NULL,
  PRIMARY KEY (`prodId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comproduct` */

/*Table structure for table `comproductclass` */

DROP TABLE IF EXISTS `comproductclass`;

CREATE TABLE `comproductclass` (
  `classID` varchar(50) NOT NULL,
  `className` varchar(100) DEFAULT NULL,
  `engName` varchar(50) DEFAULT NULL,
  `accInventoryId` varchar(50) DEFAULT NULL,
  `accInventoryName` varchar(100) DEFAULT NULL,
  `accSaleID` varchar(100) DEFAULT NULL,
  `accSaleName` varchar(100) DEFAULT NULL,
  `accSaleCostID` varchar(100) DEFAULT NULL,
  `accSaleCostName` varchar(100) DEFAULT NULL,
  `giftExpenseID` varchar(50) DEFAULT NULL,
  `giftExpenseName` varchar(100) DEFAULT NULL,
  `otherIncomeID` varchar(50) DEFAULT NULL,
  `otherIncomeName` varchar(100) DEFAULT NULL,
  `otherExpenseID` varchar(50) DEFAULT NULL,
  `otherExpenseName` varchar(100) DEFAULT NULL,
  `otherCostID` varchar(50) DEFAULT NULL,
  `otherCostName` varchar(100) DEFAULT NULL,
  `memo` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`classID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comproductclass` */

/*Table structure for table `comstdunit` */

DROP TABLE IF EXISTS `comstdunit`;

CREATE TABLE `comstdunit` (
  `unitId` varchar(50) NOT NULL COMMENT '单位编号',
  `unitName` varchar(100) DEFAULT NULL COMMENT '单位名称',
  `engName` varchar(100) DEFAULT NULL COMMENT '英文名称',
  `memo` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`unitId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comstdunit` */

/*Table structure for table `comwarehouse` */

DROP TABLE IF EXISTS `comwarehouse`;

CREATE TABLE `comwarehouse` (
  `wareHouseID` varchar(50) NOT NULL COMMENT '仓库编号',
  `wareHouseName` varchar(100) DEFAULT NULL COMMENT '仓库名称',
  `shortName` varchar(100) DEFAULT NULL COMMENT '仓库简称',
  `engName` varchar(100) DEFAULT NULL COMMENT '英文名称',
  `linkMan` varchar(100) DEFAULT NULL COMMENT '联系人员',
  `telephone` varchar(100) DEFAULT NULL COMMENT '联系电话',
  `wareHouseAddress` varchar(100) DEFAULT NULL COMMENT '仓库地址',
  `memo` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`wareHouseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `comwarehouse` */

/*Table structure for table `content` */

DROP TABLE IF EXISTS `content`;

CREATE TABLE `content` (
  `columnno` varchar(50) NOT NULL COMMENT '栏号',
  `stocknumber` varchar(100) DEFAULT NULL COMMENT '物料编号',
  `stockName` varchar(100) DEFAULT NULL COMMENT '物料名称',
  `specifications` varchar(100) DEFAULT NULL COMMENT '规格型号',
  `organizationName` varchar(100) DEFAULT NULL COMMENT '单位名称',
  `quantity` int(100) DEFAULT NULL COMMENT '数量',
  `univalence` double DEFAULT NULL COMMENT '单价',
  `money` double DEFAULT NULL COMMENT '金额',
  `taxrate` double DEFAULT NULL COMMENT '税率',
  `tax` double DEFAULT NULL COMMENT '税额',
  `taxamount` double DEFAULT NULL COMMENT '含税金额',
  `nonequantity` int(100) DEFAULT NULL COMMENT '未进数量',
  `ordernumber` varchar(100) DEFAULT NULL COMMENT '采购订单号',
  `journalizingremark` varchar(100) DEFAULT NULL COMMENT '分录备注',
  `beiyon` varchar(100) DEFAULT NULL,
  `beiyone` varchar(100) DEFAULT NULL,
  `beiyons` varchar(100) DEFAULT NULL,
  `beiyonf` varchar(100) DEFAULT NULL,
  `beiyonw` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`columnno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `content` */

/*Table structure for table `copewith` */

DROP TABLE IF EXISTS `copewith`;

CREATE TABLE `copewith` (
  `customerId` varchar(20) NOT NULL COMMENT '供应商id',
  `cash` double DEFAULT NULL COMMENT '结算一',
  `visa` double DEFAULT NULL COMMENT '结算二',
  `otherPay` double DEFAULT NULL COMMENT '结算三',
  `cashStyleName` varchar(100) DEFAULT NULL COMMENT '结算方式名称1',
  `visaStyleName` varchar(100) DEFAULT NULL COMMENT '结算方式名称2',
  `otherPayStyleID` varchar(100) DEFAULT NULL COMMENT '结算方式名称3',
  `fundBillNo` varchar(20) DEFAULT NULL COMMENT '单据号码',
  `billDate` datetime DEFAULT NULL COMMENT '单据日期',
  `rcurrencyId` int(20) DEFAULT NULL COMMENT '币别id',
  `rcurrencyName` varchar(100) DEFAULT NULL COMMENT '币别名称',
  `exchRate` varchar(100) DEFAULT NULL COMMENT '汇率',
  `offSetStyle` double DEFAULT NULL COMMENT '应付冲款类型',
  `proofnumber` varchar(100) DEFAULT NULL COMMENT '凭证编号',
  `accMonthToMonth` datetime DEFAULT NULL COMMENT '终止张月',
  `discountPer` double DEFAULT NULL COMMENT '折扣率',
  `deptFrom` varchar(100) DEFAULT NULL COMMENT '所属部门',
  `maker` varchar(100) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(100) DEFAULT NULL COMMENT '复核人员',
  `project` varchar(100) DEFAULT NULL COMMENT '所属项目',
  `beiyony` varchar(100) DEFAULT NULL,
  `beiyonr` varchar(100) DEFAULT NULL,
  `beiyons` varchar(100) DEFAULT NULL,
  `beiyonf` varchar(100) DEFAULT NULL,
  `beiyonw` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `copewith` */

/*Table structure for table `credit` */

DROP TABLE IF EXISTS `credit`;

CREATE TABLE `credit` (
  `dueToId` varchar(100) NOT NULL COMMENT '帐款归属id',
  `payTerm` varchar(100) DEFAULT NULL COMMENT '付款条件',
  `prepayDay` datetime DEFAULT NULL COMMENT '付款日期',
  `cashPayStyle` double DEFAULT NULL COMMENT '结算方式一',
  `visaPayStyle` double DEFAULT NULL COMMENT '结算方式二',
  `otherPayStyle` double DEFAULT NULL COMMENT '结算方式三',
  `cashPayStyleName` varchar(100) DEFAULT NULL COMMENT '结算方式一名称',
  `visaPayStyleName` varchar(100) DEFAULT NULL COMMENT '结算方式二名称',
  `otherPayStyleName` varchar(100) DEFAULT NULL COMMENT '结算方式三名称',
  `uDefone` varchar(100) DEFAULT NULL COMMENT '自定义栏一',
  `uDeftow` varchar(100) DEFAULT NULL COMMENT '自定义栏二',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `beiyon` varchar(100) DEFAULT NULL,
  `beiyonr` varchar(100) DEFAULT NULL,
  `beiyons` varchar(100) DEFAULT NULL,
  `beiyonf` varchar(100) DEFAULT NULL,
  `beiyonw` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dueToId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `credit` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `empid` varchar(100) NOT NULL,
  `empname` varchar(100) DEFAULT NULL,
  `empename` varchar(100) DEFAULT NULL,
  `depid` varchar(100) DEFAULT NULL,
  `empsex` varchar(50) DEFAULT NULL,
  `empcard` varchar(100) DEFAULT NULL,
  `empstate` varchar(50) DEFAULT NULL,
  `empduty` varchar(50) DEFAULT NULL,
  `empphoneone` varchar(50) DEFAULT NULL,
  `empphonetwo` varchar(50) DEFAULT NULL,
  `empphonethree` varchar(50) DEFAULT NULL,
  `empbankaccounts` varchar(50) DEFAULT NULL,
  `empbirthday` date DEFAULT NULL,
  `empjob` varchar(100) DEFAULT NULL,
  `Empemail` varchar(100) DEFAULT NULL,
  `empweb` varchar(100) DEFAULT NULL,
  `empfaxes` varchar(100) DEFAULT NULL,
  `empopenbank` varchar(100) DEFAULT NULL,
  `emptop` varchar(50) DEFAULT NULL,
  `empdegree` varchar(50) DEFAULT NULL,
  `empgotime` date DEFAULT NULL,
  `empgraduatetime` date DEFAULT NULL,
  `emppactstarttime` date DEFAULT NULL,
  `emppactendtime` date DEFAULT NULL,
  `empnowmailid` varchar(50) DEFAULT NULL,
  `empfamilyphone` varchar(50) DEFAULT NULL,
  `empfamilyplace` varchar(50) DEFAULT NULL,
  `empnowphone` varchar(50) DEFAULT NULL,
  `empnowplace` varchar(50) DEFAULT NULL,
  `empexigenceman` varchar(50) DEFAULT NULL,
  `empfamilymailid` varchar(50) DEFAULT NULL,
  `empremark` varchar(200) DEFAULT NULL,
  `emptrash` int(11) DEFAULT NULL,
  `safetyone` varchar(100) DEFAULT NULL,
  `safetytwo` varchar(100) DEFAULT NULL,
  `enables` int(11) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

/*Table structure for table `inventory` */

DROP TABLE IF EXISTS `inventory`;

CREATE TABLE `inventory` (
  `columnno` varchar(100) DEFAULT NULL COMMENT '栏号',
  `stocknumber` varchar(100) NOT NULL COMMENT '物料编号',
  `stockName` varchar(100) DEFAULT NULL COMMENT '物料名称',
  `specifications` varchar(100) DEFAULT NULL COMMENT '规格型号',
  `organizationName` varchar(100) DEFAULT NULL COMMENT '单位名称',
  `quantity` int(100) DEFAULT NULL COMMENT '数量',
  `univalence` double DEFAULT NULL COMMENT '单价',
  `moneyy` double DEFAULT NULL COMMENT '金额',
  `taxrate` double DEFAULT NULL COMMENT '税率',
  `tax` double DEFAULT NULL COMMENT '税额',
  `taxamount` double DEFAULT NULL COMMENT '含税金额',
  `sourceOdd` varchar(100) DEFAULT NULL COMMENT '来源单号',
  `singlesource` varchar(100) DEFAULT NULL COMMENT '来源单别',
  `journalizingremark` varchar(100) DEFAULT NULL COMMENT '分录备注',
  `rate` double DEFAULT NULL COMMENT '汇差',
  `differenceprice` double DEFAULT NULL COMMENT '价差',
  `differencepricebwb` varchar(100) DEFAULT NULL COMMENT '价差本位币',
  `balancetotal` double DEFAULT NULL COMMENT '差额合计',
  `beiyon` varchar(100) DEFAULT NULL,
  `beiyonr` varchar(100) DEFAULT NULL,
  `beiyons` varchar(100) DEFAULT NULL,
  `beiyonf` varchar(100) DEFAULT NULL,
  `beiyonw` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`stocknumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `inventory` */

/*Table structure for table `movemain` */

DROP TABLE IF EXISTS `movemain`;

CREATE TABLE `movemain` (
  `moveNO` varchar(14) NOT NULL COMMENT '单据编号',
  `moveDate` date DEFAULT NULL COMMENT '单据日期',
  `makerID` varchar(20) DEFAULT NULL COMMENT '制单人员编号',
  `maker` varchar(10) DEFAULT NULL COMMENT '制单人员',
  `permitterID` varchar(20) DEFAULT NULL COMMENT '复核人员编号',
  `permitter` varchar(10) DEFAULT NULL COMMENT '复核人员',
  `wareID` varchar(6) DEFAULT NULL COMMENT '调入仓库编号',
  `wareOutID` varchar(6) DEFAULT NULL COMMENT '调出仓库编号',
  `sumQty` int(11) DEFAULT NULL COMMENT '数量合计',
  `hasCheck` tinyint(1) DEFAULT NULL COMMENT '是否过账',
  `udef1` varchar(50) DEFAULT NULL COMMENT '自定义一',
  `udef2` varchar(50) DEFAULT NULL COMMENT '自定义二',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  `columOne` varchar(200) DEFAULT NULL,
  `columTow` varchar(200) DEFAULT NULL,
  `columThree` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`moveNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `movemain` */

/*Table structure for table `movesub` */

DROP TABLE IF EXISTS `movesub`;

CREATE TABLE `movesub` (
  `moveNO` varchar(14) NOT NULL COMMENT '单据编号',
  `serNO` int(11) NOT NULL COMMENT '栏号',
  `moveDate` date DEFAULT NULL COMMENT '单据日期',
  `prodID` varchar(14) DEFAULT NULL COMMENT '物料编号',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `itemRemark` varchar(1000) DEFAULT NULL COMMENT '分录备注',
  `validDateUsed` tinyint(1) DEFAULT NULL COMMENT '使用有效日期',
  `columOne` varchar(200) DEFAULT NULL,
  `columTow` varchar(200) DEFAULT NULL,
  `columThree` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`moveNO`,`serNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `movesub` */

/*Table structure for table `otherenterstock` */

DROP TABLE IF EXISTS `otherenterstock`;

CREATE TABLE `otherenterstock` (
  `billNo` varchar(20) NOT NULL COMMENT '单据号码',
  `adjustDate` date DEFAULT NULL COMMENT '单据日期',
  `wareID` int(11) DEFAULT NULL COMMENT '仓库ID',
  `wareName` varchar(20) DEFAULT NULL COMMENT '仓库名称',
  `billStyleID` int(11) DEFAULT NULL COMMENT '入库类型ID',
  `billStyleName` varchar(20) DEFAULT NULL COMMENT '其它入库类型名称',
  `salesID` int(11) DEFAULT NULL COMMENT '入库人员ID',
  `salesName` varchar(20) DEFAULT NULL COMMENT '入库人员名称',
  `departID` int(11) DEFAULT NULL COMMENT '所属部门ID',
  `departName` varchar(20) DEFAULT NULL COMMENT '所属部门名称',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `columone` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `columtow` varchar(20) DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `otherenterstock` */

/*Table structure for table `otherenterstocklist` */

DROP TABLE IF EXISTS `otherenterstocklist`;

CREATE TABLE `otherenterstocklist` (
  `billNo` varchar(20) DEFAULT NULL COMMENT '主表的单据号码',
  `prodID` int(11) DEFAULT NULL COMMENT '物料编号',
  `prodName` varchar(20) DEFAULT NULL COMMENT '物料名称',
  `prdClassID` int(11) DEFAULT NULL COMMENT '物料类别ID',
  `prdClassName` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `prodSize` varchar(20) DEFAULT NULL COMMENT '规格型号',
  `unit` varchar(20) DEFAULT NULL COMMENT '单位',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `amount` double DEFAULT NULL COMMENT '金额',
  `itemRemark` varchar(20) DEFAULT NULL COMMENT '分录备注',
  `columone` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `columtow` varchar(20) DEFAULT NULL COMMENT '备用字段2'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `otherenterstocklist` */

/*Table structure for table `otheroutstock` */

DROP TABLE IF EXISTS `otheroutstock`;

CREATE TABLE `otheroutstock` (
  `billNo` varchar(20) NOT NULL COMMENT '单据号码',
  `adjustDate` date DEFAULT NULL COMMENT '单据日期',
  `wareID` int(11) DEFAULT NULL COMMENT '仓库ID',
  `wareName` varchar(20) DEFAULT NULL COMMENT '仓库名称',
  `billStyleID` int(11) DEFAULT NULL COMMENT '出库类型ID',
  `billStyleName` varchar(20) DEFAULT NULL COMMENT '其它出库类型名称',
  `salesID` int(11) DEFAULT NULL COMMENT '出库人员ID',
  `salesName` varchar(20) DEFAULT NULL COMMENT '出库人员名称',
  `departID` int(11) DEFAULT NULL COMMENT '所属部门ID',
  `departName` varchar(20) DEFAULT NULL COMMENT '所属部门名称',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `columone` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `columtow` varchar(20) DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `otheroutstock` */

/*Table structure for table `otheroutstocklist` */

DROP TABLE IF EXISTS `otheroutstocklist`;

CREATE TABLE `otheroutstocklist` (
  `billNo` varchar(20) DEFAULT NULL COMMENT '主表的单据号码',
  `prodID` int(11) DEFAULT NULL COMMENT '物料编号',
  `prodName` varchar(20) DEFAULT NULL COMMENT '物料名称',
  `prdClassID` int(11) DEFAULT NULL COMMENT '物料类别ID',
  `prdClassName` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `prodSize` varchar(20) DEFAULT NULL COMMENT '规格型号',
  `unit` varchar(20) DEFAULT NULL COMMENT '单位',
  `quantity` int(11) DEFAULT NULL COMMENT '数量',
  `amount` double DEFAULT NULL COMMENT '金额',
  `itemRemark` varchar(20) DEFAULT NULL COMMENT '分录备注',
  `columone` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `columtow` varchar(20) DEFAULT NULL COMMENT '备用字段2'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `otheroutstocklist` */

/*Table structure for table `prepaidandbz` */

DROP TABLE IF EXISTS `prepaidandbz`;

CREATE TABLE `prepaidandbz` (
  `amountadvanced` double NOT NULL COMMENT '预付金额',
  `classified` varchar(100) DEFAULT NULL COMMENT '来源别',
  `sourcenumber` varchar(100) DEFAULT NULL COMMENT '来源单号',
  `bstract` varchar(100) DEFAULT NULL COMMENT '摘要',
  `uDefone` varchar(100) DEFAULT NULL COMMENT '自定义栏一',
  `uDeftow` varchar(100) DEFAULT NULL COMMENT '自定义栏二',
  `Remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `beiyon` varchar(100) DEFAULT NULL,
  `beiyone` varchar(100) DEFAULT NULL,
  `beiyons` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`amountadvanced`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `prepaidandbz` */

/*Table structure for table `provideinfo` */

DROP TABLE IF EXISTS `provideinfo`;

CREATE TABLE `provideinfo` (
  `peoid` varchar(50) NOT NULL,
  `peoname` varchar(100) DEFAULT NULL,
  `peoshortname` varchar(100) DEFAULT NULL,
  `peoascription` varchar(100) DEFAULT NULL,
  `peopeeid` varchar(100) DEFAULT NULL,
  `peopeename` varchar(100) DEFAULT NULL,
  `peoarea` varchar(100) DEFAULT NULL,
  `peoprincipal` varchar(100) DEFAULT NULL,
  `peolinkman` varchar(100) DEFAULT NULL,
  `peophoneone` varchar(100) DEFAULT NULL,
  `peophonetwo` varchar(100) DEFAULT NULL,
  `peomobilephone` varchar(100) DEFAULT NULL,
  `peobankaccounts` varchar(100) DEFAULT NULL,
  `peoopenbank` varchar(100) DEFAULT NULL,
  `peoempid` varchar(50) DEFAULT NULL,
  `peoempname` varchar(50) DEFAULT NULL,
  `peocalling` varchar(100) DEFAULT NULL,
  `peoemail` varchar(100) DEFAULT NULL,
  `peoweb` varchar(100) DEFAULT NULL,
  `peofaxes` varchar(100) DEFAULT NULL,
  `peocreatedate` date DEFAULT NULL,
  `peocreditclass` varchar(50) DEFAULT NULL,
  `peozhangkuanedu` double DEFAULT NULL,
  `peoremainedu` double DEFAULT NULL,
  `peomonthreckoning` double DEFAULT NULL,
  `peoqcprepaymoney` double DEFAULT NULL,
  `peoqcdealmoney` double DEFAULT NULL,
  `peoqmprepaymoney` double DEFAULT NULL,
  `peoqmdealmoney` double DEFAULT NULL,
  `peoremark` varchar(200) DEFAULT NULL,
  `peotrash` int(11) DEFAULT NULL,
  `safetyone` varchar(200) DEFAULT NULL,
  `safetytwo` varchar(200) DEFAULT NULL,
  `enables` int(11) DEFAULT NULL,
  PRIMARY KEY (`peoid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `provideinfo` */

/*Table structure for table `providetype` */

DROP TABLE IF EXISTS `providetype`;

CREATE TABLE `providetype` (
  `peeid` varchar(50) NOT NULL,
  `peename` varchar(100) DEFAULT NULL,
  `peeEname` varchar(50) DEFAULT NULL,
  `peeremark` varchar(200) DEFAULT NULL,
  `peetrash` int(11) DEFAULT NULL,
  `safetyone` varchar(200) DEFAULT NULL,
  `safetytwo` varchar(200) DEFAULT NULL,
  `enables` int(11) DEFAULT NULL,
  PRIMARY KEY (`peeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `providetype` */

/*Table structure for table `purchase` */

DROP TABLE IF EXISTS `purchase`;

CREATE TABLE `purchase` (
  `fundBillNo` varchar(100) NOT NULL COMMENT '单据号码',
  `billDate` datetime DEFAULT NULL COMMENT '单据日期',
  `custId` varchar(100) DEFAULT NULL COMMENT '供应商id',
  `invoiceNo` varchar(100) DEFAULT NULL COMMENT '发票号码',
  `currId` varchar(50) DEFAULT NULL COMMENT '币别id',
  `exchRate` varchar(20) DEFAULT NULL COMMENT '汇率',
  `deptId` varchar(50) DEFAULT NULL COMMENT '所属部门id',
  `deptName` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `projectID` varchar(50) DEFAULT NULL COMMENT '所属项目id',
  `projectName` varchar(50) DEFAULT NULL COMMENT '项目名称',
  `salesmanid` int(11) DEFAULT NULL COMMENT '采购人员id',
  `personName` varchar(100) DEFAULT NULL COMMENT '采购人员姓名',
  `priceOfTax` varchar(100) DEFAULT NULL COMMENT '单价是否含税',
  `voucherNo` varchar(100) DEFAULT NULL COMMENT '凭证编号',
  `cVoucherNo` varchar(100) DEFAULT NULL COMMENT '差价凭证编号',
  `affirmState` varchar(100) DEFAULT NULL COMMENT '采购核对状态',
  `bllType` varchar(100) DEFAULT NULL COMMENT '单据类型',
  `kerSign` varchar(100) DEFAULT NULL COMMENT '制单人员签名',
  `permitterSign` varchar(100) DEFAULT NULL COMMENT '复核人签名',
  `beiyon` varchar(100) DEFAULT NULL,
  `beiyonr` varchar(100) DEFAULT NULL,
  `beiyons` varchar(100) DEFAULT NULL,
  `beiyonf` varchar(100) DEFAULT NULL,
  `beiyonw` varchar(100) DEFAULT NULL,
  `beiyonl` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`fundBillNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `purchase` */

/*Table structure for table `recededetails` */

DROP TABLE IF EXISTS `recededetails`;

CREATE TABLE `recededetails` (
  `recid` varchar(50) DEFAULT NULL COMMENT '采购退货单号',
  `detsequ` int(11) DEFAULT NULL COMMENT '序号',
  `matid` varchar(50) DEFAULT NULL COMMENT '物料编号',
  `matname` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `detnum` int(11) DEFAULT NULL COMMENT '数量',
  `detagioprice` double DEFAULT NULL COMMENT '折扣前单价',
  `detdiscount` double DEFAULT NULL COMMENT '折数',
  `detprice` double DEFAULT NULL COMMENT '单价',
  `detamtmoney` double DEFAULT NULL COMMENT '金额',
  `depcess` double DEFAULT NULL COMMENT '税率',
  `depcessmoney` double DEFAULT NULL COMMENT '税额',
  `deplargess` int(11) DEFAULT NULL COMMENT '是否赠品',
  `sodorigintype` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `sodorigin` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `enables` varchar(50) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `recededetails` */

/*Table structure for table `saleoffer` */

DROP TABLE IF EXISTS `saleoffer`;

CREATE TABLE `saleoffer` (
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `billNo` varchar(20) NOT NULL COMMENT '单据号码',
  `valiDate` date DEFAULT NULL COMMENT '有效日期',
  `customerID` int(11) DEFAULT NULL COMMENT '客户ID',
  `customerName` varchar(20) DEFAULT NULL COMMENT '客户名称',
  `addressID` int(11) DEFAULT NULL COMMENT '送货地址Id',
  `custAddress` varchar(200) DEFAULT NULL COMMENT '送货地址',
  `priceOfTax` int(11) DEFAULT NULL COMMENT '单价是否含税1为含税2则为未税',
  `currCurrencyName` varchar(20) DEFAULT NULL COMMENT '币别',
  `exchRate` double DEFAULT NULL COMMENT '汇率',
  `salesName` varchar(20) DEFAULT NULL COMMENT '业务人员名称',
  `departID` int(11) DEFAULT NULL COMMENT '所属部门',
  `departName` varchar(20) DEFAULT NULL COMMENT '所属部门名称',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `columone` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `columtow` varchar(20) DEFAULT NULL COMMENT '备用字段2',
  UNIQUE KEY `billNo` (`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `saleoffer` */

/*Table structure for table `saleofferlist` */

DROP TABLE IF EXISTS `saleofferlist`;

CREATE TABLE `saleofferlist` (
  `billNo` varchar(20) DEFAULT NULL COMMENT '主表的单据号码',
  `prodID` varchar(20) DEFAULT NULL COMMENT '物料编号',
  `prodName` varchar(20) DEFAULT NULL COMMENT '物料名称',
  `prdClassID` int(11) DEFAULT NULL COMMENT '物料类别',
  `prdClassName` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `prodSize` varchar(20) DEFAULT NULL COMMENT '规格型号',
  `sUnit` varchar(20) DEFAULT NULL COMMENT '单位名称',
  `sQuantity` int(11) DEFAULT NULL COMMENT '数量',
  `oldPrice` double DEFAULT NULL COMMENT '折扣前单价',
  `discount` double DEFAULT NULL COMMENT '折数',
  `sPrice` double DEFAULT NULL COMMENT '单价',
  `amount` double DEFAULT NULL COMMENT '金额',
  `taxRate` double DEFAULT NULL COMMENT '税率',
  `taxAmt` int(11) DEFAULT NULL COMMENT '税额',
  `vFTotal` int(11) DEFAULT NULL COMMENT '含税金额',
  `isGift` int(11) DEFAULT NULL COMMENT '赠送1为赠送2则为不增送',
  `itemRemark` varchar(20) DEFAULT NULL COMMENT '分录备注',
  `columone` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `columtow` varchar(20) DEFAULT NULL COMMENT '备用字段2'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `saleofferlist` */

/*Table structure for table `saleorder` */

DROP TABLE IF EXISTS `saleorder`;

CREATE TABLE `saleorder` (
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `billNo` varchar(20) NOT NULL COMMENT '单据号码',
  `valiDate` date DEFAULT NULL COMMENT '有效日期',
  `customerID` varchar(20) DEFAULT NULL COMMENT '客户',
  `customerName` varchar(20) DEFAULT NULL COMMENT '客户名称',
  `custBillNo` varchar(20) DEFAULT NULL COMMENT '客户订单',
  `addressID` int(11) DEFAULT NULL COMMENT '送货地址Id',
  `custAddress` varchar(200) DEFAULT NULL COMMENT '送货地址',
  `priceOfTax` int(11) DEFAULT NULL COMMENT '单价是否含税1为含税2则为未税',
  `billStatus` int(11) DEFAULT NULL COMMENT '单况1为未结案2为已结案3为无效',
  `billStyleID` int(11) DEFAULT NULL COMMENT '销售订单类型ID',
  `billStyleName` varchar(20) DEFAULT NULL COMMENT '销售订单类型名称',
  `currCurrencyName` varchar(20) DEFAULT NULL COMMENT '币别',
  `exchRate` double DEFAULT NULL COMMENT '汇率',
  `custFundsAttribution` varchar(20) DEFAULT NULL COMMENT '账款归属',
  `catherStyle` varchar(20) DEFAULT NULL COMMENT '收款条件',
  `prepayDay` date DEFAULT NULL COMMENT '收款日期',
  `gatherDelay` int(11) DEFAULT NULL COMMENT '收款天数',
  `accMonth` date DEFAULT NULL COMMENT '账款月份',
  `salesName` varchar(20) DEFAULT NULL COMMENT '业务人员名称',
  `departID` int(11) DEFAULT NULL COMMENT '所属部门',
  `departName` varchar(20) DEFAULT NULL COMMENT '所属部门名称',
  `maker` varchar(20) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(20) DEFAULT NULL COMMENT '复核人员',
  `columone` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `columtow` varchar(20) DEFAULT NULL COMMENT '备用字段2',
  PRIMARY KEY (`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `saleorder` */

/*Table structure for table `saleorderlist` */

DROP TABLE IF EXISTS `saleorderlist`;

CREATE TABLE `saleorderlist` (
  `billNo` varchar(20) DEFAULT NULL COMMENT '主表的单据号码',
  `prodID` varchar(20) DEFAULT NULL COMMENT '物料编号',
  `prodName` varchar(20) DEFAULT NULL COMMENT '物料名称',
  `prdClassID` int(11) DEFAULT NULL COMMENT '物料类别',
  `prdClassName` varchar(20) DEFAULT NULL COMMENT '类别名称',
  `prodSize` varchar(20) DEFAULT NULL COMMENT '规格型号',
  `sUnit` varchar(20) DEFAULT NULL COMMENT '单位名称',
  `sQuantity` int(11) DEFAULT NULL COMMENT '数量',
  `oldPrice` double DEFAULT NULL COMMENT '折扣前单价',
  `discount` double DEFAULT NULL COMMENT '折数',
  `sPrice` double DEFAULT NULL COMMENT '单价',
  `amount` double DEFAULT NULL COMMENT '金额',
  `taxRate` double DEFAULT NULL COMMENT '税率',
  `taxAmt` int(11) DEFAULT NULL COMMENT '税额',
  `vFTotal` int(11) DEFAULT NULL COMMENT '含税金额',
  `preInDate` date DEFAULT NULL COMMENT '预出库日',
  `qtyRemain` int(11) DEFAULT NULL COMMENT '未出数量',
  `isGift` int(11) DEFAULT NULL COMMENT '赠送1为赠送2则为不增送',
  `itemRemark` varchar(20) DEFAULT NULL COMMENT '分录备注',
  `fromNo` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `tranType` varchar(20) DEFAULT NULL COMMENT '来源单别',
  `columone` varchar(20) DEFAULT NULL COMMENT '备用字段1',
  `columtow` varchar(20) DEFAULT NULL COMMENT '备用字段2'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `saleorderlist` */

/*Table structure for table `sellcancel` */

DROP TABLE IF EXISTS `sellcancel`;

CREATE TABLE `sellcancel` (
  `billId` varchar(50) NOT NULL COMMENT '客户编号',
  `clishortname` varchar(50) NOT NULL COMMENT '客户简称',
  `cliplaceid` varchar(50) DEFAULT NULL COMMENT '地址编号',
  `cliplace` varchar(50) DEFAULT NULL COMMENT '地址',
  `effectdate` date DEFAULT NULL COMMENT '有效日期',
  `currencyType` varchar(50) NOT NULL COMMENT '币别',
  `priceWhetherTax` varchar(50) NOT NULL COMMENT '单价是否含税',
  `stoid` varchar(50) NOT NULL COMMENT '仓库编号',
  `stoname` varchar(50) NOT NULL COMMENT '仓库名称',
  `whetheranewenterstorage` int(2) NOT NULL COMMENT '是否重新入库',
  `empid` varchar(50) NOT NULL COMMENT '业务人员编号',
  `empName` varchar(50) NOT NULL COMMENT '业务人员',
  `depid` varchar(50) NOT NULL COMMENT '部门编号',
  `depName` varchar(50) NOT NULL COMMENT '所属部门',
  `makeEmpName` varchar(50) NOT NULL COMMENT '制单人员',
  `auditingEmpName` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `checkstate` int(2) NOT NULL COMMENT '审核状态',
  `enable` int(9) NOT NULL COMMENT '标识是否删除',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `totalMoney` double DEFAULT NULL COMMENT '合计金额',
  `totalTax` double DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` double DEFAULT NULL COMMENT '合计含税金额',
  `enables` int(2) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(20) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(20) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellcancel` */

/*Table structure for table `sellcanceldetails` */

DROP TABLE IF EXISTS `sellcanceldetails`;

CREATE TABLE `sellcanceldetails` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码',
  `coteMark` int(9) NOT NULL COMMENT '栏号',
  `matid` varchar(50) NOT NULL COMMENT '物料编号',
  `matname` varchar(50) NOT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `matunit` varchar(50) NOT NULL COMMENT '单位名称',
  `number` int(10) NOT NULL COMMENT '数量',
  `agioAgoPrice` double NOT NULL COMMENT '折扣前单价',
  `agio` double NOT NULL COMMENT '折数',
  `price` double NOT NULL COMMENT '单价',
  `money` double NOT NULL COMMENT '金额',
  `cess` double NOT NULL COMMENT '税率',
  `taxmoney` double NOT NULL COMMENT '税额',
  `intaxmoney` double NOT NULL COMMENT '含税金额',
  `present` varchar(4) DEFAULT NULL COMMENT '赠品',
  `factCost` double DEFAULT NULL COMMENT '实际成本',
  `criterionCost` double DEFAULT NULL COMMENT '标准成本',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `originBillId` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `enables` int(4) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellcanceldetails` */

/*Table structure for table `sellissueorder` */

DROP TABLE IF EXISTS `sellissueorder`;

CREATE TABLE `sellissueorder` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码',
  `billDate` date NOT NULL COMMENT '单据日期',
  `sinId` int(9) NOT NULL COMMENT '单据类型',
  `sinname` varchar(50) DEFAULT NULL COMMENT '单据名称',
  `cliid` varchar(50) NOT NULL COMMENT '客户编号',
  `clishortname` varchar(20) NOT NULL COMMENT '客户简称',
  `cliplaceid` varchar(20) DEFAULT NULL COMMENT '地址编号',
  `cliplace` varchar(20) DEFAULT NULL COMMENT '地址',
  `effectdate` date DEFAULT NULL COMMENT '有效日期',
  `currencyType` varchar(20) NOT NULL COMMENT '币别',
  `priceWhetherTax` varchar(20) NOT NULL COMMENT '单价是否含税',
  `stoid` varchar(50) NOT NULL COMMENT '仓库编号',
  `stoname` varchar(20) NOT NULL COMMENT '仓库名称',
  `empid` int(10) NOT NULL COMMENT '业务人员编号',
  `empName` varchar(20) NOT NULL COMMENT '业务人员',
  `depid` int(10) NOT NULL COMMENT '部门编号',
  `depName` varchar(20) NOT NULL COMMENT '所属部门',
  `makeEmpName` varchar(20) NOT NULL COMMENT '制单人员',
  `AuditingEmpName` varchar(20) NOT NULL COMMENT '复核人员',
  `checkstate` int(4) NOT NULL COMMENT '审核状态',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `totalMoney` double DEFAULT NULL COMMENT '合计金额',
  `totalTax` double DEFAULT NULL COMMENT '合计税额',
  `totalTaxMoney` double DEFAULT NULL COMMENT '合计含税金额',
  `enables` int(2) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(20) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(20) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellissueorder` */

/*Table structure for table `sellissueorderdetails` */

DROP TABLE IF EXISTS `sellissueorderdetails`;

CREATE TABLE `sellissueorderdetails` (
  `billId` varchar(20) NOT NULL COMMENT '单据号码',
  `coteMark` int(9) NOT NULL COMMENT '栏号',
  `matid` varchar(50) NOT NULL COMMENT '物料编号',
  `matname` varchar(50) NOT NULL COMMENT '物料名称',
  `matspec` varchar(50) DEFAULT NULL COMMENT '规格型号',
  `matunit` varchar(50) NOT NULL COMMENT '单位名称',
  `number` int(9) NOT NULL COMMENT '数量',
  `agioAgoPrice` double NOT NULL COMMENT '折扣前单价',
  `agio` double NOT NULL COMMENT '折数',
  `price` double NOT NULL COMMENT '单价',
  `money` double NOT NULL COMMENT '金额',
  `cess` double NOT NULL COMMENT '税率',
  `taxmoney` double NOT NULL COMMENT '税额',
  `intaxmoney` double NOT NULL COMMENT '含税金额',
  `present` varchar(2) DEFAULT NULL COMMENT '赠品',
  `factCost` double DEFAULT NULL COMMENT '实际成本',
  `criterionCost` double DEFAULT NULL COMMENT '标准成本',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `originBillId` varchar(20) DEFAULT NULL COMMENT '来源单号',
  `enables` int(2) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(10) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(10) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`billId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sellissueorderdetails` */

/*Table structure for table `shouldgatheringdetails` */

DROP TABLE IF EXISTS `shouldgatheringdetails`;

CREATE TABLE `shouldgatheringdetails` (
  `minusaddid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `sinId` int(11) NOT NULL COMMENT '来源单别',
  `sinName` varchar(50) DEFAULT NULL COMMENT '来源单别名称',
  `originBillId` varchar(50) NOT NULL COMMENT '来源单号',
  `nowdate` date DEFAULT NULL COMMENT '来源单据日期',
  `cliid` varchar(50) NOT NULL COMMENT '客户编号client(cliid)',
  `showDate` date NOT NULL COMMENT '日期',
  `originoddMoney` int(11) NOT NULL COMMENT '原单金额',
  `currentlybalance` int(11) NOT NULL COMMENT '现行余额',
  `remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`minusaddid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `shouldgatheringdetails` */

/*Table structure for table `stockapply` */

DROP TABLE IF EXISTS `stockapply`;

CREATE TABLE `stockapply` (
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '标识列',
  `billNo` varchar(200) NOT NULL DEFAULT '' COMMENT '请购单单据号码',
  `billDate` date DEFAULT NULL COMMENT '请购单单据日期',
  `billStyleID` int(11) DEFAULT NULL COMMENT '采购请购类型',
  `billStyleName` varchar(200) DEFAULT NULL COMMENT '采购请购类型名称',
  `billStatus` int(11) DEFAULT NULL COMMENT '单况:(已结案/未结案/无效)',
  `salesName` varchar(200) DEFAULT NULL COMMENT '请购人员',
  `salesID` int(11) DEFAULT NULL COMMENT '请购人员id',
  `departName` varchar(200) DEFAULT NULL COMMENT '请购部门',
  `departID` int(11) DEFAULT NULL COMMENT '请购部门id',
  `maker` varchar(200) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(200) DEFAULT NULL COMMENT '复核人员',
  `permittering` varchar(200) DEFAULT NULL COMMENT '审核状态:(未审核/已审核/无效)',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(200) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(200) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`flag`,`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购请购表主表';

/*Data for the table `stockapply` */

/*Table structure for table `stockapplydetails` */

DROP TABLE IF EXISTS `stockapplydetails`;

CREATE TABLE `stockapplydetails` (
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '标识列',
  `serNO` int(11) NOT NULL DEFAULT '0' COMMENT '行号',
  `billNo` varchar(200) NOT NULL DEFAULT '' COMMENT '请购单单据号码',
  `prodID` varchar(200) DEFAULT NULL COMMENT '物料编号(伪外：物料主文件)',
  `prodName` varchar(200) DEFAULT NULL COMMENT '物料名称',
  `prodSize` varchar(200) DEFAULT NULL COMMENT '规格型号',
  `sUnit` varchar(200) DEFAULT NULL COMMENT '单位名称',
  `sQuantity` int(11) DEFAULT NULL COMMENT '数量',
  `sPrice` double DEFAULT NULL COMMENT '标准进价',
  `amount` double DEFAULT NULL COMMENT '标准进价金额',
  `lastestsPrice` double DEFAULT NULL COMMENT '单价',
  `lastestsAmount` double DEFAULT NULL COMMENT '进价金额',
  `preInDate` date DEFAULT NULL COMMENT '需求日期',
  `suggestPurDate` date DEFAULT NULL COMMENT '建议采购日期',
  `qtyRemain` double DEFAULT NULL COMMENT '未采购数量',
  `tranType` varchar(200) DEFAULT NULL COMMENT '来源单别',
  `fromNO` varchar(200) DEFAULT NULL COMMENT '来源单号',
  `apdremark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(200) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(200) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`flag`,`billNo`,`serNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购请购明细表';

/*Data for the table `stockapplydetails` */

/*Table structure for table `stockapplytype` */

DROP TABLE IF EXISTS `stockapplytype`;

CREATE TABLE `stockapplytype` (
  `classID` varchar(200) NOT NULL COMMENT '类型编号',
  `className` varchar(200) DEFAULT NULL COMMENT '类型名称',
  `engName` varchar(200) DEFAULT NULL COMMENT '英文名称',
  `meno` varchar(200) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  PRIMARY KEY (`classID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购请购类型表';

/*Data for the table `stockapplytype` */

/*Table structure for table `stockapportion` */

DROP TABLE IF EXISTS `stockapportion`;

CREATE TABLE `stockapportion` (
  `appid` varchar(50) DEFAULT NULL COMMENT '采购分摊单号',
  `appdate` date DEFAULT NULL COMMENT '分摊日期',
  `wisname` varchar(50) DEFAULT NULL COMMENT '分摊类型',
  `appamtmoney` double DEFAULT NULL COMMENT '待摊金额',
  `makeperson` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `auditingperson` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `estate` varchar(50) DEFAULT NULL COMMENT '是否已审核',
  `enables` varchar(50) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段2'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stockapportion` */

/*Table structure for table `stockinquire` */

DROP TABLE IF EXISTS `stockinquire`;

CREATE TABLE `stockinquire` (
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '标识列',
  `customerName` varchar(200) DEFAULT NULL COMMENT '供应商',
  `customerID` int(11) DEFAULT NULL COMMENT '伪外键(供应商主文件)',
  `custAddress` varchar(200) DEFAULT NULL COMMENT '供应商地址',
  `billNo` varchar(200) NOT NULL DEFAULT '' COMMENT '单据号码',
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `validDate` date DEFAULT NULL COMMENT '有效日期',
  `priceOfTax` int(11) DEFAULT NULL COMMENT '是否含税(含税/未含税)',
  `exchRate` int(11) DEFAULT NULL COMMENT '汇率',
  `outAddress` varchar(200) DEFAULT NULL COMMENT '送货地址',
  `maker` varchar(200) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(200) DEFAULT NULL COMMENT '复核人员',
  `salesName` varchar(200) DEFAULT NULL COMMENT '采购人员',
  `salesID` int(11) DEFAULT NULL COMMENT '伪外键(请购人员外键)',
  `departName` varchar(200) DEFAULT NULL COMMENT '所属部门',
  `departID` int(11) DEFAULT NULL COMMENT '伪外键(所属部门外键)',
  `permittering` int(11) DEFAULT NULL COMMENT '审核状态：未审核/已审核/无效',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(200) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(200) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`flag`,`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购询价主表';

/*Data for the table `stockinquire` */

/*Table structure for table `stockinquiredetails` */

DROP TABLE IF EXISTS `stockinquiredetails`;

CREATE TABLE `stockinquiredetails` (
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '标识列',
  `serNO` int(11) NOT NULL DEFAULT '0' COMMENT '行号',
  `billNo` varchar(200) NOT NULL DEFAULT '' COMMENT '单据号码',
  `prodID` varchar(200) DEFAULT NULL COMMENT '物料编号',
  `prodName` varchar(200) DEFAULT NULL COMMENT '物料名称',
  `prodSize` varchar(200) DEFAULT NULL COMMENT '规格型号',
  `sUnitID` int(11) DEFAULT NULL COMMENT '单位编号',
  `sUnit` varchar(200) DEFAULT NULL COMMENT '单位名称',
  `sQuantity` int(11) DEFAULT NULL COMMENT '数量',
  `oldPrice` double DEFAULT NULL COMMENT '折前单价',
  `discount` double DEFAULT NULL COMMENT '折数(%)',
  `sPrice` double DEFAULT NULL COMMENT '单价',
  `amount` double DEFAULT NULL COMMENT '金额',
  `taxRate` double DEFAULT NULL COMMENT '税率(%)',
  `taxAmt` double DEFAULT NULL COMMENT '税额',
  `vfTotal` double DEFAULT NULL COMMENT '含税金额',
  `isGift` double DEFAULT NULL COMMENT '赠品:是/否',
  `fromNo` varchar(200) DEFAULT NULL COMMENT '来源单号',
  `tranType` varchar(200) DEFAULT NULL COMMENT '来源单别',
  `itemRemark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(200) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(200) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`flag`,`billNo`,`serNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购询价明细表';

/*Data for the table `stockinquiredetails` */

/*Table structure for table `stockorder` */

DROP TABLE IF EXISTS `stockorder`;

CREATE TABLE `stockorder` (
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '标识列',
  `billNo` varchar(200) NOT NULL DEFAULT '' COMMENT '单据号码',
  `billDate` date DEFAULT NULL COMMENT '单据日期',
  `customerName` varchar(200) DEFAULT NULL COMMENT '供应商',
  `customerID` int(11) DEFAULT NULL COMMENT '伪外键(供应商主文件)',
  `custAddress` varchar(200) DEFAULT NULL COMMENT '供应商地址',
  `billStyleName` varchar(200) DEFAULT NULL COMMENT '采购订单类型',
  `billStyleID` varchar(200) DEFAULT NULL COMMENT '采购订单类型名称',
  `priceOfTax` varchar(200) DEFAULT NULL COMMENT '单价是否含税:1-含税,2-未税',
  `billStatus` int(11) DEFAULT NULL COMMENT '单况:1-未结案,2-已结案,3-无效',
  `outAddress` varchar(200) DEFAULT NULL COMMENT '送货地址',
  `salesName` varchar(200) DEFAULT NULL COMMENT '采购人员',
  `salesID` int(11) DEFAULT NULL COMMENT '伪外键:采购人员id',
  `departName` varchar(200) DEFAULT NULL COMMENT '采购部门',
  `departID` int(11) DEFAULT NULL COMMENT '伪外键:部门id',
  `maker` varchar(200) DEFAULT NULL COMMENT '制单人员',
  `permitter` varchar(200) DEFAULT NULL COMMENT '复核人员',
  `projectID` int(11) DEFAULT NULL COMMENT '所属项目id',
  `projectName` varchar(200) DEFAULT NULL COMMENT '所属项目',
  `permittering` int(11) DEFAULT NULL COMMENT '审核状态：未审核/已审核/无效',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(200) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(200) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`flag`,`billNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单主表';

/*Data for the table `stockorder` */

/*Table structure for table `stockorderdetails` */

DROP TABLE IF EXISTS `stockorderdetails`;

CREATE TABLE `stockorderdetails` (
  `flag` int(11) NOT NULL DEFAULT '0' COMMENT '标识列',
  `serNO` int(11) NOT NULL DEFAULT '0' COMMENT '行号',
  `billNo` varchar(200) NOT NULL DEFAULT '' COMMENT '单据号码',
  `prodID` varchar(200) DEFAULT NULL COMMENT '物料编号',
  `prodName` varchar(200) DEFAULT NULL COMMENT '物料名称',
  `prodSize` varchar(200) DEFAULT NULL COMMENT '规格型号',
  `sQuantity` int(11) DEFAULT NULL COMMENT '数量',
  `oldPrice` double DEFAULT NULL COMMENT '折前单价',
  `discount` double DEFAULT NULL COMMENT '折数(%)',
  `sPrice` double DEFAULT NULL COMMENT '单价',
  `amount` double DEFAULT NULL COMMENT '金额',
  `taxRate` double DEFAULT NULL COMMENT '税率(%)',
  `taxAmt` double DEFAULT NULL COMMENT '税额',
  `vfTotal` double DEFAULT NULL COMMENT '含税金额',
  `preInDate` date DEFAULT NULL COMMENT '预入库日',
  `qtyRemain` int(11) DEFAULT NULL COMMENT '未入库量',
  `isGift` double DEFAULT NULL COMMENT '赠品:是/否',
  `fromNo` varchar(200) DEFAULT NULL COMMENT '来源单号',
  `tranType` varchar(200) DEFAULT NULL COMMENT '来源单别',
  `itemRemark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(200) DEFAULT NULL COMMENT '保留字段1',
  `safetytwo` varchar(200) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`flag`,`billNo`,`serNO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='采购订单明细表';

/*Data for the table `stockorderdetails` */

/*Table structure for table `stockrecede` */

DROP TABLE IF EXISTS `stockrecede`;

CREATE TABLE `stockrecede` (
  `recid` varchar(50) DEFAULT NULL COMMENT '采购退货单号',
  `recdate` date DEFAULT NULL COMMENT '单据日期',
  `peoid` varchar(50) DEFAULT NULL COMMENT '供应商编号',
  `purveyname` varchar(50) DEFAULT NULL COMMENT '供货商名称',
  `peoaddress` varchar(50) DEFAULT NULL COMMENT '供应商地址',
  `stoid` varchar(50) DEFAULT NULL COMMENT '仓库编号',
  `depotname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `containtax` int(11) DEFAULT NULL COMMENT '是否含税',
  `anewstorage` int(11) DEFAULT NULL COMMENT '是否重新入库',
  `stoperson` varchar(50) DEFAULT NULL COMMENT '采购人员姓名',
  `stopersonid` varchar(50) DEFAULT NULL COMMENT '采购人员ID',
  `stodept` varchar(50) DEFAULT NULL COMMENT '请购部门',
  `stodeptid` varchar(50) DEFAULT NULL COMMENT '部门编号',
  `makeperson` varchar(50) DEFAULT NULL COMMENT '制单人员',
  `auditingperson` varchar(50) DEFAULT NULL COMMENT '复核人员',
  `recremark` varchar(50) DEFAULT NULL COMMENT '备注',
  `estate` varchar(50) DEFAULT NULL COMMENT '单据状态',
  `stockrecedename` varchar(50) DEFAULT NULL COMMENT '保存',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stockrecede` */

/*Table structure for table `stockstoragedetails` */

DROP TABLE IF EXISTS `stockstoragedetails`;

CREATE TABLE `stockstoragedetails` (
  `storagedetailno` int(11) DEFAULT NULL COMMENT '引用采购入库单单号',
  `rowno` int(50) DEFAULT NULL COMMENT '行号',
  `materielid` varchar(50) DEFAULT NULL COMMENT '引用物料文件ID',
  `types` varchar(50) DEFAULT NULL COMMENT '物料名称',
  `units` varchar(50) DEFAULT NULL COMMENT '单位',
  `amount` int(50) DEFAULT NULL COMMENT '数量',
  `rebateprice` double DEFAULT NULL COMMENT '折扣前单价',
  `rebate` double DEFAULT NULL COMMENT '折扣',
  `unitprice` double DEFAULT NULL COMMENT '单价',
  `moneys` double DEFAULT NULL COMMENT '金额',
  `cess` double DEFAULT NULL COMMENT '税率',
  `tax` double DEFAULT NULL COMMENT '税额',
  `taxmoneys` double DEFAULT NULL COMMENT '含税金额',
  `origintype` varchar(50) DEFAULT NULL COMMENT '来源单别',
  `originno` varchar(50) DEFAULT NULL COMMENT '来源单号',
  `present` int(11) DEFAULT NULL COMMENT '是否赠品',
  `apportionmoney` double DEFAULT NULL COMMENT '分摊费用',
  `enables` int(11) DEFAULT NULL COMMENT '标识是否删除',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '备用字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '备用字段'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stockstoragedetails` */

/*Table structure for table `stockstoragetable` */

DROP TABLE IF EXISTS `stockstoragetable`;

CREATE TABLE `stockstoragetable` (
  `stockstorageno` varchar(20) NOT NULL COMMENT '单据编号',
  `storagedate` time DEFAULT NULL COMMENT '入库日期',
  `purveyid` varchar(50) NOT NULL COMMENT '供货商ID',
  `purveyname` varchar(50) DEFAULT NULL COMMENT '供货商名称',
  `purveyaddress` int(11) DEFAULT NULL COMMENT '供货商地址',
  `depotid` varchar(50) DEFAULT NULL COMMENT '仓库ID',
  `depotname` varchar(50) DEFAULT NULL COMMENT '仓库名称',
  `pricerevenue` varchar(50) DEFAULT NULL COMMENT '单价是否含税',
  `stoperson` varchar(50) DEFAULT NULL COMMENT '采购人员',
  `stodept` varchar(50) DEFAULT NULL COMMENT '采购人员所属部门名称',
  `stodeptid` varchar(50) DEFAULT NULL COMMENT '部门ID',
  `audituserid` varchar(50) DEFAULT NULL COMMENT '审核人员ID',
  `repeatuserid` varchar(50) DEFAULT NULL COMMENT '复核人员ID',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `estate` int(11) DEFAULT NULL COMMENT '单据状态',
  `stockstoragetablename` varchar(50) DEFAULT NULL COMMENT '保存',
  `safetyone` varchar(50) DEFAULT NULL COMMENT '保留字段',
  `safetytwo` varchar(50) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (`stockstorageno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stockstoragetable` */

/*Table structure for table `sys_permissions` */

DROP TABLE IF EXISTS `sys_permissions`;

CREATE TABLE `sys_permissions` (
  `id` bigint(60) NOT NULL AUTO_INCREMENT,
  `permission` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  `path` varchar(255) DEFAULT NULL,
  `catalog` tinyint(1) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `component` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_permissions_permission` (`permission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_permissions` */

/*Table structure for table `sys_roles` */

DROP TABLE IF EXISTS `sys_roles`;

CREATE TABLE `sys_roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `available` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_roles_role` (`role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_roles` */

/*Table structure for table `sys_roles_permissions` */

DROP TABLE IF EXISTS `sys_roles_permissions`;

CREATE TABLE `sys_roles_permissions` (
  `role_id` bigint(20) NOT NULL,
  `permission_id` bigint(20) NOT NULL,
  PRIMARY KEY (`role_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_roles_permissions` */

/*Table structure for table `sys_users` */

DROP TABLE IF EXISTS `sys_users`;

CREATE TABLE `sys_users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `salt` varchar(100) DEFAULT NULL,
  `locked` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_sys_users_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_users` */

/*Table structure for table `sys_users_roles` */

DROP TABLE IF EXISTS `sys_users_roles`;

CREATE TABLE `sys_users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sys_users_roles` */

/*Table structure for table `takeprepay` */

DROP TABLE IF EXISTS `takeprepay`;

CREATE TABLE `takeprepay` (
  `copewithNo` varchar(100) NOT NULL COMMENT '应付冲款单号',
  `classified` varchar(100) DEFAULT NULL COMMENT '来源别',
  `sourceNo` varchar(100) DEFAULT NULL COMMENT '来源单号',
  `paymentYe` double DEFAULT NULL COMMENT '预付余额',
  `deptno` varchar(100) DEFAULT NULL COMMENT '部门编号',
  `deptName` varchar(100) DEFAULT NULL COMMENT '部门名称',
  `qYmoney` double DEFAULT NULL COMMENT '取用预付金额',
  `sourceAbstract` varchar(100) DEFAULT NULL COMMENT '来源摘要',
  `beiyon` varchar(100) DEFAULT NULL,
  `beiyonr` varchar(100) DEFAULT NULL,
  `beiyons` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`copewithNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `takeprepay` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
