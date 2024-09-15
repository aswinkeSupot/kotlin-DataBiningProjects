
#### APP1 DATA BINDING APP

## 1. app level build.gradle.kts  add below code :
```
android {
     buildFeatures {
        dataBinding = true
    }
}
```
sync the project.

## 2. move the xml mainLayout into <layout/> view
eg :-
```
<?xml version="1.0" encoding="utf-8"?>
<layout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".apps.databindingApp.DatabindingHomeActivity">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="DataBindingApp"
            android:textSize="32sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
```

## 3. initialize binding in the Activity page
```
eg :-
lateinit var binding: ActivityDatabindingHomeBinding
```

## 4. replace setContentView to DataBindingUtil.setContentView
```
eg :-
binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding_home)
```

## 5. Access the view from the xml file
```
eg :-
binding.tvTitle.text = "Hello Aswin"
```



#### APP3 VIEW MODEL APP

## 1. Add dependency for ViewModel in app level build.gradle.kts
```
dependencies {
     val lifecycle_version = "2.8.4"
     implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
}
```



#### APP4 LIVE DATA APP

## 1. Add dependency for ViewModel in app level build.gradle.kts
URL - https://developer.android.com/jetpack/androidx/releases/lifecycle#kts
```
dependencies {
     val lifecycle_version = "2.8.4"
     implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
}
```

## 2. Add dependency for LiveData
```
implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
```



































