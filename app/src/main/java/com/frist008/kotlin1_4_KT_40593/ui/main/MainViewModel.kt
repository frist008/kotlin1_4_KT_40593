package com.frist008.kotlin1_4_KT_40593.ui.main

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val liveData = MediatorLiveData<Unit>()
}