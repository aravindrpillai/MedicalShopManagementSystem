-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 19, 2015 at 02:47 AM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `medicalshopms`
--

-- --------------------------------------------------------

--
-- Table structure for table `billing_data`
--

CREATE TABLE IF NOT EXISTS `billing_data` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `medicine_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unit_price` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `billing_data`
--


-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE IF NOT EXISTS `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `contact_no` varchar(13) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `contact_no` (`contact_no`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `name`, `contact_no`, `address`) VALUES
(11, 'Ahalya A', '9495495870', 'House no:12A, Kollam'),
(17, 'Aravind', '9447020535', 'Sreerangam, Panayamcher, Anchal');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE IF NOT EXISTS `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `date_of_birth` date NOT NULL,
  `date_of_joining` date NOT NULL,
  `qualification` varchar(50) DEFAULT NULL,
  `contact_no` varchar(13) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `last_update` varchar(30) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `name`, `date_of_birth`, `date_of_joining`, `qualification`, `contact_no`, `address`, `last_update`) VALUES
(9, 'Aravind R Pillai', '1992-01-19', '2015-01-13', 'BTEch', '9447020535', 'Sreerangam, panayamcherry, Anchal', '2015-10-16 12:35:01'),
(10, 'Ahalya A', '1993-01-08', '2014-01-01', 'Fashion Tech', '9495495871', 'Ahalya Vilasam, Trichi, Tamilnadu', '2015-10-16 12:35:45'),
(11, 'Amal Krishna', '1996-01-11', '2015-02-13', 'MBBS', '77777777777', 'No 14 A, Bangalore', '2015-10-16 12:36:32'),
(12, 'Atul Prakash', '1997-02-06', '2015-10-20', 'Biotechnology', '4852145872', 'ouse No 7C, Erode', '2015-10-19 01:40:44');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `last_update` varchar(30) NOT NULL,
  `require_authentication` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `last_update`, `require_authentication`) VALUES
(1, 'user', 'pass', '2015-10-18 20:25:20', 1);

-- --------------------------------------------------------

--
-- Table structure for table `purchases`
--

CREATE TABLE IF NOT EXISTS `purchases` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `product` varchar(100) NOT NULL,
  `customer_contact_no` varchar(13) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unit_price` int(11) NOT NULL,
  `total_cost` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=65 ;

--
-- Dumping data for table `purchases`
--

INSERT INTO `purchases` (`id`, `date`, `product`, `customer_contact_no`, `quantity`, `unit_price`, `total_cost`) VALUES
(64, '2015-10-18', 'Neosporin powder', '9447020535', 2, 43, 86),
(63, '2015-10-18', 'Paracetamol', 'Not Available', 2, 2, 4),
(62, '2015-10-18', 'Bandaid', 'Not Available', 2, 10, 20);

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE IF NOT EXISTS `stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `price` int(11) NOT NULL DEFAULT '0',
  `stock_available` int(11) NOT NULL DEFAULT '0',
  `minimum_quantity` int(11) NOT NULL DEFAULT '5',
  `vendor_id` int(11) NOT NULL COMMENT 'id of the vendor. numeric value',
  `vendor_name` varchar(100) NOT NULL DEFAULT '0',
  `last_update` varchar(30) NOT NULL DEFAULT 'Not Available',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`id`, `name`, `price`, `stock_available`, `minimum_quantity`, `vendor_id`, `vendor_name`, `last_update`) VALUES
(1, 'Paracetamol', 2, 80, 3, 5, 'ABC Medical Suppliers', '2015-10-18 00:27:29'),
(2, 'Neosporin powder', 43, 97, 6, 3, 'ESI Medicines', '2015-10-18 00:17:33'),
(6, 'Horlicks', 123, 100, 50, 3, 'ESI Medicines', '2015-10-18 00:18:16'),
(5, 'Bandaid', 10, 105, 5, 2, 'Mary Matha Medical Suppliers', '2015-10-18 00:19:56');

-- --------------------------------------------------------

--
-- Table structure for table `stock_return`
--

CREATE TABLE IF NOT EXISTS `stock_return` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stock_id` int(11) NOT NULL,
  `stock_name` varchar(100) NOT NULL,
  `return_quantity` int(11) NOT NULL,
  `reason` varchar(300) NOT NULL,
  `vendor_id` int(11) NOT NULL,
  `vendor_name` varchar(100) NOT NULL,
  `return_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `stock_return`
--

INSERT INTO `stock_return` (`id`, `stock_id`, `stock_name`, `return_quantity`, `reason`, `vendor_id`, `vendor_name`, `return_date`) VALUES
(6, 1, 'Paracetamol', 20, '2nd Quality', 5, 'ABC Medical Suppliers', '2015-10-19');

-- --------------------------------------------------------

--
-- Table structure for table `vendors`
--

CREATE TABLE IF NOT EXISTS `vendors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `contact_no` varchar(15) NOT NULL,
  `address` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `vendors`
--

INSERT INTO `vendors` (`id`, `name`, `contact_no`, `address`) VALUES
(1, 'Venkiteswara Medical Suppliers', '99887744455', 'Kozhikode, Kerala'),
(2, 'Mary Matha Medical Suppliers', '8855223344', 'anchal, Kollam'),
(3, 'ESI Medicines', '7539518516', 'Ayoor, Kollam'),
(5, 'ABC Medical Suppliers', '1425415214', 'ABC center, cochin');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
