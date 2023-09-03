CREATE TABLE IF NOT EXISTS T_KMV_USERS(
    id                  serial          primary key,
    email               varchar(100)    unique not null,
    role_id             int             default 5,
    last_login_date     timestamp,
    password            varchar(128)    not null,
    surname             varchar(50)     not null,
    last_name           varchar(50)     not null,
    created_by          varchar(50),
    created_on          timestamp,
    last_modified_by    varchar(50),
    last_modified_on    timestamp,
    constraint role_id_fk foreign key(role_id) references T_KMV_ROLES(id)
);

INSERT INTO T_KMV_USERS VALUES(default, 'test@email.com', default, null, 'test', 'john', 'doe', 'flyway_insert', Current_timestamp, 'flyway_insert', Current_timestamp);