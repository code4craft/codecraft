devdev devdev123


CREATE TABLE Urls (
  Id int not null primary key auto_increment,
  UrlMd5 varchar(50) not null ,
  Url varchar(200) not null,
  PageMd5 varchar(50) not null default "",
  unique key `uk_url_md5`(`UrlMd5`),
  key `ix_page_md5`(`PageMd5`),
  key `ix_url`(`Url`)
) engine ='innodb' default charset ='utf8';

CREATE TABLE Pages (
  Id int not null primary key auto_increment,
  UrlMd5 varchar(50) not null,
  Url varchar(200) not null,
  PageMd5 varchar(50) not null default "",
  unique key `uk_url_md5`(`UrlMd5`),
  key `ix_page_md5`(`PageMd5`),
  key `ix_url`(`Url`)
) engine ='innodb' default charset ='utf8';
