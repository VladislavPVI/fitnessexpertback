package com.company.fitnessexpertback.web.screens.exercise;

import com.haulmont.cuba.gui.screen.*;
import com.company.fitnessexpertback.entity.Exercise;

@UiController("fitnessexpertback_Exercise.edit")
@UiDescriptor("exercise-edit.xml")
@EditedEntityContainer("exerciseDc")
@LoadDataBeforeShow
public class ExerciseEdit extends StandardEditor<Exercise> {
}