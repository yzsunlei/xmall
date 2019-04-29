drop database if exists xmall;
drop user if exists 'xmall'@'localhost';
-- 支持emoji：需要mysql数据库参数： character_set_server=utf8mb4
create database xmall default character set utf8mb4 collate utf8mb4_unicode_ci;
use xmall;
create user 'xmall'@'localhost' identified by 'xmall';
grant all privileges on xmall.* to 'xmall'@'localhost';
flush privileges;