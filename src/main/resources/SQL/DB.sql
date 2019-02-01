DROP DATABASE  IF EXISTS `pproProjekt2`;

CREATE DATABASE  IF NOT EXISTS `pproProjekt2`;
USE `pproProjekt2`;

--
--
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

INSERT INTO `news` VALUES (1,'Dobrý den, dne 4.2.2018 bude celofiremní volno z důvodu čištění budovy od parazitů. Každému zamšstnanci doporučujeme navštívit obvodního lékaře','Celofiremní dovolená'),(2,'Dobrý den, vyskytl se zde takový nešvar. Lidé si nosí jídlo domů!','Probléms  jídlem v jídelně');

DROP TABLE IF EXISTS `authorities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `authorities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorities`
--

INSERT INTO `authorities` VALUES (1,'ondra1','ROLE_EMPLOYEE'),(2,'ondra1','ROLE_MANAGER'),(3,'radek1','ROLE_EMPLOYEE'),(4,'radek1','ROLE_MANAGER'),(5,'zamestnanec','ROLE_EMPLOYEE');

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `attendance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `prichod` varchar(25) DEFAULT NULL,
  `stav` varchar(15) DEFAULT NULL,
  `username` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` VALUES (1,'2019-02-01 11:01:51','Příchod','ondra1'),(2,'2019-02-01 14:18:45','Příchod','ondra1'),(3,'2019-02-01 14:18:48','Odchod','pepa'),(4,'2019-02-01 14:19:25','Odchod','pepa');

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

INSERT INTO `users` VALUES ('ondra1','{bcrypt}$2a$04$HLiPFgsEH6GoGWBKfYfICO7Bul2c1AcwBrjP/nHyFtJaq3WCUCp4a','Ondrej','Pipek','Fejk strýr 69, Hradec Kralove','987654321/0200',1),('radek1','{bcrypt}$2a$04$HLiPFgsEH6GoGWBKfYfICO7Bul2c1AcwBrjP/nHyFtJaq3WCUCp4a','Radek','Letacek','Fejk strýt 69, PARDUBICE','123456789/0100',1),('zamestnanec','{bcrypt}$2a$04$HLiPFgsEH6GoGWBKfYfICO7Bul2c1AcwBrjP/nHyFtJaq3WCUCp4a','Testovaci','Zamestnanec','Fejk strýr 68, Hradec Kralove','987654321/0200',1);

DROP TABLE IF EXISTS `requests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `requests` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` varchar(10000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `owner` varchar(20) DEFAULT NULL,
  `state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `owner` (`owner`),
  CONSTRAINT `requests_ibfk_1` FOREIGN KEY (`owner`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
