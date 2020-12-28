package com.company.fitnessexpertback.web.screens.workout;

import com.haulmont.cuba.gui.screen.*;
import com.company.fitnessexpertback.entity.Workout;

@UiController("fitnessexpertback_Workout.edit")
@UiDescriptor("workout-edit.xml")
@EditedEntityContainer("workoutDc")
@LoadDataBeforeShow
public class WorkoutEdit extends StandardEditor<Workout> {
}