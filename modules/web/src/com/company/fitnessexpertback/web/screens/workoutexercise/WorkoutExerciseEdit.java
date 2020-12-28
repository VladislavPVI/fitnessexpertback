package com.company.fitnessexpertback.web.screens.workoutexercise;

import com.haulmont.cuba.gui.screen.*;
import com.company.fitnessexpertback.entity.WorkoutExercise;

@UiController("fitnessexpertback_WorkoutExercise.edit")
@UiDescriptor("workout-exercise-edit.xml")
@EditedEntityContainer("workoutExerciseDc")
@LoadDataBeforeShow
public class WorkoutExerciseEdit extends StandardEditor<WorkoutExercise> {
}