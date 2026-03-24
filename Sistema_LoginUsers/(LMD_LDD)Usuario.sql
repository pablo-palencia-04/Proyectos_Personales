--
-- Estructura de tabla para la tabla `usuario`
--
CREATE DATABASE sig2k25;

USE sig2k25;


CREATE TABLE `usuario` (
  `id_usuario` int auto_increment primary key,
  `username` varchar(60) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`username`, `password`) VALUES
('NUEVO', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
('NUEVO2', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
('PABLO', 'b2b2f104d32c638903e151a9b20d6e27b41d8c0c84cf8458738f83ca2f1dd744');

INSERT INTO usuario (username, password) 
VALUES ('admin', SHA2('12345', 256));