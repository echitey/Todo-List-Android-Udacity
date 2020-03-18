package br.com.echitey.android.todolistapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import br.com.echitey.android.todolistapp.database.AppDatabase;
import br.com.echitey.android.todolistapp.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> task;

    public AddTaskViewModel(AppDatabase database, int taskId){
        task = database.taskDao().loadTaskById(taskId);
    }

    public LiveData<TaskEntry> getTask(){
        return task;
    }

}
