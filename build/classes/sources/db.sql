/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  180900411
 * Created: 12 de jul. de 2022
 */

CREATE TABLE usuario
(
    idUsuario int primary key auto_increment,
    nomeUsuario varchar(60) not null,
    usuario varchar(30) not null unique,
    senha varchar(256) not null
);