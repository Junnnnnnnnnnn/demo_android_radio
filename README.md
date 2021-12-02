# 🏃[Android] Radio demo

## ✏️ Study

## 🌍 Setting

- CompileSdk = 30
- Minsdk = 24
- TargetSdk = 30

## 🙋 Try 

- `RadioButton` , `RadioGroup` 을 통해 버튼 구현 하기

## ✏️ Layout 구성

> activity_main.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <RadioGroup
        android:id="@+id/radio_group"
        android:layout_width="0dp"
        android:layout_height="50dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        android:orientation="horizontal"
        android:gravity="center">
        <RadioButton
            android:id="@+id/radio1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:tag="Y"
            android:text="확인" />

        <RadioButton
            android:id="@+id/radio2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:tag="N"
            android:text="취소" />
    </RadioGroup>


</androidx.constraintlayout.widget.ConstraintLayout>
```



## ✏️ MainActivity 구성

> MainActivity.kt

```kotlin
package com.yotdark.example_radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val radioGroup: RadioGroup by lazy {
        findViewById(R.id.radio_group)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioEvent()
    }

    private fun radioEvent(){
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            Toast.makeText(
              this@MainActivity,
              "check: ${findViewById<RadioButton>(checkedId).tag}",
              Toast.LENGTH_SHORT
            ).show()
        }
    }
}
```

