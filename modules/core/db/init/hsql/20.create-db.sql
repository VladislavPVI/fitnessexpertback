-- begin FITNESSEXPERTBACK_WORKOUT
alter table FITNESSEXPERTBACK_WORKOUT add constraint FK_FITNESSEXPERTBACK_WORKOUT_ON_IMAGE_FILE foreign key (IMAGE_FILE_ID) references SYS_FILE(ID)^
create index IDX_FITNESSEXPERTBACK_WORKOUT_ON_IMAGE_FILE on FITNESSEXPERTBACK_WORKOUT (IMAGE_FILE_ID)^
-- end FITNESSEXPERTBACK_WORKOUT
-- begin FITNESSEXPERTBACK_EXERCISE
alter table FITNESSEXPERTBACK_EXERCISE add constraint FK_FITNESSEXPERTBACK_EXERCISE_ON_IMAGE_FILE foreign key (IMAGE_FILE_ID) references SYS_FILE(ID)^
create index IDX_FITNESSEXPERTBACK_EXERCISE_ON_IMAGE_FILE on FITNESSEXPERTBACK_EXERCISE (IMAGE_FILE_ID)^
-- end FITNESSEXPERTBACK_EXERCISE
-- begin FITNESSEXPERTBACK_WORKOUT_EXERCISE
alter table FITNESSEXPERTBACK_WORKOUT_EXERCISE add constraint FK_FITNESSEXPERTBACK_WORKOUT_EXERCISE_ON_WORKOUT foreign key (WORKOUT_ID) references FITNESSEXPERTBACK_WORKOUT(ID)^
alter table FITNESSEXPERTBACK_WORKOUT_EXERCISE add constraint FK_FITNESSEXPERTBACK_WORKOUT_EXERCISE_ON_EXERCISE foreign key (EXERCISE_ID) references FITNESSEXPERTBACK_EXERCISE(ID)^
create index IDX_FITNESSEXPERTBACK_WORKOUT_EXERCISE_ON_WORKOUT on FITNESSEXPERTBACK_WORKOUT_EXERCISE (WORKOUT_ID)^
create index IDX_FITNESSEXPERTBACK_WORKOUT_EXERCISE_ON_EXERCISE on FITNESSEXPERTBACK_WORKOUT_EXERCISE (EXERCISE_ID)^
-- end FITNESSEXPERTBACK_WORKOUT_EXERCISE
