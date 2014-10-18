# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table abstract_user_account (
  id                        bigint auto_increment not null,
  user_name                 varchar(255),
  user_hash                 varchar(255),
  password                  varchar(255),
  create_date               datetime,
  update_date               datetime,
  delete_flg                tinyint(1) default 0,
  constraint pk_abstract_user_account primary key (id))
;

create table user_account (
  id                        bigint auto_increment not null,
  user_name                 varchar(255),
  user_hash                 varchar(255),
  password                  varchar(255),
  create_date               datetime,
  update_date               datetime,
  delete_flg                tinyint(1) default 0,
  constraint pk_user_account primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table abstract_user_account;

drop table user_account;

SET FOREIGN_KEY_CHECKS=1;

