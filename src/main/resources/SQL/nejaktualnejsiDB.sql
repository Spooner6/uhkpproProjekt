DROP DATABASE  IF EXISTS `pproProjekt2`;

CREATE DATABASE  IF NOT EXISTS `pproProjekt2`;
USE `pproProjekt2`;

--
--
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(70) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `adress` varchar(50) NOT NULL,
  `cardnumber` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
--
--

INSERT INTO `users`
VALUES
('radek1','{bcrypt}$2a$04$HLiPFgsEH6GoGWBKfYfICO7Bul2c1AcwBrjP/nHyFtJaq3WCUCp4a','Radek','Letacek','Fejk strýt 69, PARDUBICE','123456789/0100',1),
('ondra1','{bcrypt}$2a$04$HLiPFgsEH6GoGWBKfYfICO7Bul2c1AcwBrjP/nHyFtJaq3WCUCp4a','Ondrej','Pipek','Fejk strýr 69, Hradec Kralove','987654321/0200',1),
('zamestnanec','{bcrypt}$2a$04$HLiPFgsEH6GoGWBKfYfICO7Bul2c1AcwBrjP/nHyFtJaq3WCUCp4a','Testovaci','Zamestnanec','Fejk strýr 68, Hradec Kralove','987654321/0200',1);
--
--
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
--
--

INSERT INTO `authorities`
VALUES
('radek1','ROLE_EMPLOYEE'),
('ondra1','ROLE_EMPLOYEE'),
('radek1','ROLE_MANAGER'),
('zamestnanec','ROLE_EMPLOYEE'),
('ondra1','ROLE_MANAGER');

DROP TABLE IF EXISTS `requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `requests` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(10000) CHARACTER SET utf8 DEFAULT NULL ,
  `description` varchar(45)CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--
insert into `requests`
values
(1,'Dobry den, rikal jsem si, ze by bylo lepsi, kdyby firma misto vlastniho serveru poridila klaudove uloziste.','Server vs. Cloud');

-- Dump completed on 2016-09-24 21:50:59
DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(1000) CHARACTER SET utf8 DEFAULT NULL ,
  `description` varchar(45)CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

INSERT INTO `news` VALUES
	(1,'Dobrý den, dne 4.2.2018 bude celofiremní volno z důvodu čištění budovy od parazitů. Každému zamšstnanci doporučujeme navštívit obvodního lékaře','Celofiremní dovolená'),
	(2,'Dobrý den, vyskytl se zde takový nešvar. Lidé si nosí jídlo domů!','Probléms  jídlem v jídelně');

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE attendance (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prichod` varchar(25),
  `stav` varchar(15),
  `username` varchar(20),
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
