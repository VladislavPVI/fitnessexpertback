-- begin FITNESSEXPERTBACK_WORKOUT
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
)^
-- end FITNESSEXPERTBACK_WORKOUT
-- begin FITNESSEXPERTBACK_EXERCISE
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
)^
-- end FITNESSEXPERTBACK_EXERCISE
-- begin FITNESSEXPERTBACK_WORKOUT_EXERCISE
create table FITNESSEXPERTBACK_WORKOUT_EXERCISE (
    ID bigint not null,
    UUID varchar(36),
    --
    TIME_ integer,
    WORKOUT_ID bigint,
    EXERCISE_ID bigint,
    --
    primary key (ID)
)^
-- end FITNESSEXPERTBACK_WORKOUT_EXERCISE
