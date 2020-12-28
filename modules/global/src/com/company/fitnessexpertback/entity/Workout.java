package com.company.fitnessexpertback.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.HasUuid;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Table(name = "FITNESSEXPERTBACK_WORKOUT")
@Entity(name = "fitnessexpertback_Workout")
@NamePattern("%s|title")
public class Workout extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = -7476251405557541295L;

    @Column(name = "UUID")
    private UUID uuid;

    @Column(name = "TITLE", length = 16)
    @NotNull
    @Length(max = 16)
    private String title;

    @Column(name = "DESCRIPTION", length = 64)
    @NotNull
    @Length(max = 64)
    private String description;

    @Column(name = "LEVEL_")
    @Min(0)
    @Max(2)
    @NotNull
    private Integer level;

    @Column(name = "TIME_")
    @NotNull
    private Integer time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGE_FILE_ID")
    @NotNull
    private FileDescriptor image;

    @Composition
    @OneToMany(mappedBy = "workout")
    protected List<WorkoutExercise> workoutExerciseList;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public FileDescriptor getImage() {
        return image;
    }

    public void setImage(FileDescriptor image) {
        this.image = image;
    }

    public List<WorkoutExercise> getWorkoutExerciseList() {
        return workoutExerciseList;
    }

    public void setWorkoutExerciseList(List<WorkoutExercise> workoutExerciseList) {
        this.workoutExerciseList = workoutExerciseList;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}