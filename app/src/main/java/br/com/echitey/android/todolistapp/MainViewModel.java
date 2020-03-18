package br.com.echitey.android.todolistapp;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import br.com.echitey.android.todolistapp.database.AppDatabase;
import br.com.echitey.android.todolistapp.database.TaskEntry;

public class MainViewModel extends AndroidViewModel {

    private LiveData<List<TaskEntry>> tasks;

    public static final String TAG = MainViewModel.class.getSimpleName();

    public MainViewModel(@NonNull Application application) {
        super(application);

        Log.d(TAG, "Retreiving the tasks from the database");
        AppDatabase database = AppDatabase.getInstance(this.getApplication());
        tasks = database.taskDao().loadAllTasks();
    }

    public LiveData<List<TaskEntry>> getTasks() {
        return tasks;
    }
}
