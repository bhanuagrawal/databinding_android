package bhanu.agrawal.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MainViewModel: ViewModel(){

    var name = MutableLiveData<String>()

    init{
        name.postValue("sdfsdf")
    }

    fun onNameTextChanged(name: String){
        this.name.postValue(name)
    }

}