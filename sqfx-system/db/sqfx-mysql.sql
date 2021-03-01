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
  `community_name` varchar(20) DEFAULT NULL COMMENT '社区名称',
  `province` varchar(10) DEFAULT NULL COMMENT '省份',
  `city` varchar(10) DEFAULT NULL COMMENT '城市',
  PRIMARY KEY (`community_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='社区表';

/*Data for the table `system_community` */

insert  into `system_community`(`community_id`,`community_name`,`province`,`city`) values 
('41000020210224','星星社区','湖南','长沙'),
('41000020210225','洋洋社区','湖南','衡阳');

/*Table structure for table `system_house` */

DROP TABLE IF EXISTS `system_house`;

CREATE TABLE `system_house` (
  `house_id` bigint(20) NOT NULL COMMENT '房屋编号',
  `community_id` varchar(50) DEFAULT NULL COMMENT '社区编号',
  `buildingNumber` varchar(50) DEFAULT NULL COMMENT '楼号',
  `unitNumber` varchar(50) DEFAULT NULL COMMENT '单元号',
  `roomNumber` varchar(50) DEFAULT NULL COMMENT '房间号',
  PRIMARY KEY (`house_id`),
  KEY `community_id` (`community_id`),
  CONSTRAINT `system_house_ibfk_1` FOREIGN KEY (`community_id`) REFERENCES `system_community` (`community_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='房屋信息表';

/*Data for the table `system_house` */

insert  into `system_house`(`house_id`,`community_id`,`buildingNumber`,`unitNumber`,`roomNumber`) values 
(1,'41000020210224','01栋','1单元','0101'),
(2,'41000020210224','01栋','1单元','0102'),
(3,'41000020210224','01栋','1单元','0103'),
(4,'41000020210224','01栋','1单元','0104'),
(5,'41000020210224','01栋','1单元','0105'),
(6,'41000020210224','01栋','1单元','0106'),
(7,'41000020210224','01栋','2单元','0101'),
(8,'41000020210224','01栋','2单元','0102'),
(9,'41000020210224','01栋','2单元','0103'),
(10,'41000020210224','01栋','2单元','0201'),
(11,'41000020210224','01栋','2单元','0202'),
(12,'41000020210224','01栋','2单元','0203'),
(13,'41000020210224','01栋','2单元','0204'),
(14,'41000020210224','02栋','1单元','0101'),
(15,'41000020210224','02栋','1单元','0102'),
(16,'41000020210224','02栋','1单元','0103'),
(17,'41000020210224','02栋','1单元','0104'),
(18,'41000020210224','02栋','1单元','0105'),
(19,'41000020210224','02栋','1单元','0106'),
(20,'41000020210224','02栋','2单元','0101'),
(21,'41000020210224','02栋','2单元','0102'),
(22,'41000020210224','02栋','2单元','0103'),
(23,'41000020210224','02栋','2单元','0201'),
(24,'41000020210224','02栋','2单元','0202'),
(25,'41000020210224','02栋','2单元','0203'),
(26,'41000020210224','02栋','2单元','0204'),
(27,'41000020210225','01栋','1单元','0101'),
(28,'41000020210225','01栋','1单元','0102'),
(29,'41000020210225','01栋','1单元','0103'),
(30,'41000020210225','01栋','1单元','0104'),
(31,'41000020210225','01栋','1单元','0105'),
(32,'41000020210225','01栋','1单元','0106'),
(33,'41000020210225','01栋','2单元','0101'),
(34,'41000020210225','01栋','2单元','0102'),
(35,'41000020210225','01栋','2单元','0103'),
(36,'41000020210225','01栋','2单元','0201'),
(37,'41000020210225','01栋','2单元','0202'),
(38,'41000020210225','01栋','2单元','0203'),
(39,'41000020210225','01栋','2单元','0204'),
(40,'41000020210225','02栋','1单元','0101'),
(41,'41000020210225','02栋','1单元','0102'),
(42,'41000020210225','02栋','1单元','0103'),
(43,'41000020210225','02栋','1单元','0104'),
(44,'41000020210225','02栋','1单元','0105'),
(45,'41000020210225','02栋','1单元','0106'),
(46,'41000020210225','02栋','2单元','0101'),
(47,'41000020210225','02栋','2单元','0102'),
(48,'41000020210225','02栋','2单元','0103'),
(49,'41000020210225','02栋','2单元','0201'),
(50,'41000020210225','02栋','2单元','0202'),
(51,'41000020210225','02栋','2单元','0203'),
(52,'41000020210225','02栋','2单元','0204');

/*Table structure for table `system_identity` */

DROP TABLE IF EXISTS `system_identity`;

CREATE TABLE `system_identity` (
  `identity_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '身份类型编号',
  `identity_name` varchar(50) DEFAULT NULL COMMENT '身份名称',
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
  `name` varchar(50) DEFAULT NULL COMMENT '用户名称',
  `sex` varchar(50) DEFAULT NULL COMMENT '性别',
  `age` varchar(50) DEFAULT NULL COMMENT '年龄',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `identity_id` int(11) DEFAULT NULL COMMENT '身份类型编号',
  `user_type_id` int(11) DEFAULT NULL COMMENT '用户类型编号',
  `certificate_id` int(11) DEFAULT NULL COMMENT '证件类型编号',
  `identification_number` varchar(50) DEFAULT NULL COMMENT '证件号码',
  `house_id` bigint(20) DEFAULT NULL COMMENT '所在房屋编号',
  PRIMARY KEY (`user_id`),
  KEY `identity_id` (`identity_id`),
  KEY `user_type_id` (`user_type_id`),
  KEY `certificate_id` (`certificate_id`),
  KEY `house_id` (`house_id`),
  CONSTRAINT `system_user_ibfk_1` FOREIGN KEY (`identity_id`) REFERENCES `system_identity` (`identity_id`),
  CONSTRAINT `system_user_ibfk_2` FOREIGN KEY (`user_type_id`) REFERENCES `system_user_type` (`user_type_id`),
  CONSTRAINT `system_user_ibfk_3` FOREIGN KEY (`certificate_id`) REFERENCES `system_certificate` (`certificate_id`),
  CONSTRAINT `system_user_ibfk_4` FOREIGN KEY (`house_id`) REFERENCES `system_house` (`house_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';

/*Data for the table `system_user` */

insert  into `system_user`(`user_id`,`name`,`sex`,`age`,`phone`,`identity_id`,`user_type_id`,`certificate_id`,`identification_number`,`house_id`) values 
(1,'谢家斌','男','23','15697405580',1,1,1,'430423199805082515',1),
(2,'先谢郭嘉','男','23','15697405580',1,1,1,'430423199805082516',2);

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
