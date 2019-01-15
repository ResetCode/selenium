/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : choujiang

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-01-15 16:05:42
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
) ENGINE=InnoDB AUTO_INCREMENT=1136 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of au_data
-- ----------------------------
INSERT INTO `au_data` VALUES ('1107', 'goldenwestmiles@bigpond.com', 'f', 'Josi', 'Wise', 'QLD', 'Miles', '50 Murilla', '4415', '428358408', '8', '6', '1985', '99,99,99', '2019-01-15 04:35:51', '2019-01-15 07:22:28', '', '50 Murilla St, Miles');
INSERT INTO `au_data` VALUES ('1108', 'david.frances.boon@gmail.com', 'm', 'David', 'Boon', 'NT', 'Herbert', '275 Trippe', '836', '447781918', '20', '4', '1980', '99,99,99', '2019-01-15 04:35:51', '2019-01-15 07:40:03', '', '275 Trippe Rd North');
INSERT INTO `au_data` VALUES ('1109', 'nalexop@gmail.com', 'm', 'Nathan', 'Alexopoulos', 'VIC', 'Dallas', '1 Riggall', '3047', '401698482', '23', '10', '1987', '99,99,99', '2019-01-15 04:35:51', '2019-01-15 07:53:46', '', '1/61 Riggall St, Dallas');
INSERT INTO `au_data` VALUES ('1110', 'buhlers@bigpond.net.au', 'm', 'Anthony', 'Buhler', 'VIC', 'Mont Albert North', '40 Moselle', '3129', '400346261', '16', '11', '1982', '0', '2019-01-15 04:35:51', null, null, '40 Moselle St');
INSERT INTO `au_data` VALUES ('1111', 'bctm@aapt.net.au', 'f', 'Carolyn', 'Creagan', 'NSW', 'Horsley', '13 Armitage', '2530', '438939455', '24', '12', '1983', '0', '2019-01-15 04:35:51', null, null, '13 Armitage Avenue');
INSERT INTO `au_data` VALUES ('1112', 'andy84vo@gmail.com', 'm', 'Thang', 'Vo', 'SA', 'Ottoway', '6 Agnes', '5013', '477555804', '18', '10', '1984', '0', '2019-01-15 04:35:51', null, null, '6/43 Agnes St');
INSERT INTO `au_data` VALUES ('1113', 'tanyasdogwash@gmail.com', 'f', 'Tanya', 'Vandermaat', 'NSW', 'Collombatti', '269 Saleyards', '2440', '409631269', '22', '3', '1989', '0', '2019-01-15 04:35:51', null, null, '269 Saleyards Rd');
INSERT INTO `au_data` VALUES ('1114', 'davidcocks@gmail.com', 'm', 'David', 'Cocks', 'SA', 'Port Augusta West', '2 Harry', '5700', '475171693', '16', '1', '1981', '0', '2019-01-15 04:35:51', null, null, '2 Harry Cort');
INSERT INTO `au_data` VALUES ('1115', 'shardo@bigpond.com', 'f', 'Shardo Maria', 'Ulferts', 'NSW', 'Mullumbimby', '488 Box', '2482', '407653828', '14', '5', '1985', '0', '2019-01-15 04:35:51', null, null, 'Po Box 488');
INSERT INTO `au_data` VALUES ('1116', 'donnels2802@gmail.dom', 'm', 'Simon', 'Donnelly', 'VIC', 'Thomastown', '10 Tamara', '3074', '414211253', '28', '2', '1981', '0', '2019-01-15 04:35:51', null, null, '10 Tamara Ct');
INSERT INTO `au_data` VALUES ('1117', 'alarms@iinet.net.au', 'f', 'Annette Teresa', 'Bertone', 'WA', 'Alexander Heights', '4 Hillcrest', '6064', '418938576', '16', '10', '1984', '0', '2019-01-15 04:35:51', null, null, '4 Hillcrest Road ');
INSERT INTO `au_data` VALUES ('1118', 'kiwichic1@optusnet.com.au', 'f', 'Robyn ', 'Rhodes', 'VIC', 'Karingal', '7 Hartley', '3199', '402059933', '24', '10', '1989', '0', '2019-01-15 04:35:51', null, null, '7 Hartley Court');
INSERT INTO `au_data` VALUES ('1119', 'afranklin1@bigpond.com', 'f', 'Andrea', 'Franklin', 'TAS', 'Bellerive', '45 South', '7018', '438899725', '4', '4', '1982', '0', '2019-01-15 04:35:51', null, null, '45 South Street');
INSERT INTO `au_data` VALUES ('1120', 'dicameron@gmail.com.au', 'f', 'Dianne', 'Cameron', 'NSW', 'Bulli', '143 Princes', '2516', '411619153', '7', '12', '1980', '0', '2019-01-15 04:35:51', null, null, '143 Princes Highway');
INSERT INTO `au_data` VALUES ('1121', 'crystalford2112@gmail.com', 'f', 'Crystal', 'Ford', 'NSW', 'Forster', '8 Elizabeth', '2428', '421397881', '21', '12', '1990', '0', '2019-01-15 04:35:51', null, null, '8 Elizabeth Parade');
INSERT INTO `au_data` VALUES ('1122', 'tangles4223@yahoo.com', 'm', 'Frank', 'Springall', 'QLD', 'Mermaid Waters', '70 Surf', '4218', '407724509', '4', '10', '1987', '0', '2019-01-15 04:35:51', null, null, '70 Surf Street');
INSERT INTO `au_data` VALUES ('1123', 'michelle.grant@greater.com.au', 'f', 'Michelle', 'Grant', 'NSW', 'Argenton', '2 Margaret', '2284', '414310862', '31', '8', '1982', '0', '2019-01-15 04:35:51', null, null, '2 Margaret Street');
INSERT INTO `au_data` VALUES ('1124', 'annhammond3&bigpond.com', 'f', 'Ann', 'Hammond', 'NSW', 'Lalor Park', '9 Cranney', '2147', '449255529', '22', '1', '1986', '0', '2019-01-15 04:35:51', null, null, '9 Cranney Place ');
INSERT INTO `au_data` VALUES ('1125', 'info@hummerhire.com.au', 'm', 'Chris ', 'Cannon', 'VIC', 'Bentleigh', '36 Railway', '3204', '430452482', '19', '12', '1998', '0', '2019-01-15 04:35:51', null, null, '36 Railway Crescent ');
INSERT INTO `au_data` VALUES ('1126', 'bowasta@gmail.com', 'm', 'David', 'Dixon', 'QLD', 'Murrumba Downs', '13 Barrington', '4503', '429938339', '16', '3', '1988', '0', '2019-01-15 04:35:51', null, null, '13 Barrington Close');
INSERT INTO `au_data` VALUES ('1127', 'trevorjurgensen@yahoo.com.au', 'm', 'Trevor', 'Jurgensen', 'QLD', 'Inglewood', '23 Tomkins', '4387', '497787399', '23', '2', '1984', '0', '2019-01-15 04:35:51', null, null, '23 Tomkins Street');
INSERT INTO `au_data` VALUES ('1128', 'cpalias@bigpond.net.au', 'm', 'Colin ', 'Potts', 'NSW', 'Mount Annan', '5 Deep', '2567', '434658792', '8', '5', '1984', '0', '2019-01-15 04:35:51', null, null, '5 Deep Pool Way ');
INSERT INTO `au_data` VALUES ('1129', 'bricher@tpg.com.au', 'm', 'Brian', 'Stewart', 'NSW', 'Shortland', '79 Blanch', '2307', '438513899', '29', '4', '1986', '0', '2019-01-15 04:35:51', null, null, '79 Blanch Street, ');
INSERT INTO `au_data` VALUES ('1130', 'traceysilva280@yahoo.com.au', 'f', 'Tracey', 'Silva', 'NSW', 'Redfern', '5 Morehead', '2016', '451192554', '26', '9', '1982', '0', '2019-01-15 04:35:51', null, null, '510/57 Morehead Street');
INSERT INTO `au_data` VALUES ('1131', 'tysondanneberg@bigpond.com', 'm', 'Tyson', 'Danneberg', 'QLD', 'Wilsonton', '3 Ellis', '4350', '438109869', '17', '1', '1986', '0', '2019-01-15 04:35:51', null, null, '3a Ellis Street ');
INSERT INTO `au_data` VALUES ('1132', 'kimberlyverhey22@gmail.com', 'f', 'Kimberly', 'Verhey', 'VIC', 'Echuca', '10 Woodlands', '3564', '438519602', '22', '4', '1982', '0', '2019-01-15 04:35:51', null, null, '10 Woodlands Circuit');
INSERT INTO `au_data` VALUES ('1133', 'rayandminako@optusnet.com.a', 'f', 'Minako', 'Thompson', 'QLD', 'Everton Hills', '28 Illawarra', '4053', '449763924', '19', '7', '1988', '0', '2019-01-15 04:35:51', null, null, '28 Illawarra St');
INSERT INTO `au_data` VALUES ('1134', 'bugs65@bigpond.com', 'f', 'Amanda', 'Shoard', 'NSW', 'Tumut', '92 Sydney', '2720', '428474688', '6', '9', '1985', '0', '2019-01-15 04:35:51', null, null, '92 Sydney Street');
INSERT INTO `au_data` VALUES ('1135', 'cobberwayne@gmail.com', 'm', 'Wayne', 'Wilson', 'VIC', 'Warrnambool', '47 Crawley', '3280', '437002064', '14', '11', '1991', '0', '2019-01-15 04:35:51', null, null, '47 Crawley Street, Warrnambool, Victoria');

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
) ENGINE=InnoDB AUTO_INCREMENT=36697 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_agent
-- ----------------------------
INSERT INTO `user_agent` VALUES ('35612', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35613', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35615', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35618', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35620', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35621', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35624', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.99', null);
INSERT INTO `user_agent` VALUES ('35626', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35627', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35629', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35630', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35631', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.99', null);
INSERT INTO `user_agent` VALUES ('35634', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35635', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35636', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35640', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35643', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35646', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35647', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35648', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.1.2 Safari/603.3.8', null);
INSERT INTO `user_agent` VALUES ('35649', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35652', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35653', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35654', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35655', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35656', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35657', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35658', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35661', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35662', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35663', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35664', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35665', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35666', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35667', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35668', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35671', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35673', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35674', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35675', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35676', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35677', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35678', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35679', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35681', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.1.2 Safari/603.3.8', null);
INSERT INTO `user_agent` VALUES ('35683', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35684', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35686', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.104', null);
INSERT INTO `user_agent` VALUES ('35688', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35689', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35690', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent` VALUES ('35693', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35694', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35695', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35696', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent` VALUES ('35698', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35699', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35700', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35701', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/600.8.9 (KHTML, like Gecko) Version/8.0.8 Safari/600.8.9', null);
INSERT INTO `user_agent` VALUES ('35703', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35704', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35705', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.10240', null);
INSERT INTO `user_agent` VALUES ('35706', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35707', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35708', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35709', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35710', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35711', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/600.7.12 (KHTML, like Gecko) Version/8.0.7 Safari/600.7.12', null);
INSERT INTO `user_agent` VALUES ('35712', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35713', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35714', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.8.9 (KHTML, like Gecko) Version/7.1.8 Safari/537.85.17', null);
INSERT INTO `user_agent` VALUES ('35717', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35718', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0)', null);
INSERT INTO `user_agent` VALUES ('35719', null, null, null, 'Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0)', null);
INSERT INTO `user_agent` VALUES ('35720', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35723', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/600.6.3 (KHTML, like Gecko) Version/8.0.6 Safari/600.6.3', null);
INSERT INTO `user_agent` VALUES ('35724', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/600.5.17 (KHTML, like Gecko) Version/8.0.5 Safari/600.5.17', null);
INSERT INTO `user_agent` VALUES ('35725', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('35726', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35728', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35730', null, null, null, 'Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0)', null);
INSERT INTO `user_agent` VALUES ('35731', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35732', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35733', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35734', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; Trident/6.0)', null);
INSERT INTO `user_agent` VALUES ('35735', null, null, null, 'Mozilla/5.0 (Windows NT 6.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35736', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35737', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 7077.134.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.156 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35738', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.7.12 (KHTML, like Gecko) Version/7.1.7 Safari/537.85.16', null);
INSERT INTO `user_agent` VALUES ('35739', null, null, null, 'Mozilla/5.0 (Windows NT 6.0; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35740', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35742', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/600.3.18 (KHTML, like Gecko) Version/8.0.3 Safari/600.3.18', null);
INSERT INTO `user_agent` VALUES ('35743', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35744', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35745', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35746', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35750', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35753', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.6.3 (KHTML, like Gecko) Version/7.1.6 Safari/537.85.15', null);
INSERT INTO `user_agent` VALUES ('35754', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/600.4.10 (KHTML, like Gecko) Version/8.0.4 Safari/600.4.10', null);
INSERT INTO `user_agent` VALUES ('35755', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35756', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.78.2 (KHTML, like Gecko) Version/7.0.6 Safari/537.78.2', null);
INSERT INTO `user_agent` VALUES ('35758', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35759', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35762', null, null, null, 'Mozilla/5.0 (Windows NT 6.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35763', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35764', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; TNJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35765', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35766', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; ARM; Trident/7.0; Touch; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35767', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35769', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MDDCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35770', null, null, null, 'Mozilla/5.0 (Windows NT 6.0; WOW64; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35771', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35772', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35776', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35777', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35778', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35779', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35780', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35781', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:31.0) Gecko/20100101 Firefox/31.0', null);
INSERT INTO `user_agent` VALUES ('35783', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MATBJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35786', null, null, null, 'Mozilla/5.0 (X11; CrOS armv7l 7077.134.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.156 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35788', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('35789', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10) AppleWebKit/600.1.25 (KHTML, like Gecko) Version/8.0 Safari/600.1.25', null);
INSERT INTO `user_agent` VALUES ('35790', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/600.2.5 (KHTML, like Gecko) Version/8.0.2 Safari/600.2.5', null);
INSERT INTO `user_agent` VALUES ('35791', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35792', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35793', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35794', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35795', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/600.1.25 (KHTML, like Gecko) Version/8.0 Safari/600.1.25', null);
INSERT INTO `user_agent` VALUES ('35796', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35797', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11) AppleWebKit/601.1.56 (KHTML, like Gecko) Version/9.0 Safari/601.1.56', null);
INSERT INTO `user_agent` VALUES ('35800', null, null, null, 'Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35801', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35804', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35805', null, null, null, 'Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.10240', null);
INSERT INTO `user_agent` VALUES ('35806', null, null, null, 'Mozilla/5.0 (Windows NT 6.3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35807', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; LCJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35808', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MDDRJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35810', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Trident/7.0; Touch; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35811', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35812', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; LCJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35816', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; ASU2JS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35818', null, null, null, 'Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Win64; x64; Trident/5.0)', null);
INSERT INTO `user_agent` VALUES ('35819', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35820', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_4) AppleWebKit/537.77.4 (KHTML, like Gecko) Version/7.0.5 Safari/537.77.4', null);
INSERT INTO `user_agent` VALUES ('35821', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35822', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('35823', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; yie11; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35824', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MALNJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35826', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35827', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35828', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MAGWJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35830', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.5.17 (KHTML, like Gecko) Version/7.1.5 Safari/537.85.14', null);
INSERT INTO `user_agent` VALUES ('35831', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35832', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; TNJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35833', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; NP06; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35834', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35836', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36 OPR/31.0.1889.174', null);
INSERT INTO `user_agent` VALUES ('35837', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/600.4.8 (KHTML, like Gecko) Version/8.0.3 Safari/600.4.8', null);
INSERT INTO `user_agent` VALUES ('35840', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.3.18 (KHTML, like Gecko) Version/7.1.3 Safari/537.85.12', null);
INSERT INTO `user_agent` VALUES ('35843', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35844', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35845', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 AOL/9.7 AOLBuild/4343.4049.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35846', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35847', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35849', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('35850', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('35851', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35852', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35855', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.1.17 (KHTML, like Gecko) Version/7.1 Safari/537.85.10', null);
INSERT INTO `user_agent` VALUES ('35856', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35857', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.2.5 (KHTML, like Gecko) Version/7.1.2 Safari/537.85.11', null);
INSERT INTO `user_agent` VALUES ('35858', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; ASU2JS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35859', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35861', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35862', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0', null);
INSERT INTO `user_agent` VALUES ('35863', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; MDDCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35864', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35869', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35870', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 7262.52.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.86 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35871', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35872', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MDDCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35873', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35874', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('35875', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/600.4.10 (KHTML, like Gecko) Version/7.1.4 Safari/537.85.13', null);
INSERT INTO `user_agent` VALUES ('35877', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; MALNJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35879', null, null, null, 'Mozilla/5.0 (Android; Tablet; rv:40.0) Gecko/40.0 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('35881', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10) AppleWebKit/600.2.5 (KHTML, like Gecko) Version/8.0.2 Safari/600.2.5', null);
INSERT INTO `user_agent` VALUES ('35882', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35883', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_4) AppleWebKit/536.30.1 (KHTML, like Gecko) Version/6.0.5 Safari/536.30.1', null);
INSERT INTO `user_agent` VALUES ('35884', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35885', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35887', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.104 AOL/9.8 AOLBuild/4346.13.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35888', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MAAU; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35889', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35890', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('35891', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:35.0) Gecko/20100101 Firefox/35.0', null);
INSERT INTO `user_agent` VALUES ('35892', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35893', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.90 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35894', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.74.9 (KHTML, like Gecko) Version/7.0.2 Safari/537.74.9', null);
INSERT INTO `user_agent` VALUES ('35895', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35896', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35898', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; MAARJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35899', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35901', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35903', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_4) AppleWebKit/537.78.2 (KHTML, like Gecko) Version/7.0.6 Safari/537.78.2', null);
INSERT INTO `user_agent` VALUES ('35904', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:36.0) Gecko/20100101 Firefox/36.0', null);
INSERT INTO `user_agent` VALUES ('35905', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MASMJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35906', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35907', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35908', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36 OPR/31.0.1889.174', null);
INSERT INTO `user_agent` VALUES ('35909', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; FunWebProducts; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35910', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MAARJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35911', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; BOIE9;ENUS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35913', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; EIE10;ENUSWOL; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35915', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35917', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36 OPR/31.0.1889.174', null);
INSERT INTO `user_agent` VALUES ('35920', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35921', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35922', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; yie9; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35925', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35927', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:34.0) Gecko/20100101 Firefox/34.0', null);
INSERT INTO `user_agent` VALUES ('35928', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35929', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.89 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35930', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; WOW64; Trident/7.0)', null);
INSERT INTO `user_agent` VALUES ('35931', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:33.0) Gecko/20100101 Firefox/33.0', null);
INSERT INTO `user_agent` VALUES ('35935', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35937', null, null, null, 'Mozilla/5.0 (Windows NT 6.2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35938', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.2; WOW64; Trident/7.0; .NET4.0E; .NET4.0C)', null);
INSERT INTO `user_agent` VALUES ('35939', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35940', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35941', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35943', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.81 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35944', null, null, null, 'Mozilla/5.0 (PlayStation 4 2.57) AppleWebKit/537.73 (KHTML, like Gecko)', null);
INSERT INTO `user_agent` VALUES ('35945', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:31.0) Gecko/20100101 Firefox/31.0', null);
INSERT INTO `user_agent` VALUES ('35949', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.111 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35950', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; LCJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35951', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('35952', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35953', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; WOW64; Trident/6.0; Touch)', null);
INSERT INTO `user_agent` VALUES ('35955', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.111 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35956', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; MASMJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35957', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35958', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35960', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35961', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; TNJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35962', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/7.0.3 Safari/537.75.14', null);
INSERT INTO `user_agent` VALUES ('35963', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.89 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35964', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35965', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; ASJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35966', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35968', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35969', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36 OPR/31.0.1889.174', null);
INSERT INTO `user_agent` VALUES ('35970', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.114 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35971', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; EIE10;ENUSMSN; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35973', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; MATBJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35974', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:30.0) Gecko/20100101 Firefox/30.0', null);
INSERT INTO `user_agent` VALUES ('35975', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; MASAJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35976', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:41.0) Gecko/20100101 Firefox/41.0', null);
INSERT INTO `user_agent` VALUES ('35977', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MALC; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35978', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 AOL/9.7 AOLBuild/4343.4049.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35979', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0', null);
INSERT INTO `user_agent` VALUES ('35981', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; MDDCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35982', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('35984', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.120 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35986', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35987', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('35988', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35989', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; yie10; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35992', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; WOW64; Trident/8.0)', null);
INSERT INTO `user_agent` VALUES ('35993', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; TNJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('35994', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 7077.111.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35996', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('35997', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('35998', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36 LBBROWSER', null);
INSERT INTO `user_agent` VALUES ('35999', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:41.0) Gecko/20100101 Firefox/41.0', null);
INSERT INTO `user_agent` VALUES ('36002', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36004', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.104 AOL/9.8 AOLBuild/4346.18.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36005', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.3; GWX:QUALIFIED)', null);
INSERT INTO `user_agent` VALUES ('36006', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.107 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36007', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; MDDCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36008', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.104 AOL/9.8 AOLBuild/4346.13.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36009', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 AOL/9.7 AOLBuild/4343.4043.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36010', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:23.0) Gecko/20100101 Firefox/23.0', null);
INSERT INTO `user_agent` VALUES ('36012', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.13 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36015', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MANM; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36016', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.6.2000 Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36018', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:32.0) Gecko/20100101 Firefox/32.0', null);
INSERT INTO `user_agent` VALUES ('36019', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0; MDDRJS)', null);
INSERT INTO `user_agent` VALUES ('36021', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.22 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36023', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; MATBJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36024', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.93 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36025', null, null, null, 'Mozilla/5.0 (Windows NT 6.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36026', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('36027', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.104 AOL/9.8 AOLBuild/4346.13.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36030', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 6946.86.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36031', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36032', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.91 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36033', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; TNJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36034', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36035', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; MDDRJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36036', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36037', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36038', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.104 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36041', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; GIL 3.5; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36042', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:41.0) Gecko/20100101 Firefox/41.0', null);
INSERT INTO `user_agent` VALUES ('36044', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.75.14 (KHTML, like Gecko) Version/7.0.3 Safari/537.75.14', null);
INSERT INTO `user_agent` VALUES ('36046', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; MATBJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36049', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; USPortal; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36051', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:40.0) Gecko/20100101 Firefox/40.0.2 Waterfox/40.0.2', null);
INSERT INTO `user_agent` VALUES ('36052', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; SMJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36053', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; CMDTDF; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36055', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36056', null, null, null, 'Mozilla/5.0 (MSIE 9.0; Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36057', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36059', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; TNJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36060', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('36062', null, null, null, 'Mozilla/5.0 (X11; CrOS armv7l 7262.52.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.86 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36063', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MASAJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36064', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; MS-RTC LM 8; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36065', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; yie11; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36066', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.10532', null);
INSERT INTO `user_agent` VALUES ('36067', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; BOIE9;ENUSMSE; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36068', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0', null);
INSERT INTO `user_agent` VALUES ('36069', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E; InfoPath.3)', null);
INSERT INTO `user_agent` VALUES ('36070', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0', null);
INSERT INTO `user_agent` VALUES ('36071', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.3)', null);
INSERT INTO `user_agent` VALUES ('36074', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.143 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36076', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36077', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36080', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.81 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36083', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.13 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36084', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.90 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36085', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36087', null, null, null, 'Mozilla/5.0 (Android; Mobile; rv:40.0) Gecko/40.0 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('36088', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36089', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('36090', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 AOL/9.7 AOLBuild/4343.4043.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36093', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.99 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36094', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:35.0) Gecko/20100101 Firefox/35.0', null);
INSERT INTO `user_agent` VALUES ('36096', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.22 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36098', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36099', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; LCJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36100', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36101', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 6812.88.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.153 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36103', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; ASU2JS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36104', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.65 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36105', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.154 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36106', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.13 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36107', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36108', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/6.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36109', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10) AppleWebKit/537.16 (KHTML, like Gecko) Version/8.0 Safari/537.16', null);
INSERT INTO `user_agent` VALUES ('36110', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:34.0) Gecko/20100101 Firefox/34.0', null);
INSERT INTO `user_agent` VALUES ('36113', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; CMDTDF; .NET4.0C; .NET4.0E; GWX:QUALIFIED)', null);
INSERT INTO `user_agent` VALUES ('36115', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('36116', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.6.1000 Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36118', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.99 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36119', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36120', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('36121', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MDDSJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36124', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36125', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MATBJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36128', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.116 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36133', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36134', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:40.0) Gecko/20100101 Firefox/40.0.2 Waterfox/40.0.2', null);
INSERT INTO `user_agent` VALUES ('36135', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('36136', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; LCJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36137', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; NISSC; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36138', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.111 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36139', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36140', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36141', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9) AppleWebKit/537.71 (KHTML, like Gecko) Version/7.0 Safari/537.71', null);
INSERT INTO `user_agent` VALUES ('36142', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36143', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; MALC; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36144', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36145', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36146', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.0.9895 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36147', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MSBrowserIE; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36149', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.76 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36150', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('36152', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.89 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36153', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.65 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36154', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36155', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; LCJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36156', null, null, null, 'Mozilla/5.0 (Windows NT 6.0; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('36159', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; ASU2JS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36161', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:28.0) Gecko/20100101 Firefox/28.0', null);
INSERT INTO `user_agent` VALUES ('36162', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20120101 Firefox/29.0', null);
INSERT INTO `user_agent` VALUES ('36163', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36165', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 7077.95.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.90 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36166', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.6.1000 Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36167', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36168', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36 LBBROWSER', null);
INSERT INTO `user_agent` VALUES ('36169', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:36.0) Gecko/20100101 Firefox/36.0', null);
INSERT INTO `user_agent` VALUES ('36170', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36171', null, null, null, 'Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/7.0)', null);
INSERT INTO `user_agent` VALUES ('36173', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36174', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.2; Win64; x64; Trident/6.0; .NET4.0E; .NET4.0C; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET CLR 2.0.50727)', null);
INSERT INTO `user_agent` VALUES ('36176', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.76.4 (KHTML, like Gecko) Version/7.0.4 Safari/537.76.4', null);
INSERT INTO `user_agent` VALUES ('36177', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36178', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.11; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('36179', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36180', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; SMJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36181', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; MDDCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36182', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.131 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36183', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; BOIE9;ENUS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36186', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('36188', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/6.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.3)', null);
INSERT INTO `user_agent` VALUES ('36189', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.76 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36190', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2503.0 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36191', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11) AppleWebKit/601.1.50 (KHTML, like Gecko) Version/9.0 Safari/601.1.50', null);
INSERT INTO `user_agent` VALUES ('36192', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.3; GWX:RESERVED)', null);
INSERT INTO `user_agent` VALUES ('36194', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/601.1.56 (KHTML, like Gecko) Version/9.0 Safari/601.1.56', null);
INSERT INTO `user_agent` VALUES ('36197', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36198', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/534+ (KHTML, like Gecko) MsnBot-Media /1.0b', null);
INSERT INTO `user_agent` VALUES ('36199', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/7.0)', null);
INSERT INTO `user_agent` VALUES ('36200', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36201', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.3; WOW64; Trident/7.0)', null);
INSERT INTO `user_agent` VALUES ('36203', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; ASU2JS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36204', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36205', null, null, null, 'Mozilla/5.0 (Windows NT 6.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 AOL/9.7 AOLBuild/4343.4049.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36206', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 6680.78.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.102 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36208', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.59 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36209', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.6.2000 Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36210', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36211', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.111 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36212', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; MAARJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36213', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36214', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; MALNJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36216', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36217', null, null, null, 'Mozilla/5.0 (Windows; U; MSIE 9.0; Windows NT 9.0; en-US)', null);
INSERT INTO `user_agent` VALUES ('36218', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('36219', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.94 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36221', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:36.0) Gecko/20100101 Firefox/36.0', null);
INSERT INTO `user_agent` VALUES ('36222', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2503.0 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36225', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36226', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.3)', null);
INSERT INTO `user_agent` VALUES ('36227', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('36228', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MALCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36229', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:30.0) Gecko/20100101 Firefox/30.0', null);
INSERT INTO `user_agent` VALUES ('36231', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1667.0 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36235', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.59 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36236', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36237', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('36239', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.45 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36241', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36242', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; TNJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36243', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.107 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36244', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 7077.123.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36245', null, null, null, 'Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36246', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E; 360SE)', null);
INSERT INTO `user_agent` VALUES ('36249', null, null, null, 'Mozilla/5.0 (Windows NT 6.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36252', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MAARJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36254', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; MALNJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36255', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.6.2000 Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36256', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; ASJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36257', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_1) AppleWebKit/537.73.11 (KHTML, like Gecko) Version/7.0.1 Safari/537.73.11', null);
INSERT INTO `user_agent` VALUES ('36258', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; WOW64; Trident/7.0; TNJB; 1ButtonTaskbar)', null);
INSERT INTO `user_agent` VALUES ('36259', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36262', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:35.0) Gecko/20100101 Firefox/35.0', null);
INSERT INTO `user_agent` VALUES ('36263', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36265', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:33.0) Gecko/20100101 Firefox/33.0', null);
INSERT INTO `user_agent` VALUES ('36269', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; WOW64; Trident/8.0; 1ButtonTaskbar)', null);
INSERT INTO `user_agent` VALUES ('36270', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36271', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; NP08; NP08; MAAU; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36274', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; EIE10;ENUSMSE; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36275', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64; rv:33.0) Gecko/20100101 Firefox/33.0', null);
INSERT INTO `user_agent` VALUES ('36277', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.111 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36281', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36283', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.13 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36284', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; Win64; x64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36285', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36287', null, null, null, 'Mozilla/5.0 (MSIE 10.0; Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36290', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36293', null, null, null, 'Mozilla/5.0 (X11; CrOS armv7l 7077.111.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36294', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.67 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36296', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.114 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36297', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:36.0) Gecko/20100101 Firefox/36.0', null);
INSERT INTO `user_agent` VALUES ('36298', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36300', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36302', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; MAGWJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36303', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36304', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; MALNJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36305', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36306', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; Trident/7.0; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36307', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; ATT-IE11; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36308', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36309', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.103 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36310', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36 OPR/31.0.1889.174', null);
INSERT INTO `user_agent` VALUES ('36312', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('36313', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7) AppleWebKit/534.48.3 (KHTML, like Gecko) Version/5.1 Safari/534.48.3', null);
INSERT INTO `user_agent` VALUES ('36314', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.2; WOW64; Trident/7.0; .NET4.0E; .NET4.0C; .NET CLR 3.5.30729; .NET CLR 2.0.50727; .NET CLR 3.0.30729)', null);
INSERT INTO `user_agent` VALUES ('36315', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.13 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36316', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.114 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36317', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:32.0) Gecko/20100101 Firefox/32.0', null);
INSERT INTO `user_agent` VALUES ('36319', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36322', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0; MSN 9.0;MSN 9.1;MSN 9.6;MSN 10.0;MSN 10.2;MSN 10.5;MSN 11;MSN 11.5; MSNbMSNI; MSNmen-us; MSNcOTH) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36324', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.0.9895 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36325', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; WOW64; Trident/7.0; 1ButtonTaskbar)', null);
INSERT INTO `user_agent` VALUES ('36327', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 YaBrowser/15.7.2357.2877 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36328', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:27.0) Gecko/20100101 Firefox/27.0', null);
INSERT INTO `user_agent` VALUES ('36329', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; BOIE9;ENUSMSNIP; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36330', null, null, null, 'Mozilla/5.0 AppleWebKit/999.0 (KHTML, like Gecko) Chrome/99.0 Safari/999.0', null);
INSERT INTO `user_agent` VALUES ('36331', null, null, null, 'Mozilla/5.0 (X11; OpenBSD amd64; rv:28.0) Gecko/20100101 Firefox/28.0', null);
INSERT INTO `user_agent` VALUES ('36332', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/6.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36333', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/538.1 (KHTML, like Gecko) PhantomJS/2.0.0 Safari/538.1', null);
INSERT INTO `user_agent` VALUES ('36334', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; MAGWJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36336', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.71 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36338', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.7) Gecko/20150824 Firefox/31.9 PaleMoon/25.7.0', null);
INSERT INTO `user_agent` VALUES ('36339', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:31.0) Gecko/20100101 Firefox/31.0', null);
INSERT INTO `user_agent` VALUES ('36341', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36343', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.107 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36344', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E; MS-RTC LM 8; InfoPath.3)', null);
INSERT INTO `user_agent` VALUES ('36346', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36348', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:31.0) Gecko/20100101 Firefox/31.0', null);
INSERT INTO `user_agent` VALUES ('36349', null, null, null, 'Mozilla/5.0 (Windows NT 6.3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36350', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36351', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; Tablet PC 2.0)', null);
INSERT INTO `user_agent` VALUES ('36352', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; EIE10;ENUSWOL; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36358', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36359', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.22 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36360', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.137 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36361', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.45 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36362', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36363', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:27.0) Gecko/20100101 Firefox/27.0', null);
INSERT INTO `user_agent` VALUES ('36365', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; ASJB; ASJB; MAAU; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36367', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.7) Gecko/20150824 Firefox/31.9 PaleMoon/25.7.0', null);
INSERT INTO `user_agent` VALUES ('36370', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.2)', null);
INSERT INTO `user_agent` VALUES ('36371', null, null, null, 'Mozilla/5.0 (Windows NT 5.2; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('36372', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.0.9895 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36374', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; EIE10;ENUSMCM; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36376', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.107 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36377', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.93 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36379', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/600.8.9 (KHTML, like Gecko)', null);
INSERT INTO `user_agent` VALUES ('36380', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:35.0) Gecko/20100101 Firefox/35.0', null);
INSERT INTO `user_agent` VALUES ('36381', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; MALCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36382', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36384', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36385', null, null, null, 'Mozilla/5.0 (Windows NT 5.2; rv:29.0) Gecko/20100101 Firefox/29.0 /29.0', null);
INSERT INTO `user_agent` VALUES ('36387', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 AOL/9.7 AOLBuild/4343.4049.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36388', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('36395', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.143 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36397', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.7.1000 Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36398', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:34.0) Gecko/20100101 Firefox/34.0', null);
INSERT INTO `user_agent` VALUES ('36399', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36400', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36401', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:35.0) Gecko/20100101 Firefox/35.0', null);
INSERT INTO `user_agent` VALUES ('36402', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.104 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36405', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.22 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36406', null, null, null, 'Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN) AppleWebKit/530.19.2 (KHTML, like Gecko) Version/4.0.2 Safari/530.19.1', null);
INSERT INTO `user_agent` VALUES ('36407', null, null, null, 'Mozilla/5.0 (Android; Tablet; rv:34.0) Gecko/34.0 Firefox/34.0', null);
INSERT INTO `user_agent` VALUES ('36408', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MALCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36412', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.146 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36413', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; yie10; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36415', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; yie11; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36416', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('36417', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36419', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; WOW64; Trident/8.0; TNJB; 1ButtonTaskbar)', null);
INSERT INTO `user_agent` VALUES ('36422', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36423', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2503.0 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36425', null, null, null, 'Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.0.8) Gecko/2009032609 Firefox/3.0.8 (.NET CLR 3.5.30729)', null);
INSERT INTO `user_agent` VALUES ('36427', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.65 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36428', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.7.1000 Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36429', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; NP08; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36430', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36432', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:40.0) Gecko/20100101 Firefox/40.0.2 Waterfox/40.0.2', null);
INSERT INTO `user_agent` VALUES ('36434', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.104 AOL/9.8 AOLBuild/4346.18.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36435', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.22 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36436', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36438', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; ASU2JS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36440', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.154 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36441', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/7.0; 1ButtonTaskbar)', null);
INSERT INTO `user_agent` VALUES ('36443', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2503.0 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36444', null, null, null, 'Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E; 360SE)', null);
INSERT INTO `user_agent` VALUES ('36445', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MAAU; MAAU; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36446', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36448', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; MANM; MANM; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36449', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.90 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36450', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('36451', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/534+ (KHTML, like Gecko) BingPreview/1.0b', null);
INSERT INTO `user_agent` VALUES ('36452', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.93 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36453', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.81 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36454', null, null, null, 'Mozilla/5.0 (Windows NT 6.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.94 AOL/9.7 AOLBuild/4343.4049.US Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36456', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.104 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36462', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36463', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36469', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:31.0) Gecko/20100101 Firefox/31.0', null);
INSERT INTO `user_agent` VALUES ('36470', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; MDDCJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36471', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36475', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36477', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36479', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MAMIJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36480', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.120 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36481', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.120 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36484', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36486', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36487', null, null, null, 'Mozilla/5.0 (Windows NT 6.0; WOW64; rv:39.0) Gecko/20100101 Firefox/39.0', null);
INSERT INTO `user_agent` VALUES ('36489', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2503.0 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36492', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36494', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36495', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:36.0) Gecko/20100101 Firefox/36.0', null);
INSERT INTO `user_agent` VALUES ('36496', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; InfoPath.3; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36497', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36498', null, null, null, 'Mozilla/5.0 (Windows NT 5.2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36500', null, null, null, 'Mozilla/5.0 (Windows NT 5.2; WOW64; rv:40.0) Gecko/20100101 Firefox/40.0', null);
INSERT INTO `user_agent` VALUES ('36501', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; MDDRJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36503', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.3; WOW64; Trident/6.0)', null);
INSERT INTO `user_agent` VALUES ('36505', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.3; MS-RTC LM 8)', null);
INSERT INTO `user_agent` VALUES ('36506', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2503.0 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36507', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.91 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36509', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36510', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36512', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36518', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36519', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36520', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; Win64; x64; Trident/7.0)', null);
INSERT INTO `user_agent` VALUES ('36521', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:33.0) Gecko/20100101 Firefox/33.0', null);
INSERT INTO `user_agent` VALUES ('36522', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.154 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36523', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.99 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36524', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('36525', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.89 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36526', null, null, null, 'Mozilla/5.0 (X11; CrOS armv7l 6946.86.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36527', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.94 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36528', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:38.0) Gecko/20100101 Firefox/38.0 SeaMonkey/2.35', null);
INSERT INTO `user_agent` VALUES ('36529', null, null, null, 'http://www.useragentstring.com/Firefox25.0_id_19710.php', null);
INSERT INTO `user_agent` VALUES ('36532', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36533', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36534', null, null, null, 'Mozilla/5.0 (Windows NT 10.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36536', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36 TheWorld 6', null);
INSERT INTO `user_agent` VALUES ('36538', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36539', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.107 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36540', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/600.2.5 (KHTML, like Gecko) Version/8.0 Safari/600.1.25', null);
INSERT INTO `user_agent` VALUES ('36541', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0; EIE10;ENUSWOL)', null);
INSERT INTO `user_agent` VALUES ('36546', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; ATT; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36547', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.90 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36548', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36550', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; EIE10;ENUSMSN; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36551', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; MATBJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36552', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.107 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36553', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36555', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.81 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36556', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36557', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; EIE11;ENUSMSN; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36558', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36559', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Maxthon/4.4.6.1000 Chrome/30.0.1599.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36560', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:29.0) Gecko/20100101 Firefox/29.0', null);
INSERT INTO `user_agent` VALUES ('36562', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.131 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36563', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; yie8; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36565', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36566', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; FunWebProducts; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36567', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/47.0.2505.0 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36568', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; MALNJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36569', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; BOIE9;ENUSSEM; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36570', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Win64; x64; Trident/6.0; Touch; WebView/1.0)', null);
INSERT INTO `user_agent` VALUES ('36571', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36573', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36574', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:33.0) Gecko/20100101 Firefox/33.0', null);
INSERT INTO `user_agent` VALUES ('36575', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36577', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Trident/7.0; yie9; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36578', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1985.143 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36579', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.89 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36581', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('36582', null, null, null, 'Mozilla/5.0 (compatible; Windows NT 6.1; Catchpoint) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.81 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36583', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/29.0', null);
INSERT INTO `user_agent` VALUES ('36584', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:32.0) Gecko/20100101 Firefox/32.0', null);
INSERT INTO `user_agent` VALUES ('36585', null, null, null, 'Mozilla/5.0 (Windows NT 6.0; rv:38.0) Gecko/20100101 Firefox/38.0', null);
INSERT INTO `user_agent` VALUES ('36586', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36589', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_3) AppleWebKit/534.55.3 (KHTML, like Gecko) Version/5.1.3 Safari/534.53.10', null);
INSERT INTO `user_agent` VALUES ('36590', null, null, null, 'Mozilla/5.0 (X11; CrOS armv7l 6812.88.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.153 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36591', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.1 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36593', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; MAARJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36594', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.6; rv:36.0) Gecko/20100101 Firefox/36.0', null);
INSERT INTO `user_agent` VALUES ('36595', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36596', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; rv:34.0) Gecko/20100101 Firefox/34.0', null);
INSERT INTO `user_agent` VALUES ('36597', null, null, null, 'Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0; )', null);
INSERT INTO `user_agent` VALUES ('36598', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36599', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; MASAJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36600', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; MAARJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36602', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.101 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36603', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.13+ (KHTML, like Gecko) Version/5.1.7 Safari/534.57.2', null);
INSERT INTO `user_agent` VALUES ('36604', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10; rv:33.0) Gecko/20100101 Firefox/33.0', null);
INSERT INTO `user_agent` VALUES ('36605', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36606', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.63 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('36607', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 BIDUBrowser/7.6 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36608', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36609', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; MASMJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36610', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Trident/7.0; Touch; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36612', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; InfoPath.3; .NET4.0C; .NET4.0E; MS-RTC LM 8)', null);
INSERT INTO `user_agent` VALUES ('36613', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; Touch; MAGWJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36615', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 6457.107.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36620', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.154 Safari/537.36 LBBROWSER', null);
INSERT INTO `user_agent` VALUES ('36621', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('36624', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.117 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36627', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; NP08; MAAU; NP08; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36629', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0', null);
INSERT INTO `user_agent` VALUES ('36630', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.3)', null);
INSERT INTO `user_agent` VALUES ('36631', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:28.0) Gecko/20100101 Firefox/28.0', null);
INSERT INTO `user_agent` VALUES ('36632', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 6946.70.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.132 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36633', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36634', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/6.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; InfoPath.3; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36637', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:38.0) Gecko/20100101 IceDragon/38.0.5 Firefox/38.0.5', null);
INSERT INTO `user_agent` VALUES ('36638', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36639', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; managedpc; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36640', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.116 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36641', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; Touch; MASMJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36646', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.152 Safari/537.36 LBBROWSER', null);
INSERT INTO `user_agent` VALUES ('36647', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('36648', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; ARM; Trident/7.0; Touch; rv:11.0; WPDesktop; Lumia 1520) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36649', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.65 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36650', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:42.0) Gecko/20100101 Firefox/42.0', null);
INSERT INTO `user_agent` VALUES ('36652', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; WOW64; Trident/4.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; InfoPath.2; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36654', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.103 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36655', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36656', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; InfoPath.3; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36657', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:34.0) Gecko/20100101 Firefox/34.0', null);
INSERT INTO `user_agent` VALUES ('36658', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.76 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36659', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.87 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36660', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; PRU_IE; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36663', null, null, null, 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.155 Safari/537.36 OPR/31.0.1889.174', null);
INSERT INTO `user_agent` VALUES ('36664', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; NP02; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36665', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.111 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36666', null, null, null, 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Win64; x64; Trident/4.0; .NET CLR 2.0.50727; SLCC2; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36667', null, null, null, 'Mozilla/5.0 (X11; CrOS x86_64 6946.63.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36668', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:37.0) Gecko/20100101 Firefox/37.0', null);
INSERT INTO `user_agent` VALUES ('36669', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36670', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.0.9895 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36673', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; Touch; MASMJS; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36674', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; AOL 9.7; AOLBuild 4343.1028; Windows NT 6.1; WOW64; Trident/7.0)', null);
INSERT INTO `user_agent` VALUES ('36676', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Trident/7.0; Touch; TNJB; rv:11.0) like Gecko', null);
INSERT INTO `user_agent` VALUES ('36678', null, null, null, 'Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; WOW64; Trident/5.0; Active Content Browser)', null);
INSERT INTO `user_agent` VALUES ('36679', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; WOW64; Trident/7.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36681', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36682', null, null, null, 'Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/6.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; Media Center PC 6.0; .NET4.0C; .NET4.0E; InfoPath.3)', null);
INSERT INTO `user_agent` VALUES ('36683', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.81 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36684', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Win64; x64; Trident/6.0; WebView/1.0)', null);
INSERT INTO `user_agent` VALUES ('36685', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.89 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36687', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.91 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36690', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36691', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) coc_coc_browser/50.0.125 Chrome/44.0.2403.125 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36692', null, null, null, 'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0; SLCC2; .NET CLR 2.0.50727; .NET4.0C; .NET4.0E)', null);
INSERT INTO `user_agent` VALUES ('36693', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.124 Safari/537.36', null);
INSERT INTO `user_agent` VALUES ('36694', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; Trident/7.0; MAARJS; rv:11.0) like Gecko', null);

-- ----------------------------
-- Table structure for user_agent_copy
-- ----------------------------
DROP TABLE IF EXISTS `user_agent_copy`;
CREATE TABLE `user_agent_copy` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `device` varchar(255) DEFAULT '' COMMENT '设备名',
  `system` varchar(255) DEFAULT '' COMMENT '操作系统',
  `browser` varchar(255) DEFAULT '' COMMENT '浏览器',
  `user_agent` text NOT NULL COMMENT 'User_Agent',
  `is_mobile` tinyint(1) DEFAULT '1' COMMENT '1:是手机，0：是pc',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35697 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user_agent_copy
-- ----------------------------
INSERT INTO `user_agent_copy` VALUES ('35610', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35611', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35612', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35613', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35614', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35615', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35616', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35617', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35618', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35619', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35620', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35621', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35622', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35623', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35624', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.99', null);
INSERT INTO `user_agent_copy` VALUES ('35625', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35626', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35627', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35628', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.104', null);
INSERT INTO `user_agent_copy` VALUES ('35629', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35630', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35631', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.99', null);
INSERT INTO `user_agent_copy` VALUES ('35632', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35633', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.104', null);
INSERT INTO `user_agent_copy` VALUES ('35634', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35635', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35636', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35637', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35638', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35639', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35640', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35641', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35642', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35643', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35644', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35645', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35646', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35647', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35648', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.1.2 Safari/603.3.8', null);
INSERT INTO `user_agent_copy` VALUES ('35649', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35650', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35651', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35652', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35653', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35654', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35655', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35656', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35657', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35658', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35659', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35660', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35661', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35662', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35663', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35664', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35665', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35666', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35667', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.0.1 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35668', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35669', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35670', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35671', null, null, null, 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35672', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35673', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35674', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35675', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35676', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35677', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35678', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35679', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35680', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35681', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/603.3.8 (KHTML, like Gecko) Version/10.1.2 Safari/603.3.8', null);
INSERT INTO `user_agent_copy` VALUES ('35682', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35683', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35684', null, null, null, 'Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35685', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35686', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36 OPR/56.0.3051.104', null);
INSERT INTO `user_agent_copy` VALUES ('35687', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35688', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35689', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35690', null, null, null, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/11.1.2 Safari/605.1.15', null);
INSERT INTO `user_agent_copy` VALUES ('35691', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35692', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35693', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);
INSERT INTO `user_agent_copy` VALUES ('35694', null, null, null, 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35695', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36', null);
INSERT INTO `user_agent_copy` VALUES ('35696', null, null, null, 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0', null);

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
