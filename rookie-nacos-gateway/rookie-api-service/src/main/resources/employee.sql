-- mydb.employee definition

CREATE TABLE `employee` (
                            `id` bigint(20) NOT NULL AUTO_INCREMENT,
                            `name` varchar(100) NOT NULL,
                            `age` int(11) NOT NULL,
                            `salary` bigint(20) NOT NULL,
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;