create database Universidad;
use Universidad;

create table estudiantes(
CarnetID int not null,
Nombre varchar(30),
Apellidos varchar(30),
FechaNacimiento date,
FechaIngreso date,
Telefono varchar(11),
Direccion varchar(60)
);

insert into estudiantes values('1230',"Vidalia Elizabeth","Perez Nolasco",'1998/05/05','2018/01/03','24848464',"Nahuizalco, Sonsonate");
insert into estudiantes values('1231',"Dina Beatriz","Perez Nolasco",'1995/05/05','2018/01/03','22635162',"Sonsonate");
insert into estudiantes values('1233',"Jorge Alberto","Perez Cortez",'1993/02/13','2018/01/03','27869543',"Sonsonate");
insert into estudiantes values('1234',"Flor de Liz","Nolasco de Perez",'1990/11/02','2018/01/03','27642834',"Nahuizalco, Sonsonate");
insert into estudiantes values('1235',"Alexander","Aguilar Sanchez",'1999/11/02','2019/06/05','98767890',"Sonsonate, Sonzacate");

select * from estudiantes;

