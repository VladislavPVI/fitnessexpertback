package com.company.fitnessexpertback.entity;

import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "FITNESSEXPERTBACK_WORKOUT_EXERCISE")
@Entity(name = "fitnessexpertback_WorkoutExercise")
public class WorkoutExercise extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = -5507449437583880460L;

    @Column(name = "UUID")
    private UUID uuid;

    @Column(name = "TIME_")
    @NotNull(message = "input time")
    private Integer time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORKOUT_ID")
    @NotNull
    protected Workout workout;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXERCISE_ID")
    @NotNull
    protected Exercise exercise;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}