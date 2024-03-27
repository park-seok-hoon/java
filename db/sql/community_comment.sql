CREATE DATABASE  IF NOT EXISTS `community` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `community`;

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `cm_num` int NOT NULL AUTO_INCREMENT,
  `cm_bo_num` int NOT NULL,
  `cm_me_id` varchar(13) NOT NULL,
  `cm_content` text NOT NULL,
  PRIMARY KEY (`cm_num`),
  KEY `FK_board_TO_comment_1` (`cm_bo_num`),
  KEY `FK_member_TO_comment_1` (`cm_me_id`),
  CONSTRAINT `FK_board_TO_comment_1` FOREIGN KEY (`cm_bo_num`) REFERENCES `board` (`bo_num`),
  CONSTRAINT `FK_member_TO_comment_1` FOREIGN KEY (`cm_me_id`) REFERENCES `member` (`me_id`)
);

