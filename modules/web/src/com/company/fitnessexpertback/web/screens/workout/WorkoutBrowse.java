package com.company.fitnessexpertback.web.screens.workout;

import com.haulmont.cuba.gui.screen.*;
import com.company.fitnessexpertback.entity.Workout;

@UiController("fitnessexpertback_Workout.browse")
@UiDescriptor("workout-browse.xml")
@LookupComponent("workoutsTable")
@LoadDataBeforeShow
public class WorkoutBrowse extends StandardLookup<Workout> {
}