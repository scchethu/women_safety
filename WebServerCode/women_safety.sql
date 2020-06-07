-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2020 at 07:57 AM
-- Server version: 5.6.11
-- PHP Version: 5.5.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `women_safety`
--
CREATE DATABASE IF NOT EXISTS `women_safety` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `women_safety`;

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE IF NOT EXISTS `data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` text NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`id`, `msg`, `date`) VALUES
(3, 'hello', '2020-06-06'),
(4, 'hello amn', '2020-06-07'),
(5, 'ðŸ˜‚ ðŸ¤£ ðŸ˜ƒ ðŸ˜„ ðŸ˜…', '2020-06-07'),
(6, '8%ðŸ˜‚ 4%ðŸ¤£  6%ðŸ˜ƒ ðŸ˜„ ðŸ˜…', '2020-06-07'),
(7, '8%ðŸ˜‚ 4%ðŸ¤£  6%ðŸ˜ƒ ðŸ˜„ ðŸ˜…', '2020-06-07'),
(8, '8%ðŸ˜‚ 4%ðŸ¤£  6%ðŸ˜ƒ ðŸ˜„ ðŸ˜…', '2020-06-07'),
(9, '8%ðŸ˜‚ 4%ðŸ¤£  6%ðŸ˜ƒ ðŸ˜„ ðŸ˜…', '2020-06-07'),
(10, '8%ðŸ˜‚ 4%ðŸ¤£  6%ðŸ˜ƒ ðŸ˜„ ðŸ˜…', '2020-06-07');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `email` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `phone`, `email`, `password`) VALUES
(1, 'Chethan', '9611825370', 'scchethu@gmail.com', '123'),
(2, '', '', '', ''),
(3, 'Abc', '1234567890', 'abc@gmail.com', '123');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
