-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-11-2018 a las 20:33:36
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `giza`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comanda`
--

CREATE TABLE `comanda` (
  `id_comanda` int(11) NOT NULL,
  `id_pedido` int(11) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `id_mesa` int(4) NOT NULL,
  `estado_mesa` varchar(12) DEFAULT NULL,
  `capacidad` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`id_mesa`, `estado_mesa`, `capacidad`) VALUES
(1, 'Libre', 2),
(2, 'Libre', 2),
(3, 'Libre', 2),
(4, 'Libre', 2),
(5, 'Libre', 2),
(6, 'Libre', 2),
(7, 'Libre', 2),
(8, 'Libre', 2),
(9, 'Libre', 2),
(10, 'Libre', 2),
(11, 'Libre', 3),
(12, 'Libre', 3),
(13, 'Libre', 3),
(14, 'Libre', 3),
(15, 'Libre', 3),
(16, 'Libre', 3),
(17, 'Libre', 3),
(18, 'Libre', 3),
(19, 'Libre', 3),
(20, 'Libre', 3),
(21, 'Libre', 3),
(22, 'Libre', 3),
(23, 'Libre', 3),
(24, 'Libre', 3),
(25, 'Libre', 3),
(26, 'Libre', 3),
(27, 'Libre', 3),
(28, 'Libre', 3),
(29, 'Libre', 3),
(30, 'Libre', 3),
(31, 'Libre', 5),
(32, 'Libre', 5),
(33, 'Libre', 5),
(34, 'Libre', 5),
(35, 'Libre', 5),
(36, 'Libre', 5),
(37, 'Libre', 5),
(38, 'Libre', 5),
(39, 'Libre', 5),
(40, 'Libre', 5),
(41, 'Libre', 6),
(42, 'Libre', 6),
(43, 'Libre', 6),
(44, 'Libre', 6),
(45, 'Libre', 6),
(46, 'Libre', 6),
(47, 'Libre', 6),
(48, 'Libre', 6),
(49, 'Libre', 6),
(50, 'Libre', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `id_mesero` int(4) NOT NULL,
  `nombre_mesero` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(4) NOT NULL,
  `id_mesa` int(11) DEFAULT NULL,
  `id_mesero` int(11) DEFAULT NULL,
  `fecha_pedido` datetime DEFAULT NULL,
  `cuenta` double DEFAULT NULL,
  `estado_pedido` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(4) NOT NULL,
  `nombre_producto` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre_producto`, `precio`) VALUES
(1, 'Picada', 50),
(2, 'Ensalada', 25),
(3, 'Papas', 48),
(4, 'Empanadas', 50),
(5, 'Locro', 30),
(6, 'Tacos por 3', 60),
(7, 'Lomito', 50),
(8, 'Pizza', 40),
(9, 'Agua Sin Gas 500ml', 10),
(10, 'Agua Con Gas 500ml', 15),
(11, 'Agua Saborizada 500ml', 30),
(12, 'Gaseosa 1Lt', 80),
(14, 'Vino', 20),
(15, 'Fernet', 70),
(16, 'Whiskey', 100),
(17, 'Flan Mixto', 5),
(18, 'Helado', 15),
(19, 'Pastel en fuente', 50),
(20, 'Asado', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `id_reserva` int(4) NOT NULL,
  `nombre_cliente` varchar(50) DEFAULT NULL,
  `dni_cliente` int(11) DEFAULT NULL,
  `fecha_reserva` datetime DEFAULT NULL,
  `id_mesa` int(11) DEFAULT NULL,
  `esta_vigente` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comanda`
--
ALTER TABLE `comanda`
  ADD PRIMARY KEY (`id_comanda`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_pedido` (`id_pedido`) USING BTREE;

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`id_mesa`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`id_mesero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_mesero` (`id_mesero`),
  ADD KEY `id_mesa` (`id_mesa`) USING BTREE;

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_mesa` (`id_mesa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comanda`
--
ALTER TABLE `comanda`
  MODIFY `id_comanda` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `id_mesa` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `id_mesero` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `id_reserva` int(4) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comanda`
--
ALTER TABLE `comanda`
  ADD CONSTRAINT `comanda_ibfk_1` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `comanda_ibfk_2` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`id_mesa`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`id_mesero`) REFERENCES `mesero` (`id_mesero`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`id_mesa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
