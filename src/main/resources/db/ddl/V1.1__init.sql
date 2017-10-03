CREATE TABLE `employee_details` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `comp_id` int(11) NOT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `comp_id` (`comp_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`comp_id`) REFERENCES `company` (`comp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;