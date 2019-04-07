create table job
(
    id              serial      not null
        constraint job_pk
            primary key,
    nameOfCompany   varchar(50) not null,
    adressOfCompany varchar(50) not null
);

alter table job
    owner to postgres;

create unique index job_id_uindex
    on job (id);