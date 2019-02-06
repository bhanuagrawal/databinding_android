package bhanu.agrawal.databinding

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.BaseObservable
import android.databinding.Bindable

class MainViewModel: ViewModel(){

    private val name = MutableLiveData<String>()

    init {
        name.postValue("Enter your name")
    }


    @Bindable
    fun getName(): String{
        return name.value.toString()
    }


    fun setName(name: String){
        if(!this.name.value.equals(name)){
            this.name.postValue(name)
        }
    }

}