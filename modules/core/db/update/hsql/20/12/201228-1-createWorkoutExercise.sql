create table FITNESSEXPERTBACK_WORKOUT_EXERCISE (
    ID bigint not null,
    UUID varchar(36),
    --
    TIME_ integer,
    WORKOUT_ID bigint,
    EXERCISE_ID bigint,
    --
    primary key (ID)
);