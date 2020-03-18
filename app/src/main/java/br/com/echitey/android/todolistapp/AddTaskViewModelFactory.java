package br.com.echitey.android.todolistapp;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import br.com.echitey.android.todolistapp.database.AppDatabase;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final AppDatabase database;
    private final int taskId;

    public AddTaskViewModelFactory(AppDatabase database, int taskId) {
        this.database = database;
        this.taskId = taskId;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new AddTaskViewModel(database, taskId);
    }
}
