package com.company.fitnessexpertback.web.screens.exercise;

import com.haulmont.cuba.gui.screen.*;
import com.company.fitnessexpertback.entity.Exercise;

@UiController("fitnessexpertback_Exercise.browse")
@UiDescriptor("exercise-browse.xml")
@LookupComponent("exercisesTable")
@LoadDataBeforeShow
public class ExerciseBrowse extends StandardLookup<Exercise> {
}