/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.7.26 : Database - sqfx
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sqfx` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `sqfx`;

/*Table structure for table `system_certificate` */

DROP TABLE IF EXISTS `system_certificate`;

CREATE TABLE `system_certificate` (
  `certificate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '证件类型编号',
  `certificate_name` varchar(20) DEFAULT NULL COMMENT '证件类型名词',
  `user_type_id` int(11) DEFAULT NULL COMMENT '用户类型编号',
  PRIMARY KEY (`certificate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COMMENT='证件类型表';

/*Data for the table `system_certificate` */

insert  into `system_certificate`(`certificate_id`,`certificate_name`,`user_type_id`) values 
(1,'身份证',1),
(2,'居民身份证（港澳台）',1),
(3,'港澳台同胞来往通行证',1),
(4,'军官证',1),
(5,'护照',1),
(6,'统一身份代码',2);

/*Table structure for table `system_community` */

DROP TABLE IF EXISTS `system_community`;

CREATE TABLE `system_community` (
  `community_id` varchar(30) NOT NULL COMMENT '社区编号',
  `community_name` varchar(20) DEFAULT NULL COMMENT '社区名词',
  `province` varchar(10) DEFAULT NULL COMMENT '省份',
  `city` varchar(10) DEFAULT NULL COMMENT '城市',
  PRIMARY KEY (`community_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='社区表';

/*Data for the table `system_community` */

/*Table structure for table `system_house` */

DROP TABLE IF EXISTS `system_house`;

CREATE TABLE `system_house` (
  `house_id` bigint(20) NOT NULL COMMENT '房屋编号',
  `community_id` varchar(30) DEFAULT NULL COMMENT '社区编号',
  `buildingNumber` varchar(20) DEFAULT NULL COMMENT '楼号',
  `unitNumber` varchar(20) DEFAULT NULL COMMENT '单元号',
  `roomNumber` varchar(20) DEFAULT NULL COMMENT '房间号',
  PRIMARY KEY (`house_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='房屋信息表';

/*Data for the table `system_house` */

/*Table structure for table `system_identity` */

DROP TABLE IF EXISTS `system_identity`;

CREATE TABLE `system_identity` (
  `identity_id` int(11) NOT NULL AUTO_INCREMENT,
  `identity_name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`identity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='身份信息表';

/*Data for the table `system_identity` */

insert  into `system_identity`(`identity_id`,`identity_name`) values 
(1,'业主'),
(2,'家人'),
(3,'租客');

/*Table structure for table `system_user` */

DROP TABLE IF EXISTS `system_user`;

CREATE TABLE `system_user` (
  `user_id` bigint(20) NOT NULL COMMENT '用户编号',
  `name` varchar(10) DEFAULT NULL COMMENT '用户名称',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `age` varchar(3) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `identity_id` int(11) DEFAULT NULL COMMENT '身份类型编号',
  `user_type_id` int(11) DEFAULT NULL COMMENT '用户类型编号',
  `certificate_id` int(11) DEFAULT NULL COMMENT '证件类型编号',
  `identification_number` varchar(50) DEFAULT NULL COMMENT '证件号码',
  `house_id` bigint(20) DEFAULT NULL COMMENT '所在房屋编号',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';

/*Data for the table `system_user` */

/*Table structure for table `system_user_type` */

DROP TABLE IF EXISTS `system_user_type`;

CREATE TABLE `system_user_type` (
  `user_type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户类型编号',
  `name` varchar(10) DEFAULT NULL COMMENT '类型名词',
  PRIMARY KEY (`user_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='用户类型表';

/*Data for the table `system_user_type` */

insert  into `system_user_type`(`user_type_id`,`name`) values 
(1,'个人用户'),
(2,'企业用户');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
