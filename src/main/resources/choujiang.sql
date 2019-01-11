/*
Navicat MySQL Data Transfer

Source Server         : 172.22.30.110
Source Server Version : 50722
Source Host           : 172.22.30.110:3306
Source Database       : choujiang

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2019-01-11 19:32:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for au_data
-- ----------------------------
DROP TABLE IF EXISTS `au_data`;
CREATE TABLE `au_data` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT,
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `name` varchar(50) DEFAULT NULL COMMENT '名字',
  `first_name` varchar(50) DEFAULT NULL COMMENT '名',
  `last_name` varchar(50) DEFAULT NULL COMMENT '姓',
  `state` varchar(50) DEFAULT NULL COMMENT '区',
  `city` varchar(50) DEFAULT NULL COMMENT '城市',
  `address` varchar(255) DEFAULT NULL COMMENT '街道',
  `zip_code` varchar(50) DEFAULT NULL COMMENT '邮编',
  `phone` varchar(50) DEFAULT NULL COMMENT '电话',
  `birth_day` varchar(5) DEFAULT NULL,
  `birth_month` varchar(5) DEFAULT NULL,
  `birth_year` varchar(5) DEFAULT '0',
  `use_status` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `submit_time` datetime DEFAULT NULL,
  `offer_url` text,
  `address2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `11` (`email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1099 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of au_data
-- ----------------------------
INSERT INTO `au_data` VALUES ('1081', 'sling_344@hotmail.com', 'f', 'Stephanie ', 'Aboud', 'VIC', 'Altona North', '2 Misten', '3025', '421781408', '14', '7', '1983', '3,3,3', '2019-01-11 04:45:56', '2019-01-11 04:46:36', '', '2/70 Misten Avenue');
INSERT INTO `au_data` VALUES ('1082', 'jane.e.honeyman@gmail.com', 'f', 'Jane', 'Honeyman', 'VIC', 'Brunswick East', '15 French', '3057', '408535437', '5', '11', '1982', '1,3,3', '2019-01-11 04:45:56', '2019-01-11 05:23:37', 'https://newgamesapp.net/?id=48053&offer_id=164998,https://c.sparkletrace.com/?a=267&c=1521&E=N%2fI8oeJiWSM%3d&s1=,http://www.braverymobtracking.com/tl?a=1372&o=14904', '15/22 French Avenue');
INSERT INTO `au_data` VALUES ('1083', '2ksparevc2@gmail.com', 'm', 'Eman', 'Johnson', 'VIC', 'Craigieburn', '7 Clovelly', '3064', '400001100', '20', '11', '1990', '0', '2019-01-11 04:45:56', null, null, '7 Clovelly Ddr');
INSERT INTO `au_data` VALUES ('1084', 'emaamillsen@yahoo.com', 'm', 'Millsen', 'Mauger', 'NSW', 'Blackmans Point', '2 Gray', '2444', '401507885', '18', '6', '1982', '0', '2019-01-11 04:45:56', null, null, '2-6 Gray St');
INSERT INTO `au_data` VALUES ('1085', 'kendashte@gmail.com', 'm', 'Ken Te', 'Chang', 'QLD', 'Bowen Hills', '17 Mallon', '4006', '435726749', '8', '7', '1987', '0', '2019-01-11 04:45:56', null, null, '17 Mallon St');
INSERT INTO `au_data` VALUES ('1086', 'matthew-caruana@hotmail.com', 'm', 'Matthew', 'Caruana', 'NSW', 'Cecil Park', '63 Brolen', '2178', '420713087', '13', '4', '1989', '0', '2019-01-11 04:45:56', null, null, '63-65 Brolen Way ');
INSERT INTO `au_data` VALUES ('1087', 'maccaronie@hotmail.com', 'f', 'Cassie', 'Mckeon', 'VIC', 'Echuca', '237 Service', '3564', '447286507', '22', '2', '1986', '0', '2019-01-11 04:45:56', null, null, '237 Service St ');
INSERT INTO `au_data` VALUES ('1088', 'rplandscape@live.com', 'm', 'Rob', 'Picheta', 'SA', 'Osborne', '13 Enid', '5017', '422659016', '22', '5', '1984', '0', '2019-01-11 04:45:56', null, null, '13 Enid Ave');
INSERT INTO `au_data` VALUES ('1089', 'inder.3028@gmail.com', 'm', 'Satwinderpal ', 'Singh', 'VIC', 'Laverton Raaf', '23 Fieldwren', '3027', '406718719', '6', '2', '1983', '0', '2019-01-11 04:45:56', null, null, '23 Fieldwren Drive');
INSERT INTO `au_data` VALUES ('1090', 'nathanharmer@gmail.com', 'm', 'Nathan', 'Harmer', 'QLD', 'Whiteside', '5 Whiteside', '4503', '438620965', '21', '6', '1987', '0', '2019-01-11 04:45:56', null, null, '5 Whiteside Rd');
INSERT INTO `au_data` VALUES ('1091', 'hiramohsin1@hotmail.com', 'f', 'Hira', 'Mohsin ', 'ACT', 'Gungahlin', '343 Anthony', '2912', '449760303', '17', '3', '1983', '0', '2019-01-11 04:45:56', null, null, '343 Anthony Rolfe Avenue ');
INSERT INTO `au_data` VALUES ('1092', 'mariaam_77@yahoo.com', 'f', 'Maryam', 'Darestani', 'VIC', 'Rosanna', '3 Station', '3084', '458000987', '27', '4', '1983', '0', '2019-01-11 04:45:56', null, null, '3/23 Station Road');
INSERT INTO `au_data` VALUES ('1093', 'fcstyles777@hotmail.com', 'm', 'Lee', 'Martin', 'QLD', 'Labrador', '90 Central', '4215', '478898169', '16', '12', '1985', '0', '2019-01-11 04:45:56', null, null, '90 Central Street');
INSERT INTO `au_data` VALUES ('1094', 'antoniaking1@icloud.com', 'f', 'Antonia ', 'King', 'NSW', 'Merrylands', '3 Eddy', '2160', '414959195', '11', '12', '1983', '0', '2019-01-11 04:45:56', null, null, '3/95-99 Eddy St ');
INSERT INTO `au_data` VALUES ('1095', 'lukemainland@yahoo.com.au', 'm', 'Luke', 'Mainland ', 'WA', 'Palmyra', '36 Petra', '6157', '477004521', '26', '12', '1983', '0', '2019-01-11 04:45:56', null, null, '36a Petra St ');
INSERT INTO `au_data` VALUES ('1096', 'nickitruskett@icloud.com', 'f', 'Nicki', 'Truskett', 'QLD', 'Toolooa', '23 Whiting', '4680', '431235546', '1', '10', '1981', '0', '2019-01-11 04:45:56', null, null, '23 Whiting St ');
INSERT INTO `au_data` VALUES ('1097', 'Stacy_holden@hotmail.com', 'f', 'Stacy', 'Holden', 'VIC', 'Bruthen', '5 Delahunty', '3885', '429598099', '5', '12', '1984', '0', '2019-01-11 04:45:56', null, null, '5 Delahunty St ');
INSERT INTO `au_data` VALUES ('1098', 'Usabc1234567@gmail.com', 'm', 'Mac', 'Fager', 'VIC', 'Moorabbin', '16 Bulli', '3189', '434261289', '1', '1', '1990', '0', '2019-01-11 04:45:56', null, null, 'Parcel Locker 10050 29480. 16-20 Bulli Street ');

-- ----------------------------
-- Table structure for au_wish
-- ----------------------------
DROP TABLE IF EXISTS `au_wish`;
CREATE TABLE `au_wish` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT,
  `content` text,
  `use_status` varchar(255) DEFAULT NULL,
  `type` int(1) DEFAULT '0' COMMENT '类型：0心愿单1获奖理由',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=237 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of au_wish
-- ----------------------------
INSERT INTO `au_wish` VALUES ('86', 'ook', '1', '0');
INSERT INTO `au_wish` VALUES ('87', 'oney', '1', '0');
INSERT INTO `au_wish` VALUES ('88', 'phone', '1', '0');
INSERT INTO `au_wish` VALUES ('89', 'ift Card', '1', '0');
INSERT INTO `au_wish` VALUES ('90', 'areer', '1', '0');
INSERT INTO `au_wish` VALUES ('91', ' new Car', '1', '0');
INSERT INTO `au_wish` VALUES ('92', 'ravel', '1', '0');
INSERT INTO `au_wish` VALUES ('93', 'lothes', '1', '0');
INSERT INTO `au_wish` VALUES ('94', 'MW', '1', '0');
INSERT INTO `au_wish` VALUES ('95', 'box', '1', '0');
INSERT INTO `au_wish` VALUES ('96', ' new House', '1', '0');
INSERT INTO `au_wish` VALUES ('97', ' NEW Television', '1', '0');
INSERT INTO `au_wish` VALUES ('98', 'ercedes Benz Car', '1', '0');
INSERT INTO `au_wish` VALUES ('99', 'aptop', '1', '0');
INSERT INTO `au_wish` VALUES ('100', 'ift', '1', '0');
INSERT INTO `au_wish` VALUES ('101', 'offe mashine', '1', '0');
INSERT INTO `au_wish` VALUES ('102', 'ireless earplug', '1', '0');
INSERT INTO `au_wish` VALUES ('103', 'mart speakers', '1', '0');
INSERT INTO `au_wish` VALUES ('104', 'lower', '1', '0');
INSERT INTO `au_wish` VALUES ('105', 'obomb', '1', '0');
INSERT INTO `au_wish` VALUES ('106', 'ntelligent Watch', '0', '0');
INSERT INTO `au_wish` VALUES ('107', 'OLD', '0', '0');
INSERT INTO `au_wish` VALUES ('108', 'ope the stars', '0', '0');
INSERT INTO `au_wish` VALUES ('109', 'et the moon', '0', '0');
INSERT INTO `au_wish` VALUES ('110', 'ig  meal', '0', '0');
INSERT INTO `au_wish` VALUES ('111', 'orld peace', '0', '0');
INSERT INTO `au_wish` VALUES ('112', 'arry', '0', '0');
INSERT INTO `au_wish` VALUES ('113', 'arty', '0', '0');
INSERT INTO `au_wish` VALUES ('114', 'ave health body', '0', '0');
INSERT INTO `au_wish` VALUES ('115', 'y family and the people around me to be fine.', '0', '0');
INSERT INTO `au_wish` VALUES ('116', ' wish and you can later every good time together', '0', '0');
INSERT INTO `au_wish` VALUES ('117', ' wish for a truly merry Christmas and may the joy of Christmas linger in your heart all the year', '0', '0');
INSERT INTO `au_wish` VALUES ('118', 'ish you in this year\'s Christmas, every desire can realize', '0', '0');
INSERT INTO `au_wish` VALUES ('119', 'ope all your Christmas dreams come true', '0', '0');
INSERT INTO `au_wish` VALUES ('120', ' wish my favorite people health, and every Christmas can be a happy heart', '0', '0');
INSERT INTO `au_wish` VALUES ('121', 'Learn to swim ', '0', '0');
INSERT INTO `au_wish` VALUES ('122', 'earn to dive ', '0', '0');
INSERT INTO `au_wish` VALUES ('123', 'ake a plane ', '0', '0');
INSERT INTO `au_wish` VALUES ('124', 'earn to make cake and bread ', '0', '0');
INSERT INTO `au_wish` VALUES ('125', 'earn to pull coffee flowers (simple) ', '0', '0');
INSERT INTO `au_wish` VALUES ('126', 'e a volunteer (preferably go to NGO experience). ', '0', '0');
INSERT INTO `au_wish` VALUES ('127', 'e a manager ', '0', '0');
INSERT INTO `au_wish` VALUES ('128', 'Start a business ', '0', '0');
INSERT INTO `au_wish` VALUES ('129', 'Go to space once and see my planet. ', '0', '0');
INSERT INTO `au_wish` VALUES ('130', 'Deep-sea diving, make a big fish. ', '0', '0');
INSERT INTO `au_wish` VALUES ('131', 'Skydiving ', '0', '0');
INSERT INTO `au_wish` VALUES ('132', 'Bungee jumping ', '0', '0');
INSERT INTO `au_wish` VALUES ('133', 'Meditation ', '0', '0');
INSERT INTO `au_wish` VALUES ('134', 'Standing upside down ', '0', '0');
INSERT INTO `au_wish` VALUES ('135', 'Marathon ', '0', '0');
INSERT INTO `au_wish` VALUES ('136', 'When a doctor ', '0', '0');
INSERT INTO `au_wish` VALUES ('137', 'Speech ', '0', '0');
INSERT INTO `au_wish` VALUES ('138', 'Dream back to the Tang Dynasty in an antique costume. Do a white-faced scholar (shooting a set of antique art photos). ', '0', '0');
INSERT INTO `au_wish` VALUES ('139', 'Write a martial arts novel ', '0', '0');
INSERT INTO `au_wish` VALUES ('140', 'Write an urban novel ', '0', '0');
INSERT INTO `au_wish` VALUES ('141', 'Write a novel that can be painted as a cartoon. ', '0', '0');
INSERT INTO `au_wish` VALUES ('142', 'Write a well-known book ', '0', '0');
INSERT INTO `au_wish` VALUES ('143', 'All three years, once ', '0', '0');
INSERT INTO `au_wish` VALUES ('144', ' years to say \"thanksgiving\" for everything, once ', '0', '0');
INSERT INTO `au_wish` VALUES ('145', 'Climb several famous mountains in China (at least 20). And on top of one of the hills, you can see the sunrise and the sea of clouds. ', '0', '0');
INSERT INTO `au_wish` VALUES ('146', 'Take a vacation on the beach with your loved ones ', '0', '0');
INSERT INTO `au_wish` VALUES ('147', 'Go to the prairie and roll hard in the wind-driven prairie waves. ', '0', '0');
INSERT INTO `au_wish` VALUES ('148', 'Raise a Golden Hair ', '0', '0');
INSERT INTO `au_wish` VALUES ('149', 'Raise a Cat ', '0', '0');
INSERT INTO `au_wish` VALUES ('150', 'Go to Antarctica ', '0', '0');
INSERT INTO `au_wish` VALUES ('151', 'Go to the Arctic ', '0', '0');
INSERT INTO `au_wish` VALUES ('152', 'Collect 100 historic ancient residences. ', '0', '0');
INSERT INTO `au_wish` VALUES ('153', 'Go to the world\'s major museums once ', '0', '0');
INSERT INTO `au_wish` VALUES ('154', 'Have 8 abdominal muscles once. Before the age of ', '0', '0');
INSERT INTO `au_wish` VALUES ('155', 'he was familiar with the contents of 200 books. (equivalent to 2000-6000) ', '0', '0');
INSERT INTO `au_wish` VALUES ('156', 'Domestic Backpack Travel 2-3 years ', '0', '0');
INSERT INTO `au_wish` VALUES ('157', 'Write good handwriting (middle-level calligraphy) ', '0', '0');
INSERT INTO `au_wish` VALUES ('158', 'Go to Finland to see snow, drink beer, steam sauna ', '0', '0');
INSERT INTO `au_wish` VALUES ('159', 'Go to Heidelberg University in Germany to study ', '0', '0');
INSERT INTO `au_wish` VALUES ('160', 'Can speak at least eight languages. (Ancient Chinese, English, German, Greek, Latin, Hebrew, Spanish, Hindi, Sanskrit, Tibetan) ', '0', '0');
INSERT INTO `au_wish` VALUES ('161', 'If I met the right person before I was old, I would try to form a family. If I was destined to be lonely in my life, I would consider adopting a child. Choose one or two to finish. ', '0', '0');
INSERT INTO `au_wish` VALUES ('162', 'Settlement in Italy for 1-2 years ', '0', '0');
INSERT INTO `au_wish` VALUES ('163', 'Experience skiing in the Alps once ', '0', '0');
INSERT INTO `au_wish` VALUES ('164', 'Learn to drive private civilian helicopters. ', '0', '0');
INSERT INTO `au_wish` VALUES ('165', 'Learn Chinese food ', '0', '0');
INSERT INTO `au_wish` VALUES ('166', 'Learn West Point ', '0', '0');
INSERT INTO `au_wish` VALUES ('167', 'Learn investment and finance ', '0', '0');
INSERT INTO `au_wish` VALUES ('168', 'Play several tunes on the piano ', '0', '0');
INSERT INTO `au_wish` VALUES ('169', 'Go to the (world famous) opera house and listen to a Canon ', '0', '0');
INSERT INTO `au_wish` VALUES ('170', 'Walk along the Rhine River ', '0', '0');
INSERT INTO `au_wish` VALUES ('171', 'Set up a company for the disabled with 80% - 90% of the disabled to serve the society and the welfare workers at home. The scientific research management company does not aim at making money. 54. Take a look at the stars in the most beautiful place. (Antarctica, Arctic, Space, Desert, etc.) ', '0', '0');
INSERT INTO `au_wish` VALUES ('172', 'Western etiquette learning ', '0', '0');
INSERT INTO `au_wish` VALUES ('173', 'Chinese classical etiquette learning ', '0', '0');
INSERT INTO `au_wish` VALUES ('174', 'Can at least one simple dance ', '0', '0');
INSERT INTO `au_wish` VALUES ('175', 'Learn to ride ', '0', '0');
INSERT INTO `au_wish` VALUES ('176', 'Have a house-sized library ', '0', '0');
INSERT INTO `au_wish` VALUES ('177', 'Study yoga in India ', '0', '0');
INSERT INTO `au_wish` VALUES ('178', 'Travel with parents ', '0', '0');
INSERT INTO `au_wish` VALUES ('179', 'Be an adult ', '0', '0');
INSERT INTO `au_wish` VALUES ('180', 'Cultivate an elegant and exquisite attitude towards life ', '0', '0');
INSERT INTO `au_wish` VALUES ('181', 'Open a memorial service for your own death ', '0', '0');
INSERT INTO `au_wish` VALUES ('182', 'earn Chinese medicine for health preservation, and strive for 80 years old, you can still jump ', '0', '0');
INSERT INTO `au_wish` VALUES ('183', 'Repeat on Mount Wudang for 3-5 years, ', '0', '0');
INSERT INTO `au_wish` VALUES ('184', 'Climb Mount Qomolangma and kiss it ', '0', '0');
INSERT INTO `au_wish` VALUES ('185', 'Go to the valley of the dead volcano once ', '0', '0');
INSERT INTO `au_wish` VALUES ('186', 'Practice inner strength (wonder if the world has inner strength, if there is really one for health preservation and medicine) ', '0', '0');
INSERT INTO `au_wish` VALUES ('187', 'Learn authentic Taiji ', '0', '0');
INSERT INTO `au_wish` VALUES ('188', 'Find a place to plant a tree, and let life continue in the tree (I will not bury, ashes after death). ', '0', '0');
INSERT INTO `au_wish` VALUES ('189', 'If I die, what I have learned from this great soil in my lifetime will feed back on it. ', '0', '0');
INSERT INTO `au_wish` VALUES ('190', 'As my life draws to a close, I will look for a small place to stand by the mountains and rivers. Then, like Mr. Tao Lao, he learns to \"gather Chrysanthemum under the East fence and see Nanshan leisurely.\" ', '0', '0');
INSERT INTO `au_wish` VALUES ('191', 'Experience a can of herring and five divine waters. It is said that there will be a feeling that your soul will break through the spiritual cap. From then on, there will be no barrier that can not be overcome in life. ', '0', '0');
INSERT INTO `au_wish` VALUES ('192', 'Participate in WWOOF, go to farms/pastures all over the world, learn and experience exotic pastoral planting and animal husbandry life. ', '0', '0');
INSERT INTO `au_wish` VALUES ('193', 'Write a collection of modern poems on ancient Chinese poems ', '0', '0');
INSERT INTO `au_wish` VALUES ('194', 'Premarital sex is prohibited ', '0', '0');
INSERT INTO `au_wish` VALUES ('195', 'Kiss a dolphin once. ', '0', '0');
INSERT INTO `au_wish` VALUES ('196', 'Open a vegetarian restaurant ', '0', '0');
INSERT INTO `au_wish` VALUES ('197', 'Pay attention to the mental health problems of people aged 10-23, and do what you can. ', '0', '0');
INSERT INTO `au_wish` VALUES ('198', 'Study the brilliant Chinese literature such as Confucianism, Buddhism, Taoism and the Book of Changes ', '0', '0');
INSERT INTO `au_wish` VALUES ('199', 'Study other sacred, magical human history and other interesting knowledge and culture abroad. ', '0', '0');
INSERT INTO `au_wish` VALUES ('200', 'Change at least one person\'s life with the action of one\'s wish list. ', '0', '0');
INSERT INTO `au_wish` VALUES ('201', 'Establish an organic non-genetically modified farm or villa.', '0', '0');
INSERT INTO `au_wish` VALUES ('227', 'It’s a miracle ,How I believe that miracles can be.', '0', '1');
INSERT INTO `au_wish` VALUES ('228', 'My last prize was in elementary school.the chance belongs to me.', '0', '1');
INSERT INTO `au_wish` VALUES ('229', 'Looking forward to mysterious gifts.can\'t wait !', '0', '1');
INSERT INTO `au_wish` VALUES ('230', 'I am too tired, I have been losing weight.emmmmmmm', '0', '1');
INSERT INTO `au_wish` VALUES ('231', 'If I have to live my life without you near me,days will all be empty.', '0', '1');
INSERT INTO `au_wish` VALUES ('232', 'You don’t have to change a thing,I Love you just the way you are.', '0', '1');
INSERT INTO `au_wish` VALUES ('233', 'oh,what a warm day!got this!i am always the lucky one.', '0', '1');
INSERT INTO `au_wish` VALUES ('234', 'Why should I explain to you?Are you a judge?', '0', '1');
INSERT INTO `au_wish` VALUES ('235', 'So come with me and share the view,I’ll help you see forever too.', '0', '1');
INSERT INTO `au_wish` VALUES ('236', 'I like beautiful cards with perfume.', '0', '1');

-- ----------------------------
-- Table structure for screen
-- ----------------------------
DROP TABLE IF EXISTS `screen`;
CREATE TABLE `screen` (
  `screen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of screen
-- ----------------------------
INSERT INTO `screen` VALUES ('1024,600');
INSERT INTO `screen` VALUES ('1024,768');
INSERT INTO `screen` VALUES ('1280,1024');
INSERT INTO `screen` VALUES ('1600,900');
INSERT INTO `screen` VALUES ('1440,1050');
INSERT INTO `screen` VALUES ('1600,1200');
INSERT INTO `screen` VALUES ('1280,800');
INSERT INTO `screen` VALUES ('1366,768');
INSERT INTO `screen` VALUES ('1280,854');
INSERT INTO `screen` VALUES ('1440,900');
INSERT INTO `screen` VALUES ('1600,1024');
INSERT INTO `screen` VALUES ('1680,1050');
INSERT INTO `screen` VALUES ('1920,1080');
INSERT INTO `screen` VALUES ('1920,1200');

-- ----------------------------
-- Table structure for us_data
-- ----------------------------
DROP TABLE IF EXISTS `us_data`;
CREATE TABLE `us_data` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `primary_phone` varchar(50) DEFAULT NULL,
  `street_address` varchar(255) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `zip_code` varchar(50) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL COMMENT '州全名',
  `birth_year` varchar(5) DEFAULT NULL,
  `birth_month` varchar(5) DEFAULT NULL,
  `birth_day` varchar(255) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `state_code` varchar(20) DEFAULT NULL COMMENT '州缩写',
  `use_status` varchar(50) NOT NULL DEFAULT '0' COMMENT '抽奖状态：0未使用1使用2废资料3提交后异常，默认为0，多个以逗号隔开',
  `submit_time` datetime DEFAULT NULL COMMENT '提交时间',
  `submit_offer` text COMMENT 'offer提交地址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=1506 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of us_data
-- ----------------------------
INSERT INTO `us_data` VALUES ('1486', 'tearteatuwhpir@hotmail.com', 'Todd', 'Christensen', '678-457-3336', '2188Adonais Way', 'Norcross', '30071', null, null, '1987', '12', '24', '2019-01-05 12:59:37', 'GA', '1,3', '2019-01-05 13:28:37', null);
INSERT INTO `us_data` VALUES ('1487', 'smeweesmeesrs@hotmail.com', 'Jewell', 'Trujillo', '601-491-5565', '2790Lena Lane', 'Raleigh', '39153', null, null, '1972', '6', '29', '2019-01-05 13:00:39', 'MS', '3,3', '2019-01-05 13:43:07', null);
INSERT INTO `us_data` VALUES ('1488', 'sayshecagvimo@hotmail.com', 'Roselle', 'Abbott', '201-818-6808', '1803Lakewood Drive', 'Ramsey', '07446', null, null, '1997', '12', '11', '2019-01-05 13:00:41', 'NJ', '1,3', '2019-01-05 14:02:34', null);
INSERT INTO `us_data` VALUES ('1489', 'shesesoneoaxia@hotmail.com', 'Lowell', 'Proulx', '830-294-3353', '4063Morris Street', 'San Antonio', '78205', null, null, '1979', '7', '19', '2019-01-05 13:01:38', 'TX', '99,99', '2019-01-05 14:09:40', null);
INSERT INTO `us_data` VALUES ('1490', 'theroasevsfxf@hotmail.com', 'Sandra', 'Liao', '410-662-2377', '1493Marshall Street', 'Baltimore', '21218', null, null, '1985', '3', '25', '2019-01-05 13:01:45', 'MD', '99,99', '2019-01-05 14:15:24', null);
INSERT INTO `us_data` VALUES ('1491', 'thesayjgdkd@hotmail.com', 'Alma', 'McGonigal', '516-280-7583', '4349Heavner Court', 'Garden City', '11530', null, null, '1973', '9', '17', '2019-01-05 13:02:03', 'NY', '1,3', '2019-01-06 07:45:32', null);
INSERT INTO `us_data` VALUES ('1492', 'leesacswsrc@hotmail.com', 'George', 'Freeman', '401-784-0613', '2823Bond Street', 'Providence', '02905', null, null, '1998', '8', '20', '2019-01-05 13:02:50', 'RI', '3,3', '2019-01-06 08:12:02', null);
INSERT INTO `us_data` VALUES ('1493', 'thadeatkgs@hotmail.com', 'Shirley', 'Myers', '856-745-8846', '1496Valley Street', 'Maple Shade', '08052', null, null, '1990', '7', '25', '2019-01-05 13:03:08', 'NJ', '1,3', '2019-01-06 08:31:09', null);
INSERT INTO `us_data` VALUES ('1494', 'thaythayshqlxi@hotmail.com', 'Mercedes', 'Rivers', '334-449-7934', '3370Turkey Pen Lane', 'Montgomery', '36117', null, null, '1990', '5', '22', '2019-01-05 13:04:05', 'AL', '99,99', '2019-01-06 08:35:12', null);
INSERT INTO `us_data` VALUES ('1495', 'thabeighpfkpg@hotmail.com', 'Scott', 'Johnson', '785-670-4971', '729Dog Hill Lane', 'Topeka', '66608', null, null, '1982', '10', '24', '2019-01-05 13:04:20', 'KS', '3,3', '2019-01-06 08:43:01', null);
INSERT INTO `us_data` VALUES ('1496', 'nedeedwgjec@hotmail.com', 'Frances', 'Obyrne', '224-628-9310', '4440Victoria Street', 'Chicago', '60631', null, null, '1975', '5', '5', '2019-01-06 08:29:16', 'IL', '3,3', '2019-01-06 09:00:55', null);
INSERT INTO `us_data` VALUES ('1497', 'thaysteastirtf@hotmail.com', 'Brian', 'Connors', '517-364-0051', '980Amethyst Drive', 'Lansing', '48933', null, null, '1997', '12', '13', '2019-01-06 08:29:28', 'MI', '99,99', '2019-01-06 09:12:59', null);
INSERT INTO `us_data` VALUES ('1498', 'slodoughsdbow@hotmail.com', 'Kent', 'Brown', '240-326-1834', '2202Wilmar Farm Road', 'Herndon', '22070', null, null, '1970', '2', '26', '2019-01-06 08:29:30', 'MD', '0', null, null);
INSERT INTO `us_data` VALUES ('1499', 'teighpftw@hotmail.com', 'Jill', 'Ng', '863-528-0693', '715Oakdale Avenue', 'Winter Haven', '33830', null, null, '1976', '8', '8', '2019-01-06 08:29:32', 'FL', '0', null, null);
INSERT INTO `us_data` VALUES ('1500', 'nasheauktl@hotmail.com', 'Yvonne', 'Dawson', '772-341-2191', '2410Elkview Drive', 'Lake Worth', '33463', null, null, '1991', '4', '24', '2019-01-06 08:29:34', 'FL', '0', null, null);
INSERT INTO `us_data` VALUES ('1501', 'thysetgcrt@hotmail.com', 'Colin', 'Doctor', '719-749-2405', '1707Berry Street', 'Peyton', '80831', null, null, '1993', '12', '25', '2019-01-06 08:29:37', 'CO', '0', null, null);
INSERT INTO `us_data` VALUES ('1502', 'Violacdj@yahoo.com', 'Michael', 'Gabriel', '858-481-7811', '96Pike Street', 'Del Mar', '92014', null, null, '1972', '11', '10', '2019-01-06 08:29:42', 'CA', '0', null, null);
INSERT INTO `us_data` VALUES ('1503', 'WadeCut@yahoo.com', 'Judith', 'Rose', '928-372-5617', '1202Clarksburg Park Road', 'Harquahala Valley', '85069', null, null, '1977', '3', '21', '2019-01-06 08:29:44', 'AZ', '0', null, null);
INSERT INTO `us_data` VALUES ('1504', 'Marciabni@yahoo.com', 'Stephen', 'Cooper', '510-352-5768', '4836Thompson Drive', 'San Leandro', '94578', null, null, '1971', '8', '13', '2019-01-06 08:29:46', 'CA', '0', null, null);
INSERT INTO `us_data` VALUES ('1505', null, 'John', 'Ray', '405-908-4382', '3665Meadow Drive', 'Oklahoma City', '73135', null, null, '1993', '5', '4', '2019-01-06 08:29:48', 'OK', '0', null, null);

-- ----------------------------
-- Table structure for us_data_state
-- ----------------------------
DROP TABLE IF EXISTS `us_data_state`;
CREATE TABLE `us_data_state` (
  `state` varchar(20) DEFAULT NULL,
  `state_code` varchar(20) DEFAULT NULL COMMENT '州缩写',
  `state_name` varchar(100) NOT NULL,
  PRIMARY KEY (`state_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of us_data_state
-- ----------------------------
INSERT INTO `us_data_state` VALUES ('Georgia', 'GA', '乔治亚州');
INSERT INTO `us_data_state` VALUES ('Arizona', 'AZ', '亚利桑那州');
INSERT INTO `us_data_state` VALUES ('Illinois', 'IL', '伊利诺斯州');
INSERT INTO `us_data_state` VALUES ('Florida', 'FL', '佛罗里达州');
INSERT INTO `us_data_state` VALUES ('Vermont', 'VT', '佛蒙特州');
INSERT INTO `us_data_state` VALUES ('Ohio', 'OH', '俄亥俄州');
INSERT INTO `us_data_state` VALUES ('Oklahoma', 'OK', '俄克拉荷马州');
INSERT INTO `us_data_state` VALUES ('Oregon', 'OR', '俄勒冈州');
INSERT INTO `us_data_state` VALUES ('Nevada', 'NV', '内华达州');
INSERT INTO `us_data_state` VALUES ('Nebraska', 'NE', '内布拉斯加州');
INSERT INTO `us_data_state` VALUES ('California', 'CA', '加利福尼亚州');
INSERT INTO `us_data_state` VALUES ('North Carolina', 'NC', '北卡罗来纳州');
INSERT INTO `us_data_state` VALUES ('North Dakota', 'ND', '北达科他州');
INSERT INTO `us_data_state` VALUES ('Washington', 'WA', '华盛顿州');
INSERT INTO `us_data_state` VALUES ('South Carolina', 'SC', '南卡罗来纳州');
INSERT INTO `us_data_state` VALUES ('South Dakota', 'SD', '南达科他州');
INSERT INTO `us_data_state` VALUES ('Indiana', 'IN', '印第安纳州');
INSERT INTO `us_data_state` VALUES ('Kansas', 'KS', '堪萨斯州');
INSERT INTO `us_data_state` VALUES ('Hawaii', 'HI', '夏威夷州');
INSERT INTO `us_data_state` VALUES ('Wisconsin', 'WI', '威斯康辛州');
INSERT INTO `us_data_state` VALUES ('Pennsylvania', 'PA', '宾夕法尼亚州');
INSERT INTO `us_data_state` VALUES ('Michigan', 'MI', '密歇根州 ');
INSERT INTO `us_data_state` VALUES ('Missouri', 'MO', '密苏里州');
INSERT INTO `us_data_state` VALUES ('Mississippi', 'MS', '密西西比州');
INSERT INTO `us_data_state` VALUES ('Connecticut', 'CT', '康涅狄格州');
INSERT INTO `us_data_state` VALUES ('Virginia', 'VA', '弗吉尼亚州');
INSERT INTO `us_data_state` VALUES ('Texas', 'TX', '得克萨斯州');
INSERT INTO `us_data_state` VALUES ('Wyoming', 'WY', '怀俄明州');
INSERT INTO `us_data_state` VALUES ('New Mexico', 'NM', '新墨西哥州');
INSERT INTO `us_data_state` VALUES ('New Jersey', 'NJ', '新泽西州');
INSERT INTO `us_data_state` VALUES ('New Hampshire', 'NH', '新罕布什尔州');
INSERT INTO `us_data_state` VALUES ('Minnesota', 'MN', '明尼苏达州');
INSERT INTO `us_data_state` VALUES ('Iowa', 'IA', '爱荷华州');
INSERT INTO `us_data_state` VALUES ('Idaho', 'ID', '爱达荷州');
INSERT INTO `us_data_state` VALUES ('Delaware', 'DE', '特拉华州');
INSERT INTO `us_data_state` VALUES ('Utah', 'UT', '犹他州');
INSERT INTO `us_data_state` VALUES ('Tennessee', 'TN', '田纳西州');
INSERT INTO `us_data_state` VALUES ('Colorado', 'CO', '科罗拉多州');
INSERT INTO `us_data_state` VALUES ('New York', 'NY', '纽约州');
INSERT INTO `us_data_state` VALUES ('Maine', 'ME', '缅因州');
INSERT INTO `us_data_state` VALUES ('Rhode Island', 'RI', '罗得岛州');
INSERT INTO `us_data_state` VALUES ('Kentucky', 'KY', '肯塔基州');
INSERT INTO `us_data_state` VALUES ('Montana', 'MT', '蒙大拿州');
INSERT INTO `us_data_state` VALUES ('West Virginia', 'WV', '西弗吉尼亚州');
INSERT INTO `us_data_state` VALUES ('Louisiana', 'LA', '路易斯安那州 ');
INSERT INTO `us_data_state` VALUES ('Alabama', 'AL', '阿拉巴马州');
INSERT INTO `us_data_state` VALUES ('Alaska', 'AK', '阿拉斯加州');
INSERT INTO `us_data_state` VALUES ('Arkansas', 'AR', '阿肯色州');
INSERT INTO `us_data_state` VALUES ('Massachusetts', 'MA', '马萨诸塞州 ');
INSERT INTO `us_data_state` VALUES ('Maryland', 'MD', '马里兰州');

-- ----------------------------
-- Table structure for user_agent
-- ----------------------------
DROP TABLE IF EXISTS `user_agent`;
CREATE TABLE `user_agent` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `device` varchar(255) DEFAULT '' COMMENT '设备名',
  `system` varchar(255) DEFAULT '' COMMENT '操作系统',
  `browser` varchar(255) DEFAULT '' COMMENT '浏览器',
  `user_agent` text NOT NULL COMMENT 'User_Agent',
  `is_mobile` tinyint(1) DEFAULT '1' COMMENT '1:是手机，0：是pc',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35697 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_agent
-- ----------------------------
INSERT INTO `user_agent` VALUES ('35610', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35611', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35612', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35613', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35614', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35615', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35616', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35617', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35618', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35619', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35620', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35621', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35622', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35623', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35624', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.99', null);
INSERT INTO `user_agent` VALUES ('35625', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35626', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35627', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35628', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.104', null);
INSERT INTO `user_agent` VALUES ('35629', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35630', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35631', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.99', null);
INSERT INTO `user_agent` VALUES ('35632', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35633', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.104', null);
INSERT INTO `user_agent` VALUES ('35634', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35635', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35636', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35637', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35638', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35639', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35640', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35641', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35642', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35643', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35644', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35645', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35646', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35647', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35648', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.1.2 Safari/603.3.8', null);
INSERT INTO `user_agent` VALUES ('35649', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35650', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35651', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35652', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35653', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35654', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35655', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35656', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35657', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35658', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35659', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35660', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35661', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35662', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35663', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35664', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35665', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35666', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35667', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35668', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35669', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35670', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35671', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35672', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35673', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35674', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35675', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35676', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35677', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35678', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35679', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35680', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35681', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.1.2 Safari/603.3.8', null);
INSERT INTO `user_agent` VALUES ('35682', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35683', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35684', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35685', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35686', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.104', null);
INSERT INTO `user_agent` VALUES ('35687', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35688', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35689', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35690', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35691', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35692', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35693', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35694', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35695', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35696', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
