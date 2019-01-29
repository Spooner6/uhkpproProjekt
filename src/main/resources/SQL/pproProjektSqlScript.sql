DROP DATABASE  IF EXISTS `pproProjekt2`;

CREATE DATABASE  IF NOT EXISTS `pproProjekt2`;
USE `pproProjekt2`;

--
-- 
--
DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
`id` int(11) NOT NULL AUTO_INCREMENT,
  `authority` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
--
--

INSERT INTO `authorities`
VALUES
(1,'ROLE_EMPLOYEE'),
(2,'ROLE_MANAGER'),
(3,'ROLE_ADMIN');

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(1000) CHARACTER SET utf8 DEFAULT NULL ,
  `description` varchar(45)CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

INSERT INTO `news` VALUES
	(1,'Dobrý den, dne 4.2.2018 bude celofiremní volno z důvodu čištění budovy od parazitů. Každému zamšstnanci doporučujeme navštívit obvodního lékaře','Celofiremní dovolená'),
	(2,'Dobrý den, vyskytl se zde takový nešvar. Lidé si nosí jídlo domů!','Probléms  jídlem v jídelně');


DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
`id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  `id_authorities` int(10) NOT NULL,
  foreign key (`id_authorities`) references authorities (`id`),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
--
--

INSERT INTO `users`
VALUES
(1,'radek1','{noop}heslo',1,2),
(2,'ondra1','{noop}heslo',1,2);

--
--
--

DROP TABLE IF EXISTS `requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `requests` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(10000) CHARACTER SET utf8 DEFAULT NULL ,
  `description` varchar(45)CHARACTER SET utf8 DEFAULT NULL,
  	`owner` int(20) ,
    `state` varchar(10),
  PRIMARY KEY (`id`),
	foreign key (`owner`) references users (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--


-- Dump completed on 2016-09-24 21:50:59



