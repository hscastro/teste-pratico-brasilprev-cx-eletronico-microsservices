create table tb_clientes (id int8 generated by default as identity, cpf varchar(11) not null, data_nascimento DATE, email varchar(255) not null, login varchar(50), name varchar(255) not null, qtd_anos int4, senha varchar(33), vlr_total float8, primary key (id));
alter table if exists tb_clientes add constraint UK_1kfnl9yua2kxtxp1do5o2mrhp unique (login);
