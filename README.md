# π[Android] Radio demo

## βοΈ Study

## π Setting

- CompileSdk = 30
- Minsdk = 24
- TargetSdk = 30

## π Try 

- `RadioButton` , `RadioGroup` μ ν΅ν΄ λ²νΌ κ΅¬ν νκΈ°

## βοΈ Layout κ΅¬μ±

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
            android:text="νμΈ" />

        <RadioButton
            android:id="@+id/radio2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:tag="N"
            android:text="μ·¨μ" />
    </RadioGroup>


</androidx.constraintlayout.widget.ConstraintLayout>
```



## βοΈ MainActivity κ΅¬μ±

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

