alter table FITNESSEXPERTBACK_WORKOUT add constraint FK_FITNESSEXPERTBACK_WORKOUT_ON_IMAGE_FILE foreign key (IMAGE_FILE_ID) references SYS_FILE(ID);
create index IDX_FITNESSEXPERTBACK_WORKOUT_ON_IMAGE_FILE on FITNESSEXPERTBACK_WORKOUT (IMAGE_FILE_ID);
