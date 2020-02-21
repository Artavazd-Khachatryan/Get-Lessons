package com.oqaphwzzza.testlessons.view.mainActivity

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oqaphwzzza.testlessons.data.models.LessonModel
import com.oqaphwzzza.testlessons.domain.DataUseCase
import com.oqaphwzzza.testlessons.view.adapters.lessonAdapter.LessonAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel(private val dataUseCase: DataUseCase) : ViewModel() {

    private val mainDispatcher = Dispatchers.Main
    val lessonAdapter = LessonAdapter()

    val progressViable = MutableLiveData<Int>()


    init {
        setData()
    }

    fun setData(){
        viewModelScope.launch(mainDispatcher) {
            val lessons = dataUseCase.getLessons()
            lessonAdapter.submitList(lessons as List<LessonModel>)
            if (lessons.isNotEmpty()) {
                dataUseCase.deleteLessons()
                dataUseCase.saveLessons(lessons)
            }

            progressViable.value = View.INVISIBLE

        }
    }

}