package bhanu.agrawal.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class MainViewModel: ViewModel(){

    private val name = MutableLiveData<String>()

    init {
        name.postValue("Enter your name")
    }

/*    fun getName(): String{
        return name.value.toString()
    }


    fun setName(name: String){
        if(!this.name.value.equals(name)){
            this.name.postValue(name)
        }
    }*/

}