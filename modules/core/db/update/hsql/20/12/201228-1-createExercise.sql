create table FITNESSEXPERTBACK_EXERCISE (
    ID bigint not null,
    UUID varchar(36),
    --
    TITLE varchar(16),
    DESCRIPTION varchar(512),
    TYPE_ integer,
    IMAGE_FILE_ID varchar(36),
    --
    primary key (ID)
);