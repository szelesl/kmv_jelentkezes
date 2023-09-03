CREATE TABLE IF NOT EXISTS T_KMV_ROLES(
    id                  serial          primary key,
    role_name           varchar(100)    unique not null,
    created_by          varchar(50),
    created_on          timestamp,
    last_modified_by    varchar(50),
    last_modified_on    timestamp
);

INSERT INTO T_KMV_ROLES VALUES(1, 'ADMIN', 'flyway_insert', Current_timestamp, 'flyway_insert', Current_timestamp);
INSERT INTO T_KMV_ROLES VALUES(2, 'ORGANIZER', 'flyway_insert', Current_timestamp, 'flyway_insert', Current_timestamp);
INSERT INTO T_KMV_ROLES VALUES(3, 'COMPETITOR', 'flyway_insert', Current_timestamp, 'flyway_insert', Current_timestamp);
INSERT INTO T_KMV_ROLES VALUES(4, 'TEACHER', 'flyway_insert', Current_timestamp, 'flyway_insert', Current_timestamp);
INSERT INTO T_KMV_ROLES VALUES(5, 'OTHER', 'flyway_insert', Current_timestamp, 'flyway_insert', Current_timestamp);
