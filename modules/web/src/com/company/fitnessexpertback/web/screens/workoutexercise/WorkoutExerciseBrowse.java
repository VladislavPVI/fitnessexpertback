package com.company.fitnessexpertback.web.screens.workoutexercise;

import com.haulmont.cuba.gui.screen.*;
import com.company.fitnessexpertback.entity.WorkoutExercise;

@UiController("fitnessexpertback_WorkoutExercise.browse")
@UiDescriptor("workout-exercise-browse.xml")
@LookupComponent("workoutExercisesTable")
@LoadDataBeforeShow
public class WorkoutExerciseBrowse extends StandardLookup<WorkoutExercise> {
}