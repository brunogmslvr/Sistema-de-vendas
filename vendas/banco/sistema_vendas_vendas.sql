-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: sistema_vendas
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `vendas`
--

DROP TABLE IF EXISTS `vendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendas` (
  `idVENDAS` int NOT NULL AUTO_INCREMENT,
  `datas` date DEFAULT NULL,
  `valor` varchar(45) DEFAULT NULL,
  `obs` longtext,
  `vendascol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idVENDAS`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendas`
--

LOCK TABLES `vendas` WRITE;
/*!40000 ALTER TABLE `vendas` DISABLE KEYS */;
INSERT INTO `vendas` VALUES (1,'2024-02-20','10',NULL,NULL),(2,'2024-02-20','5',NULL,NULL),(3,'2024-02-21','4',NULL,NULL),(4,'2024-02-22','6',NULL,NULL),(28,'2024-02-20','10',NULL,NULL),(29,'2024-02-22',NULL,'2024/02/22',NULL),(30,'2024-02-22',NULL,'2024/02/22',NULL),(31,'2024-02-22',NULL,'2024/02/22',NULL),(32,'2024-02-22',NULL,'2024/02/22',NULL),(33,'2024-02-20',NULL,'10',NULL),(34,'2024-02-22',NULL,'2024/02/22',NULL),(35,'2024-02-22',NULL,'2024/02/22',NULL),(36,'2024-02-22',NULL,'TESTE',NULL),(37,'2024-02-22',NULL,'Olá',NULL),(38,'2024-02-22',NULL,'certo',NULL),(39,'2024-02-22',NULL,'',NULL),(40,'2024-02-22',NULL,'ooo',NULL),(41,'2024-02-22','4','certo',NULL);
/*!40000 ALTER TABLE `vendas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-23  9:39:40