package com.production.graduation.home

import android.databinding.Bindable
import com.production.graduation.BR
import com.production.graduation.base.BaseViewModel
import javax.inject.Inject

/**
 * Created by student on 2018/02/01.
 */
class HomeViewModel @Inject constructor(
        private val homeText: String
) : BaseViewModel() {

    @Bindable
    var text: String = homeText
        set(value) {
            if (field != value) {
                field = value
                notifyPropertyChanged(BR.text)
            }
        }


}