-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 12, 2021 at 06:11 PM
-- Server version: 5.1.36
-- PHP Version: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tftdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `alumni`
--

CREATE TABLE IF NOT EXISTS `alumni` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `branch` varchar(50) NOT NULL,
  `batch` int(20) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `imgname` varchar(250) NOT NULL,
  `uploaddate` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `imgname` (`imgname`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `alumni`
--

INSERT INTO `alumni` (`id`, `name`, `branch`, `batch`, `email`, `imgname`, `uploaddate`) VALUES
(1, 'Divyansh Srivastava', 'IT', 2019, NULL, 'a4.jpeg', '2020-08-29'),
(2, 'Akash Jaiswal', 'EL', 2019, NULL, 'a5.jpeg', '2020-08-29'),
(3, 'Sumit Verma', 'CSE', 2016, NULL, 'a6.jpeg', '2020-08-29'),
(4, 'Anshu Agarwal', 'IT', 2018, NULL, 'a2.jpg', '2020-08-29'),
(5, 'Anurag Srivastava', 'IT', 2018, NULL, 'a3.jpg', '2020-08-30'),
(6, 'Bharat Kumar', 'ME', 2014, NULL, 'a1.jpg', '2020-08-30');

-- --------------------------------------------------------

--
-- Table structure for table `gallery`
--

CREATE TABLE IF NOT EXISTS `gallery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `imgname` varchar(250) NOT NULL,
  `uploaddate` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `gallery`
--

INSERT INTO `gallery` (`id`, `imgname`, `uploaddate`) VALUES
(1, 'tfti.jpg', '2020-08-29'),
(2, 'tft2.jpg', '2020-08-29'),
(3, 'tft3.jpg', '2020-08-29'),
(5, 'aa1.jpg', '2020-09-08'),
(6, 'aa2.jpg', '2020-09-08'),
(7, 'aa3.jpg', '2020-09-08'),
(8, 'aa4.jpg', '2020-09-08'),
(9, 'aa5.jpg', '2020-09-08');

-- --------------------------------------------------------

--
-- Table structure for table `notes`
--

CREATE TABLE IF NOT EXISTS `notes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `department` varchar(100) NOT NULL,
  `subject` varchar(100) NOT NULL,
  `filename` varchar(250) NOT NULL,
  `title` varchar(250) NOT NULL,
  `description` varchar(500) NOT NULL,
  `uploaddate` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `notes`
--

INSERT INTO `notes` (`id`, `department`, `subject`, `filename`, `title`, `description`, `uploaddate`) VALUES
(1, 'CE', 'SOM', 'SOM.pdf', 'SOM', 'Structure of Material', '2020-08-31'),
(2, 'EL', 'ELECTRONICS', 'ELECTRONICS.pdf', 'ELECTRONICS', 'Introduction to Electronics', '2020-08-31'),
(3, 'EE', 'ELECTRICAL', 'ELECTRICAL.pdf', 'ELECTRICAL', 'Introduction to Electrical', '2020-08-31'),
(4, 'AS', 'MATHEMATICS', 'MATHEMATICS.pdf', 'MATHEMATICS', 'Introduction to Engineering Mathematics', '2020-08-31'),
(5, 'ME', 'ENGINEERING MECHANICS', 'ENGINEERING MECHANICS.pdf', 'MECHANICS', 'Introduction to Engineering Mechanics', '2020-08-31'),
(6, 'ME', 'FLUID MECHANICS', 'FLUID MECHANICS.pdf', 'FLUID MECHANICS', 'Introduction to Fluid Mechanics', '2020-08-31'),
(7, 'CSE_IT', 'DS', 'DS.pdf', 'DATA STRUCTURES', 'Introduction to Data Structures', '2020-08-31'),
(8, 'CSE_IT', 'OS', 'OS.pdf', 'OPERATING SYSTEM', 'Introduction to Operating System', '2020-08-31'),
(9, 'CSE_IT', 'PYTHON', 'PYTHON.pdf', 'PYTHON', 'Introduction to Python Programming', '2020-08-31'),
(10, 'CSE_IT', 'C', 'C_INTRO.pdf', 'C PROGRAMMING', 'Introduction to C Programming', '2020-08-31'),
(11, 'CSE_IT', 'C', 'POINTER.pdf', 'POINTER', 'Pointer in C', '2021-01-08'),
(12, 'CSE_IT', 'C', 'LOOPS.pdf', 'LOOPS', 'Loops in C', '2021-01-08'),
(13, 'CSE_IT', 'C', 'FUNCTIONS.pdf', 'FUNCTIONS', 'Functions in C', '2021-01-08'),
(15, 'CSE_IT', 'C', 'RECURSION.pdf', 'RECURSION', 'Recursion in C', '2021-01-09');

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE IF NOT EXISTS `notification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `notificationtext` varchar(500) NOT NULL,
  `posteddt` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `notification`
--

INSERT INTO `notification` (`id`, `notificationtext`, `posteddt`) VALUES
(9, 'Semester exam of  IT final year will be held on 27th September', '2020-08-27'),
(2, 'Class Timing for today is from 4:00 pm to 6:00 pm.', '2019-04-27'),
(4, 'tomorrow''s class is cancelled', '2019-10-25'),
(5, 'Next class of C will be held tomorrow morning at 7am-8:30am', '2019-10-27'),
(6, 'Semester exams will start from 9th Dec', '2019-11-02'),
(7, 'Online project viva will start from 1st september', '2020-08-27'),
(8, 'Semester exam of final year students will start from 21st September', '2020-08-27');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE IF NOT EXISTS `subjects` (
  `S.no` int(11) NOT NULL AUTO_INCREMENT,
  `department` varchar(100) NOT NULL,
  `subject` varchar(250) NOT NULL,
  PRIMARY KEY (`S.no`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`S.no`, `department`, `subject`) VALUES
(1, 'CSE_IT', 'C'),
(2, 'CSE_IT', 'PYTHON'),
(3, 'CSE_IT', 'OS'),
(4, 'CSE_IT', 'DS'),
(5, 'CE', 'SOM'),
(6, 'EE', 'ELECTRICAL'),
(7, 'EL', 'ELECTRONICS'),
(8, 'AS', 'MATHEMATICS'),
(9, 'ME', 'ENGINEERING MECHANICS'),
(10, 'ME', 'FLUID MECHANICS');
