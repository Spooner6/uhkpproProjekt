DROP DATABASE  IF EXISTS `pproProjekt2`;

CREATE DATABASE  IF NOT EXISTS `pproProjekt2`;
USE `pproProjekt2`;

--
-- 
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 
--

INSERT INTO `users` 
VALUES 
('radek1','{noop}heslo',1),
('ondra1','{noop}heslo',1);

--
-- 
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- 
--

INSERT INTO `authorities` 
VALUES 
('radek1','ROLE_EMPLOYEE'),
('ondra1','ROLE_EMPLOYEE'),
('radek1','ROLE_MANAGER'),
('ondra1','ROLE_ADMIN');

