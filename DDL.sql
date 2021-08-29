create schema motoBd;

use motoBd;

create user 'moto'@'localhost' identified by 'moto123';

grant select, insert, delete, update on motoBd.* to moto@'localhost';

create table motoUsuario (
  usuario_id bigint unsigned not null auto_increment,
  usuario_nome varchar(50) not null,
  usuario_email varchar(50) not null,
  usuario_senha varchar(20) not null,
  usuario_cidade varchar(50) not null,
  usuario_estado varchar(2) not null,
  usuario_pais varchar(20) not null,

  primary key (usuario_id),
  unique key uni_usuario_id (usuario_id)
);

create table motoDespesas (
  despesa_id bigint unsigned not null auto_increment,
  despesa_nome varchar(50) not null,
  despesa_tipo varchar(20) not null,
  despesa_data DATE,
  despesa_valor varchar(10),
  primary key (despesa_id),
  unique key uni_despesa_id (despesa_id)
);

create table motoRecebimentos (
  recebimento_id bigint unsigned not null auto_increment,
  recebimento_nome varchar(50) not null,
  recebimento_tipo varchar(20) not null,
  recebimento_distancia varchar(20) not null,
  recebimento_valor varchar(20) not null,
  recebimento_tempo varchar(20) not null,
  recebimento_data DATE,
  primary key (recebimento_id),
  unique key uni_recebimento_id (recebimento_id)
);

create table motoEmpresas(
  empresa_id bigint unsigned not null auto_increment,
  empresa_nome varchar(50) not null,
  empresa_tipo varchar(50) not null,
  empresa_retencao varchar(50),
  primary key (empresa_id),
  unique key uni_empresa_nome (empresa_nome)
);

create table motoAutorizacao (
  aut_id bigint unsigned not null auto_increment,
  aut_nome varchar(20) not null,
  primary key (aut_id),
  unique key uni_aut_nome (aut_nome)
);

create table ligacao (
  usuario_id bigint unsigned not null,
  aut_id bigint unsigned not null,
  primary key (usuario_id, aut_id),
  foreign key aut_usuario_fk (usuario_id) references motoUsuario (usuario_id) on delete restrict on update cascade,
  foreign key aut_autorizacao_fk (aut_id) references motoAutorizacao (aut_id) on delete restrict on update cascade
);




show tables;