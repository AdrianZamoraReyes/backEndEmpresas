CREATE DATABASE  IF NOT EXISTS `bde` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bde`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bde
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `comentario`
--

DROP TABLE IF EXISTS `comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comentario` (
  `idComentario` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuario` int(11) DEFAULT NULL,
  `idEmpresa` int(11) DEFAULT NULL,
  `tituloComentario` varchar(150) DEFAULT NULL,
  `comentario` varchar(450) DEFAULT NULL,
  `valoracionEmpresa` int(1) DEFAULT NULL,
  `idRespuesta` int(11) DEFAULT NULL,
  PRIMARY KEY (`idComentario`),
  KEY `fkUsuarioEncomentario_idx` (`idUsuario`),
  KEY `fkEmpresaEnComentario_idx` (`idEmpresa`),
  KEY `fkComentarioEnComentario_idx` (`idRespuesta`),
  CONSTRAINT `fkComentarioEnComentario` FOREIGN KEY (`idRespuesta`) REFERENCES `comentario` (`idComentario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fkEmpresaEnComentario` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fkUsuarioEncomentario` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentario`
--

LOCK TABLES `comentario` WRITE;
/*!40000 ALTER TABLE `comentario` DISABLE KEYS */;
INSERT INTO `comentario` VALUES (1,1,1,'adadsda','fdfsd',2,NULL),(2,2,1,'fsdfs','sdfsdf',4,NULL),(3,2,1,'fsdf','fsdf',1,1);
/*!40000 ALTER TABLE `comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contratado`
--

DROP TABLE IF EXISTS `contratado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contratado` (
  `idContratado` int(11) NOT NULL AUTO_INCREMENT,
  `puesto` varchar(45) NOT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `idEmpresa` int(11) DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFinal` date DEFAULT NULL,
  PRIMARY KEY (`idContratado`),
  KEY `fkUsuarioEnContratado_idx` (`idUsuario`),
  KEY `fkEmpresaEnContratado_idx` (`idEmpresa`),
  CONSTRAINT `fkEmpresaEnContratado` FOREIGN KEY (`idEmpresa`) REFERENCES `empresa` (`idEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fkUsuarioEnContratado` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contratado`
--

LOCK TABLES `contratado` WRITE;
/*!40000 ALTER TABLE `contratado` DISABLE KEYS */;
/*!40000 ALTER TABLE `contratado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `idEmpresa` int(11) NOT NULL AUTO_INCREMENT,
  `nombreEmpresa` varchar(45) DEFAULT NULL,
  `direccionEmpresa` varchar(45) DEFAULT NULL,
  `paisEmpresa` varchar(45) DEFAULT NULL,
  `idTipoEmpresa` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEmpresa`),
  KEY `fkTipoEmpresaEnEmpresa_idx` (`idTipoEmpresa`),
  CONSTRAINT `fkTipoEmpresaEnEmpresa` FOREIGN KEY (`idTipoEmpresa`) REFERENCES `tipoempresa` (`idTipoEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES (1,'dasd','dasd','dasda',1),(2,'ewewe','ewew','ewe',2);
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoempresa`
--

DROP TABLE IF EXISTS `tipoempresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoempresa` (
  `idTipoEmpresa` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idTipoEmpresa`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoempresa`
--

LOCK TABLES `tipoempresa` WRITE;
/*!40000 ALTER TABLE `tipoempresa` DISABLE KEYS */;
INSERT INTO `tipoempresa` VALUES (1),(2),(3);
/*!40000 ALTER TABLE `tipoempresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipousuario` (
  `idTipoUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombreTipoUsuario` varchar(45) DEFAULT NULL,
  `descripcionTipoUsuario` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`idTipoUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
INSERT INTO `tipousuario` VALUES (1,'AdministradorJefe','De este tipo solo hay uno y es el administrador de la página'),(2,'Administrador','Administrador de la página.'),(3,'Usuario','Usuario normal'),(4,'UsuarioDes','Este usuario esta deshabilitado para revisar.'),(5,'UsuarioSinVal','Este usuario aún no ha respondido a su correo de activación.'),(6,'UsuarioBaneado','Este usuario ha sido baneado y NUNCA más tendrá acceso.');
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `idTipoUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(45) DEFAULT NULL,
  `passUsuario` varchar(45) CHARACTER SET keybcs2 DEFAULT NULL,
  `emailUsuario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `fkTipoUsuarioEnUsuario_idx` (`idTipoUsuario`),
  CONSTRAINT `fkTipoUsuarioEnUsuario` FOREIGN KEY (`idTipoUsuario`) REFERENCES `tipousuario` (`idTipoUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,2,'dasdasd','dasdasd','dasdad'),(2,3,'fsdfds','fsdfs','fsdf');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-20 11:11:21
