CREATE SCHEMA 'twitter-staging' DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `STG_TWITTER_MSG` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `twitter_id` int(11) NOT NULL,
  `twitter_msg` varchar(1024) NOT NULL COMMENT 'Stores Raw Twitter Messages',
  `status` varchar(1) NOT NULL,
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `twitter_id_UNIQUE` (`twitter_id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) DEFAULT CHARSET=utf8;


