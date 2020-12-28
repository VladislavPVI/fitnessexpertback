create table FITNESSEXPERTBACK_WORKOUT (
    ID bigint not null,
    UUID varchar(36),
    --
    TITLE varchar(16),
    DESCRIPTION varchar(64),
    LEVEL_ integer,
    TIME_ integer,
    IMAGE_FILE_ID varchar(36),
    --
    primary key (ID)
);