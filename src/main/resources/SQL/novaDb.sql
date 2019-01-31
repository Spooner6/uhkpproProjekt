DROP DATABASE  IF EXISTS `pproProjekt`;

CREATE DATABASE  IF NOT EXISTS `pproProjekt`;
USE `pproProjekt`;

--
--
--

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
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `adress` varchar(50) NOT NULL,
  `cardnumber` varchar(50) NOT NULL,
  birthdate date NOT NULL,
  `role` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
--
--

INSERT INTO `users`
VALUES
(1,'radek1','{noop}heslo','Radek','Letacek','Fejk strýt 69, PARDUBICE 530 01','123456789/0300','1993-10-01','ROLE_MANAGER',1),
(2,'ondra1','{noop}heslo','Ondrej','Pipek','Fejk strýt 69, Hradec Králové 420 05','987654321/0100','1994-12-12','ROLE_MANAGER',1),
(3,'zamestnanec','{noop}heslo','radovy','zamestnanec','Jungmanova 66, Hradec Králové 420 06','456782319/0200','1990-11-11','ROLE_EMPLOYEE',1);
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


	DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attendance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prichod` DATETIME(6),
  `stav` int(2),
  `id_user` int(11),
  PRIMARY KEY (`id`),
  foreign key (`id_user`) references users (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

INSERT INTO `attendance` VALUES(1,STR_TO_DATE('12-01-2014 00:00:00','%m-%d-%Y %H:%i:%s'), 1, 1);


